import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int s = 0;
        if(N%2 == 1)
        N--;
        while(N>=2)
        {
            s+= N;
            N-=2;
        }
