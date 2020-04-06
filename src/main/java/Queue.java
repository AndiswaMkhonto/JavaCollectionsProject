import java.util.HashMap;



public class Queue {
    // Function to find maximum number of
    // Unique integers in Sub-Array
    // of given size
    public static int maxUniqueNum(int arr[],
                                   int N, int M)
    {
        int maxUnique = 0;

        // Generate all subarrays of size M
        for (int i = 0; i < N - M; i++) {
            int currentUnique = 0;

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            for (int k = i; k < i + M; k++) {

                // if the key is new to the map,
                // push the key in map and increment
                // count for unique number
                if (!map.containsKey(arr[k])) {
                    map.put(arr[i], 1);
                    currentUnique++;
                    continue;
                }
            }

            if (currentUnique > maxUnique)
                maxUnique = currentUnique;
        }

        return maxUnique;
    }



    public static int maxUniqueNum1(int arr1[],
                                   int N1, int M1)
    {
        int maxUnique = 0;

        // Generate all subarrays of size M
        for (int i = 0; i < N1 - M1; i++) {
            int currentUnique = 0;

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            for (int k = i+1; k < i + M1; k++) {

                // if the key is new to the map,
                // push the key in map and increment
                // count for unique number
                if (!map.containsKey(arr1[k])) {
                    map.put(arr1[i], 1);
                    currentUnique++;
                    continue;
                }
            }

            if (currentUnique > maxUnique)
                maxUnique = currentUnique;
        }

        return maxUnique;
    }



    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 2,2,2,2,2,2,2,2 };
        int[] arr1={7,5,5,7,5,5,7,5,5,6};
        int N = 8;
        int N1 = 10;




        int M = 4;
        int M1 =3;

        System.out.println(maxUniqueNum(arr, N, M));
        System.out.println("...............................................");
        System.out.println(maxUniqueNum1(arr1, N1, M1));

    }
}
