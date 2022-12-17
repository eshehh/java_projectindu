package pattern2_swingObserveEx;
	
import java.awt.*;
import javax.swing.*;
	
public class SwingObserverExample {
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();

		JButton button = new JButton("천사?");
		JButton button2 = new JButton("악마?");
		
		// Without lambdas
		//button.addActionListener(new AngelListener());
		//button.addActionListener(new DevilListener());
		
		// With lambdas
		button.addActionListener(event -> 
			System.out.println("하지마 후회해!")
		);
		button2.addActionListener(event ->
			System.out.println("한번 해봐 ㅋㅋ")
		);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.getContentPane().add(BorderLayout.EAST, button2);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));

		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,100);
		frame.setVisible(true);
	}
	
	/*
	 * Remove these two inner classes to use lambda expressions instead.
	 * 
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
	*/

}
