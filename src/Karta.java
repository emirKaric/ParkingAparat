import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Karta {

	private String vrstaKarte;
	private Date datum;
	private int id;
	private static int trenutniId;
	private int ukupnoSati;

	Karta(String vrstaKarte, int ukupnoSati) {
		this.ukupnoSati = ukupnoSati;
		this.vrstaKarte = vrstaKarte;
		this.id = trenutniId++;
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		this.datum = new Date();
		df.format(datum);

	}

	public String getVrstaKarte() {
		return vrstaKarte;
	}

	public Date getDatum() {
		return datum;
	}

	public int getId() {
		return id;
	}

	public static int getTrenutniId() {
		return trenutniId;
	}

	public int getUkupnoSati() {
		return ukupnoSati;
	}

	@Override
	public String toString() {
		return "Karta [vrstaKarte=" + vrstaKarte + ", datum=" + datum + ", id="
				+ id + ", ukupnoSati=" + ukupnoSati + "]";
	}

	
	

}
