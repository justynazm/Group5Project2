package project2;
/* 14. Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName.  */
public class Registration {

        private String email;
        private String userName;
        private String password;
        public void setEmail(String email) {
            if (email.toLowerCase().endsWith("@yahoo.com")) {
                this.email = email;
                System.out.println("Email set successfully");
            } else {
                System.out.println("Invalid email. Please provide a Yahoo email.");
            }
        }
        public void setUserName(String userName) {
            if (userName.length() > 6) {
                this.userName = userName;
                System.out.println("Username set successfully");
            } else {
                System.out.println("Invalid username. Username should be larger than 6 characters.");        }    }    public void setPassword(String password) {        if (password.length() > 6 && !password.contains(userName)) {            this.password = password;            System.out.println("Password set successfully");        } else {            System.out.println("Invalid password. Password should be of length larger than 6 characters and cannot contain the username.");
        }
        }
    }

