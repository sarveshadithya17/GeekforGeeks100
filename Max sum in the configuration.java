//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            System.out.println(new Solution().max_sum(arr, n));

            t--;
        }
    }
}

// } Driver Code Ends


class Solution {
    long max_sum(int a[], int n) {
        long currentValue = 0;
        long arraySum = 0;
        
        for (int i = 0; i < n; i++) {
            currentValue += (long) i * a[i];
            arraySum += a[i];
        }
        
        long maxValue = currentValue;
        
        for (int i = 1; i < n; i++) {
            currentValue = currentValue + arraySum - (long) n * a[n - i];
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }
        
        return maxValue;
    }
}
