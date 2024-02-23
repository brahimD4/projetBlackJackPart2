use blackjack;

-- Joueur(id_joueur,username_joueur,solde_joueur,id_main(fk)) -- 
Create TABLE Main (
               id_main int auto_increment,
               nbCartes_main int,
               valeurTotal_main int ,
               primary key(id_main)
            
);
CREATE TABLE Joueur (
               id_joueur int auto_increment,
               name_joueur varchar(15),
               solde_joueur int ,
               id_main int,
              primary key(id_joueur),
        constraint fk_jou_main foreign key  (id_main)  references Main(id_main)
       
);

-- Croupier(id_croupier(pk),valeurTotalLimit,id_main(fk)) -- 

Create TABLE Croupier (
               id_croupier int auto_increment,
               valeurTotal int,
               id_main int ,
               primary key(id_croupier),
               
	constraint fk_croup_main foreign key  (id_main)  references Main(id_main)
  
);

-- Catre (id_carte(pk),couleur_carte,valeur_carte) -- 
 create TABLE Catre (
               id_carte int  auto_increment ,
               typee varchar(10),
               couleur_carte varchar(15),
               valeur_carte int ,
            primary key(id_carte)   
);


-- PaquetCarte(id_paquetCarte(pk),taille_paquetCartes)--

Create TABLE PaquetCarte (
               id_paquetCarte int auto_increment,
               taille_paquetCartes int,
               primary key(id_paquetCarte)
               
);

 insert into catre(typee, couleur_carte, valeur_carte) values

	("A","pique",1),("deux","pique",2),("trois","pique",3),
    ("quatre","pique",4),("cinq","pique",5),("six","pique",6),
 	("sept","pique",7),	("huit","pique",8),	("neuf","pique",9),
   	("dix","pique",10),	("J","pique",10),("Q","pique",10),("K","pique",10),
    
    ("A","carreau",1),("deux","carreau",2),("trois","carreau",3),
    ("quatre","carreau",4),("cinq","carreau",5),("six","carreau",6),
 	("sept","carreau",7),("huit","carreau",8),("neuf","carreau",9),
   	("dix","carreau",10),("J","carreau",10),("Q","carreau",10),("K","carreau",10),
    
     ("A","trefle",1),("deux","trefle",2),("trois","trefle",3),
    ("quatre","trefle",4),("cinq","trefle",5),("six","trefle",6),
 	("sept","trefle",7),("huit","trefle",8),("neuf","trefle",9),
   	("dix","trefle",10),("J","trefle",10),	("Q","trefle",10),("K","trefle",10),
    
	  ("A","coeur",1),("deux","coeur",2),("trois","coeur",3),
    ("quatre","coeur",4),("cinq","coeur",5),("six","coeur",6),
 	("sept","coeur",7),	("huit","coeur",8),	("neuf","coeur",9),
   	("dix","coeur",10),	("J","coeur",10),("Q","coeur",10),("K","coeur",10); 
    
-- insert into main(nbCartes_main,valeurTotal_main)values(23,45);

-- select* from paquetcarte;
 -- drop table Joueur;
  -- drop table catre;
 --  drop table Croupier;
 -- drop table Main;
 -- drop table PaquetCarte;