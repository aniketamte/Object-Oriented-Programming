public class OOPS {
      public static void main(String[] args) {
            Pen p1 = new Pen();  //Created a pen object called p1
            p1.setColor("Blue");
            System.out.println(p1.color);

            p1.setTip(5);
            System.out.println(p1.tip);

            p1.setColor("Yellow");
            System.out.println(p1.color);


            //Using access modifier

            BankAccount myAcc = new BankAccount();
            myAcc.username = "aniketamte";
            //myAcc.password = "123456";  <== Didnot use like this
            myAcc.setPassword("lcdjkdv");
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