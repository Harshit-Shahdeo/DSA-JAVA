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

        // if we divide Integer.MIN_VALUE with -1 it will give us stack overflow error because it will result in 2,147,483,648, which exceeds Integer.MAX_VALUE
        
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        // This will determine the sign that the integer shpuld have in our result of divison 
        
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
         long dividendL = Math.abs(dividend);
        long divisorL = Math.abs(divisor);
int result = helper((int) dividendL, (int) divisorL);

if(divisor > dividend){
    return 0;
}
else return sign * result;

    }

    // we will need a helper method to use recurssion by dividiing our dividend with big chunks of divisor while maintaining the number of multiples.
    // we need to do this because if again we divide Integer.MIN_VALUE or MAX_VALUE by a number like 1, the recurssion will call itself the no. of times equal to the value of the dividend,
    // which will result in memory running out as each recurssive calls has its own memory.
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
        return result;
        }
    }
}
