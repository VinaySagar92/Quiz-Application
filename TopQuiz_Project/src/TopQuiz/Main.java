/**
 * @date 11/26/2016
 * @version 1
 */

package TopQuiz;

import java.awt.EventQueue;

/**
 * @author VINAY SAGAR GONABAVI
 */

public class Main{
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Image frame = new Image();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}