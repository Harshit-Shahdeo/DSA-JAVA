package recurssion_medium;

import java.util.Scanner;

public class Divison {
    public static void main(String[] args) {
        System.out.println(" Enter the dividend ");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        System.out.println(" Enter the divisor ");
        int divisor = sc.nextInt();

        Divison divison = new Divison();
        int result = Divison.divide(dividend, divisor);
        System.out.println(" The quotient of the following division is " + result);
    }
    public static int divide(int dividend, int divisor){
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
         long dividendL = Math.abs(dividend);
        long divisorL = Math.abs(divisor);
int result = helper((int) dividendL, (int) divisorL);

if(divisor > dividend){
    return 0;
}
else return sign * result;

    }
    private static int helper(long dividend, long divisor){
        long sum = divisor;
        int multiple = 1;

        while((sum+sum) <= dividend){
            sum+= sum;
            multiple += multiple;
        }

        if (divisor > dividend){
            return 0;
        }
        else{
            int result =  multiple + helper( (dividend -sum), divisor);
        return result;}
    }
}
