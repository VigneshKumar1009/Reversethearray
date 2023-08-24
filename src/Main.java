public class Main {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int B1 = 2;
        int C1 = 3;
        reverseRange(A1, B1, C1);
        printArray(A1); // Output: [1, 2, 4, 3]

        int[] A2 = {2, 5, 6};
        int B2 = 0;
        int C2 = 2;
        reverseRange(A2, B2, C2);
        printArray(A2); // Output: [6, 5, 2]
    }

    public static void reverseRange(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
