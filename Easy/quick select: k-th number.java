import java.util.*;
import java.io.*;

public class Main{

    // do the parsing
    public static void main(String[]args) throws IOException{
        InputStreamReader rin = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(rin);
        // The first input is the length of the array
        String[] info = br.readLine().split(" ");
        int[] input = new int[Integer.parseInt(info[0])];
        // The second input is k
        int k = Integer.parseInt(info[1]);
        // The third input is the array
        String[] input_s = br.readLine().split(" ");
        for(int i = 0; i < input.length; i++){
            input[i] = Integer.parseInt(input_s[i]);
        }
        
        System.out.println( quick_sort(input, 0, input.length - 1, k) );
    }
    
    public static int quick_sort(int[] input, int l, int h, int k) {
        if (l >= h) {return input[l];}
        int l_ptr = l-1;
        int h_ptr = h+1;
        int pivot = (l+h)/2;
        int x = input[pivot];
        while(l_ptr < h_ptr){
            do l_ptr ++; while(input[l_ptr] < x);
            do h_ptr --; while(input[h_ptr] > x);
            if(l_ptr < h_ptr){
                int temp = input[l_ptr];
                input[l_ptr] = input[h_ptr];
                input[h_ptr] = temp;
            }
        }
        int sl = h_ptr - l + 1;
        if (k <= sl) { return quick_sort(input, l, h_ptr, k); }
        return quick_sort(input, h_ptr+1, h, k - sl);
    }
}    
