import java.util.Arrays;

public class Assignment01Q04 {
    /*
     * Shifts the elements of an array cyclically by a specified number of positions.
     * @param array The input array to be shifted.
     * @param move The number of positions to shift.
     * @param direction The direction of the shift ('L' for left, 'R' for right).
     * @return The shifted array.
     */

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0) {
            return array;
        }
        int n = array.length;
        move = Math.floorMod(move, n); // Normalize negative moves to the opposite shift
        int[] result = new int[n];
        if (direction == 'L') {
            // Shift left
            for (int i = 0; i < n; i++) {
                result[i] = array[(i + move) % n];
            }
        } else if (direction == 'R') {
            // Shift right
            for (int i = 0; i < n; i++) {
                result[i] = array[(i - move + n) % n];
            }
        } else {
            // Invalid direction, return the original array
            return array;
        }
        for (int i = 0; i < n; i++) {
            array[i] = result[i];
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}
