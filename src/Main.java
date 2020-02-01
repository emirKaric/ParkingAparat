import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pocetak, kraj, brojKovanica, unos = -1;
        double kovanica;
        String karta;

        Scanner input = new Scanner(System.in);
        Date date;
        Aparat aparat = new Aparat();

        do {
            menu();
            unos = input.nextInt();
            switch (unos) {
                case 1:
                    boolean isTrue;
                    do {
                        System.out.print("Unesite broj kovanica: ");
                        brojKovanica = input.nextInt();
                        System.out.print("Unesite kovanice: ");
                        kovanica = input.nextDouble();
                        isTrue = aparat.izdajKartu(brojKovanica, kovanica);
                    } while (!isTrue);
                    break;
                case 2:
                    System.out.println("Unesite cijenu dnevne karte: ");
                    double dnevnaKarta = input.nextDouble();
                    aparat.setDnevna(dnevnaKarta);
                    break;
                case 3:
                    System.out.println("Unesite cijenu sata: ");
                    int cijenaSata = input.nextInt();
                    aparat.cijenaSata(cijenaSata);
                    break;
                case 4:
                    System.out.println("Sve izdate karte: ");
                    for (int i = 0; i < aparat.getSize(); i++) {
                        System.out.println(aparat.getKartu(i));
                    }
                    break;
            }
        } while (unos != 5);
    }

    public static void menu() {
        System.out.println("Welcome to BILD-IT Aparat");
        System.out.println("Time: " + new Date());
        System.out.println("\t1 --> Unesite kartu");
        System.out.println("\t2 --> Unesite cijenu dnevne karte: ");
        System.out.println("\t3 --> Unesite cijenu sata: ");
        System.out.println("\t4 --> Ispis svih izdatih karati: ");
        System.out.println("\t5 --> Exit ");
    }
}
