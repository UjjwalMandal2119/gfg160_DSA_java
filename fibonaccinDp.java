import java.util.HashMap;
import java.util.Scanner;
public class fibonaccinDp {
    public static void main(String args[]){
       System.out.println("Enter a number");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(fib(n));
    }
    public static int fib(int n){
        return fib(n, new HashMap<>());
    }
    public static int fib(int n, HashMap<Integer, Integer> memo){
        if(n==0||n==1){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result = fib(n-1, memo) + fib(n-2,memo);
        memo.put(n, result);
        return result;
    }
}
