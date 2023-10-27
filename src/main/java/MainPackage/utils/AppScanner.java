package MainPackage.utils;

import java.util.Scanner;

public class AppScanner {
    public static Scanner scanner;
    public static Scanner getScanner(){
        if(scanner==null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
