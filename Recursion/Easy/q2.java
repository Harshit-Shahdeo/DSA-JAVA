package Practice_recursion;

public class q2 {
    public static void main(String[] args) {
        int base;
        int power1;
        int result = Raisedpower(2,4);
        System.out.println(result);
    }
    public static int Raisedpower(int base, int power1){
        if (power1 ==0){
            return 1;
        }
        else{
            return base * Raisedpower(base, power1-1);
        }
    }
}
