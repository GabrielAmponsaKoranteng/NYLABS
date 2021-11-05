import java.awt.*;
import javax.swing.*;

/**
 * Main
 */
public class Main extends JPanel{
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,645);
        myFrame.setTitle("Team Sheet - Afutu");
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.add(new Main());
    }


    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);

        //NB: There is always a missing 15x45 at edges

        //PAINT PITCH Method unevenly
        int start = 0, finish = 0;
        for(int i=0;i<6;i++){
            g.setColor(colorMe(0,(i%2==0)?120:150 ,0));
            finish = start + 100;
            g.fillRect(0,start,485,finish);
            start = finish;
        }

        //DRAWING FIELD
        g.setColor(Color.WHITE);
        g.drawRect(10,15,490-25,565);//Pitch Outline
        g.drawLine(10,300,490-15,300);//center line
        g.drawOval(200, 263, 80, 80);//CENTER CIRCLE

        //UPPER HALF
        g.drawRect(160, 15, 160, 80);
        g.drawRect(200, 15, 80, 30);
        g.drawRect(220, 5, 40, 10);
        g.drawArc(200, 80, 80, 30, 0, -180);

        //LOWER HALF
        g.drawRect(160, 500, 160, 80);
        g.drawRect(205, 550, 80, 30);
        g.drawRect(225, 580, 40, 10);
        g.drawArc(205, 485, 80, 30, 0, 180);

        //PLAYERS
        final String[] NUMS = {"10","11","7","8","6","9","3","5","4","2","1"};
        final String[] pNAMES = {"Rashford","Fernandes",
                        "Felix","McTominay","Rice","Sancho",
                        "Shaw","Lindelof","Maguire","Wan-Bissaka",
                        "De Gea"};
        final int[] xPOSITIONS = {185,305,65,240,240,420,65,185,305,420,245};
        final int[] yPOSITIONS = {150,150,280,355,248,280,420,450,450,420,530};
        
        for(int i=0;i<NUMS.length;i++){
            placePayer(g, NUMS[i], pNAMES[i], xPOSITIONS[i], yPOSITIONS[i]);
        }
    }

    public static Color colorMe(int r,int g,int b){
        //Converts RGB color to HSB color
        //returns color
        float[] me = new float[3];
        me = Color.RGBtoHSB(r, g, b,me);
        return Color.getHSBColor(me[0], me[1], me[2]);
    }

    public static void placePayer(Graphics g,String num,String pName, int posX,int posY){
        //PLAYER ICON
        g.setFont(new Font("Serif",Font.BOLD,20));
        g.setColor(colorMe(200, 0, 0));
        g.fillOval(posX-15, posY-15, 30, 30);
        g.setColor(Color.WHITE);
        g.drawOval(posX-15, posY-15, 30, 30);
        g.drawOval(posX-16 , posY-16, 32, 32);
        g.drawString(num, posX-num.length()*5, posY+6);


        //PLAYER NAME-TAG
        g.setFont(new Font("Serif",Font.BOLD,15));
        int plateWdth = g.getFontMetrics().stringWidth(pName)+10;
        int plateHght = g.getFontMetrics().getHeight();

        g.setColor(Color.WHITE);
        g.fillRoundRect(posX-plateWdth/2, posY+16, plateWdth, plateHght,5,5);
        g.setColor(Color.BLACK);
        g.drawRoundRect(posX-plateWdth/2, posY+16, plateWdth, plateHght,5,5);

        g.drawString(" "+pName+" ", posX-plateWdth/2, posY+11+plateHght);
    }
}