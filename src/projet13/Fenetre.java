package projet13;

import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dimScreen = tk.getScreenSize();
    int widthScreen = dimScreen.width;
    int heightScreen = dimScreen.height;

    JPanel container = new JPanel();

    JMenuBar menubar = new JMenuBar();

    JMenu menuCouleur = new JMenu("Couleur");
    JMenu menuFormes = new JMenu("Formes");
    JMenu menuDimensions = new JMenu("Dimensions");

    JMenuItem itemBlanc = new JMenuItem("Blanc");
    JMenuItem itemRouge = new JMenuItem("Rouge");
    JMenuItem itemVert = new JMenuItem("Vert");
    JMenuItem itemJaune = new JMenuItem("Jaune");
    JMenuItem itemBleu = new JMenuItem("Bleu");

    JMenuItem itemRectangle = new JCheckBoxMenuItem("Rectangle");
    JMenuItem itemOvale = new JCheckBoxMenuItem("Ovale");
    JMenuItem itemTriangle = new JCheckBoxMenuItem("Triangle");

    JMenuItem itemLargeur = new JMenuItem("Largeur");
    JMenuItem itemHauteur = new JMenuItem("Hauteur");

    public Fenetre() {
        this.setSize(widthScreen / 2, heightScreen / 2);
        this.setTitle("Figures avec menu et barre d'outils");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(container);

        //ajout des items, menus et barre de menus
        menuCouleur.add(itemBlanc);
        menuCouleur.add(itemRouge);
        menuCouleur.add(itemVert);
        menuCouleur.add(itemJaune);
        menuCouleur.add(itemBleu);
        menuFormes.add(itemRectangle);
        menuFormes.add(itemOvale);
        menuFormes.add(itemTriangle);
        menuDimensions.add(itemLargeur);
        menuDimensions.add(itemHauteur);
        menubar.add(menuCouleur);
        menubar.add(menuFormes);
        menubar.add(menuDimensions);

        this.setJMenuBar(menubar);

        this.setVisible(true);
    }
}
