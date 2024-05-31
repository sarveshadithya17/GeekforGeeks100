//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        // Extract the higher nibble and lower nibble
        int higherNibble = (n & 0xF0) >> 4;  // Extract the higher nibble and shift right by 4 bits
        int lowerNibble = (n & 0x0F) << 4;   // Extract the lower nibble and shift left by 4 bits

        // Combine the swapped nibbles
        int swapped = higherNibble | lowerNibble;

        return swapped;
    }
}
