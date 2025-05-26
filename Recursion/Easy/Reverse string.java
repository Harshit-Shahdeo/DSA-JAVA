package Practice_recursion;

public class rought {
    public static void main(String[] args) {

        char[] s = {'a', 'p', 'p', 'l', 'e'};
          rought ob = new rought();
          ob.reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {

  revesre(s,0,s.length-1);
        }
        public void revesre(char[] s, int left, int right){
        if (left >= right){
            return;
        }
        else{
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            revesre( s,left+1, right - 1 );

        }
        }
    }
