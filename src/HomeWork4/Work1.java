package HomeWork4;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner inNum = new Scanner(System.in);
        int a = inNum.nextInt();
        int sum = 0;
        int count = 0;
        double x;

        while (a != 0) {
            if (a % 2 == 0) {
                sum += a;
                count++;
                System.out.println(a);

            }

            a--;

        }
        x = sum / count;
        System.out.println("Arithmetic average " + x);




    }
}
