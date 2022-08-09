package sayiBulmaca;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class codingPage {
    static int [] sayiArr =new int[4];
    static String [] sayiArr1 =new String[4];
    static Scanner scan=new Scanner(System.in);

    public static void oyunaGiris() throws IOException {
        System.out.print("Aciklama icin 1'i, oyuna baslamak icin 2'yi giriniz : ");
        char giris= scan.nextLine().charAt(0);
        switch (giris){
            case '1':
                aciklamaGetir();
                sayiUret();
                sayiKontrol();
                break;
            case '2':
                sayiUret();
                sayiKontrol();
                break;
            default:
                System.out.println("Yanlis deger girdiniz");
                oyunaGiris();

        }
    }
    public static void aciklamaGetir() throws IOException {
        int k;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/sayiBulmaca/aciklama.txt");

            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi veya bozuk");
        } catch (IOException e) {
            System.out.println("Dosyadan bilgiler okunamadi");
        }
        System.out.println();
    }
    public static void sayiUret() {
        Random rnd=new Random();
        //int [] sayiArr =new int[4];
        int low=1000;
        int high=9999;
        int test=0;
        do {
            int sayi = rnd.nextInt(high - low) + low;
            sayiArr[3] = sayi % 10;          // 4. basamak
            sayiArr[2] = (sayi / 10) % 10;
            sayiArr[1] = (sayi / 100) % 10;
            sayiArr[0] = sayi / 1000;

            for (int i = 0; i <sayiArr.length ; i++) {  // 1251
                for (int j = 0; j <sayiArr.length ; j++) {
                    if (sayiArr[i]==sayiArr[j]){
                        test++;
                    }
                }
            }
            if (test==4){
                break;
            } else {
                test=0;
            }
        }while (test<4);
            sayiArr1[3]=String.valueOf(sayiArr[3]);
            sayiArr1[2]=String.valueOf(sayiArr[2]);
            sayiArr1[1]=String.valueOf(sayiArr[1]);
            sayiArr1[0]=String.valueOf(sayiArr[0]);
    }

    public static void sayiKontrol() {
        System.out.println("OYUN BASLIYOR");
        int[] girilenSayiArr=new int[4];
        int arti;
        int eksi;
        int kacKeredeBuldun=0;
        int toplamBulunan;
        int test;

        do{
            arti=0;eksi=0;test=0;toplamBulunan=0;
            System.out.print("Lutfen 4 basamakli, rakamlari birbirinden farkli bir sayi giriniz :");
            int girilenSayi= scan.nextInt();

            girilenSayiArr[3]=girilenSayi%10;       // birler basamagini verir
            girilenSayiArr[2]=(girilenSayi/10)%10;
            girilenSayiArr[1]=(girilenSayi/100)%10;
            girilenSayiArr[0]=girilenSayi/1000;

            for (int i = 0; i <girilenSayiArr.length ; i++) {
                for (int j = 0; j <girilenSayiArr.length ; j++) {
                    if (girilenSayiArr[i]==girilenSayiArr[j]){
                        test++;
                    }
                }
            }
            if (girilenSayi<1000 || girilenSayi>9999){
                System.out.println("Girilen "+girilenSayi+" sayisi dort basamakli degildir.");
            }else if (test>4){
                System.out.println("Girilen "+girilenSayi+" sayisi icinde ayni rakam vardir.");
            } else{
                for (int i = 0; i <girilenSayiArr.length ; i++) { //
                    for (int j = 0; j <sayiArr.length ; j++) {
                        if(girilenSayiArr[i]==sayiArr[j]){
                            toplamBulunan++;
                        }
                    }
                }
                for (int i = 0; i <girilenSayiArr.length ; i++) {
                    if(girilenSayiArr[i]==sayiArr[i]){
                        arti++;
                    }
                }
                eksi=toplamBulunan-arti;
                kacKeredeBuldun++;
                if (arti==4){
                    System.out.println("Sayiniz : " + Arrays.toString(girilenSayiArr));
                    System.out.println("+ "+arti +"  Tebrikler, " + kacKeredeBuldun + ". denemede buldunuz.");
                    System.out.println("Tutulan Sayi : " + Arrays.toString(sayiArr));
                } else{
                    //System.out.println("Sayiniz : " + Arrays.toString(girilenSayiArr));
                    System.out.println("+ " + arti + ", - "+eksi);
                }
            }
        }while(arti<4);
    }

}
