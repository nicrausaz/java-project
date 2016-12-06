package projet13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dimScreen = tk.getScreenSize();
    int widthScreen = dimScreen.width;
    int heightScreen = dimScreen.height;

    JPanel container = new JPanel();

    Menubar menubar = new Menubar();
    Toolbar toolBar = new Toolbar();

    public Fenetre() {
        this.setSize(widthScreen / 2, heightScreen / 2);
        this.setTitle("Figures avec menu et barre d'outils");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(container);
        container.setLayout(new BorderLayout());

        //ajout barre de menus
        this.setJMenuBar(menubar);

        //ajouts barre d'outils
        container.add(toolBar, BorderLayout.NORTH);

        this.setVisible(true);
    }
}
