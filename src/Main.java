import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean start = true;

        while (start) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n///////////////  Choisissez la tribut /////////////// "
            					+ "\n"
            			    	+ "\n*****************  1- Pieds Noirs       ***************** "
            			    	+ "\n*****************  2- Danseurs masqués  *****************" 
            			    	+ "\n*****************  3- Resistenza        *****************" 
            					+ "\n*****************  4- Tribut 4          *****************" );
            
            int choix = sc.nextInt();
        	switch(choix) 
        	{
        		case 1: 
	        	
        			PiedsNoirs pn = new PiedsNoirs("Pieds Noirs");
        			pn.communiquerAvecEspritDeLaNuit().demanderConseil("Puis-je gagner la guerre ?");
        			pn.communiquerAvecEspritDeLaNuit().ecouterEtRepondre("J'aimerais être protégé.");
        			pn.communiquerAvecEspritDeLaNuit().ecouterSansRepondre("Je suis ici juste pour parler.");
        			pn.communiquerAvecEspritDeLaNuit().ecouterEtRealiserMiracle("Je veux pouvoir voler.");
        			pn.communiquerAvecEspritDeLaNuit().realiserMiracle("Je veux pouvoir voler.");
		

		            break;
	            
        		case 2: 
	
		            break;

        		 case 3: 
        			 
         			Resistenza rz = new Resistenza("Resistenza");
         			rz.communiquerAvecEspritDeLaResistance().echangerMiracleEtPunition();
         			rz.communiquerAvecEspritDeLaResistance().ecouterEtRepondre("J'ai besoin de votre éclaircissement.");
         			rz.communiquerAvecEspritDeLaResistance().ecouterEtPunir("j'ai commis une erreur");
         			rz.communiquerAvecEspritDeLaResistance().ecouterEtRealiserMiracle("J'ai besoin de votre pouvoir.");
                    rz.communiquerAvecEspritDeLaResistance().realiserMiracle("J'ai besoin de votre pouvoir.");
		           break;
		           
        		 case 4: 
        			 
  		           break;
        	}
        	
        	
        }
    }
}

