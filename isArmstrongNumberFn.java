import java.util.*;
public class isArmstrongNumberFn {
    public static void main(String args[]){
       System.out.println("Enter a number");
       Scanner sc= new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int n){
        int d = cntDigit(n);
        int sum=0;
        int num=n;
        while(n>0){
            int r = n%10;
            sum+=(int)(Math.pow(r, d));
            n=n/10;
        }
        if(sum == num) return true;
        else return false;
    }
    public static int cntDigit(int n){
        int cnt =0;
        while(n>0){
            cnt++;
            n=n/10;
        }
        return cnt;
    }
}
