package task_2_8;

public class Main {
    public static void main(String[] args) {
        int [] arg = {2, 3, 4, 5};
        int result = 1;
        for (int j : arg) {
            result = result * j;
        }
        System.out.println(result);
    }
}
