package Blackjackpart2;

public interface InterfaceCarte {
	public  Couleur getCouleurs();
	public void setCouleurs(Couleur couleur);
	public Valeur getValeurs();
	public void setValeurs(Valeur valeur);
	public void setAffiche(boolean affiche);
	public boolean isAffiche();
	public void tourner();
	public void AfficheCarte();
	}
