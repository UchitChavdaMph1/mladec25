const form = document.getElementById('registerForm');
        const errorMsg = document.getElementById('errorMsg');
        form.addEventListener('submit', function (e) {
            errorMsg.style.display = 'none';
            let errors = "";
            const username = form.username.value.trim();
            const mobile = form.mobile.value.trim();
            const dob = form.dob.value;
            const gender = form.gender.value;
            const password = form.password.value;
            const confirmpassword = form.confirmpassword.value;

            if (!confirmpassword) {
                errors = "Confirm Password is required.";
            } else if (password !== confirmpassword) {
                errors = "Passwords do not match.";
            }

             if (!password) {
                errors = "Password is required.";
            } else if (password.length < 6) {
                errors = "Password must be at least 6 characters.";
            }

            if (!gender) {
                errors = "Gender selection is required.";
            }

             if (!dob) {
                errors = "Date of Birth is required.";
            }

             if (!mobile) {
                errors = "Mobile number is required.";
            } else if (!/^\d{10}$/.test(mobile)) {
                errors = "Mobile number must be 10 digits.";
            }

            if (!username) {
                errors = "Username is required.";
            }
           
           
            
           
            

            if (errors != "") {
                e.preventDefault();
                errorMsg.innerText = errors;
                errorMsg.style.display = 'block';
            } else {
                // On successful validation, redirect to home page
                e.preventDefault();
                window.location.href = "website.html";
                alert("Registration Successful!, welcome " + username);
            }
        });