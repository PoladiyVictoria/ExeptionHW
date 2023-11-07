package data;

import java.io.FileWriter;
import java.io.IOException;

public class file {
    public void recordInFile(String[] contact){
        String fileName = contact[0];
        FileWriter fileWriter = null;
        String cont = String.join(" ", contact);
        try {
           fileWriter = new FileWriter(fileName.toLowerCase() + ".txt");
           fileWriter.write(cont);
           
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            }
            catch (Exception e){

            }

        }
    }
    
    
}
