class Students1 {
    String name;
    int rollNo;
    long phoneNo;
    String city;
    float percentage;
    int birthYear;

    public void age(int birthYear){
        int haveAge = 2024 - birthYear;
        System.out.println("The Age of " + this.name + " (" + rollNo + ")"+ " is " + haveAge);
    }


    // we can make a functions of a same name with different values in a class is called polymorphism
    public void studentInfo(){
        System.out.println(this.name);
    }
    public void studentInfo(int birthYear , String name){
        System.out.println(this.name + this.birthYear + name);
    }
    public void studentInfo(float percentage){
        System.out.println(this.name);
    }


    Students1(Students1 s2){
        this.name = s2.name;
        this.percentage = s2.percentage;
    }
    Students1(){
    }
}

public class OopsPolymorphism {
    public static void main(String[] args){

        Students1 st1 = new Students1();
        st1.name = "Abhinav Thakur";
        st1.city = "Ahmedabad";
        st1.rollNo = 1;
        st1.birthYear = 2005;
        st1.phoneNo = 2311242526l;
        st1.percentage = 88.6f;
        st1.age(st1.birthYear);

        Students1 st2 = new Students1(st1);
        st2.studentInfo();
        st2.studentInfo(2005, "arnav");

    }
}
