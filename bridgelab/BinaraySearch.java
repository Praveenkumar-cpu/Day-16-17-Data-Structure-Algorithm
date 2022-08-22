package bridgelab;

public class BinaraySearch {
    static int binarySearch(String[] arr, String search) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {

            int m = (l + r)/2;
            int res = search.compareTo(arr[m]);

            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }


    public static void main(String[] args) {

        String[] arr = { "Delhi", "Karnataka", "Kerala", "Noida" };
        String search = "Kerala";

        int result = binarySearch(arr, search);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}

