import java.io.IOException;

import data.contact;
import data.file;
import exeption.LengthNameExeption;

public class programm {
    public static void main(String[] args) throws IOException {
       final contact con = new contact();
       final file file = new file();
  
    try {
        String[] contact = con.createContact();
        file.recordInFile(contact);
    } catch (LengthNameExeption e) {
        e.printStackTrace();
    }
         
       System.out.println("success");
        

    }

}   