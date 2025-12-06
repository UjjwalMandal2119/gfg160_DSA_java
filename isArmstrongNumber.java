import java.util.Scanner;
public class isArmstrongNumber {
    public static void main(String args[]){
        System.out.println("Enter a number");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int num =n;
    int num1=n;
    int cnt=0;
    int sum=0;
    while(n>0){
        n=n/10;
        cnt++;
    }
    System.out.println("number of digits " + cnt);
     while(num1>0){
        int r =num1%10;
        num1=num1/10;
      sum+=Math.pow(r,cnt);
     }
     if(sum==num){
        System.out.println("Given number is Armstrong number");
     }else{
        System.out.println("Given number is not a Armstrong number");
     }
    }
}
