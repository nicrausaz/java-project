package projet13;

import java.awt.*;
import javax.swing.*;

public class Panneau extends JPanel {

    public int largeur = 500;
    public int hauteur = 200;

    public Boolean rectangle = false;
    public Boolean ovale = false;
    public Boolean triangle = false;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //centre fenetre
        int winX = this.getWidth() / 2;
        int winY = this.getHeight() / 2;

        if (rectangle) {
            g.drawRect(winX - (largeur / 2), winY - (hauteur / 2), largeur, hauteur);
        }

        if (ovale) {
            g.drawOval(winX - (largeur / 2), winY - (hauteur / 2), largeur, hauteur);
        }

        if (triangle) {
            int x[] = {winX - (largeur / 2), winX, winX + (largeur / 2)};
            int y[] = {winY + (hauteur / 2), winY - (hauteur / 2), winY + (hauteur / 2)};
            g.drawPolygon(x, y, 3);
        }
        repaint();
    }
}
