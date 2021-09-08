import java.util.Scanner;

public class HomeWorkd {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your number 1.");
        int num1 = inputScanner.nextInt();
        System.out.println("Enter your number 2.");
        int num2 = inputScanner.nextInt();
        System.out.println("a - add, s - subtract, m - multiply, d - divide. ");
        char c = inputScanner.next().charAt(0);
        switch (c){
            case 'a':
                System.out.println(num1 + num2);
                break;
            case 's':
                System.out.println(num1 - num2);
                break;
            case 'm':
                System.out.println(num1 * num2);
                break;
            case 'd':
                if (num2 == 0){
                    System.out.println("Error");
                }else System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Wrong option");


        }


        }


    }

