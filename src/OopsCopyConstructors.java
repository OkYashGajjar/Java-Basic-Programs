class Students {
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

    public void studentInfo(){
        System.out.println(this.name);
    }


    Students(Students s2){
        this.name = s2.name;
        this.percentage = s2.percentage;
    }
    Students(){

    }


}


public class OopsCopyConstructors {
    public static void main(String[] args){

        Students st1 = new Students();
        st1.name = "Abhinav Thakur";
        st1.city = "Ahmedabad";
        st1.rollNo = 1;
        st1.birthYear = 2005;
        st1.phoneNo = 2311242526l;
        st1.percentage = 88.6f;
        st1.age(st1.birthYear);

      Students st2 = new Students(st1);
      st2.studentInfo();

    }
}


