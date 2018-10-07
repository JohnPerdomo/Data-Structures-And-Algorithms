public class BinarySearch {

    public static int binarySearch(int[] arr, int key){
        int low = 0, high = arr.length;

        while(low < high){
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Key: " + key + " found at index: " + mid);
                return mid;
            }
            else if (key > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }

        System.out.println("Key: " + key + " does not exist.");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        binarySearch(arr,9);
        binarySearch(arr,10);
        binarySearch(arr,-1);
    }
}
