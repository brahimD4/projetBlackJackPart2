package blackjack;

public class Carte implements InterfaceCarte {
   private Couleur couleurs;
   private Valeur valeurs;
   private boolean affiche;
  

public Carte(Couleur couleur, Valeur valeur) {
	this.couleurs = couleur;
	this.valeurs = valeur;
	this.affiche=true;
}

@Override
public Couleur getCouleurs() {
	return couleurs;
}
@Override
public void setCouleurs(Couleur couleur) {
	this.couleurs = couleur;
}
@Override
public Valeur getValeurs() {
	return valeurs;
}@Override
public void setValeurs(Valeur valeur) {
	this.valeurs = valeur;
}
@Override
public boolean isAffiche() {
	return affiche;
}
@Override
public void setAffiche(boolean affiche) {
	this.affiche = affiche;
}

@Override
public void tourner() {
	 affiche=!affiche;
 } 

@Override
public void AfficheCarte() {
	if(affiche)
		System.out.printf("   {   "+valeurs.getNomval()+" || "+couleurs.getNomcol()+"  }      ");
	else
		System.out.printf("     cache");
	}
	
	
}
