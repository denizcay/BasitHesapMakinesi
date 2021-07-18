import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int islem;
        double s1, s2, sonuc;
        System.out.print("İlk sayıyı giriniz:");
        s1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz:");
        s2 = input.nextDouble();
        System.out.println("Toplama 1 / Çıkarma 2 / Çarpma 3 / Bölme 4");
        System.out.print("Yapmak istediğiniz işlemi seçiniz:");
        islem = input.nextInt();

        switch (islem){
            case 1:
                sonuc = s1+s2;
                System.out.println(s1 +" + " +s2+" = " +sonuc);
                break;
            case 2:
                sonuc = s1-s2;
                System.out.println(s1 +" - " +s2+" = " +sonuc);
                break;
            case 3:
                sonuc = s1*s2;
                System.out.println(s1 +" * " +s2+" = " +sonuc);
                break;
            case 4:
                sonuc= s1/s2;
                System.out.println(s1 +" / " +s2+" = " +sonuc);
                break;
        }

    }
}
