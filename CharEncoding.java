import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author piotrkowalski
 */
public class CharEncoding {   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader in=null;
        BufferedWriter out=null;        
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\piotrek\\program\\plik.txt"), "UTF8"));
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\piotrek\\program\\plik2.txt"), "cp1250"));
            String linijka = in.readLine();
            out.write(linijka);
            System.out.println(linijka);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                System.out.println("Wyj¹tek w sekcji finally podczas zamykania in.");
            }
             try {
                out.close();
            } catch (IOException ex) {
                System.out.println("Wyj¹tek w sekcji finally podczas zamykania out.");
            }
        }
  
      
    }
    
}