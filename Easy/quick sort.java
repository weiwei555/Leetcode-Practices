//这里填你的代码^^
//注意代码要放在两组三个点之间，才可以正确显示代码高亮哦~
给定你一个长度为 n 的整数数列。

请你使用快速排序对这个数列按照从小到大进行排序。

并将排好序的数列按顺序输出。

输入格式
输入共两行，第一行包含整数 n。

第二行包含 n 个整数（所有整数均在 1∼109 范围内），表示整个数列。

输出格式
输出共一行，包含 n 个整数，表示排好序的数列。

数据范围
1≤n≤100000


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
        quick_sort(input, 0, input.length - 1);
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
    }

    public static void quick_sort(int[] input, int l, int h){
        if (l >= h) {return;}

        int l_ptr = l-1;
        int h_ptr = h+1;
        int pivot = (l + h)/2 ;
        int x = input[pivot];
        while (l_ptr < h_ptr) {
            do l_ptr++; while (input[l_ptr] < x);
            do h_ptr--; while (input[h_ptr] > x);
            if (l_ptr < h_ptr) {
                int temp = input[l_ptr];
                input[l_ptr] = input[h_ptr];
                input[h_ptr] = temp;
            }
        }

        quick_sort(input, l, h_ptr);
        quick_sort(input, h_ptr+1, h);
    }
}


作者：小芒要吃面包
链接：https://www.acwing.com/activity/content/code/content/2989466/
来源：AcWing
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
