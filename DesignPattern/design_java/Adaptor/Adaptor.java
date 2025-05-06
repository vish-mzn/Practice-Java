package Adaptor;
import javax.swing.*;
import java.awt.event.*;
class Adaptor extends JFrame {
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Adaptor () {
        setSize(200,200);
        setVisible(true);
        addWindowListener(new Closer());
    }
    public static void main(String[] args) {
        new Adaptor();
    }
    class Closer extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
} 