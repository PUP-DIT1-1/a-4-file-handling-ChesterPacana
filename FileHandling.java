import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] ArrF= new String[10];//Stores Files.
        boolean exit=false;

        while(!exit){
            System.out.println(">>>File Handler<<<");
            System.out.println("1. Create & Save");
            System.out.println("2. Load");
            System.out.println("3. Delete");
            System.out.println("4. Exit");
            System.out.print("Please Enter Choice: ");
            int choice=sc.nextInt();

            if (choice==1){
                try{
                    //User prompt for .txt name
                    System.out.println("Enter File name: ");
                    String Fname=sc.next();
                    //Content of file
                    System.out.println("Plase write contents: ");
                    String Fcontent= sc.next();
                    try(FileWriter writer=new FileWriter(Fname)){
                        writer.write(Fcontent);
                        System.out.println("Successfully wrote content on "+Fname);
                    }


                } catch (Exception e) {
                    System.out.println("ERROR HAPPENED WHILE MAKING FILE");
                }

            } else if (choice==2) {
                System.out.println("Insert .txt file name: ");
                String Rname= sc.nextLine();//To enter file name and read it.
                //FOR CODER: This is to use to find file names


            } else if (choice==3) {
                System.out.println("Insert .txt file name to delete: ");
                String DelName= sc.nextLine();//to find and delete files
                //FOR CODER: This is to use to delte file names


            } else if (choice==4) {
                System.out.println("UNSAVED PROGRESS WILL BE DELETED.");
                System.out.println("NOW EXITING");
                exit=true;
            }


        }
       sc.close();
    }
}
