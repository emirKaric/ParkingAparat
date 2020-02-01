import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DnevnaKarta extends Karta {
	
	DnevnaKarta() {
		this.id = trenutniId++;
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		this.datum = new Date();
		df.format(datum);
		this.ukupnoSati = 24;
	}


	@Override
	public String getInfo() {
		return "I am daily ticket" + "\n" + this.toString();
	}
}
