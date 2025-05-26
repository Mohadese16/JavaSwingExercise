package part2.app;

import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ShowPanel extends JPanel {
    private Image image; // Image object to hold the loaded image
    private String imagePath = "./images/img.png"; // Path to the image file

    public ShowPanel() {
        setLayout(new BorderLayout()); // Set layout to BorderLayout
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Add border to the panel

        loadImage(); // Load the image initially
    }

 public void loadImage(){
    try {
        //load image from file system
        image = ImageIO.read(getClass().getResource(imagePath));
        
    } catch (IOException e) {
        e.printStackTrace(); //print any error during load
    }
    repaint();
 }

 public void scaleImage(int width , int height){
    if(image!=null){
        Image scaledImage= image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        image=scaledImage;
        repaint();
    }
 }

 @Override
 protected  void paintComponent(Graphics g){
    super.paintComponent(g);
    if(image!= null){

  int x= (getWidth()-image.getWidth(null)) /2;
  int y = (getHeight()-image.getHeight(null))/2;
    g.drawImage(image, x, y, this);





    }
 }



}