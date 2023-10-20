public class sorting_college {
    public static void Bubble_sort(int number[]) {
        for (int i = 0; i < number.length - 1; i++) { // TURNS
            for (int j = 0; j < number.length - 1 - i; j++) { // swap
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

    public static void main(String args[]) {
        int number[] = { 1, 473, 32, 21, 5, 49, 77, 41, 66, 44, 52, 344, 87, 91, 152, 88 };
        Bubble_sort(number);
    }
}