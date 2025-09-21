package Project3;

import java.util.Scanner;

public class _UpperLOwerCase {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Text:");
        String userEntry=scanner.nextLine();

        String upperText=upperCase(userEntry);
        String lowerText=lowerCase(userEntry);

        System.out.println("Upper Text:"+upperText);
        System.out.println("Lower Text:"+lowerText);



        // Kullanıcıdan cümle alınır (örneğin: "Merhaba dünya!").
        // Her bir fonksiyon kullanılarak cümle farklı formatlarda yazdırılır.
    }

    public static String upperCase(String str) {
        return str.toUpperCase();
    }

    public static String lowerCase(String str) {
        return str.toLowerCase();
    }

}