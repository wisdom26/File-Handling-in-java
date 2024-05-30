import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileH {
    public static void main(String[] args)  {
        File a=new File("abc.txt");
       try{ 
       if( a.createNewFile()){
        System.out.println("Created succesasfully");
       }
       else{
         System.out.println("File Alredy Exists");
       }
    }
       catch(Exception e){
              System.out.println("Not created succesasfully");
       }


       if(a.exists()){
            System.out.println("File Name is:"+a.getName());
            System.out.println("File path:"+a.getAbsolutePath());
            System.out.println("File parent:"+a.getParent());
            System.out.println("File length:"+a.length());
            System.out.println("File is readble:"+a.canRead());
            System.out.println("File is writeble:"+a.canWrite());
       }else{
        System.out.println("File not found");
       }
       try{
       FileWriter b=new FileWriter("abc.txt");
       b.write("Writen using java");
       b.close();
       System.out.println("File written successfully");
       }catch(Exception e){
        System.out.println("File not written successfully");
       }
       try{
        File c=new File("abc.txt");
        Scanner d=new Scanner(c);
        while (d.hasNextLine()) {
            String data=d.nextLine();
            System.out.println(data);
        }
       }catch(Exception e){
        System.out.println(e);
       }
       if(a.exists()){
        a.delete();
        System.out.println("file is delete");
       }
       else{
        System.out.println("File not found");
       }
    }
}
