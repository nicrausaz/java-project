package projet13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dimScreen = tk.getScreenSize();
    int widthScreen = dimScreen.width;
    int heightScreen = dimScreen.height;

    public JPanel container = new JPanel();

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

        //ajout des items aux menus
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

        //ajouts des accélérateurs
        itemRectangle.setMnemonic('R');
        itemRectangle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
        itemOvale.setMnemonic('O');
        itemOvale.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        itemTriangle.setMnemonic('T');
        itemTriangle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
        itemLargeur.setMnemonic('L');
        itemLargeur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
        itemHauteur.setMnemonic('H');
        itemHauteur.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));

        //ajouts des infosbulles
        itemBlanc.setToolTipText("Fond Blanc");
        itemRouge.setToolTipText("Fond Rouge");
        itemVert.setToolTipText("Fond Vert");
        itemJaune.setToolTipText("Fond Jaune");
        itemBleu.setToolTipText("Fond Bleu");
        itemRectangle.setToolTipText("Dessine un rectangle");
        itemOvale.setToolTipText("Dessine un ovale");
        itemTriangle.setToolTipText("Dessine un triangle");
        itemLargeur.setToolTipText("Modifie la largeur");
        itemHauteur.setToolTipText("Modifie la hauteur");

        boutonBlanc.setToolTipText("Fond Blanc");
        boutonRouge.setToolTipText("Fond Rouge");
        boutonVert.setToolTipText("Fond Vert");
        boutonJaune.setToolTipText("Fond Jaune");
        boutonBleu.setToolTipText("Fond Bleu");

        //ajouts des boutons a la barre d'outils
        toolBar.add(boutonBlanc);
        toolBar.add(boutonRouge);
        toolBar.add(boutonVert);
        toolBar.add(boutonJaune);
        toolBar.add(boutonBleu);

        //ajouts des listeners
        itemLargeur.addActionListener(new fenDialogLst());
        itemHauteur.addActionListener(new fenDialogLst());
        boutonBlanc.addActionListener(new colorChangerLst());
        boutonRouge.addActionListener(new colorChangerLst());
        boutonVert.addActionListener(new colorChangerLst());
        boutonJaune.addActionListener(new colorChangerLst());
        boutonBleu.addActionListener(new colorChangerLst());
        itemBlanc.addActionListener(new colorChangerLst());
        itemRouge.addActionListener(new colorChangerLst());
        itemVert.addActionListener(new colorChangerLst());
        itemJaune.addActionListener(new colorChangerLst());
        itemBleu.addActionListener(new colorChangerLst());

        //ajout barre de menus
        this.setJMenuBar(menubar);

        //ajouts barre d'outils
        container.add(toolBar, BorderLayout.NORTH);

        this.setVisible(true);
    }

    class fenDialogLst implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();
            if (src == itemLargeur) {
                FenDialog largeurDialog = new FenDialog();
                largeurDialog.setTitle("Choisir Largeur");
                largeurDialog.label.setText("Largeur:");
            } else if (src == itemHauteur) {
                FenDialog hauteurDialog = new FenDialog();
                hauteurDialog.setTitle("Choisir Hauteur");
                hauteurDialog.label.setText("Hauteur:");
            }
        }
    }

    class colorChangerLst implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Object src = e.getSource();
            if (src == boutonBlanc || src == itemBlanc) {
                container.setBackground(Color.white);
            } else if (src == boutonRouge || src == itemRouge) {
                container.setBackground(Color.red);
            } else if (src == boutonVert || src == itemVert) {
                container.setBackground(Color.green);
            } else if (src == boutonJaune || src == itemJaune) {
                container.setBackground(Color.yellow);
            } else if (src == boutonBleu || src == itemBleu) {
                container.setBackground(Color.blue);
            }
        }
    }

}
