
import java.util.*;
import java.io.*;

public class Main{

    // do the parsing
    public static void main(String[]args) throws IOException{
        InputStreamReader rin = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(rin);
        // The first input is the length of the array
        int[] input = new int[Integer.parseInt(br.readLine())];
        // The second input is the array
        String[] input_s = br.readLine().split(" ");
        for(int i = 0; i < input.length; i++){
            input[i] = Integer.parseInt(input_s[i]);
        }
        
        merge_sort(input, 0, input.length-1);
        
       for(int each : input){
           System.out.print(each + " ");
       }
    }
    
    public static void merge_sort (int[] input, int l, int h){
        // base case for ending the recursion:
        // only one or zero element remain in the input.
        if (l >= h) {return;}
        
        int[] sorted = new int[h-l+1];
        
        // in mergesort, do the recursion first.
        int pivot = (l+h)/2;
        merge_sort(input, l, pivot);
        merge_sort(input, pivot+1, h);
        
        int k = 0;
        int i = l;
        int j = pivot+1;
        // compare the two parts and see which number from each part's ptr
        // is smaller. Put that number into sorted.
        while (i <= pivot && j <= h) {
            if (input[i] <= input[j]) {
                sorted[k] = input[i];
                i ++;
            } else {
                sorted[k] = input[j];
                j ++;
            }
            k ++;
        }
        // When finished (one of the ptrs reaches its end), put the remaining numbers
        // of the other part into sorted directly.
        if (i <= pivot) {
             while (i <= pivot) sorted[k++] = input[i++];
        }else if (j <= h){
             while (j <= h) sorted[k++] = input[j++];
        }
        // finally, put the sorted numbers into the original array
        i = l;
        for(int x = 0; i <= h; x++){
            input[i] = sorted[x];
            i++;
        }
        // return
    }
}
