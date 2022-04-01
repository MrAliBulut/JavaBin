import java.util.Scanner;
public class vektor {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Merhaba. Bugün sizlerle vektörleri dizilerde saklayıp daha sonra onlar ile işlem yapacağız.");
        double v[][]= new double[2][3];
        
        
        for(int i=0; i<2; i++){
            
            
            for(int j=0; j<3; j++){
                if(i==0){
                    System.out.println("İlk vektörünüzün x,y ve z eksenlerindeki değerlerini giriniz.");
                }
                else{
                    System.out.println("İkinci vektörünüzün x,y ve z eksenlerindeki değerlerini giriniz.");
                }
                v[i][j]= input.nextDouble();
            }
        }


        double x1=0,x2=0,y1=0,y2=0,z1=0,z2=0;
        x1= v[0][1] * v[1][2];
        x2= v[0][2] * v[1][1];

        y1= v[0][0] * v[1][2];
        y2= v[0][2] * v[1][0];

        z1= v[0][0] * v[1][1];
        z2= v[0][1] * v[1][0];

        double c1= x1-x2;
        double c2= (y1-y2)*-1;
        double c3= z1-z2;

        double sonuc[]= {c1,c2,c3};

        System.out.print("Girdiğiniz vektör değerlerinin vektörel çarpımı= ");
        for(int s=0; s<3; s++){
            System.out.print(sonuc[s]+",");
        }
    }   
    
}
