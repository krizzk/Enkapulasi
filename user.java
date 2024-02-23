package enskapulasi;

public class user {
    private String Username;
    private String Password;
    private int id;
    private boolean status;

    public user(){
        System.out.println("ini contruction");
    }
    
    public user(String krisna, String epep){
    this.Username = krisna;
    this.Password = epep;
    }
    public String getUsername(){
        return Username;
    }
    public void setUsername(String Username){
        this.Username= Username;
    }
    public String getPassword(){
        return Password;
    }
    public void setPassword(String Password){
        this.Password= Password;
    }
    public int id(){
        return id;
    }
    public void setid(int id){
        this.id= id;
    }
    public boolean status(){
        return status;
    }
    public void setstatus(boolean status){
        this.status= status;
    }

}
