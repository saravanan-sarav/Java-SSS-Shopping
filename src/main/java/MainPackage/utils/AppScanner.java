package MainPackage.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppScanner {
    public static Scanner scanner;
    public static Scanner fileScanner;
    public static Scanner getScanner(){
        if(scanner==null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static Scanner getFileScanner(File file)  {
        File csvFile = file;
        if(fileScanner==null){
            try {
                fileScanner = new Scanner(csvFile);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return fileScanner;
    }
}
