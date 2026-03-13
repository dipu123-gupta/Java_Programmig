public class largestNub {
    public static void main(String[] args) {
        int arr[] = { 4, 8, 3, 9, 12, 1 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element is " + max);
    }
}
