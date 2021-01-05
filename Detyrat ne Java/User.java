class User {

        private int id;
        private String email;
        private String password;
        private boolean isActive;

        public User(int id, String email, String password, boolean isActive){
            this.id = id;
            this.email = email;
            this.password = password;
            this.isActive = isActive;
        }

        public int getId(){
            return id;
        }

        public String getEmail(){
            return email;
        }

        public void setEmail(String newEmail){
            this.email = newEmail;
        }

        public String getPassword(){
            return password;
        }

        public void setPassword(String newPassword){
            this.password = newPassword;
        }

        public boolean getIsActive(){
            return isActive;
        }

        @Override

        public String toString(){
            return " id: " + "{" + this.id + "}" + " Email " + "{" +  this.email + "}" + " Password " + "{" +  this.password + "}" + " IsActive " + "{" +  isActive + "}";
        }


}