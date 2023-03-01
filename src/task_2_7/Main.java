package task_2_7;

public class Main {
    public static void main(String[] args) {
        int num = 13;
        int a = 2;
        for (int i = 0; i < num-1; i++) {
            int result = num%(a+i);
            if (result == 0) {
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }
    }
}
