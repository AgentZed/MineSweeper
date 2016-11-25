package editing;

public class Game {

	public Game(int difficulty)
	{
		// G�n�ration et affichage du tableau de bombes
		Tableau grille = new Tableau(difficulty);
		grille.Build();
		System.out.println(grille.toString());
		System.out.println();
		
		// G�n�ration et affichage du tableau solution
		grille.nbBombesAdjacants();
		System.out.println(grille.toString());
		
		// Affichage de la fen�tre de jeu
		Window fenetre = new Window(grille.getLigne(), grille.getColonne());
	}
}
