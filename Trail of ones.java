//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfConsecutiveOnes(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int MOD = 1000000007;
    
    static int numberOfConsecutiveOnes(int n) {
        if (n == 1) return 0;
        
        long[] dp0 = new long[n + 1];
        long[] dp1 = new long[n + 1];
        
        dp0[1] = 1;
        dp1[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp0[i] = (dp0[i-1] + dp1[i-1]) % MOD;
            dp1[i] = dp0[i-1] % MOD;
        }
        
        long totalStrings = power(2, n, MOD);
        
        long noConsecutiveOnes = (dp0[n] + dp1[n]) % MOD;
        
        long result = (totalStrings - noConsecutiveOnes + MOD) % MOD;
        
        return (int) result;
    }
    
    static long power(long base, int exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
