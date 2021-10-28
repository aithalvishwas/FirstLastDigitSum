package FirstLastDigitSum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your number? ");
        int number=sc.nextInt();
        if(number<0){
            System.out.println("It is Invalid input");
        }
        int FirstDigit=0;
        int Lastdigit=number%10;
        while(number>0){
            FirstDigit=number%10;
            number=number/10;
        }
        int sum=FirstDigit+Lastdigit;
        System.out.println("The sum of the first and the last digits are "+sum);
    }
}

