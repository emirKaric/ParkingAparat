import java.util.Date;

public abstract class Karta {
	protected Date datum;
	protected int id;
	protected static int trenutniId;
	protected int ukupnoSati;
	protected Date kraj;

	abstract public String getInfo();

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
		return " [ datum izdavanja = " + datum + ", id=" + id
				+ ", ukupnoSati=" + ukupnoSati + ", karta validna do: " + kraj+ "]";
	}
}