package blackjack;

public enum Valeur {
	ACE("A",1),
	DEUX("deux",2),
	TROIS("trois",3),
	QUATRE("quatre",4),
	CINQ("cinq",5),
	SIX("six",6),
	SEPT("sept",7),
	HUIT("huit",8),
	NEUF("neuf",9),
	DIX("dix",10),
	VALET("J",10),
	ROI("Q",10),
	DAME("K",10), 
	 ;
	
	private final String nom;
	private final int valeur;
	
	private Valeur(String nom ,int valeur) {
		this.nom = nom;
		this.valeur = valeur;
	}

	public String getNomval() {
		return nom;
	}

	public int getValeur() {
		return valeur;
	}
	
			
}
