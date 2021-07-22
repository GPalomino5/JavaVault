import java.io.*;
public class Java_to_String {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;

         int num_bytes = in.available();

         byte [] str = new byte[num_bytes];

         int index =0;

         while ((c = in.read()) != -1) {
            str[index] = (byte)c;
            out.write(c);
            index++;
         }

         String string = new String(str);
         System.out.println("\n"+string);
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}