package task_2_9;

public class Main {
    public static void main(String[] args) {
        int[] arg = {5, 3, 4, 85, 6, 5};
        boolean a =false;
        for (int j : arg) {
            if (j == 5) {
                a = true;
                break;
            }
        }
        if (a){
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }
}
