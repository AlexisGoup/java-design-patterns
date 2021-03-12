package fr.diginamic.factory.entite;

public class ObjetConnecte {
	
	private int limiteVolt;
	
	public ObjetConnecte(int limiteVolt) {
		this.limiteVolt = limiteVolt;
	}

	public int getLimiteVolt() {
		return limiteVolt;
	}

	public void setLimiteVolt(int limiteVolt) {
		this.limiteVolt = limiteVolt;
	}
	
	@Override
	public String toString() {
		return "Objet connecte, voltage limite :" + getLimiteVolt() + "V."; 
	}
}
