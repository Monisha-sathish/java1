import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile{
  public static void main(String[] args)
{
try{
  FileWriter myWriter=new FileWriter("name.txt");
   myWriter.write("file in java might be tricky but it is fun enough!!");
   myWriter.close();
   System.out.println("successfully wrote to a file");
   }catch(IOException e)
{
System.out.println("an error occured");
e.printStackTrace();
}
}
}