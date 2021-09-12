package HomeWork4;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {

        Scanner intNum = new Scanner(System.in);
        System.out.println("Enter your number 1.");
        int a = intNum.nextInt();
        System.out.println("Enter your number 2.");
        int b = intNum.nextInt();
        System.out.println("Enter your number 3.");
        int c = intNum.nextInt();
        System.out.println("Enter your number 4.");
        int d = intNum.nextInt();
        System.out.println("Enter your number 5.");
        int e = intNum.nextInt();
        int sum = a + b +c +d + e;
        System.out.println("the sum is : " + sum);


    }
}
