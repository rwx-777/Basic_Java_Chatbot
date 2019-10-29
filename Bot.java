//My First Java ChatBot
//2019 Basic Java Chat Bot
//written by rwx-777

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame{
	
	private JTextArea ChatArea = new JTextArea();
	private JTextField chatbox = new JTextField();
	
	public Bot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("Chat Bot");
		frame.add(ChatArea);
		frame.add(chatbox);
		
		//For TextArea
		ChatArea.setSize(550, 470);
		ChatArea.setLocation(2, 2);
		
		//For TextField
		chatbox.setSize(540, 30);
		chatbox.setLocation(2, 500);
		
		
		chatbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String gtext = chatbox.getText().toLowerCase(); //gets the text you typed
				ChatArea.append("YOU: " + gtext + "\n"); //Transfers Text from chatbox to ChatArea
				chatbox.setText(null); //Sets the Textfield back to empty
				
				if(gtext.contains("hi")) {
					Bot_Answer("Hello Master");
				}else if(gtext.contains("how are you?")) { //commands always have to be lowercase
					Bot_Answer("I'm well and ready to serve sir");
				}else {
					Random rand = new Random();
					int  randNum = rand.nextInt(5);
					
					if (randNum == 0) {
						Bot_Answer("Go away");
					}else if (randNum == 1) {
						Bot_Answer("I am busy sorry sir");
					}else if(randNum == 2) {
						Bot_Answer("I am whatching Rick & Morty.");
					}else if(randNum == 3) {
						Bot_Answer("Please leave");
					}else if(randNum == 4) {
						Bot_Answer("unavailable");
					}
				}
				
				
			}
		});
	}
	
	private void Bot_Answer(String string) {
		ChatArea.append("BOT: " + string + "\n");
	}

	public static void main(String[] args) {
		
		new Bot();
		

	}

}
