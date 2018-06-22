/**
 * @date 11/26/2016
 * @version 1
 */

package TopQuiz;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

/**
 * 
 * @author VINAY SAGAR GONABAVI
 */

public class Question extends JPanel {

	/**
	 * Create the panel.
	 */
	
	
	//Question Panel
	public JLabel lblNewLabel, lblNewLabel_timer, lblNewLabel_timer1;
	public JLabel lblNewLabel_1 = new JLabel();
	public JRadioButton rdbtnNewRadioButton, rdbtnNewRadioButton_1, rdbtnNewRadioButton_2, rdbtnNewRadioButton_3;
	public JButton btnNewButton, btnNewButton_1, btnNewButton_2;
	//private JTextField textField;
	Integer time = 30;
	public Timer timer;
	String fileName;
	public int ch = 0, ans = 0;
	String[] questions = new String[1000];
	String answers[] = new String[100], line = null;
	String[] userAns = new String[10];
	String[] questions1 = new String[100];
	String[] questions2 = new String[100];
	String[] questions3 = new String[100];
	String[] questions4 = new String[100];
	String[] questions5 = new String[100];
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	
	public Question(Category c) {
	
		setLayout(null);
		
		switch(c){
		case PURSUIT_OF_HAPPYNESS:
			fileName = ".\\src\\TopQuiz\\Test.txt";
			lblNewLabel_1.setIcon(new ImageIcon(".\\src\\Images\\rsz_poh.png"));
			break;
		case DARK_KNIGHT:
			fileName = ".\\src\\TopQuiz\\Test1.txt";
			lblNewLabel_1.setIcon(new ImageIcon(".\\src\\Images\\rsz_tdk.png"));
			break;
		case INCEPTION:
			fileName = ".\\src\\TopQuiz\\Test2.txt";
			lblNewLabel_1.setIcon(new ImageIcon(".\\src\\Images\\rsz_1inception.png"));
			break;
		case INTERSTELLAR:
			fileName = ".\\src\\TopQuiz\\Test5.txt";
			lblNewLabel_1.setIcon(new ImageIcon(".\\src\\Images\\rsz_interstellar.png"));
			break;
		case THE_PRESTIGE:
			fileName = ".\\src\\TopQuiz\\Test4.txt";
			lblNewLabel_1.setIcon(new ImageIcon(".\\src\\Images\\rsz_theprestige.png"));
			break;
		}
		
		/**
		* @exception FileIOException Handling
		*/
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int count = 0, j=0;
			
			while((line = bufferedReader.readLine()) != null){
					questions[count] = line;
				count = count + 1;
			}
			
			
			
			while(j<10){
				answers[j]  = questions[(5*(j+1))+j];
				j++;
			}
			
			lblNewLabel = new JLabel("<html>"+questions[ch++]+"</html>");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBackground(Color.WHITE);
			lblNewLabel.setBounds(380, 92, 608, 199);
			add(lblNewLabel);
			
			rdbtnNewRadioButton = new JRadioButton(questions[ch++]);
			rdbtnNewRadioButton.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			rdbtnNewRadioButton.setBounds(400, 300, 600, 50);
			rdbtnNewRadioButton.setMultiClickThreshhold(1L);
			rdbtnNewRadioButton.addActionListener(new ActionListener() {
	            
				@Override
				public void actionPerformed(ActionEvent e) {
						rdbtnNewRadioButton_1.setSelected(false);
						rdbtnNewRadioButton_2.setSelected(false);
						rdbtnNewRadioButton_3.setSelected(false);
						userAns[ans] = rdbtnNewRadioButton.getText();
				}
			});
			add(rdbtnNewRadioButton);
			
			rdbtnNewRadioButton_1 = new JRadioButton(questions[ch++]);
			rdbtnNewRadioButton_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			rdbtnNewRadioButton_1.setBounds(400, 360, 600, 50);
			rdbtnNewRadioButton_1.setMultiClickThreshhold(1L);
			rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
	            
				@Override
				public void actionPerformed(ActionEvent e) {
						rdbtnNewRadioButton.setSelected(false);
						rdbtnNewRadioButton_2.setSelected(false);
						rdbtnNewRadioButton_3.setSelected(false);
						userAns[ans] = rdbtnNewRadioButton_1.getText();
				}
			});
			add(rdbtnNewRadioButton_1);
			
			rdbtnNewRadioButton_2 = new JRadioButton(questions[ch++]);
			rdbtnNewRadioButton_2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			rdbtnNewRadioButton_2.setBounds(400, 420, 600, 50);
			rdbtnNewRadioButton_2.setMultiClickThreshhold(1L);
			rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
	            
				@Override
				public void actionPerformed(ActionEvent e) {
						rdbtnNewRadioButton.setSelected(false);
						rdbtnNewRadioButton_1.setSelected(false);
						rdbtnNewRadioButton_3.setSelected(false);
						userAns[ans] = rdbtnNewRadioButton_2.getText();
				}
			});
			add(rdbtnNewRadioButton_2);
			
			rdbtnNewRadioButton_3 = new JRadioButton(questions[ch++]);
			rdbtnNewRadioButton_3.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			rdbtnNewRadioButton_3.setBounds(400, 480, 600, 50);
			rdbtnNewRadioButton_3.setMultiClickThreshhold(1L);
			rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
	            
				@Override
				public void actionPerformed(ActionEvent e) {
						rdbtnNewRadioButton.setSelected(false);
						rdbtnNewRadioButton_1.setSelected(false);
						rdbtnNewRadioButton_2.setSelected(false);
						userAns[ans] = rdbtnNewRadioButton_3.getText();
				}
			});
			add(rdbtnNewRadioButton_3);
			
			/*
			JTextField textField = new JTextField();
			textField.setVisible(false);
			textField.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setBounds(351, 550, 347, 33);
			textField.addActionListener(new ActionListener() {
	            
				@Override
				public void actionPerformed(ActionEvent e) {
						
				}
			});
			//add(rdbtnNewRadioButton_3);
			add(textField);
			textField.setColumns(10);
			*/
			
			
			
			btnNewButton = new JButton("Next");
			btnNewButton.setEnabled(false);
			
			
			btnNewButton.addActionListener(new ActionListener() {
	            
				@Override
				public void actionPerformed(ActionEvent e) {
					ch++;
					ans++;
					if(ch<55){
						lblNewLabel.setText("<html>"+questions[ch++]+"</html>");
						rdbtnNewRadioButton.setText(questions[ch++]);
						rdbtnNewRadioButton_1.setText(questions[ch++]);
						rdbtnNewRadioButton_2.setText(questions[ch++]);
						rdbtnNewRadioButton_3.setText(questions[ch++]);
						time = 30;
						timer.restart();
					}
					
					/*
					if(ch>54){
						rdbtnNewRadioButton.setVisible(false);
						rdbtnNewRadioButton_1.setVisible(false);
						rdbtnNewRadioButton_2.setVisible(false);
						rdbtnNewRadioButton_3.setVisible(false);
						textField.setVisible(true);
						textField.setText(null);
					}
					*/
					
					if(ch>59){
						try {
							bufferedReader.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
					btnNewButton.setEnabled(false);
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
					lblNewLabel_2.setVisible(false);
					lblNewLabel_3.setVisible(false);
					lblNewLabel_4.setVisible(false);
					lblNewLabel_5.setVisible(false);
					lblNewLabel_6.setVisible(false);
					lblNewLabel_7.setVisible(false);
				}
			});
			
			
			btnNewButton.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			btnNewButton.setBounds(829, 600, 120, 40);
			add(btnNewButton);
			
			btnNewButton_1 = new JButton("Submit");
			btnNewButton_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			btnNewButton_1.setBounds(416, 600, 120, 40);
			btnNewButton_1.addActionListener(new ActionListener() {
	            
				@Override
				public void actionPerformed(ActionEvent e) {
					btnNewButton.setEnabled(true);
					//if(ch>54)
						//userAns[ans] = textField.getText();
				}
			});
			add(btnNewButton_1);
			
			//lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(26, 268, 300, 400);
			add(lblNewLabel_1);
			
			lblNewLabel_timer = new JLabel("Time Remaining");
			lblNewLabel_timer.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_timer.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			lblNewLabel_timer.setBounds(661, 25, 185, 67);
			add(lblNewLabel_timer);
			
			lblNewLabel_timer1 = new JLabel();
			lblNewLabel_timer1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			lblNewLabel_timer1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_timer1.setBounds(847, 25, 116, 67);
			add(lblNewLabel_timer1);
			
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setIcon(new ImageIcon(".\\src\\Images\\rsz_a.jpg"));
			lblNewLabel_2.setBounds(0, 0, 100, 75);
			lblNewLabel_2.setVisible(false);
			add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setIcon(new ImageIcon(".\\src\\Images\\rsz_b.jpg"));
			lblNewLabel_3.setBounds(100, 0, 100, 75);
			lblNewLabel_3.setVisible(false);
			add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon(".\\src\\Images\\rsz_c.jpg"));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(200, 0, 100, 75);
			lblNewLabel_4.setVisible(false);
			add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon(".\\src\\Images\\rsz_1d.jpg"));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(300, 0, 100, 75);
			lblNewLabel_5.setVisible(false);
			add(lblNewLabel_5);
			
			lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setIcon(new ImageIcon(".\\src\\Images\\rsz_e.jpg"));
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(400, 0, 100, 75);
			lblNewLabel_6.setVisible(false);
			add(lblNewLabel_6);
			
			lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setIcon(new ImageIcon(".\\src\\Images\\rsz_f.jpg"));
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setBounds(500, 0, 100, 75);
			lblNewLabel_7.setVisible(false);
			add(lblNewLabel_7);
			
			btnNewButton_2 = new JButton("Change Topic");
			btnNewButton_2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
			btnNewButton_2.setBounds(764, 650, 185, 40);
			add(btnNewButton_2);
			
			
			//Timer Action
			ActionListener taskPerformer = new ActionListener (){
				public void actionPerformed(ActionEvent e){
		    		if (time.intValue() < 1 || ch > 59) {
		    			btnNewButton.setEnabled(true);
		    			//btnNewButton.setSelected(true);
		    			btnNewButton.doClick();
		    			//timer.stop();  		
		    		}
		    		
		    		if(time.intValue() < 30 && time.intValue() > 24){
		    			lblNewLabel_2.setVisible(true);
		    		}
		    		
		    		if(time.intValue() < 25 && time.intValue() > 19){
		    			lblNewLabel_3.setVisible(true);
		    			lblNewLabel_2.setVisible(false);
		    		}
		    		
		    		if(time.intValue() < 20 && time.intValue() > 14){
		    			lblNewLabel_4.setVisible(true);
		    			lblNewLabel_3.setVisible(false);
		    		}
		    		
		    		if(time.intValue() < 15 && time.intValue() > 9){
		    			lblNewLabel_5.setVisible(true);
		    			lblNewLabel_4.setVisible(false);
		    		}
		    		
		    		if(time.intValue() < 10 && time.intValue() > 4){
		    			lblNewLabel_6.setVisible(true);
		    			lblNewLabel_5.setVisible(false);
		    		}
		    		
		    		if(time.intValue() < 5 && time.intValue() > 0){
		    			lblNewLabel_7.setVisible(true);
		    			lblNewLabel_6.setVisible(false);
		    		}
		    		
		    		lblNewLabel_timer1.setText(time.toString());   		 
		    		time = time - 1;
		    	 }
		     };
		      
		      // add the task to the timer
		      timer = new Timer(1000,taskPerformer);
			
			bufferedReader.close();
			
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to open file '" + fileName + "'");
		}
		catch (IOException ex){
			System.out.println("Error Reading file '" + fileName + "'");
		}
		
		
	}
}
