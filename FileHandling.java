import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] ArrF= new String[10];//Stores Files.
        boolean exit=false;
        File f=new File("C:\\Users\\pacan\\Desktop\\Folder\\");

        while(!exit){
            System.out.println(">>>File Handler<<<");
            System.out.println("1. Create & Save");
            System.out.println("2. Load");
            System.out.println("3. Delete");
            System.out.println("4. Modify");
            System.out.println("5. Exit");
            System.out.print("Please Enter Choice: ");
            int choice=sc.nextInt();

            if (choice==1){

                try {
                    sc.nextLine(); // clear leftover newline

                    System.out.print("Enter File Name: ");
                    String Fname = sc.nextLine();

                    FileWriter writer = new FileWriter("C:\\Users\\pacan\\Desktop\\Folder\\" + Fname + ".txt");

                    System.out.println("Enter Contents: ");
                    String content = sc.nextLine();

                    writer.write(content);
                    writer.close();

                    System.out.println("Content written to file: " + Fname + ".txt");

                } catch (IOException e) {
                    System.out.println("ERROR HAPPENED WHILE MAKING FILE");
                }


            } else if (choice==2) {
                File find=new File("C:\\Users\\pacan\\Desktop\\Folder");

                if(find.isDirectory()){
                    String[] fileNames = find.list();
                    System.out.println(Arrays.toString(fileNames));
                }else {
                    System.out.println("ERROR IN LOCATING FILES");
                }

                    System.out.println("Insert file name you would like to read: ");
                    String Rname= sc.next();

                    try(BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\pacan\\Desktop\\Folder\\"+Rname+".txt"))) {
                        String info;
                        while ((info = reader.readLine()) != null) {
                            System.out.println(info);
                        }
                        System.out.println(Rname);

                    } catch (FileNotFoundException e) {
                        System.out.println("FILE NOT FOUND OR YOU DID NOT PUT .txt IN THE END");
                    }catch (IOException e){
                        System.out.println("FILE ERROR");
                    }



            } else if (choice==3) {

                sc.nextLine(); // clear leftover newline

                System.out.print("Insert .txt file name to delete: ");
                String DelName = sc.nextLine();


                File delfile=new File("C:\\Users\\pacan\\Desktop\\Folder\\"+DelName+".txt");

                if(delfile.exists()){
                    if (delfile.delete()){
                        System.out.println("Successfully Deleted: "+DelName);
                    }
                    else {
                        System.out.println("ERROR COULD NOT DELETE");
                    }
                }
                else {
                    System.out.println("FILE DOES NOT EXIST");
                }



            } else if (choice==4) {
                System.out.println("Please enter file that you want to Modify: ");
                String mod= sc.next();

            } else if (choice==5) {
                System.out.println("UNSAVED PROGRESS WILL BE DELETED.");
                System.out.println("NOW EXITING");
                exit=true;
            }


        }
       sc.close();
    }
}
