public class OOPS {
      public static void main(String[] args) {
            System.out.println("Classes and object started");
            Pen p1 = new Pen();  //Created a pen object called p1
            p1.setColor("Blue");
            System.out.println(p1.color);

            p1.setTip(5);
            System.out.println(p1.tip);

            p1.setColor("Yellow");
            System.out.println(p1.color);

            System.out.println("Classes and object ended");

            //Using access modifier

            System.out.println("access modifier started");
            BankAccount myAcc = new BankAccount();
            myAcc.username = "aniketamte";
            //myAcc.password = "123456";  <== Didnot use like this
            myAcc.setPassword("lcdjkdv");
            System.out.println("access modifier ended");

            //Getters and setters

            System.out.println("Getters and setters started");
            Pens p2 = new Pens();
            p2.setColor("Black");
            System.out.println(p2.getColor());
            p2.setTip(50);
            System.out.println(p2.getTip());
            p2.setColor("White");
            System.out.println(p2.getColor());

            System.out.println("Getters and setters ended");

            System.out.println("Constructor Started");
            students s2 = new students("Aniket");
            System.out.println(s2.name);
            System.out.println("Constructor ended");
      }
}

//classes and Objects

class Pen {
      String color;
      int tip;

      void setColor(String newColor){
            color = newColor;
      }

      void setTip(int newTip){
            tip = newTip;
      }
}

class Student{
      String name;
      int age;
      float percentage;

      void calcPercentage(int phy, int chem, int math){
            percentage = (phy + chem + math) / 3;
      }
}

//Access Modifiers

/*
 * Access Modifier - within class - within package - outside packeage by subclass only - outside package
 * 
 * 1) Private - yes - No - No - No
 * 2) Default - Yes - Yes - No - No
 * 3) Protected - Yes - Yes - Yes - No
 * 4) Public - Yes - Yes - Yes - Yes
 */

 class BankAccount {
      public String username;
      private String password;
      public void setPassword( String pwd){
            password = pwd;
      }
 }

 /*
  * Getters and Setters
   
  * Get -> To return the value
  * Set -> To modify(update) the value

  * this -> this keyword is used to refer to the current object
  */

class Pens {

    private String color;
    private int tip;

    String getColor() {
      return this.color;
    }

    int getTip(){
      return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

/*
 * Encapsulation ---> It is defined as the wrapping up of data and methods under a single unit. It also implements data hidding.
 */

 /*
  * Constructors ==> It is a special method which is invoked automatically at the time of object creation.

  * Constructor hava same name as class or structure
  * It dont have a return type not even void.
  * These are only called once, at object creation.
  * Memory allocation happens when constructor is called.
  */

  class students{
      String name;
      int roll;

      students(String name){
            this.name = name;
      }
  }