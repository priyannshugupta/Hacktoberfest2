/*
Given 2 numbers - a and b, evaluate a^b

Input Format
First line of input contains T - number of test cases. Its followed by T lines, each line containing 2 numbers - a and b, separated by space.

Constraints
1 <= T <= 1000
0 <= a <= 106
0 <= b <= 109

Output Format
For each test case, print a^b, separated by new line.

Sample Input 
4
5 2
1 10
2 30
10 10

Sample Output 
25
1
73741817
999999937
*/

import java.io.*;
import java.util.*;



public class Solution {
    static boolean checkBit(long N,int i){
        return ((N & (1<<i))!=0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            long a= sc.nextInt();
            long N= sc.nextInt();
            long res = 1;
            long mod = (int)1e9+7;
            for(int j=0;j<32;j++){
                if(checkBit(N,j)){
                    res = (res*a)%mod;
                }
                a = (a*a)%mod;
            }
            System.out.println(res);
        }
    
    }
}
