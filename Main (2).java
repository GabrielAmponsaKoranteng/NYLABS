import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main
 */
public class Main extends JPanel{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
     JFrame myFrame = new JFrame(); 
     myFrame.setSize(670, 700);
     myFrame.setTitle("Sudoku - Afutu");
     myFrame.setVisible(true);
     myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     

     myFrame.add(new Main());
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 650, 650);//ONLY ONE FILL RECT USED

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                for(int k=0;k<6;k++){
                    g.draw3DRect(i*80+k+5, j*80+k+5, 80-2*k, 80-2*k, true);
                }
            }
        }
    }
}