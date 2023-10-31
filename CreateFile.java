import java.io.File;
import java.io.IOException;
public class CreateFile{
   public static void main(String[] args){
   try{
      File myobj=new File("name.txt");
      if(myobj.createNewFile()){
      System.out.println("file created:"+myobj.getName());
}
else{
 System.out.println("file already exists");
}
}catch(IOException e){
  System.out.println("an error occured");
   e.printStackTrace();
}
}
}