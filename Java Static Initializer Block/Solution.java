import java.io.*;
import java.util.*;

public class Solution {

    public static void check(int l, int b)
    {
        /*this.l=l;
        this.b=b;*/
        if(l>0 && b>0){
            System.out.println(l*b);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        check(a,b);
    }
}   
