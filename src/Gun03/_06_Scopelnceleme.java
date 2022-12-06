package Gun03;

public class _06_Scopelnceleme {
    public static void main(String[] args) {

        int a=5; // a degeri aşagıdaki parantez bölgesinde geçerli olur
                 // çünkü dışarıdaki içeriye erişebilir.
        {    //bu parantez arası kendine özel bölge oluşturur ve buradaki tanımlanan değişkenler
             // sadece burada geçerli olur. Kullanım amacı karışıklığı azaltmak.

            int b = 5;
            b = 77;
            a=b;
            System.out.println("b = " + b);
        }  // içeride tanımlanan değişkenler sadece içerde kullanılabilir.


        // System.out.println("b = " + b); b değişkenine sadece özel bolgede erişilebilir.
        System.out.println("a = " + a);

    }

}
