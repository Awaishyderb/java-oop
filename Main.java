import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        dataTypes();
//        allOperators();
//        evenOrOdd();
//        cpn();


    }

    //        1: Print All DataTypes that we have discussed
    public static void dataTypes() {

        int int1 = -2147483648, int2 = 2147483647;
        byte byte1 = -128,  byte2 = 127;
        short short1  = -32768, short2 = 32767;
        double double1 = -1.23456e300d,double2 = 1.23456e300d;
        long long1 = -922337219, long2 = 999999999;
        boolean hello = true,hi = false;
        char char1 = 'A',char2 = 'z';
        String string = "Awais",string2 = "Hyder";

        System.out.println("Int: " + int1 + " to " + int2);
        System.out.println("Byte: " + byte1 + " to " + byte2);
        System.out.println("Short: " + short1 + " to " + short2);
        System.out.println("Double: " + double1 + " to " + double2);
        System.out.println("Long: " + long1 + " to " + long2);
        System.out.println("hello is " + hello + " Hi is " + hi);
        System.out.println("Char: " + char1 + " " + char2);
        System.out.println("String: " + string + " " + string2);

    }

    //         2: Make a Function that tell the number is odd/even
    public static void evenOrOdd () {

        System.out.print("Enter the number: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Your number is Even");
        } else {
            System.out.println("Your number is odd");
        }

    }

    //       3: Print All Arithmetic Operators
    public static void allOperators(){

//  Arithmetic Operators
        int a = 25 , b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
//  Logical Operators
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);
        System.out.println(a == b);
        System.out.println(a & b);
        System.out.println(a | b);
//  Assignment operators
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a /= b);
        System.out.println(a *= b);
        System.out.println(a %= b);
//  Increment & decrement Operators
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println(--a);

    }

    //         4: Make a CPN Function
    public static void cpn(){
        float matric = 0,inter = 0,test = 0,cpn;


        System.out.println("Enter your Matric Percentage");
        matric = scanner.nextFloat();
        matric = matric * 0.1f;

        System.out.println("Enter your Intermediate Percentage");
        inter = scanner.nextFloat();
        inter = inter * 0.2f;

        System.out.println("Enter Your Test Marks");
        test = scanner.nextInt();
        test = test * 0.7f;

        cpn = matric + inter + test;
        System.out.println("Your CPN is: " + cpn);

    }

}