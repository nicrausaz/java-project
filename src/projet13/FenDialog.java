package projet13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FenDialog extends JFrame implements ActionListener {

    JPanel container = new JPanel();
    JLabel label = new JLabel();
    JTextField fieldValue = new JTextField();
    JButton okButton = new JButton("OK");
    JButton cancelButton = new JButton("Annuler");

    public FenDialog() {
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(container);

        container.setLayout(new BorderLayout());

        //taille de l'input
        //fieldValue.setSize(20, 20);

        //ajouts de groupes de boutons
        Box group1 = Box.createHorizontalBox();
        group1.add(label);
        group1.add(Box.createRigidArea(new Dimension(5, 0)));
        group1.add(fieldValue);

        Box group2 = Box.createHorizontalBox();
        group2.add(okButton);
        group2.add(Box.createRigidArea(new Dimension(5, 0)));
        group2.add(cancelButton);

        //ajouts elements au panel
        container.add(group1, BorderLayout.NORTH);
        container.add(group2, BorderLayout.SOUTH);
        // container.add(group);

        //ajout des listeners
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);

        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == okButton) {

        } else if (src == cancelButton) {

        }
    }
}
