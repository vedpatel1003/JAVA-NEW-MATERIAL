class MyMainEmployee{
        private int id;
        private String name;
        public MyMainEmployee(){
            id = 45;
            name = "Your-Name-Here";
        }
        public String getName() { return name; }
        public void setName (String n) { this.name = n; }
        public void setId(int i) { this.id = i; }
        public int getId() { return id; }
}
public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee VED = new MyMainEmployee();
        VED.setName("HELLO WORLD");
        VED.setId(12);
        System.out.println(VED.getId());
        System.out.printlnCHELLO.getName();

    }
}
