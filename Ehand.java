public class Ehand {
    public static void main(String[] args) {
        int a =9;
        int b=0;
        try{
            int c=a/b;
        System.out.println(c);
        }
        // catch(Exception x){
        //     System.out.println("Error"+x);
        // }
        catch(ArithmeticException j){
System.out.println(j);
        }
        catch(ArrayIndexOutOfBoundsException i){
            System.out.println(i);
        }
        
        int d=a+b;
        System.out.println(d);
    }
}
