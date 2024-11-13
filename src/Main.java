import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        sortArray(new int[]{5, 2, 1, 3, 4});
    }

    public static int[] sortArray(int[] array) {
        int[] odd = Arrays.stream(array)
                .filter(num -> num % 2 == 1)
                .toArray();

        Arrays.sort(odd);

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = odd[j++];
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}