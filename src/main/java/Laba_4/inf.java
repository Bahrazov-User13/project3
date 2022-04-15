package Laba_4;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
 
  
public class inf extends JFrame {
	private JTextArea textArea;
        public inf(String text) {
                super("Информация");
                
                JTextArea textArea = new JTextArea();
                
                textArea.setText(text);
                textArea.setEditable(false);
                
                this.add(textArea);
                this.setBounds(600, 500, 200, 200);
                this.setVisible(true);
        }
        public inf() {
                super("Информация");
                
                JLabel label = new JLabel();
                label.setText(
                                "<html>" 
                                );
                
                this.add(label);
                this.setBounds(0, 0, 400, 500);
                this.setVisible(true);
        }
		public JTextArea getTextArea() {
			return textArea;
		}
		public void setTextArea(JTextArea textArea) {
			this.textArea = textArea;
		}
}
