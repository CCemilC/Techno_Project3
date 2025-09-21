package Project3;

import java.util.Scanner;

public class palindrom {

    public static Boolean ispalindrom(String str) {
        String reverse="";

        for (int i = str.length()-1; i >=0; i--) {
            reverse+=str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)){
            System.out.println("This is a Polindrom text");
            return true;

        }else {
            System.out.println("This is NOT a Polindrom text");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Text:");

        String userEnrty=scanner.nextLine();

        ispalindrom(userEnrty);
    }
}
