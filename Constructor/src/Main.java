import java.util.Scanner;
public class Main {

        //Çıktıyı kolaylaştırmak amaçlı
    public static void yaz(String text){System.out.println(text);}

    public static void main(String[] args){

        boolean loop=true;
        while(loop) {
            Scanner input = new Scanner(System.in);
            yaz("0 girerseniz boş constructor 2 girerseniz 2li, 3 girerseniz 3lü constructor çalışacak");
            int deger = input.nextInt();
            if (deger == 2) {
                OverLoad alf = new OverLoad("Kendisi", 340);
            } else if (deger == 3) {
                OverLoad alf = new OverLoad("Kendisi", 340, 5);
            } else {
                OverLoad alf = new OverLoad();
            }
            yaz("Döngüde kalmak istiyorsanız 'True' çıkmak istiyorsanız 'False' giriniz");
            loop= input.nextBoolean();
        }
    }
}
