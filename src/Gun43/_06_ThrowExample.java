package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı=");
        String userName= oku.nextLine();

        System.out.println("Şifre=");
        String password= oku.nextLine();

        try {

            if (password.length() < 8)
                System.out.println("Şifre 8 karakterden az olamaz");

            if (password.length() > 15)
                System.out.println("Şifre 15 karakterden fazla olamaz");
        }
        catch (Exception ex)
        {

        }

    }
}
