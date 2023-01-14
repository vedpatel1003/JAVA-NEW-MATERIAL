class Account{
    public String name;
    protected String email;
    private String password;

    // getters and setter
    private String getPassword(){
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

//public class Bank{
//    public static void main (String args[]){
//       Account account1 = new Account();
//       account1.name= "Hello Coders";
//       account1.email= "AiMentor.com";
//       account1.setPassword("abcd");
//       System.out.println(account1.getPassword());
//    }
//}

//class Bank {
//    public static void main(String args[]){
//        System.out.println("Hello");
//    }
//}
public static void main(String args[]) {
    System.out.println("Hello");
}