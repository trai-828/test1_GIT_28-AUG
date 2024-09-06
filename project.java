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

        float product = first * second;

        System.out.println("The product is: " + product);
    }
}