package projet13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame implements ActionListener {

    //variables
    //récupération taille écran
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dimScreen = tk.getScreenSize();
    int widthScreen = dimScreen.width;
    int heightScreen = dimScreen.height;

    Panneau container = new Panneau();

    //barre de menu et ses élements
    JMenuBar barreMenus = new JMenuBar();

    JMenu menuCouleurs = new JMenu("Couleurs");
    JMenuItem itemBlanc = new JMenuItem("Blanc");
    JMenuItem itemRouge = new JMenuItem("Rouge");
    JMenuItem itemVert = new JMenuItem("Vert");
    JMenuItem itemJaune = new JMenuItem("Jaune");
    JMenuItem itemBleu = new JMenuItem("Bleu");

    JMenu menuFormes = new JMenu("Formes");
    JMenuItem itemOvale = new JCheckBoxMenuItem("Ovale");
    JMenuItem itemRectangle = new JCheckBoxMenuItem("Rectangle");
    JMenuItem itemTriangle = new JCheckBoxMenuItem("Triangle");

    JMenu menuDimensions = new JMenu("Dimensions");
    JMenuItem itemLargeur = new JMenuItem("Largeur");
    JMenuItem itemHauteur = new JMenuItem("Hauteur");

    //barre d'outils et ses élements
    JToolBar toolBar = new JToolBar();
    JButton boutonBlanc = new JButton(new ImageIcon("icons/blanc.gif"));
    JButton boutonRouge = new JButton(new ImageIcon("icons/rouge.gif"));
    JButton boutonVert = new JButton(new ImageIcon("icons/vert.gif"));
    JButton boutonJaune = new JButton(new ImageIcon("icons/jaune.gif"));
    JButton boutonBleu = new JButton(new ImageIcon("icons/bleu.gif"));

    public Fenetre() {
        // Paramètres Fenetre
        this.setSize(widthScreen / 2, heightScreen / 2);
        this.setTitle("Figures avec menus et barre d'outils");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(container);

        //layout du container
        container.setLayout(new BorderLayout());

        //appel fonction ajout menuBar
        setAndAddMenuBar();

        //appel fonction ajout accélérateur
        setAccAndMnemo();

        // appel fonction ajout des infos bulles
        setTooltips();

        //appel fonction ajout menuBar
        setAndAddToolBar();

        //ajout des listeners
        setListeners();

        this.setVisible(true);
    }

    private void setAndAddMenuBar() {
        //structure de la barre de de menu et ajouts
        menuCouleurs.add(itemBlanc);
        menuCouleurs.add(itemRouge);
        menuCouleurs.add(itemVert);
        menuCouleurs.add(itemJaune);
        menuCouleurs.add(itemBleu);

        menuFormes.add(itemRectangle);
        menuFormes.add(itemOvale);
        menuFormes.add(itemTriangle);

        menuDimensions.add(itemLargeur);
        menuDimensions.add(itemHauteur);

        barreMenus.add(menuCouleurs);
        barreMenus.add(menuFormes);
        barreMenus.add(menuDimensions);
        this.setJMenuBar(barreMenus);
    }

    private void setAndAddToolBar() {
        //ajout de la barre d'outils et ses éléments
        toolBar.add(boutonBlanc);
        toolBar.add(boutonRouge);
        toolBar.add(boutonVert);
        toolBar.add(boutonJaune);
        toolBar.add(boutonBleu);
        container.add(toolBar, BorderLayout.NORTH);
    }

    private void setAccAndMnemo() {
        //ajout accélérateurs
        itemOvale.setMnemonic('O');
        itemOvale.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        itemRectangle.setMnemonic('R');
        itemRectangle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
        itemTriangle.setMnemonic('T');
        itemTriangle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
        itemLargeur.setMnemonic('L');
        itemLargeur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
        itemHauteur.setMnemonic('H');
        itemHauteur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
    }

    private void setTooltips() {
        // ajout des tootltips
        itemBlanc.setToolTipText("Changer le fond en BLANC");
        itemRouge.setToolTipText("Changer le fond en ROUGE");
        itemVert.setToolTipText("Changer le fond en VERT");
        itemJaune.setToolTipText("Changer le fond en JAUNE");
        itemBleu.setToolTipText("Changer le fond en BLEU");

        itemRectangle.setToolTipText("Dessiner un RECTANGLE");
        itemOvale.setToolTipText("Dessiner un OVALE");
        itemTriangle.setToolTipText("Dessiner un TRIANGLE");

        itemLargeur.setToolTipText("Changer la LARGEUR");
        itemHauteur.setToolTipText("Changer la HAUTEUR");
    }

    private void setListeners() {
        //ajouts des listeners sur les objets
        itemBlanc.addActionListener(this);
        itemRouge.addActionListener(this);
        itemVert.addActionListener(this);
        itemJaune.addActionListener(this);
        itemBleu.addActionListener(this);

        boutonBlanc.addActionListener(this);
        boutonRouge.addActionListener(this);
        boutonVert.addActionListener(this);
        boutonJaune.addActionListener(this);
        boutonBleu.addActionListener(this);

        itemOvale.addActionListener(this);
        itemRectangle.addActionListener(this);
        itemTriangle.addActionListener(this);

        itemLargeur.addActionListener(this);
        itemHauteur.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        // Changements de couleurs
        if (source == itemBlanc || source == boutonBlanc) {
            container.setBackground(Color.WHITE);
        }
        if (source == itemRouge || source == boutonRouge) {
            container.setBackground(Color.RED);
        }
        if (source == itemVert || source == boutonVert) {
            container.setBackground(Color.GREEN);
        }
        if (source == itemJaune || source == boutonJaune) {
            container.setBackground(Color.YELLOW);
        }
        if (source == itemBleu || source == boutonBleu) {
            container.setBackground(Color.BLUE);
        }

        // false/true pour les dessins
        if (source == itemOvale) {
            // dessine/efface
            if (container.ovale) {
                container.ovale = false;
            } else {
                container.ovale = true;
            }
        }
        if (source == itemRectangle) {
            // dessine/efface
            if (container.rectangle) {
                container.rectangle = false;
            } else {
                container.rectangle = true;
            }
        }
        if (source == itemTriangle) {
            // dessine/efface
            if (container.triangle) {
                container.triangle = false;
            } else {
                container.triangle = true;
            }
        }

        if (source == itemLargeur) {
            // Fenetre avec champ largeur
            String newLarg = JOptionPane.showInputDialog(this, "Largeur");
            container.largeur = Integer.parseInt(newLarg);
        }
        if (source == itemHauteur) {
            // Fenetre avec champ hauteur
            String newHaut = JOptionPane.showInputDialog(this, "Largeur");
            container.hauteur = Integer.parseInt(newHaut);
        }
    }

}
