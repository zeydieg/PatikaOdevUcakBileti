import java.util.Scanner;
public class biletfiyati {
    public static void main(String[] args) {
            Scanner inp = new Scanner (System.in);
            int km, age, giddon;
            double ageDis = 0;

            System.out.print("Gideceğiniz kilometreyi giriniz : ");
            km = inp.nextInt();
            System.out.print("Yaşınızı giriniz : ");
            age = inp.nextInt();
            System.out.println("Bilet türünü seçiniz : \n1-Tek Yön\n2-Gidiş-Dönüş");
            System.out.print("Seçiminiz : ");
            giddon = inp.nextInt();

            double normal = (km * 0.10);

            if (age >= 0) {
                    if (age < 12) {
                            ageDis = 0.50;
                    } else if ((age >= 12) && (age <= 24)) {
                            ageDis = 0.10;
                    } else if (age >= 65) {
                            ageDis = 0.30;
                    }
            } else {
                    System.out.print("Hatalı giriş yaptınız. Tekrar deneyiniz.");
                    }
            double yasIndrm = (normal * ageDis), indirimli = (normal - yasIndrm), giddonDis = (indirimli * 0.20), toplam = ((indirimli - giddonDis)*2);

                            if (giddon == 1) {
                                    System.out.println("Bilet fiyatı : " + indirimli + " TL");
                            } else if (giddon == 2) {
                                    System.out.print("Bilet fiyatı : " + toplam + " TL");
                            } else {
                                    System.out.print("Hatalı giriş yaptınız. Tekrar deneyiniz.");
                            }
                    }
            }