package com.worldcup.controller;

import com.worldcup.model.Player;
import com.worldcup.service.TeamSelectionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class WorldCupTeamApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TeamSelectionService service =
                context.getBean("teamSelectionService", TeamSelectionService.class);

        List<Player> finalTeam = service.selectFinalTeam();

        System.out.println("🏏 FINAL WORLD CUP TEAM (11 PLAYERS)");
        System.out.println("--------------------------------");

        int count = 1;
        for (Player player : finalTeam) {
            System.out.println(count++ + ". "
                    + player.getName()
                    + " | Role: " + player.getRole()
                    + " | Country: " + player.getCountry());
        }
    }
}
