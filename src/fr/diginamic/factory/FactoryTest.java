package fr.diginamic.factory;

import fr.diginamic.factory.entite.ObjetConnecte;
import fr.diginamic.factory.entite.Type;

public class FactoryTest {

	public static void main(String[] args) {
		
		ObjetConnecte tablette = ObjetConnecteFactory.getObjetConnecte(Type.TABLETTE);
		ObjetConnecte telephone = ObjetConnecteFactory.getObjetConnecte(Type.TELEPHONE_PORTABLE);
		ObjetConnecte enceinte = ObjetConnecteFactory.getObjetConnecte(Type.ENCEINTE);
		
		System.out.println(tablette);
		System.out.println(telephone);
		System.out.println(enceinte);

	}

}
