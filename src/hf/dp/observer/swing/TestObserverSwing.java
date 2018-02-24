/**
 * 
 */
package hf.dp.observer.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

/**
 * @author root
 *
 */
public class TestObserverSwing {

	JFrame frame;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestObserverSwing test = new TestObserverSwing();
		test.go();

	}
	
	public void go() {
		frame = new JFrame("Observers Test");
		JButton button = new JButton("Shoud I do it ?");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Don't do it , you might regret it");
			}
		});
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Come on  ,do it");
				
			}
		});
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(3);
	
	}

}
