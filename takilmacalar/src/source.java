public class source {

        //System.out.println ile tekrar tekrar uğraşmamak için
    public static void  yaz (String text){
        System.out.println(text);
    }

    public static void main(String[] args){

            //Tanımlamalar
        Product urun1= new Product();
        Product urun2= new Product();

        ProductManager yonetici = new ProductManager();

            //Ürünleri üzerinde işlem yapacağımız sınıfa yolluyoruz.
        yonetici.Add(urun1);
        yonetici.Add(urun2);



    }


}
