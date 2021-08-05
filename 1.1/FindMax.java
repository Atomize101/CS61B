public class FindMax {
    public static int findMax(int[] a, int head, int last) {

        int max = 0, max1 = 0;

        if (head == last) {
            return a[head];

        } else if (a[head] < a[last]) {
            max = findMax(a, head + 1, last);
        } else
            max = findMax(a, head, last - 1);

        if (max >= max1) {
            max1 = max;
        }
        return max1;

    }

    public static void main(String[] args) {
        int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
        int i = findMax(numbers, 0, 6);
        System.out.println(i);
    }
}