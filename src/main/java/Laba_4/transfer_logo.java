package Laba_4; 

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

import javax.swing.JComboBox; 

public class transfer_logo implements ActionListener { 
	private JComboBox box; 
	private Imagee image; 
	public transfer_logo (JComboBox box, ugatuu menu) { 
		this.box = box;
			image = menu.getImage(); 
	} 
@Override 
	public void actionPerformed(ActionEvent e) { 
// TODO Auto-generated method stub 

	String item = (String)box.getSelectedItem(); 

	if(image==null){
		} 
	else 
	{ 

		if (item=="����������� ������� ����� � ������� ������ ����") 
		{ 
			image.setSize(200, 200); 
			image.setLocation(180, 50); 
		} 
	
	if (item=="����������� ������� ����� � ��������") 
		{ 
		image.setSize(200, 200); 
		image.setLocation(100, 75); 
	
		} 
	
	if (item=="����������� ������� ����� � ����� ������� ����") 
		{ 
		image.setSize(200, 200); 
		image.setLocation(5, 50); 

		} 

	} 
}
public JComboBox getbox() {
	return box;
}


public void setbox(JComboBox box) {
	this.box = box;
}

public Imagee getImage() {
	return image;
}

public void setImage(Imagee image) {
	this.image = image;
}



}