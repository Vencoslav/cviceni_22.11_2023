import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>();//vytvořím si seznam čísel s jménem seznam
        Random random = new Random();//nový objekt Random
        int nahodneCislo = 10;

        for(int i = 0; i <=nahodneCislo; i++) {//vypiš 10 čísel
            int randomNumber = random.nextInt(100); //nahodne číslo s maximem 100
            if(i>6) {//vypis jen větší než 6
                System.out.println("Cislo:" + randomNumber);
            }
        }
//        for(int cislo : seznam) {
//            if (cislo > 6) {
//
//                System.out.println("Cisl:" + cislo
//        }
    }

}


