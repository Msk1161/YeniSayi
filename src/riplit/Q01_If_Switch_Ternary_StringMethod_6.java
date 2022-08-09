package riplit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q01_If_Switch_Ternary_StringMethod_6 {
    /*
    Ask user to type a name,
    the length of name should be 3.
    Then check if the name has same characters.

    If the String has same characters
    Print "String has duplicate characters" Else
    Print "String has unique characters"

TR  Kullanıcıdan bir ad yazmasını isteyin, 1- String bir ifade istenecek
    adının uzunluğu 3 olmalıdır.            2- 3 veya daha uzun olacak
    Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

    Dize aynı karakterlere sahipse
    Yazdır "Dize çift karakterler içeriyor" Aksi takdirde
    Yazdır "Dizenin benzersiz karakterleri var"

    Lütfen üçlü kullanın.
    Giriş :

    ala - abc
    Çıktı:
    Dize yinelenen karakterler içeriyor
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str;
        int count = 0;
        do {
            System.out.println("Bir String ifade giriniz");
            str = scan.nextLine();
                           // 1. Yol
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {  // j=0 dan baslatilabilir, o zaman count>str.length deriz yine olur
                    if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {   //substru
                        count++;
                        System.out.println(count);
                        break;
                    }
                }
                if (count>0) break;
            }
        } while (str.length()<3); // 0-1-2 index'ine sahipse
        System.out.println(count>0? "Your String has duplicate characters" :count==0?" Your String has unique characters":"");
str.substring(1);
        /*
        ahbaba  0'inci index icin
        1- i=0 icin j= 0+1=1 icin - a=h ? hayir
        2- i=0 icin j= 0+2=2 icin - a=b ? hayir
        3- i=0 icin j= 0+3=3 icin - a=a ? evet count=1
        4- i=0 icin j= 0+4=4 icin - a=b ? hayir
        5- i=0 icin j= 0+5=5 icin - a=a ? evet count=2
        1'inci index
        1- i=1 icin j= 1+1=2 icin - h=b ? hayir
        2- i=1 icin j= 1+2=3 icin - h=a ? hayir
        3- i=1 icin j= 1+3=4 icin - h=b ? hayir
        4- i=1 icin j= 1+4=5 icin - h=a ? hayir

         */

        String[] arr= str.split("");    // 2.yol
        Arrays.sort(arr);
        count=0;
        for (int i = 0; i <arr.length-1 ; i++) {
                if (arr[i].equals(arr[i+1])){
                    count++;
                    System.out.println(count>0? "Your String has duplicate characters" :" Your String has unique characters");
                    break;
                }
        }
    }
}
