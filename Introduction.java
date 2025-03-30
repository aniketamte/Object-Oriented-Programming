
import java.util.Arrays;


public class Introduction {

    /*
     OOP 1 | Introduction & Concepts - Classes, Objects, Constructors, Keywords
     */

     /*
      * Class ==> A class is a name group of properties and function'
      */

      //create a class

      class Student{
            int rollNo;
            String name;
            float marks;
      }

      /*
      variable inside the object is called instance variable
      Example => syso(student.rollno)
      */

    public static void main(String[] args) {
      Student Aniket[] = new Student[5];
      Student aniket;
      System.out.println(Arrays.toString(Aniket));

      //Aniket is a reference variable of STudent class
    }
}
