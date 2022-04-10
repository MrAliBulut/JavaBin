import java.util.Random;

    //Makine için tutacağımız değeri buradan hesaplatıyoruz.
public class GenerateRandom {

    public int Randomize(){
        Random random = new Random();
        int makine= random.nextInt(3);
        return makine;
    }
}
