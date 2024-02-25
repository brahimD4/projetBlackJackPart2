package blackjack;

import java.util.ArrayList;

public class Croupier implements InterfaceCroupier{

public Main mainCR;
	
	
public Croupier(Main mainCR) {
		//super();
		this.mainCR = mainCR;
	}

//croupier recoit un carte
@Override
public void cRecoirCarte(PaquetCartes paquet) {
	     mainCR.listCartes.add(paquet.listCartes.get(0));
	  	paquet.listCartes.remove(paquet.listCartes.get(0));
	
	}

//Affiche la main de Croupier
@Override
public void AfficheMainCroupier() {
	 System.out.println();
		System.out.println("****************************************************************************");
	 System.out.println(" ---------- Main de Croupier");
	 System.out.println();
	mainCR.AffichelisteCartes();
	 System.out.println();
	 System.out.println();
	 System.out.println(" ---->Valeur Total=  "+mainCR.getValeurTotal());
	 System.out.println();
	 System.out.println(" ---->Nombre de Cartes=  "+mainCR.getNbCartes());
	System.out.println("****************************************************************************");
		 }
	 
//Distrubier les cartes par le croupier
@Override
public void DistribuerLesCartes(PaquetCartes paquet, Joueur jouer1) {

for(int i=0;i<1;i++) {
		
		jouer1.jRecoirCarte(paquet);
		jouer1.jRecoirCarte(paquet);
	
		cRecoirCarte(paquet);
		cRecoirCarte(paquet);
		
}


		
	

}
}
	

