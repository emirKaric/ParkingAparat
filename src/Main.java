import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int unos, brojKovanica;
		double kovanica;
		
		
        Scanner input = new Scanner(System.in);
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
                    System.out.print("Unesite cijenu dnevne karte: ");
                    double dnevnaKarta = input.nextDouble();
                    aparat.setDnevna(dnevnaKarta);
                    break;
                case 3:
                    System.out.print("Unesite cijenu sata: ");
                    int cijenaSata = input.nextInt();
                    aparat.setSat(cijenaSata);
                    break;
                case 4:
                    System.out.print("Sve izdate karte: ");
                    for (int i = 0; i < aparat.getSize(); i++) {
                        System.out.println(aparat.getKartu(i).getInfo());
                    }
                    break;
            }
            System.out.println();
        } while (unos != 5);
        input.close();
    }

    public static void menu() {
        System.out.println("Welcome to BILD-IT Aparat Menu");
        System.out.println("Time: " + new Date());
        System.out.println("\t1 --> Kreiraj kartu");
        System.out.println("\t2 --> Unesite cijenu dnevne karte: ");
        System.out.println("\t3 --> Unesite cijenu sata: ");
        System.out.println("\t4 --> Ispis svih izdatih karati: ");
        System.out.println("\t5 --> Exit ");
        System.out.print("Unos: ");
    }
}
