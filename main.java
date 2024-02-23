package enskapulasi;

public class main {
    public static void main(String[] args) {
        
        user user = new user("aaa","bbb" );
        user user1 = new user();

        user.setUsername("lmao");
        user.setPassword("oaml");
        user.setstatus(false);
        user.setid(0);


        System.out.println("Username : " + user.getUsername());
        System.out.println("Password : " + user.getPassword());
    }
}


