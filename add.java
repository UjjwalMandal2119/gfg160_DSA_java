public class add {
    public static void main(String args[]){
        int a=8;
        int b=9;
        int c=a+b;
        Add();
        System.out.println("sum "+ c);
        Add();//calling
    }
    public static void Add(){
        int a=4;
        int b=5;
        int c = a+b;
        Sub();
        System.out.println(c);
    }
     public static void Sub(){
        int a=5;
        int b=2;
        int c=a-b;
        System.out.println(c);
     }
}
