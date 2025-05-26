package Practice_recursion;

    public class Binary_Search {
        public int search(int[] nums, int target) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        public int binarySearch(int[] nums, int low, int high, int target) {
            if (low > high) {
                return -1;
            }

            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                return binarySearch(nums, mid + 1, high, target);
            } else {
                return binarySearch(nums, low, mid - 1, target);
            }
        }

        public static void main(String[] args) {
            Binary_Search solution = new Binary_Search();
            int[] nums = {-1, 0, 3, 5, 9, 12};
            int target = 9;
            int result = solution.search(nums, target);
            System.out.println("Index of target " + target + " is: " + result);
        }
    }


