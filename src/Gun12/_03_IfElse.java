package Gun12;

import sun.security.rsa.RSASignature;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {

        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 10 saate kadar 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız.


        Scanner oku=new Scanner(System.in);
        System.out.println("Saati giriniz=");
        int saat= oku.nextInt();

        if (saat <= 3)
        {
            System.out.println("10 tl");
        }
        else { // BURASI ZATEN 3 DEN BÜYÜKSE DEMEK
            if (saat <= 5) {
                System.out.println("15 tl");
            }
            else {
                System.out.println("20 tl");
                }
            }
        }





    }

