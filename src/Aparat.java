import java.util.ArrayList;
import java.util.HashMap;

public class Aparat {
  
	ArrayList<Karta> sveKarte;
	HashMap<String, Double> vrstaKarti;
	
	Aparat(){
		sveKarte = new ArrayList<Karta>();
		vrstaKarti = new HashMap<String, Double>();
		vrstaKarti.put("Sat", 1.0);
		vrstaKarti.put("Dnevna", 10.0);
	}
	
	void izdajKartu(int brojKovanica, double iznos) {
		if(brojKovanica <= 0 || iznos <= 0)
			return;
		if(vrstaKarti.get("Dnevna")  >= brojKovanica * iznos)
			sveKarte.add(new Karta("Dnevna", 24));
		else if(vrstaKarti.get("Sat")  >= brojKovanica * iznos)
			sveKarte.add(new Karta("Sat", Math.round(brojKovanica * iznos) * 1.0));
	}
	
	Karta getKartu(int index) {
		if(index < 0 || index  >= sveKarte.size())
			return null;
		return sveKarte.get(index);
	}
	
	void setDnevna(double cijena) {
		if(cijena <= 0)
			return;
		vrstaKarti.put("Dnevna", cijena);
	}
	
	void setSat(double cijena) {
		if(cijena <= 0)
			return;
		vrstaKarti.put("Sat", cijena);
	}
	
	int getSize(){
		return sveKarte.size();
	}
}
