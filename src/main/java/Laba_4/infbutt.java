package Laba_4;

import javax.swing.*;

import java.awt.event.ActionEvent;
 
import java.awt.event.ActionListener;

public class infbutt implements ActionListener {
 private JFrame INFO;
 private JPanel PAN;
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame INFO = new JFrame("Информация");
		 
		INFO.setBounds(600,300,200,200);
		 
		INFO.setResizable(false); // ôèêñèðîâàííûé ðàçìåð îêíà
		 
		JPanel PAN = new JPanel();
		 
		 
		INFO.setLayout(null);
		 
		INFO.add(PAN);
		 
		 
		 
		 
		JLabel name = new JLabel("ФИО:"); // Îòîáðàæåíèå òåêñòà èëè èçîáðàæåíèÿ
		 
		name.setBounds(20,0,150,30);
		 
		INFO.add(name);
		 
		JLabel f1 = new JLabel("Фатхиев.Д.А");
		 
		f1.setBounds(20,30,200,30);
		 
		INFO.add(f1);
		 
		JLabel b2 = new JLabel("Бахразов.Р.Р");
		 
		b2.setBounds(20,50,200,30);
		 
		INFO.add(b2);
		 
		JLabel y3 = new JLabel("Юлмухаметов.А.Ш 15.04.22");
		 
		y3.setBounds(20,70,200,30);
		 
		INFO.add(y3);
		 
		JLabel k4 = new JLabel("Кыдыргычов.А.М 15.04.22");
		 
		k4.setBounds(20,90,200,30);
		 
		INFO.add(k4);
		 
		JButton ex = new JButton("Назад");
		ex.setBounds(20,125,150, 30);
		INFO.add(ex);
		ex.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		         
		         INFO.setVisible(false);
		         
		     }
		});
		 
		 
		 
		 
		 
		INFO.setVisible(true);
	}
		 
		
		public static void exit(int i) {
		        // TODO Auto-generated method stub
		        
		}


		public JFrame getINFO() {
			return INFO;
		}


		public void setINFO(JFrame iNFO) {
			INFO = iNFO;
		}


		public JPanel getPAN() {
			return PAN;
		}


		public void setPAN(JPanel pAN) {
			PAN = pAN;
		}
		 
		 
		 
	}