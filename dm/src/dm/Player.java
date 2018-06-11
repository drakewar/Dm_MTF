package dm;

public class Player {
	private String pseudo;
	private int[][] piocheP=new int[7][2];
	private float score;
	
	public void Player() {
		pseudo="Joueur";
		score=0;
	}
	
	public int[][] init_piocheP(int[][] pp){ // pp : pioches du joueur
		int cmp=0;
		for(int k=0;k<28;k++) {
			if(pp[k][0]!=-1 && cmp<7) {
				piocheP[cmp][0]=pp[k][0];
				piocheP[cmp][1]=pp[k][1];
				cmp++;
				pp[k][0]=-1;
				pp[k][1]=-1;
			}

		}
		return(pp);
	}
	
	//---- Un test pour voir  tous les pioches
		public void affiche_piocheP() {
			int nbr=0;
			for(int k=0;k<7;k++) {
				nbr++;
				System.out.println(piocheP[k][0]+" | "+piocheP[k][1]+ "		=>"+nbr);
			}
		}
		
	
}
