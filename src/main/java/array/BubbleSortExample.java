import java.util.Arrays;

public class BubbleSortExample {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Loop untuk setiap elemen dalam array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Bandingkan elemen berdekatan
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Tukar elemen jika dalam urutan yang salah
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Jika tidak ada elemen yang ditukar, array sudah terurut
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Sebelum sorting: " + Arrays.toString(numbers));

        bubbleSort(numbers);

        System.out.println("Setelah sorting: " + Arrays.toString(numbers));
    }
}
