import java.util.Scanner;
public class ProductManager {

    public void Add(Product product){

        Scanner input= new Scanner(System.in);

            //Ürün ismini alıyoruz
        source.yaz("Kayda geçirmek istediğiniz ürünün ismini giriniz.");
        product.name= input.nextLine();

            //Ürün seri numarasını alıyoruz
        source.yaz("Kayda geçirmek istediğiniz ürünün seri numarasını giriniz.");
        product.id=input.nextInt();


            //Ürünü yazıyoruz
        source.yaz("Ürün eklendi: "+ product.name);

    }


}
