public class checkUser {
    public static void main(String[] args) {

        User user1 = new User(1, "hello@email.com", "12345", false);
        User user2 = new User(2, "world@world.com", "0012345", true);
        User user3 = new User(3, "ny@ny.de", "12345", false);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);


    }
}
