//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String str) {
        String[] fractions = str.split(", ");
        
        String[] firstFraction = fractions[0].split("/");
        String[] secondFraction = fractions[1].split("/");
        
        int a = Integer.parseInt(firstFraction[0]);
        int b = Integer.parseInt(firstFraction[1]);
        int c = Integer.parseInt(secondFraction[0]);
        int d = Integer.parseInt(secondFraction[1]);
        
        int lhs = a * d;
        int rhs = b * c;
        
        if (lhs > rhs) {
            return fractions[0];
        } else if (lhs < rhs) {
            return fractions[1];
        } else {
            return "equal";
        }
    }
}
