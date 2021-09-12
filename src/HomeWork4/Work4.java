package HomeWork4;

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        System.out.print("Enter your  integer: ");
        Scanner intNum = new Scanner(System.in);
        int a = intNum.nextInt();
        int cube = 0;
        for (int  i = 0; i < a ; i++) {
            cube = i*i*i;
            System.out.println(cube);

        }

        }




    }

