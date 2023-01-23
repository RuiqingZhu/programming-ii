package session6.fileExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        //using Java.io.file gives you ability to access to the physical information of a file
        File file = new File("src/session6/fileExample/files/testfile.txt");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));

        File file2 = new File("src/session6/fileExample/files");
        if (file2.isDirectory()) {
            File[] filesInFolder = file2.listFiles();
            for (File fileInfolder : filesInFolder) {
                System.out.println(fileInfolder.getName());
            }
        }

        //How to Create and write data to file
        //Checked Exception -> compile time


        File fileToWrite = new File("files/testfileToWrite1");
        if(fileToWrite.exists()){
            System.out.println("The file already exists");
        }
        else{
            //to create a file
            try (PrintWriter writer = new PrintWriter(fileToWrite)) {
                // Write formatted output to the file
                writer.print("John T Smith ");
                writer.println(90);
                writer.print("Eric K Jones ");
                writer.println(85);
            }
        }

        try (PrintWriter writer = new PrintWriter("files/testfileToWrite2")) {
            // Write formatted output to the file
            writer.print("John T Smith ");
            writer.println(90);
            writer.print("Eric K Jones ");
            writer.println(85);
        }


        //reading from a file
        File fileToWriteNotExists = new File("files/testfileToWriteRRRRR");
        if(fileToWriteNotExists.exists()){
            Scanner input = new Scanner(fileToWriteNotExists);
            // Read data from a file
            while(input.hasNext()){
                String firstName = input.next();
                String mi = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(
                        firstName + " " + mi + " " + lastName + " " + score);

            }

            input.close();
        }
        else{
            //maybe you want to create a file
        }


        //make an empty file
        //try-with-resource -> whatever resource such as Network/socket/database/file
        //that we open and we NEED to close, by using this feature, we do NOT need to close
        //those resources and it is implicitly being taken care of.
        try (PrintWriter writer = new PrintWriter("files/emptyFile")) {
            // Write formatted output to the file
        }

    }
}
