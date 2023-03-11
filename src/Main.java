import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create variables
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.0;
        double armutkilo,elmakilo,domateskilo,muzkilo,patlıcankilo;
        double armut1, elma1, domates1, muz1, patlıcan1,sonuc;

        // create scanners
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kilosu: ");
        armutkilo = input.nextDouble();

        System.out.print("Elma kilosu: ");
        elmakilo = input.nextDouble();

        System.out.print("Domates kilosu: ");
        domateskilo = input.nextDouble();

        System.out.print("Muz kilosu: ");
        muzkilo = input.nextDouble();

        System.out.print("Patlıcan kilosu: ");
        patlıcankilo = input.nextDouble();

        // calculations
        armut1 = armut * armutkilo;
        elma1 = elma * elmakilo;
        domates1 = domates * domateskilo;
        muz1 = muz * muzkilo;
        patlıcan1 = patlıcan * patlıcankilo;
        sonuc = armut1 + elma1 + domates1 + muz1 + patlıcan1;

        // output
        System.out.println("Ödenecek tutar :" + sonuc);
    }
}