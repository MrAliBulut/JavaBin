import java.util.Scanner;

public class Source {

        //Kolayca çıktı vermek amacıyla kullandım.
    public static void yaz(String text){System.out.println(text);}

    public static void main(String[] args){


            //Tanımlamalar
        Scanner input = new Scanner(System.in);
        GenerateRandom random = new GenerateRandom();
        TasKagitMakas taskagitmakas= new TasKagitMakas();
        int dongu=1,sayac=0,insan,makine;

            //Oyun hakkında ufak bilgiler veriyoruz
        yaz("Taş Kağıt ve Makas oyunumuza hoş geldiniz.\nRastgele bir değer tutan makinemiz ile mücadele edeceksiniz.\nHer makine kazandığında 5 puan kaybedecek \nHer siz kazandığınız da 5 puan kazanacaksınız");

            //Oyunun tek turda bitmemesi için döngüye sokuyoruz.
        while(dongu==1){

                //Makineye bir değer atıyoruz.
            makine = random.Randomize();
            yaz(""+makine);
                //Oyuncudan girdi alıyoruz.
            yaz("Taş=0, Kağıt=1, Makas=2 değerlerinden birini giriniz.");
            insan= input.nextInt();

                //Puan sistemi için hesabı her tur için kazanan belirlediğimiz sınıfta hesaplıyoruz.
            sayac=taskagitmakas.Oyun(makine,insan,sayac);

                //Oyuna devam etmek istenilip istenilmediğini sorguluyoruz.
            yaz("Tekrar oynamak için 1, Oyunu bitirmek için başka bir değer tuşlayınız. ");
            dongu = input.nextInt();

        }
            //Oyunun sonuçlarını yazdırıyoruz.
        yaz("Oyun sona erdi.\nToplam puanınız= "+sayac);
    }
}
