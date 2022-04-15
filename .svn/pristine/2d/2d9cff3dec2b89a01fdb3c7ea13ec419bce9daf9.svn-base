package Laba_4;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

public class ugatuu {
	private Imagee image;
	public ugatuu(JFrame fr, ActionListener actionListener, JPanel pn) {
		image = new Imagee();
		
		JMenu Menu = new JMenu("Меню");
		
		JMenuBar mBar = new JMenuBar();
		
		JMenuItem exmenu = new JMenuItem("Выход");
		JMenuItem uga = new JMenuItem("Отобразить логотип УГАТУ");
		JMenuItem txt = new JMenuItem("Загрузить файл в проект3");
		
		Menu.add(uga);
		Menu.add(exmenu);
		Menu.add(txt);
		
		mBar.add(Menu);
		
		fr.setJMenuBar(mBar);
		
		exmenu.addActionListener(actionListener);
		uga.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { 
				pn.add(image);
				image.setBounds(180, 50, 200, 200);
			}
		});
		txt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { 
				try {
					FileReader reader = new FileReader("src/main/resources/inf.txt");
                    int c;
                    String text = "";
                    while ((c=reader.read()) != -1) {
                        text = text + (char)c;
                }
                    inf form = new inf(text);
                } catch(IOException ex){
				}
			}
		});
	}
	public Imagee getImage() {
		return image;
	}
	
}