package blackjack;

public enum Couleur {
	 COEUR("coeur"),
	  PIQUE("pique"),
	 CARREAU("carreau"),
	TREFLE("trefle");
	private final String nom;

	private Couleur(String nom) {
		this.nom = nom;
	}

	public String getNomcol() {
		return nom;
	}

}
