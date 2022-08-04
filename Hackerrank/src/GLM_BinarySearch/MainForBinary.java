package GLM_BinarySearch;

class BinarySearchRecursive {
    public static boolean binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) {
            return false;
        }
        int midpoint = left + (right - left) / 2;
        if (array[midpoint] == target) {
            return true;
        }
        else if (array[midpoint] > target) {
            return binarySearchRecursive(array, target, left, midpoint - 1);
        }
        else if (array[midpoint] < target) {
            return binarySearchRecursive(array, target, midpoint + 1, right);
        }
        return false;
    }
}

public class MainForBinary {
    public static void main (String[] args) {
        BinarySearchRecursive obj = new BinarySearchRecursive();
        int[] array1 = new int[]{1, 6, 7, 8, 9};
        System.out.println(obj.binarySearchRecursive(array1, 5, 0, 4));
    }
}