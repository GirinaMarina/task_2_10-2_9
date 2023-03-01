package task_2_2;

public class Main {
    public static void main(String[] args) {
        int[] arg = {7, 10, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4};
        int summArg = 0;
        int count = 0;
        for (int j : arg) {
            if (summArg < 10) {
                summArg = summArg + j;
                count += 1;
            } else break;

        }
        System.out.println(count);
    }
}

