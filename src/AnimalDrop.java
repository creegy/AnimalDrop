import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalDrop {
    String[][] NumberOfCards;
    int drawNumber;
    int upperBound = 20;
    int lowerBound = 10;
    int range = (upperBound + lowerBound) + 1;
    int rand = (int)(Math.random() * range);

    String s = Integer.toString(rand);

    private JButton JBInfo;
    private JButton JBPlay;
    private JPanel JPMainPanel;

    public AnimalDrop() {
        JBPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //przycisk aby przzeszlo do opcji losowania kart
                // oraz pokazywania kart
            }
        });
        JBInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //przycisk aby pokazywal liczbe mozliwych losowan
            //oraz inne wartosci
            }
        });


    }
    JPanel getPanelGlowny() {
        return JPMainPanel;
    }
}
