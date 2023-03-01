public class Main {
    public static void main(String[] args) {
        boolean a = false;
        int[] nums = {2, 6, 6, 1, 2};
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                a = true;
                break;
            }
        }
        if (a) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }
}