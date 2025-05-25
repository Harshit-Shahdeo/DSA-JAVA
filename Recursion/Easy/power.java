package Practice_recursion;

    public class power {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) {
                return false;
            }
            int base = 2;
            for (int power = 0; power <= 30; power++) {
                if (result(base, power) == n) {
                    return true;
                }
            }
            return false;
        }

        public int result(int base, int power) {
            if (power == 0) {
                return 1;
            } else {
                return base * result(base, power - 1);
            }
        }

        public static void main(String[] args) {
            power sol = new power();
            System.out.println(sol.isPowerOfTwo(1));
            System.out.println(sol.isPowerOfTwo(16));
            System.out.println(sol.isPowerOfTwo(18));
            System.out.println(sol.isPowerOfTwo(0));
        }
    }


