import java.util.Scanner;

    //Oyunumuzun koşul hesaplarını bu sınıfta yapıyoruz.
public class TasKagitMakas {

        //Source sınıfımızdan makine ve oyuncunun değerini alıyoruz. Ayrıca puan hesabı için sayaç değerinide her seferinde tekrar hesaplıyoruz.
    public static int Oyun(int makine, int insan,int sayac){

                //Makinenin kazandığı durumlar
            if((makine==0 && insan==2) || (makine==1 && insan==0) || (makine==2 && insan==1)) {
                Source.yaz("Tur sona erdi.\nMakine kazandı");
                sayac=sayac-5;
            }
                //Oyuncunun kazandığı durumlar
            else if ((insan==0 && makine==2) || (insan ==1 && makine==0) || (insan==2 && makine==1)) {
                Source.yaz("Tur sona erdi.\nSiz kazandınız");
                sayac=sayac+5;
            }
                //Berabere kalma durumları
            else {
                Source.yaz("Makine ile aynı değeri girdiniz. \nKazanan yok");
            }
                //Puan hesabı için sayaç değerinin yeni değerini döndürüyoruz.
            return sayac;
        }

    }