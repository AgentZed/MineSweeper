package editing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	public Window(int ligne, int colonne)
	{
		// JFrame
		this.setTitle("D�mineur");
		this.setSize(288, 288);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//
		// JPanel
		JPanel pane = new JPanel();
		pane.setPreferredSize(new Dimension(ligne*32, colonne*32));
		pane.setLayout(null);
		pane.setBackground(Color.BLUE);
	    
	    // Icone
	    ImageIcon textureBloc = new ImageIcon("src/editing/case.png");
	    
	    // Liste de liste boutons
	    ArrayList<ArrayList<JButton>> liste = new ArrayList<ArrayList<JButton>>();
	    
		// Ajout d'autant de bouton qu'il faut de ligne et de colonne sous forme de liste de liste.
		for(int i = 0; i < ligne; i++)
		{
			liste.add(new ArrayList<JButton>());
			for(int j = 0; j < colonne; j++)
			{
				
				liste.get(i).add(new JButton("", textureBloc));
				((Component) liste.get(i).get(j)).setBounds(32*i, 32*j, 32, 32);
				pane.add((Component) liste.get(i).get(j));
			}
		}	   
	    
		// Ajout du JPanel dans la JFrame
	    this.setContentPane(pane);
	    this.pack();
	    this.setVisible(true);
		
	}
	
    // Evenements
/*    bouton.addActionListener(new ActionListener()
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		
    	}
    });*/
}
