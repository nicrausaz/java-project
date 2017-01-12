package projet13;

import java.awt.*;
import javax.swing.*;

public class Panneau extends JPanel {

    private int largeur = 500;
    private int hauteur = 200;

    private Boolean rectangle = false;
    private Boolean ovale = false;
    private Boolean triangle = false;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //centre fenetre
        int winX = this.getWidth() / 2;
        int winY = this.getHeight() / 2;
        
        if(rectangle){
            
        }
        
        if(ovale){
            g.drawOval(winX - (largeur / 2), winY - (hauteur / 2), largeur, hauteur);
        }
        
        if(triangle){
            
        }
    }

}
