import java.util.*;
import java.util.Collection;

public class sorting_college {
    // BUBBLE SORT

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

    /* its a second commit for as a SELECTION SORT */

    public static void Selection_sort(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[minPos] > number[j]) {
                    minPos = j;
                }
            }
            // SWAP
            int temp = number[minPos];
            number[minPos] = number[i];
            number[i] = temp;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

    /* its a third commit for as a INSERTION SORT */
    public static void INsertion_Sort(int number[]) {
        for (int i = 1; i < number.length; i++) {
            int curr = number[i];
            int j = i - 1;
            while (j >= 0 && number[j] > curr) {
                number[j + 1] = number[j];
                j--;
            }
            number[j + 1] = curr;// number[i];
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

    /* INBUILT SORT */
    public static void Inbuilt_sort(int number[]) {
        Arrays.sort(number);
    }

    public static void main(String args[]) {
        int number[] = { 1, 473, 32, 21, 5, 49, 77, 41, 66, 44, 52, 344, 87, 91, 152, 88 };
        Bubble_sort(number);
        Selection_sort(number);
        INsertion_Sort(number);
        Inbuilt_sort(number);
    }
}