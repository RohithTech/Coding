package Coding;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
public class Towrite {
    public static void main(String[] args) {
        File obj =new File("SimpleText.txt");
        try(Scanner myobj = new Scanner(obj)){
            //  FileWriter obj = new FileWriter("SimpleText.txt");
            //  obj.write("Hello from Rohith");
            //  obj.close();
            while(myobj.hasNextLine() )
             System.out.print(myobj.nextLine());
        }
        catch(Exception e){
            System.out.println("The error was Occured");
        }
    }
}
