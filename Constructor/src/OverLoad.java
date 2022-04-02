public class OverLoad {

    public OverLoad(String name, int id) {
        Main.yaz("2 li Yapıcı çalıştı");
        this.isim=name;
        this.kod=id;
    }

    public OverLoad(String name, int id, int count){
        Main.yaz("3 lü yapıcı çalıştı");
        this.isim=name;
        this.kod=id;
        this.sayi=count;
    }
    public OverLoad(){
        Main.yaz("Boş yapıcı çalıştı");
    }

    String isim;
    int kod;
    int sayi;

}
