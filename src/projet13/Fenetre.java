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
    JToolBar toolBar = new JToolBar();

    JMenu menuCouleur = new JMenu("Couleur");
    JMenu menuFormes = new JMenu("Formes");
    JMenu menuDimensions = new JMenu("Dimensions");

    JMenuItem itemBlanc = new JMenuItem(new ImageIcon("icons/blanc.gif") + "Blanc");
    JMenuItem itemRouge = new JMenuItem("Rouge");
    JMenuItem itemVert = new JMenuItem("Vert");
    JMenuItem itemJaune = new JMenuItem("Jaune");
    JMenuItem itemBleu = new JMenuItem("Bleu");

    JMenuItem itemRectangle = new JCheckBoxMenuItem("Rectangle");
    JMenuItem itemOvale = new JCheckBoxMenuItem("Ovale");
    JMenuItem itemTriangle = new JCheckBoxMenuItem("Triangle");

    JMenuItem itemLargeur = new JMenuItem("Largeur");
    JMenuItem itemHauteur = new JMenuItem("Hauteur");

    JButton boutonBlanc = new JButton(new ImageIcon("icons/blanc.gif"));
    JButton boutonRouge = new JButton(new ImageIcon("icons/rouge.gif"));
    JButton boutonVert = new JButton(new ImageIcon("icons/vert.gif"));
    JButton boutonJaune = new JButton(new ImageIcon("icons/jaune.gif"));
    JButton boutonBleu = new JButton(new ImageIcon("icons/bleu.gif"));

    public Fenetre() {
        this.setSize(widthScreen / 2, heightScreen / 2);
        this.setTitle("Figures avec menu et barre d'outils");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(container);
        container.setLayout(new BorderLayout());

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

        //ajouts barre d'outils
        toolBar.add(boutonBlanc);
        toolBar.add(boutonRouge);
        toolBar.add(boutonVert);
        toolBar.add(boutonJaune);
        toolBar.add(boutonBleu);
        container.add(toolBar, BorderLayout.NORTH);

        this.setVisible(true);
    }
}
