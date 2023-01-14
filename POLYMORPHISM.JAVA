// COMPILE TIME POLYMORPHISM ( FUNCTION OVERLOADING )

class Student {
    int age ;
    String name;


     public void printInfo(String name ){
         System.outprintln(name);
     }
    public void printInfo(int age ){
        System.outprintln(age);
    }
    public void printInfo(String name , int age ) {
        System.outprintln(name + " " + age);
    }
}

