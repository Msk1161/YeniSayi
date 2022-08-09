package sayiBulmaca;

import java.util.Arrays;

import static sayiBulmaca.codingPage.*;

public class sayiOtoKontrol {
    public static void main(String[] args) {
        sayiUret();
        System.out.println(Arrays.toString(sayiArr));
        System.out.println("OYUN BASLIYOR");
        String [] girilenSayiArr=new String[4];
        int girsay=0;
        int arti;
        int eksi;
        int kacKeredeBuldun=0;
        int toplamBulunan;
        int test;

        do{
            arti=0;eksi=0;test=0;toplamBulunan=0;
            System.out.print("Lutfen 4 basamakli, rakamlari birbirinden farkli bir sayi giriniz :");
            String girilenSayi= scan.nextLine();
            try{
                girsay=Integer.parseInt(girilenSayi);
                System.out.println("aaaaa");

            }catch (NumberFormatException e){
                System.out.println("Girilen ifade sadece rakamlardan olusmali ");
                arti=0;
            }

            girilenSayiArr[3]=girilenSayi.substring(3);
            girilenSayiArr[2]=girilenSayi.substring(2,3);
            girilenSayiArr[1]=girilenSayi.substring(1,2);
            girilenSayiArr[0]=girilenSayi.substring(0,1);

            for (int i = 0; i <girilenSayiArr.length ; i++) {
                for (int j = 0; j <girilenSayiArr.length ; j++) {
                    if (girilenSayiArr[i].equals(girilenSayiArr[j])){
                        test++;
                    }
                }
            }
            if (girilenSayi.length()==3){
                System.out.println("Girilen "+girilenSayi+" sayisi dort basamakli degildir.");
            }else if (test>4){
                System.out.println("Girilen "+girilenSayi+" sayisi icinde ayni rakam vardir.");
            } else{
                for (int i = 0; i <girilenSayiArr.length ; i++) { //
                    for (int j = 0; j <sayiArr1.length ; j++) {
                        if(girilenSayiArr[i].equals(sayiArr1[j])){
                            toplamBulunan++;
                        }
                    }
                }
                for (int i = 0; i <girilenSayiArr.length ; i++) {
                    if(girilenSayiArr[i].equals(sayiArr1[i])){
                        arti++;
                    }
                }
                eksi=toplamBulunan-arti;
                kacKeredeBuldun++;
                if (arti==4){
                    System.out.println("Sayiniz : " + Arrays.toString(girilenSayiArr));
                    System.out.println("+ "+arti +"  Tebrikler, " + kacKeredeBuldun + ". denemede buldunuz.");
                    System.out.println("Tutulan Sayi : " + Arrays.toString(sayiArr1));
                } else{
                    //System.out.println("Sayiniz : " + Arrays.toString(girilenSayiArr));
                    System.out.println("+ " + arti + ", - "+eksi);
                }
            }
        }while(arti<4);
    }
    }

