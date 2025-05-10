// counting negative and positive integers in an array and returning the greater value among the two.

package Practice_recursion;

    public class Count {
        public int maximumCount(int[] nums) {
            int pos = countPositive(nums, 0);
            int neg = countNegative(nums, 0);
            return Math.max(pos, neg);
        }

        public int countPositive(int[] nums, int index) {
            if (index == nums.length) return 0;
            return (nums[index] > 0 ? 1 : 0) + countPositive(nums, index + 1);
        }

        public int countNegative(int[] nums, int index) {
            if (index == nums.length) return 0;
            return (nums[index] < 0 ? 1 : 0) + countNegative(nums, index + 1);
        }

        public static void main(String[] args) {
            Count sol = new Count();
            int[] nums = {-3, -2, -1, 0, 0, 1, 2};
            System.out.println(sol.maximumCount(nums));
        }
    }


