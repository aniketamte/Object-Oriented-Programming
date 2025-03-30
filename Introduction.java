
public class Introduction {

    /*
     OOP 1 | Introduction & Concepts - Classes, Objects, Constructors, Keywords
     */

 /*
      * Class ==> A class is a name group of properties and function'
     */
    //create a class
    static class Student {

        int rollNo;
        String name;
        float marks;
    }

    /*
      variable inside the object is called instance variable
      Example => syso(student.rollno)
     */
    public static void main(String[] args) {
        int rollNo[] = new int[5];
        String name[] = new String[5];
        float marks[] = new float[5];

        Student students[] = new Student[5];
        //new = dynamically allocates memory and return a reference variable to it
        Student aniket = new Student();
        //System.out.println(Arrays.toString(aniket.rollNo));

        //Aniket is a reference variable of STudent class
        
        aniket.rollNo = 17;
        aniket.name = "Aniket Amte";
        aniket.marks = 90;

        System.out.println("Roll No : " + aniket.rollNo);
        System.out.println("Name : " + aniket.name);
        System.out.println("Marks : " + aniket.marks);
    }
}
