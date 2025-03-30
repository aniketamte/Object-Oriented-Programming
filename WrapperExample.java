
public class WrapperExample {

    public static void main(String[] args) {
        // //Pass by Value
        // int a = 10;
        // int b=20;
        // Integer num = 45;

        //pass by reference value
        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);
    }

    //Integer is a final class so it takes directly final value when we perform operation it doesnt show the answer it shows on final value
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
