import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SatKarta extends Karta {

	SatKarta(int sati) {
		this.ukupnoSati = sati;
		this.id = trenutniId++;
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		this.datum = new Date();
		df.format(datum);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Sat karta" + this.toString();
	}
}
