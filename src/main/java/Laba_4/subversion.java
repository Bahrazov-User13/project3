package Laba_4; //пакет Java классов

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

import java.lang.Math;

public class subversion {
	private Imagee image;
	private final double pi= Math.PI;
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// создание графического окна
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,400,350);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	laba_info.setBounds(120,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(285,249,100,40);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("Информация"); // добавляем кнопку
	button_info.setBounds(100,249,150,40);
	ActionListener ew = new infbutt(); //создаем слушатель
	button_info.addActionListener(ew); // добавляем слушатель к кнопке
	main_panel.add(button_info);
	
	
    window info = new window("Информация");
    info.setBounds(50,280,120,40);
	
	ugatuu menu = new ugatuu(main_GUI, actionListener, main_panel); 

	String[] item = {"Переместить логотип УГАТУ в верхний правый угол","Переместить логотип УГАТУ в середину","Переместить логотип УГАТУ в левый верхний угол", "Отсортировать данные в проекте3"}; 
	JComboBox Box = new JComboBox(item); 
	Box.setBounds(1,25,380,20); //установка размеров 
	transfer_logo transferlogo = new transfer_logo(Box, menu); 
	Box.addActionListener(transferlogo); 
	main_panel.add(Box); 
	
	
	JTextField r = new JTextField();
	r.setBounds(10,210,120,20);
	
	JLabel lr = new JLabel("Введите радиус r (см):");
	lr.setBounds(10,190,140,20);

	main_panel.add(r);
	main_panel.add(lr);
	
	
		
	JLabel rez = new JLabel();
	rez.setBounds(150,190,100,20);
	JLabel S = new JLabel();
	S.setBounds(150,208,300,20);
	JButton rachet = new JButton("Расчет");
		rachet.setBounds(305,200,80,30);
		rachet.addActionListener(new ActionListener() {
	@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			try {
				
			
				int rad = Integer.parseInt(r.getText());
				rez.setText("Результат:");
			
				S.setText(
					Double.toString((double) (pi * rad * rad))
						);
				} catch (NumberFormatException nfe) {
						}
			}
		});
		
	
	main_panel.add(rachet);
	main_panel.add(S);
	main_panel.add(rez);
	
	
	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
	
	
	
	
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}




	public Imagee getImage() {
		return image;
	}




	public void setImage(Imagee image) {
		this.image = image;
	}

 
	
	
}
