package Practice_recursion;
// Print no.s from 1 to n

public class q3 {
    public static void main(String[] args) {
        int n =  10;
        num( n);
    }
    public static void num(int n){
print(1, n);
    }
    public static void print(int i , int n){
        if(i > n){
            return;
        }
        else{
            System.out.println(i);
            print(i + 1, n);

        }
    }

}
