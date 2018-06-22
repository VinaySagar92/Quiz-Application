/**
 * @date 11/26/2016
 * @version 1
 */


package TopQuiz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import TopQuiz.QuestionBank;

/**
 * @author VINAY SAGAR GONABAVI
 *
 */

public class Image extends JFrame {
	public JPanel contentPane, selectionPanel, preamble, resultsPanel, graphPanel;
	private JLabel lblNewLabel_new = new JLabel();
	private JLabel lblNewLabel_results = new JLabel();
	private JLabel lblNewLabel_1_results = new JLabel();
	private JLabel lblNewLabel_graph = new JLabel();
	private JLabel lblNewLabel_1_graph = new JLabel();
	private JLabel lblNewLabel_2_graph = new JLabel();
	private JLabel lblNewLabel_3_graph = new JLabel();
	private JLabel lblNewLabel_4_graph = new JLabel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea txtrAModernRagstoriches = new JTextArea();
	private JButton btnNewButton, btnNewButton_new, btnNewButton_results;
	String[] userAns1 = new String[10];
	String[] userAns2 = new String[10];
	String[] userAns3 = new String[10];
	String[] userAns4 = new String[10];
	String[] userAns5 = new String[10];
	public static String name;
	public int i, j, index, v;
	static int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
	QuestionBank qB = new QuestionBank();
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Image() {
	
		Category a[] = {Category.PURSUIT_OF_HAPPYNESS, Category.DARK_KNIGHT, Category.INCEPTION, Category.INTERSTELLAR, Category.THE_PRESTIGE};
		
		
		
		//Home Panel UI
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\VINAY\\Desktop\\TopQuiz.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(0, 0, 1000, 750);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 228, 225));
		lblNewLabel.setIcon(new ImageIcon(".\\src\\Images\\rsz_top_quiz_icon.png"));
		lblNewLabel.setBounds(0, 94, 982, 431);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please Enter Your Name");
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lblNewLabel_1.setBackground(new Color(160, 82, 45));
		lblNewLabel_1.setBounds(253, 538, 358, 38);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Please Enter Your Age");
		lblNewLabel_2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(253, 609, 358, 32);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(623, 542, 359, 30);
		textField.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				name = textField.getText();
				lblNewLabel_results.setText("<html>Hi " + name + ".<br>You've done a good job!<br>Please find your results as follows:<html>");
				//System.out.println(name);
				textField_1.setEnabled(true);
			}
		});
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEnabled(false);
		textField_1.setBounds(623, 609, 359, 32);
		textField_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btnNewButton.setEnabled(true);
			}
		});
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Next");
		btnNewButton.setEnabled(false);
		btnNewButton.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		btnNewButton.setBounds(451, 665, 97, 25);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setContentPane(selectionPanel);
				selectionPanel.revalidate();
			}
		});
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("TOP QUIZ");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setLabelFor(this);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBackground(new Color(255, 240, 245));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 40));
		lblNewLabel_3.setBounds(0, 0, 982, 93);
		panel.add(lblNewLabel_3);
		
        
		
		
		//Selection/Category Panel UI 
		
		selectionPanel = new JPanel();
        selectionPanel.setSize(1000, 750);
		selectionPanel.setForeground(new Color(0, 0, 0));
		selectionPanel.setBackground(new Color(255, 228, 225));
		selectionPanel.setLayout(null);
		
		JLabel label1 = new JLabel("Please select a movie of your choice");
		label1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(204, 306, 524, 62);
		
		JButton b1 = new JButton("The Pursuit of Happyness");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//timer.start();
				v=0;
				lblNewLabel_new.setText("THE PURSUIT OF HAPPYNESS");
				txtrAModernRagstoriches.setText("A modern rags-to-riches tale based on a true story, this charming, poignant 2006 movie\r\nfound a surprising level of success at the box office. Let's follow the story of Chris Gardner\r\n, as played by Will Smith.");
				setContentPane(preamble);
                preamble.revalidate();
			}
		});
		b1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		b1.setBounds(300, 400, 313, 25);
		
		
		
		JButton b2 = new JButton("The Dark Knight");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				v=1;
				lblNewLabel_new.setText("The Dark Knight");
				txtrAModernRagstoriches.setText("Christopher Nolan's sequel to \"Batman Begins\" does not disappoint.\r\nIt is worth watching the film simply to see Heath Ledger's amazing performance as\r\nthe Joker.");
				setContentPane(preamble);
                preamble.revalidate();
			}
		});
		b2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		b2.setBounds(300, 450, 313, 25);
		
		
		
		JButton b3 = new JButton("Inception");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				v=2;
				lblNewLabel_new.setText("The Inception");
				txtrAModernRagstoriches.setText("\"Your mind is the scene of the crime\".\r\nIn this highly original and surreal sci-fi movie directed by Christopher Nolan,\r\nDom (Leonardo DiCaprio) attempted to complete a herculean task - \r\nimplanting idea into human mind by manipulating their dream.");
				setContentPane(preamble);
                preamble.revalidate();
	        }
		});
		b3.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		b3.setBounds(300, 500, 313, 25);
		
		
		
		JButton b4 = new JButton("Interstellar");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				v=3;
				lblNewLabel_new.setText("The Interstellar");
				txtrAModernRagstoriches.setText("A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.\r\n");
				setContentPane(preamble);
                preamble.revalidate();
			}
		});
		b4.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		b4.setBounds(300, 550, 313, 25);
		
		
		
		JButton b5 = new JButton("The Prestige");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				v=4;
				lblNewLabel_new.setText("The Prestige");
				txtrAModernRagstoriches.setText("\"A friendship that became a rivalry. A rivalry that turned deadly.\" \r\nAlfred Borden (Christian Bale) and Robert Angier (Hugh Jackman) were two stage\r\nmagicians who were willing to sacrifice anything to become the best magician in the town.");
				setContentPane(preamble);
                preamble.revalidate();
			}
		});
		b5.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		b5.setBounds(300, 600, 313, 25);
		
		
		
		JLabel icon1 = new JLabel("");
		icon1.setIcon(new ImageIcon(".\\src\\Images\\rsz_785c97_39994e67d7274943bb482646294320c8-mv2_d_4080_2278_s_2.jpg"));
		icon1.setBounds(0, 13, 1035, 296);
		
		
		btnNewButton_results = new JButton("Results");
		btnNewButton_results.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		btnNewButton_results.setBounds(722, 600, 119, 25);
		btnNewButton_results.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setContentPane(resultsPanel);
				resultsPanel.revalidate();
			}
		});
		selectionPanel.add(btnNewButton_results);
		
		
		
		selectionPanel.add(label1);
		selectionPanel.add(b1);
		selectionPanel.add(b2);
		selectionPanel.add(b3);
		selectionPanel.add(b4);
		selectionPanel.add(b5);
		selectionPanel.add(icon1);
		
		
		
		
		lblNewLabel_graph.setBounds(100, 500, 56, 0);
		lblNewLabel_1_graph.setBounds(300, 500, 56, 0);
		lblNewLabel_2_graph.setBounds(500, 500, 56, 0);
		lblNewLabel_3_graph.setBounds(700, 500, 56, 0);
		lblNewLabel_4_graph.setBounds(900, 500, 56, 0);
		
		
		//Panel as a Preamble to each Category
		
		preamble = new JPanel();
		preamble.setSize(1000, 750);
		preamble.setForeground(new Color(0, 0, 0));
		preamble.setBackground(new Color(255, 228, 225));
		preamble.setLayout(null);
		
		
		
		lblNewLabel_new.setBounds(64, 62, 865, 145);
		lblNewLabel_new.setFont(new Font("Lucida Calligraphy", Font.BOLD,40));
		lblNewLabel_new.setHorizontalAlignment(SwingConstants.CENTER);
		preamble.add(lblNewLabel_new);
		
		
		txtrAModernRagstoriches = new JTextArea();
		txtrAModernRagstoriches.setBounds(12, 237, 976, 134);
		txtrAModernRagstoriches.setBackground(new Color(204, 255, 204));
		txtrAModernRagstoriches.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		txtrAModernRagstoriches.setEditable(false);
		preamble.add(txtrAModernRagstoriches);
		
		btnNewButton_new = new JButton("Start");
		btnNewButton_new.setBounds(433, 620, 118, 36);
		btnNewButton_new.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		
		btnNewButton_new.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(a[v]){
				case PURSUIT_OF_HAPPYNESS:
					qB.qB1.timer.start();
					setContentPane(qB.qB1);
					qB.qB1.revalidate();
					
					qB.qB1.btnNewButton.addActionListener(new ActionListener() {
			            
						@Override
						public void actionPerformed(ActionEvent e) {
							
							if(qB.qB1.ch>54){
								qB.qB1.timer.stop();
								
								setContentPane(selectionPanel);
								selectionPanel.revalidate();
								userAns1 = qB.qB1.userAns;
								for(int n = 0; n<10; n++){
									if(userAns1[n].equals(qB.qB1.answers[n])){
										count1++;
										
									}
								}
								lblNewLabel_1_results.setText("<html>You've answered " + count1 + "/10 questions correctly in \"The Pursuit of Happyness\"<br>You've answered " + count2 +"/10 questions correctly in \"The Dark Knight\"<br>You've answered " + count3 +"/10 questions correctly in \"Inception\"<br>You've answered " + count4 +"/10 questions correctly  in \"Interstellar\"<br>You've answered " + count5 +"/10 questions correctly in \"The Prestige\"<html>");
								lblNewLabel_graph.setBounds(100, 500-count1*30, 56, count1*30);
							}
						}
					});
					
					qB.qB1.btnNewButton_2.addActionListener(new ActionListener() {
			            
						@Override
						public void actionPerformed(ActionEvent e) {
							setContentPane(selectionPanel);
							selectionPanel.revalidate();
						}
					});
					
					break;
					
				case DARK_KNIGHT:
					lblNewLabel_new.setText("Dark Knight");
					qB.qB2.timer.start();
					setContentPane(qB.qB2);
					qB.qB2.revalidate();
					
					qB.qB2.btnNewButton.addActionListener(new ActionListener() {
			            
						@Override
						public void actionPerformed(ActionEvent e) {
							
							if(qB.qB2.ch>59){
								qB.qB2.timer.stop();
								
								setContentPane(selectionPanel);
								selectionPanel.revalidate();
								userAns2 = qB.qB2.userAns;
								
								for(int n = 0; n<10; n++){
									if(userAns2[n].equals(qB.qB2.answers[n])){
										count2++;
										
									}
								}
								lblNewLabel_1_results.setText("<html>You've answered " + count1 + "/10 questions correctly in \"The Pursuit of Happyness\"<br>You've answered " + count2 +"/10 questions correctly in \"The Dark Knight\"<br>You've answered " + count3 +"/10 questions correctly in \"Inception\"<br>You've answered " + count4 +"/10 questions correctly  in \"Interstellar\"<br>You've answered " + count5 +"/10 questions correctly in \"The Prestige\"<html>");
								lblNewLabel_1_graph.setBounds(300, 500-count2*30, 56, count2*30);
							}	
						}
					});
					
					qB.qB2.btnNewButton_2.addActionListener(new ActionListener() {
			            
						@Override
						public void actionPerformed(ActionEvent e) {
							setContentPane(selectionPanel);
							selectionPanel.revalidate();
						}
					});
					
					break;
				
				case INCEPTION:
					qB.qB3.timer.start();
					setContentPane(qB.qB3);
					qB.qB3.revalidate();
					qB.qB3.btnNewButton.addActionListener(new ActionListener() {
			            
						@Override
						public void actionPerformed(ActionEvent e) {
						
							if(qB.qB3.ch>59){
								qB.qB3.timer.stop();
							
								setContentPane(selectionPanel);
								selectionPanel.revalidate();
								userAns3 = qB.qB3.userAns;
								
								for(int n = 0; n<10; n++){
									if(userAns3[n].equals(qB.qB3.answers[n])){
										count3++;
										
									}
								}
								lblNewLabel_1_results.setText("<html>You've answered " + count1 + "/10 questions correctly in \"The Pursuit of Happyness\"<br>You've answered " + count2 +"/10 questions correctly in \"The Dark Knight\"<br>You've answered " + count3 +"/10 questions correctly in \"Inception\"<br>You've answered " + count4 +"/10 questions correctly  in \"Interstellar\"<br>You've answered " + count5 +"/10 questions correctly in \"The Prestige\"<html>");
								lblNewLabel_2_graph.setBounds(500, 500-count3*30, 56, count3*30);
							}
						}
					});
					
					qB.qB3.btnNewButton_2.addActionListener(new ActionListener() {
			            
						@Override
						public void actionPerformed(ActionEvent e) {
							setContentPane(selectionPanel);
							selectionPanel.revalidate();
						}
					});
					
					break;
					
				case INTERSTELLAR:
					qB.qB4.timer.start();
					setContentPane(qB.qB4);
					qB.qB4.revalidate();
					qB.qB4.btnNewButton.addActionListener(new ActionListener() {
			            
						@Override
						public void actionPerformed(ActionEvent e) {
						
							if(qB.qB4.ch>59){
								qB.qB4.timer.stop();
							
								setContentPane(selectionPanel);
								selectionPanel.revalidate();
								userAns4 = qB.qB4.userAns;
								
								for(int n = 0; n<10; n++){
									if(userAns4[n].equals(qB.qB4.answers[n])){
										count4++;
										
									}
								}
								lblNewLabel_1_results.setText("<html>You've answered " + count1 + "/10 questions correctly in \"The Pursuit of Happyness\"<br>You've answered " + count2 +"/10 questions correctly in \"The Dark Knight\"<br>You've answered " + count3 +"/10 questions correctly in \"Inception\"<br>You've answered " + count4 +"/10 questions correctly  in \"Interstellar\"<br>You've answered " + count5 +"/10 questions correctly in \"The Prestige\"<html>");
								lblNewLabel_3_graph.setBounds(700, 500-count4*30, 56, count4*30);
							}
						}
					});
					
					qB.qB4.btnNewButton_2.addActionListener(new ActionListener() {
			            
						@Override
						public void actionPerformed(ActionEvent e) {
							setContentPane(selectionPanel);
							selectionPanel.revalidate();
						}
					});
					
					break;
					
				case THE_PRESTIGE:
					qB.qB5.timer.start();
					setContentPane(qB.qB5);
					qB.qB5.revalidate();
					qB.qB5.btnNewButton.addActionListener(new ActionListener() {
			            
						@Override
						public void actionPerformed(ActionEvent e) {
						
							if(qB.qB5.ch>59){
								qB.qB5.timer.stop();
							
								setContentPane(selectionPanel);
								selectionPanel.revalidate();
								userAns5 = qB.qB5.userAns;
								
								for(int n = 0; n<10; n++){
									if(userAns5[n].equals(qB.qB5.answers[n])){
										count5++;
										
									}
								}
								lblNewLabel_1_results.setText("<html>You've answered " + count1 + "/10 questions correctly in \"The Pursuit of Happyness\"<br>You've answered " + count2 +"/10 questions correctly in \"The Dark Knight\"<br>You've answered " + count3 +"/10 questions correctly in \"Inception\"<br>You've answered " + count4 +"/10 questions correctly  in \"Interstellar\"<br>You've answered " + count5 +"/10 questions correctly in \"The Prestige\"<html>");
								lblNewLabel_4_graph.setBounds(900, 500-count5*30, 56, count5*30);
							}
						}
					});
					
					qB.qB5.btnNewButton_2.addActionListener(new ActionListener() {
			            
						@Override
						public void actionPerformed(ActionEvent e) {
							setContentPane(selectionPanel);
							selectionPanel.revalidate();
						}
					});
					
					break;
					
				}	
				}
			});
				
			
		
		
		preamble.add(btnNewButton_new);
		
		JLabel lblNewLabel_new1 = new JLabel("<html>Instructions:<br>1. There will be 10 questions with a maximum time limit of 30 sec per Question.<br> 2. You need to make a choice, click 'Submit' and 'Next' Buttons to move to the next question.<br> 3. In case you exceed the maximum time for a question, the quiz will be moved to the next question automatically.\r\n\r\n<html>");
		lblNewLabel_new1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lblNewLabel_new1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_new1.setBounds(12, 384, 976, 276);
		preamble.add(lblNewLabel_new1);
		

		
		//Panel for Text Results
		
		resultsPanel = new JPanel();
		resultsPanel.setSize(1000, 750);
		resultsPanel.setForeground(new Color(0, 0, 0));
		resultsPanel.setBackground(new Color(255, 228, 225));
		resultsPanel.setLayout(null);
		
		
		lblNewLabel_results.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_results.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lblNewLabel_results.setBounds(80, 56, 830, 91);
		resultsPanel.add(lblNewLabel_results);
		
		lblNewLabel_1_results.setText("<html>You've answered " + count1 + "/10 questions correctly in \"The Pursuit of Happyness\"<br>You've answered " + count2 +"/10 questions correctly in \"The Dark Knight\"<br>You've answered " + count3 +"/10 questions correctly in \"Inception\"<br>You've answered " + count4 +"/10 questions correctly  in \"Interstellar\"<br>You've answered " + count5 +"/10 questions correctly in \"The Prestige\"<html>");
		lblNewLabel_1_results.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_results.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lblNewLabel_1_results.setBounds(90, 160, 830, 312);
		resultsPanel.add(lblNewLabel_1_results);
		
		JLabel lblNewLabel_2_results = new JLabel("You can view your performance graph here:");
		lblNewLabel_2_results.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lblNewLabel_2_results.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_results.setBounds(163, 600, 501, 49);
		resultsPanel.add(lblNewLabel_2_results);
		
		JButton btnNewButton_results = new JButton("Performance Graph");
		btnNewButton_results.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		btnNewButton_results.setBounds(663, 600, 247, 49);
		btnNewButton_results.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Results r = new Results();
				//Graph g = new Graph();
				//g.
				setContentPane(graphPanel);
				graphPanel.revalidate();
			}
		});
		resultsPanel.add(btnNewButton_results);
		
		//Graph Panel UI
		
		graphPanel = new JPanel();
		graphPanel.setSize(1000, 750);
		graphPanel.setForeground(new Color(0, 0, 0));
		graphPanel.setBackground(new Color(255, 228, 225));
		graphPanel.setLayout(null);
		
		lblNewLabel_graph.setOpaque(true);
		lblNewLabel_graph.setBackground(Color.GREEN);
		//lblNewLabel_graph.setBounds(100, 203, 56, 200);
		graphPanel.add(lblNewLabel_graph);
		
		//lblNewLabel_1_graph = new JLabel("");
		lblNewLabel_1_graph.setBackground(Color.ORANGE);
		lblNewLabel_1_graph.setOpaque(true);
		//lblNewLabel_1_graph.setBounds(300, 242, 56, 200);
		graphPanel.add(lblNewLabel_1_graph);
		
		//lblNewLabel_2_graph = new JLabel("");
		lblNewLabel_2_graph.setBackground(Color.YELLOW);
		lblNewLabel_2_graph.setOpaque(true);
		//lblNewLabel_2_graph.setBounds(500, 228, 56, 200);
		graphPanel.add(lblNewLabel_2_graph);
		
		//lblNewLabel_3_graph = new JLabel("");
		lblNewLabel_3_graph.setBackground(Color.BLUE);
		lblNewLabel_3_graph.setOpaque(true);
		//lblNewLabel_3_graph.setBounds(700, 228, 56, 200);
		graphPanel.add(lblNewLabel_3_graph);
		
		//lblNewLabel_4_graph = new JLabel("");
		lblNewLabel_4_graph.setBackground(Color.PINK);
		lblNewLabel_4_graph.setOpaque(true);
		//lblNewLabel_4_graph.setBounds(900, 268, 56, 200);
		graphPanel.add(lblNewLabel_4_graph);
		
		JLabel lblNewLabel_5_graph = new JLabel("The Pursuit Of Happyness");
		lblNewLabel_5_graph.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
		lblNewLabel_5_graph.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_graph.setBounds(28, 581, 188, 33);
		graphPanel.add(lblNewLabel_5_graph);
		
		JLabel lblNewLabel_6_graph = new JLabel("The Dark Knight");
		lblNewLabel_6_graph.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_graph.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
		lblNewLabel_6_graph.setBounds(255, 581, 142, 33);
		graphPanel.add(lblNewLabel_6_graph);
		
		JLabel lblNewLabel_7_graph = new JLabel("Inception");
		lblNewLabel_7_graph.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_graph.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
		lblNewLabel_7_graph.setBounds(469, 581, 142, 33);
		graphPanel.add(lblNewLabel_7_graph);
		
		JLabel lblNewLabel_8_graph = new JLabel("Interstellar");
		lblNewLabel_8_graph.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_graph.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
		lblNewLabel_8_graph.setBounds(662, 581, 131, 33);
		graphPanel.add(lblNewLabel_8_graph);
		
		JLabel lblNewLabel_9_graph = new JLabel("The Prestige");
		lblNewLabel_9_graph.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_graph.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
		lblNewLabel_9_graph.setBounds(839, 581, 149, 33);
		graphPanel.add(lblNewLabel_9_graph);
		
		JLabel lblNewLabel_10_graph = new JLabel("Performance Graph");
		lblNewLabel_10_graph.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10_graph.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 40));
		lblNewLabel_10_graph.setBounds(223, 95, 611, 58);
		graphPanel.add(lblNewLabel_10_graph);
		
		
	}
}