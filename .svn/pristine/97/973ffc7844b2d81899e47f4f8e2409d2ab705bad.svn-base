package Laba_4;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Imagee extends JComponent {

	private BufferedImage image;
	
	public Imagee() {
		
		// получаем изображение и проверяем на доступность
		try 
		{
			image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("ugatu.jpg"));
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void paintComponent(Graphics g)
    {
        if(image == null) return;
        
        
        // Отображение рисунка в правом верхнем углу.
        g.drawImage(image, 0, 0, null);
    }
	public BufferedImage getImage() {
        return image;
}

    public void setImage(BufferedImage image) {
        this.image = image;
}
}
