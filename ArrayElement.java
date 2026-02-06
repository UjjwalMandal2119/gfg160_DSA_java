public class ArrayElement {
    public static void main(String args[]){
        int [] arr = new int[5];
        System.out.println(arr);
        arr[0]=1;
        arr[1]=21;
        arr[2]=25;
        arr[3]=29;
        arr[4]=27;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
       // System.out.println(arr[5]);
       int[] other= arr; //one array
       System.out.println(other[0]);
       other[0]=-5;
       System.out.println(arr[0]);
    }
}
