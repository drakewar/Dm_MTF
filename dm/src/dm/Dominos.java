package dm;
import java.util.*;

public class Dominos {
	private	int[][] pioche=new int[28][2]; // Tableau des pioches (28 pioches)
	private int x,y,etat=0;

	// x,y: positions des pioches dans la fenetre 
	// état c'est pour préciser si la pioche est deja jouer ou pas (1=déja été jouer sinon 0)
	

	//---- Création des tous les pioche et les mettre dans le tableau pioche [28][2]
	public void int_pioche() {			
		  int k=0;
	      for (int i=0;i<7;i++){
	      	for (int j=0;j<i+1;j++ ){   
	      		pioche[k][0]=j;
	      		pioche[k][1]=i;
	      		k++;        		
	      	}
	      }
	}
	
	public int random() {
  		Random r = new Random();
		return(r.nextInt(27));
	}
	
	public void mix_pioche() {
		int [][] p = new int [1][2];
		int rand;
		
		for(int k=0;k<28;k++) {
			rand = random();
			p[0][0]=pioche[k][0];
			p[0][1]=pioche[k][1];

			pioche[k][0]=pioche[rand][0];
			pioche[k][1]=pioche[rand][1];
			
			pioche[rand][0]=p[0][0];
			pioche[rand][1]=p[0][1];

		}
	}
	
	//---- Un test pour voir  tous les pioches
	public void affiche_pioche() {
		int nbr=0;
		for(int k=0;k<28;k++) {
			nbr++;
			System.out.println(pioche[k][0]+" | "+pioche[k][1]+ "		=>"+nbr);
		}
	}
	
	public void affiche_tt_pioche(int[][] p) {
		for(int k=0;k<28;k++) {
			System.out.println(p[k][0]+" | "+p[k][1]);
		}
	}
	
	//---- Getter et setter des variables : << x,y,etat,pioche >>

	public int[][] getPioche() {
		return pioche;
	}

	public void setPioche(int[][] pioche) {
		this.pioche = pioche;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

}
