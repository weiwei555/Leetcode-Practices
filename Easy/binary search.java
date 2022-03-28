import java.util.*;
import java.io.*;

public class Main{

    // do the parsing
    public static void main(String[]args) throws IOException{
        InputStreamReader rin = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(rin);
        // The first input is the length of the array
        // The second input is the number of requests
        String[] info = br.readLine().split(" ");
        int num = Integer.parseInt(info[0]);
        int req = Integer.parseInt(info[1]);
        int[] input = new int[num];
        
        // The third input is the array
        String[] input_s = br.readLine().split(" ");
        for(int i = 0; i < input.length; i++){
            input[i] = Integer.parseInt(input_s[i]);
        }
        
        int curr_req;
        // The remaining inputs are the requests
        for(int i = 0; i < req; i++){
            curr_req = Integer.parseInt(br.readLine());
            binary_search(input, curr_req, 0, num-1);
        }
    }
       
    public static void binary_search (int[] input, int x, int l, int h) {
        
        // search from the middle
        // if middle fullfill the request, reduce the scope
        // do this util l = h, and there's only one element left. (the answer)
        int mid;
        while (l < h) {
            mid = (l + h)/2;
            // the requirement for this question specifically
            // here we should find the first x appeard in input
            // since input is sorted, if input[mid] >= x, the first x
            // must be at left side (including mid) of the mid.
            if (input[mid] >= x) {
                h = mid;
            // if input[mid] > x, x will be in the scope at the right of mid. (not including mid)
            } else {
                l = mid+1;
            }
        }
        // when l = h, we end while and now input[l] = input[h] = the only answer.
        // if the answer is not x, return no answer.
        if (input[l] != x) {
            System.out.println("-1 -1");
            return;
        }
        
        // Else, we've found the first x and we now need to find the last x.
        int start = l;
        l = 0;
        h = input.length-1;
        
        while (l < h) {
            mid = (l + h + 1)/2;
            // here we should find the last x appeard in input
            // since input is sorted, if input[mid] <= x, the last x
            // must be at right side (including mid) of the mid.
            if (input[mid] <= x) {
                l = mid;
            }else{
            // if input[mid] > x then the last x must be at the left side,
            // not including mid.
                h = mid - 1;
            }
        }
        
        // found the last x, the only answer here when l = h
        System.out.println(start + " " + l);
        return;
    }  
    
}
