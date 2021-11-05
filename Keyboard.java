package Question1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Keyboard extends JFrame implements KeyListener {

	String Row1[] = {"~","1","2","3","4","5","6","7","8","9","0","-","+","<<<<<"};//BackSpace
	String Row2[] = {"Tab","Q","W","E","R","T","Y","U","I","O","P","[","]","\\"};
	String Row3[] = {"Caps","A","S","D","F","G","H","J","K","L",":","\"","Enter"};
	String Row4[] = {"Shift","Z","X","C","V","B","N","M",",",".","?"," ^" };
	String Row5[]={" " ,"<" ,"\\/",">" };


	String A="`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
	String B ="~-+[]\\;',.?";
	JButton Frt[];
	JButton Sec[];
	JButton Trd[];
	JButton Frth[];
	JButton Fth[];
	Color C = new JButton().getBackground();

	public void keyPressed(KeyEvent evt){
	}

	public void keyReleased(KeyEvent evt){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Keyboard().setVisible(true);
	}
	
	public Keyboard(){
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	this.setResizable(false);

	this.getContentPane().setPreferredSize(new Dimension(800,400));

	this.setLocation(50,50);

	InitWidgets();
	}
	
	private void InitWidgets()
	{

	JTextArea Text = new JTextArea();
	Text.setPreferredSize(new Dimension(600,200));

	JLabel Info = new JLabel("<html>Type Some Text Using Your Keyboard.The Keys You Will Be Highlighted And Text Will Displayed.<br> Note : Clicking The Buttons With Your Mouse Will Not Perform Any Action. <br><br> </html>" );

	Info.setFont(new Font("Verdana",Font.BOLD,12));


	setLayout(new BorderLayout());

	JPanel JpNorth = new JPanel();
	JPanel JpCenter = new JPanel();
	JPanel JpKeyboard = new JPanel();
	JPanel JpNote = new JPanel();
	add( JpNorth, BorderLayout.NORTH);
	add( JpNote);
	add( JpCenter, BorderLayout.CENTER);
	add(JpKeyboard, BorderLayout.SOUTH);

	JpNorth.setLayout(new BorderLayout());
	JpNorth.add(Info, BorderLayout.WEST);
	JpNorth.add(Info, BorderLayout.SOUTH);

	JpCenter.setLayout( new BorderLayout());
	JpCenter.add(Text, BorderLayout.WEST);
	JpCenter.add(Text, BorderLayout.CENTER);


	JpKeyboard.setLayout(new GridLayout(6,1));

	pack();


	Frt = new JButton[Row1.length];

	JPanel Q = new JPanel(new GridLayout(1, Row1.length));
	for(int j = 0; j < Row1.length; ++j){
	JButton B= new JButton(Row1[j]);
	B.setPreferredSize(new Dimension(90,40));
	Frt[j] = B;
	Q.add(Frt[j]);
	}
	JpKeyboard.add(Q);


	Sec = new JButton[Row2.length];

	Q = new JPanel(new GridLayout(1, Row2.length));
	for(int j = 0; j < Row2.length; ++j)
	{
	Sec[j] = new JButton(Row2[j]);
	Q.add(Sec[j]);

	}
	JpKeyboard.add(Q);

	Trd = new JButton[Row3.length];

	Q = new JPanel(new GridLayout(1, Row3.length));
	for(int J = 0; J < Row3.length; ++J)
	{
	Trd[J] = new JButton(Row3[J]);
	Q.add(Trd[J]);
	}
	JpKeyboard.add(Q);


	Frth = new JButton[Row4.length];

	Q = new JPanel(new GridLayout(1, Row4.length));
	for(int J = 0; J < Row4.length; ++J)
	{
	Frth[J] = new JButton(Row4[J]);
	Q.add(Frth[J]);
	if(J==Row4.length-2)
	Q.add(new JPanel());

	}
	Q.add(new JPanel());
	JpKeyboard.add(Q);


	Fth = new JButton[Row5.length];

	Q = new JPanel(new GridLayout(1, Row5.length));

	for(int J = 0; J < 1; ++J)
	{
	JPanel spacePanel = new JPanel();
	Q.add(spacePanel);
	}

	for(int J = 0; J < Row5.length; ++J)
	{
	if(J==0)
	{
	JButton B = new JButton(Row5[J]);
	Fth[J]=B;

	Q.add(new JPanel());Q.add(new JPanel());Q.add(new JPanel());Q.add(new JPanel());Q.add(new JPanel());Q.add(new JPanel());Q.add(new JPanel());Q.add(new JPanel());
	Container GlassPane = (Container) getRootPane().getGlassPane();
	GlassPane.setVisible(true);
	GlassPane.setLayout(new GridBagLayout());
	GridBagConstraints Gbc = new GridBagConstraints();
	Gbc.weightx = 1.0;
	Gbc.weighty = 1.0;
	Gbc.fill = GridBagConstraints.NONE;
	Gbc.insets = new Insets(getBounds().y-350, 180, 0, 20);
	Gbc.anchor = GridBagConstraints.SOUTHWEST;
	B.setPreferredSize(new Dimension(450,50));
	GlassPane.add(Fth[J], Gbc);
	}
	else
	{
	Fth[J]=new JButton(Row5[J]);
	Q.add(Fth[J]);
	}
	if(J==0)
	{
	JPanel spacePanel = new JPanel();
	Q.add(spacePanel);
	}
	}
	JpKeyboard.add(Q);

	getContentPane().addKeyListener(this);
	Text.addKeyListener(this);

	for(JButton B : Frt)
	B.addKeyListener(this);

	for(JButton B : Sec)
	B.addKeyListener(this);
	for(JButton B : Trd)
	B.addKeyListener(this);

	for(JButton B : Frth)
	B.addKeyListener(this);

	for(JButton B : Fth)
	B.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

}
