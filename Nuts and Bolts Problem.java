//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(n, nuts, bolts);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        char[] order = { '!', '#', '$', '%', '&', '*', '?', '@', '^' };

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length; i++) {
            map.put(order[i], i);
        }

        Character[] nutsArray = new Character[n];
        Character[] boltsArray = new Character[n];
        for (int i = 0; i < n; i++) {
            nutsArray[i] = nuts[i];
            boltsArray[i] = bolts[i];
        }

        Arrays.sort(nutsArray, (a, b) -> map.get(a) - map.get(b));
        Arrays.sort(boltsArray, (a, b) -> map.get(a) - map.get(b));

        for (int i = 0; i < n; i++) {
            nuts[i] = nutsArray[i];
            bolts[i] = boltsArray[i];
        }
    }
}
