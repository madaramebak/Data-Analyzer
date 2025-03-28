import java.io.*;
import java.util.ArrayList;

public class Parser{
    private String delimiter; 
    private char quote;
    
    public Parser(){
        this.delimiter = ",";
        this.quote = '"';
    }

    public ArrayList<String[]> parseCSV(String filePath){
        String line; 
        ArrayList<String[]> myData = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            while((line = reader.readLine()) != null){
            myData.add(line.split(this.delimiter));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return myData;
    }


    
}