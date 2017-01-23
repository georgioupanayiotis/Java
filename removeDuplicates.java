package javaexamples;

/**
 *
 * @author Panayiotis Georgiou <www.panayiotisgeorgiou.net>
 */
public class NewClass {

    public static int[] removeDuplicates(int[] input) {
        /* Varable declearation */
        int j = 0;
        int i = 1;
        /*if the array length is less than 2 then return */
        if (input.length < 2) {
            return input;
        }
        while (i < input.length) {
            if (input[i] == input[j]) {
                i++;
            } else {
                input[++j] = input[i++];
            }
        }
        int[] output = new int[j + 1];
        for (int k = 0; k < output.length; k++) {
            output[k] = input[k];
        }

        return output;
    }

    public static void main(String a[]) {
        /* Unsorted list of array to sorted */
        int[] input1 = {1, 1, 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12};
        int[] output = removeDuplicates(input1);
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}
