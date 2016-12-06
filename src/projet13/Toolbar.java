package projet13;

import java.awt.event.*;
import javafx.scene.paint.Color;
import javax.swing.*;

public class Toolbar extends JToolBar implements ActionListener {

    JButton boutonBlanc = new JButton(new ImageIcon("icons/blanc.gif"));
    JButton boutonRouge = new JButton(new ImageIcon("icons/rouge.gif"));
    JButton boutonVert = new JButton(new ImageIcon("icons/vert.gif"));
    JButton boutonJaune = new JButton(new ImageIcon("icons/jaune.gif"));
    JButton boutonBleu = new JButton(new ImageIcon("icons/bleu.gif"));

    public Toolbar() {

        //ajouts des infosbulles
        boutonBlanc.setToolTipText("Fond Blanc");
        boutonRouge.setToolTipText("Fond Rouge");
        boutonVert.setToolTipText("Fond Vert");
        boutonJaune.setToolTipText("Fond Jaune");
        boutonBleu.setToolTipText("Fond Bleu");

        //ajouts des boutons a la barre d'outils
        this.add(boutonBlanc);
        this.add(boutonRouge);
        this.add(boutonVert);
        this.add(boutonJaune);
        this.add(boutonBleu);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == boutonBlanc) {
            changeColor(Color.WHITE);
        }
    }

    public void changeColor(Object selectedColor) {
    }

}
