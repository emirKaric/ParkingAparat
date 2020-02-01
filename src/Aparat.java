import java.util.ArrayList;

public class Aparat {
	// index 0 je dnevna index 1 je sat
	ArrayList<Karta> sveKarte;
	ArrayList<Double> cijena;

	Aparat() {
		sveKarte = new ArrayList<Karta>();
		cijena = new ArrayList<Double>();
		cijena.add(10.0);
		cijena.add(1.0);
	}

	boolean izdajKartu(int brojKovanica, double iznos) {
		if (brojKovanica <= 0 || iznos <= 0)
			return false;
		if (iznos == 0.5 || iznos == 1.0 || iznos == 2.0) {
			if (cijena.get(0) <= brojKovanica * iznos)
				sveKarte.add(new DnevnaKarta());
			else if (cijena.get(1) <= brojKovanica * iznos) {
				int broj = (int)(brojKovanica * iznos / cijena.get(1));
				sveKarte.add(new SatKarta(broj));				
			}
			return true;
		}
		return false;
	}

	Karta getKartu(int index) {
		if (index < 0 || index >= sveKarte.size())
			return null;
		return sveKarte.get(index);
	}

	void setDnevna(double cijena) {
		if (cijena <= 0)
			return;
		this.cijena.add(0, cijena);
	}

	void setSat(double cijena) {
		if (cijena <= 0)
			return;
		this.cijena.add(1,cijena);
	}

	int getSize() {
		return sveKarte.size();
	}
}