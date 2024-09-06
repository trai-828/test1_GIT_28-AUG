public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        float first = 1.5f;
        float second = 2.0f;
      
#feature2.1 added by Devloper Anil in Axis project on july 2023
public class SwapNumbers {

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
Outp
#end of feature2.1

#feature2.2 added by Devloper trailokya in Axis project on dec 2023
public class AsciiValue {


    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
#end of feature 2.2
        float product = first * second;

        System.out.println("The product is: " + product);
    }
}
