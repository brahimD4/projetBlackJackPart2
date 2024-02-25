package blackjack;

public interface InterfaceJoueur {
	 public void jRecoirCarte(PaquetCartes paquet);
	 public void AfficheMainJoueur();
	 public int getSolde();
	 public void incrementSolde(int sold);
	 public void disincrementSolde(int sold);
	 public int  verifirMise(int mise);
}
