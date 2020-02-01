import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SatKarta extends Karta {

	@SuppressWarnings("deprecation")
	SatKarta(int sati) {
		this.ukupnoSati = sati;
		this.id = trenutniId++;
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		this.datum = new Date();
		df.format(datum);
		kraj = new Date();
		df.format(kraj);
		kraj.setHours(datum.getHours()+ukupnoSati);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Sat karta" + this.toString();
	}
}
