package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // 1️⃣ Define Users & Roles
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {

        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder.encode("admin123"))
                .roles("ADMIN")
                .build();

        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder.encode("user123"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    // 2️⃣ Password Encoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 3️⃣ Security Rules
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http
//            .csrf(csrf -> csrf.disable())
//            .authorizeHttpRequests(auth -> auth
//
//                // READ APIs → ADMIN & USER
//                .requestMatchers(HttpMethod.GET, "/api/employees/**")
//                .hasAnyRole("ADMIN", "USER")
//
//                // WRITE APIs → ADMIN only
//                .requestMatchers(HttpMethod.POST, "/api/employees/**")
//                .hasRole("ADMIN")
//                .requestMatchers(HttpMethod.PUT, "/api/employees/**")
//                .hasRole("ADMIN")
//                .requestMatchers(HttpMethod.DELETE, "/api/employees/**")
//                .hasRole("ADMIN")
//
//                // Any other request must be authenticated
//                .anyRequest().authenticated()
//            )
//            .formLogin(form -> form
//                    .loginPage("/login")
//                    .defaultSuccessUrl("/employees", true)
//                    .permitAll()
//            )
//            .logout(logout -> logout
//                    .logoutSuccessUrl("/login?logout"));
//
//        return http.build();
//    }
    
    
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth

                // ✅ Allow static resources
                .requestMatchers("/css/**", "/js/**", "/images/**").permitAll()

                // Login page
                .requestMatchers("/login").permitAll()

                // ADMIN UI actions
                .requestMatchers("/employees/add", "/employees/save", "/employees/delete/**")
                .hasRole("ADMIN")

                // Employee pages
                .requestMatchers("/employees", "/employees/**")
                .hasAnyRole("ADMIN", "USER")

                // REST APIs
                .requestMatchers(HttpMethod.GET, "/api/employees/**")
                .hasAnyRole("ADMIN", "USER")

                .requestMatchers(HttpMethod.POST, "/api/employees/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.PUT, "/api/employees/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")

                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login")
                .defaultSuccessUrl("/employees", true)
                .permitAll()
            )
            .logout(logout -> logout
                .logoutSuccessUrl("/login?logout")
            );

        return http.build();
    }


}
