public class Array_swap_demo {
    public static void main(String args[]){
     int [] arr={4,5,8,9,15,24};
     System.out.println(arr[0]+" "+arr[1]);
     Swap(arr,0,1);  
     System.out.println(arr[0]+" "+ arr[1]); 
    }
    public static void Swap(int []arr, int i,int j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]+" ");
      }
      }
       
    
}
