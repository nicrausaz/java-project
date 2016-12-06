package projet13;

import java.awt.event.*;
import javax.swing.*;

public class Menubar extends JMenuBar implements ActionListener {

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

    public Menubar() {

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
        this.add(menuCouleur);
        this.add(menuFormes);
        this.add(menuDimensions);

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

        //ajouts des listeners
        itemLargeur.addActionListener(this);
        itemHauteur.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == itemLargeur) {
            FenDialog largeurDialog = new FenDialog();
            largeurDialog.setTitle("Choisir Largeur");
            largeurDialog.label.setText("Largeur:");
        } else if (e.getSource() == itemHauteur) {
            FenDialog hauteurDialog = new FenDialog();
            hauteurDialog.setTitle("Choisir Hauteur");
            hauteurDialog.label.setText("Hauteur:");
        }

    }
}
