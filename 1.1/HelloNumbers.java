public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int total = 0;
        while (x < 10 && y < 10) {
            System.out.print(total + " ");
            x = x + 1;
            y = x;
            total = x + y;
        }
    }
}