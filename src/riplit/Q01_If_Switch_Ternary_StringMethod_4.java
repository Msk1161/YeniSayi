package riplit;

import java.util.Scanner;

public class Q01_If_Switch_Ternary_StringMethod_4 {
    /*
    Write a switch statement that tests the value of the char variable response and performs the following actions:
if response is a, the message Your request is being processed is printed
if response is b, the message Thank you anyway for your consideration is printed

if response is c, the message Sorry, no help is currently available is printed for any other value of response, the
message "Invalid entry, please try again!" is printed
Create Scanner object.
Use charAt0 method, in order to get the char value at the specified index.

Example:
Display prompt: "Enter command:"
input: a -Display prompt: "Your request is being processed"

Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
yanıt a ise, talebiniz işleniyor mesajı yazdırılır
yanıt b ise, yine de ilgilendiğiniz için teşekkür ederiz mesajı yazdırılır

yanıt c ise, Üzgünüz, şu anda herhangi bir yardım yok mesajı, yanıtın başka herhangi bir değeri için yazdırılır,
"Geçersiz giriş, lütfen tekrar deneyin!" mesajı yazdırılır
Tarayıcı nesnesi oluşturun.
Belirtilen dizindeki char değerini almak için charAt 0 yöntemini kullanın.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input a or b or c caracter");
        char harf=scan.nextLine().charAt(0);
       /*
        switch (harf){
            case 'a':
                System.out.println("Your request is being processed");
                break;
            case 'b':
                System.out.println("Thank you anyway for your consideration");
                break;
            case 'c':
                System.out.println("Sorry, no help is currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again!");

        }

        if(harf=='a'){
            System.out.println("Your request is being processed");
        } else if (harf=='b'){
            System.out.println("Thank you anyway for your consideration");

        } else if (harf=='c'){
            System.out.println("Sorry, no help is currently available");

        }else System.out.println("Invalid entry, please try again!");*/

        System.out.println(harf=='a'?"Your request is being processed":harf=='b'?"Thank you anyway for your consideration":harf=='c'?"Invalid entry, please try again!":"Invalid entry, please try again!");
    }

}
