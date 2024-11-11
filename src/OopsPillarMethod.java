abstract class GFG{
    //abstract methods declaration
    abstract void add();
    abstract void mul();
    abstract void div();
}

//Encapsulation using private modifier
//Employee class contains private data called employee id and employee name
class Employee {
    private int empid;
    private String ename;
}

// Inheritance

class Animal  {     //parent class
    //parent class methods
   public void walk(){
       System.out.println("Animal could walk");
   }
}
//derived class or child class or base class
class Horse extends Animal{  //Inherits parent class methods
    //child class methods
    public void eat() {
    System.out.println("Horse could eat.");
    }
}



public class OopsPillarMethod {
    public static void main(String[] args)
    {
        // Pillar 1: Abstraction
//    GFG student = new GFG();
//    student.add();          we_can_not_initiate_it.

       // Pillar 2: Encapsulation
        Employee e1 = new Employee();
      //  e1.ename = "yuvraj";  //'ename' has private access in 'Employee'

        // Pillar 3: Inheritance
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();      //child class can access parent class attributes.

        // pillar 4: Polymorphism
       // check out on OopsPolymorphism repo.


    }
}
