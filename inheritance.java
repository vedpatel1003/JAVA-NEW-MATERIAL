// inheritance has 4 types in java
// 1. single level inheritance                         base class
                                                       ||||||||||
//                                                     derived class
class shape {  //base class ( parent class )
   public void area(){
       System.out.println("Displays Area");
   }
}

class Triange extends shape { // (sub class or child class  )
    public void area(int l, int h){
        System.ouy.println(1/2*l*h);
    }
}

class circle extends shape{
    public void area(int r){
        System.ouy.println((3.14)*r*r);
    }
}

public class OOPS{
    public static void main(String args[]){}
       Triange t1 = new Triange();
       t1.color = "red"
}

// Multi Level Inheritance
// Hierarchial Inheritance
// Hybrid Inheritance
