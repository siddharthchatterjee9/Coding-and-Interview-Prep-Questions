package kyu7;

import java.util.*;

/* https://www.codewars.com/kata/604517d65b464d000d51381f/java */
// Strange Maths logic building
// Notice how arrays.sort is different on both int[] and String[] arrays
public class Demo {
    public static void main (String... args) {
        Strange obj = new Strange();
        obj.mathematics(15, 5);
    }
}

class Strange{
    public void mathematics(int n, int k){
        String[] number = new String[n];
        int res = 0;
        for(int i = 0; i < n; i++){
            number[i] = String.valueOf(i + 1);
        }
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        /* for(int i = 0; i < n; i++){
            if(number[i].equals(String.valueOf(k))) {
                res = i + 1;
                break;
            }
        }
        return res; */
    }
}