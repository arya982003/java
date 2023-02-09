import java.io.FileWriter; 
  public class FileArya
{   
  public static void main(String []args) 
     {                try 
        {     
         FileWriter fout=new FileWriter("D:\\Testout.txt");                  fout.write(65);                  fout.close();     
            System.out.println("success...");     
         } 
          catch(Exception e) 
          {System.out.println(e);}     
      }     
}   
