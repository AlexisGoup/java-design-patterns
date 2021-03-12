package fr.diginamic.factory;

import fr.diginamic.factory.entite.EnceinteConnectee;
import fr.diginamic.factory.entite.ObjetConnecte;
import fr.diginamic.factory.entite.Tablette;
import fr.diginamic.factory.entite.TelephonePortable;
import fr.diginamic.factory.entite.Type;

public class ObjetConnecteFactory {
	public static ObjetConnecte getObjetConnecte(Type type) {
		switch (type) {
		case ENCEINTE:
			return new EnceinteConnectee(24);
		case TABLETTE:
			return new Tablette(32);
		case TELEPHONE_PORTABLE:
			return new TelephonePortable(34);
		default:
			return null;
		}
	}
}
