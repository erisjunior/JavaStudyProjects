package aulagraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class AulaGraphics extends JFrame{

public AulaGraphics(){

    setSize(600,600);
    setVisible(true);
    setResizable(false);
    setLocationRelativeTo(null);
    setTitle("Desenhando");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
}
    public void paint(Graphics d){
    
        setBackground(Color.yellow);

//desenho basico        
//        d.setColor(Color.red);
//        d.drawLine(50, 50, 150, 150);
//        
//        d.drawLine(150, 50, 50, 150);
//        
//        d.drawRect(50, 50, 100, 100);
//        
//        d.drawOval(50, 50, 100, 100);
    
//capeta
//        d.setColor(Color.red);
//        d.drawOval(50, 50, 100, 100);
//        
//        d.drawLine(100, 50, 60, 130);
//        
//        d.drawLine(145, 75, 60, 130);
//        
//        d.drawLine(100, 50, 140, 130);
//        
//        d.drawLine(55, 75, 140, 130);
//        
//        d.drawLine(55, 75, 145, 75);        

//olimpiada
//        d.setColor(Color.red);
//        d.drawOval(50, 250, 100, 100);
//        d.setColor(Color.blue);
//        d.drawOval(160, 250, 100, 100);
//        d.setColor(Color.yellow);
//        d.drawOval(270, 250, 100, 100);
//        d.setColor(Color.green);
//        d.drawOval(105, 285, 100, 100);
//        d.setColor(Color.black);
//        d.drawOval(215, 285, 100, 100);

//carinha
//        d.setColor(Color.red);
//        d.drawArc(150,150,300,300,45,480);
//        
//        d.drawArc(210,230,40,40,45,480);
//        d.drawArc(350,230,40,40,45,480);
//        
//        d.drawArc(230,280,150,100,200,140);
//        d.drawArc(235,300,140,100,180,180);

//coração na bandeira
//        d.setColor(Color.red);
//        d.drawArc(150,101,150,100,0,210);
//        d.drawArc(300,101,150,100,-30,210);
//        
//        d.drawLine(155,170,300,350);
//        d.drawLine(443,170,300,350);
//
//        
//        d.setColor(Color.green);
//        d.drawRect(100, 100, 400, 250);
//        
//        d.setColor(Color.yellow);
//        d.drawLine(300, 100, 100, 225);
//        d.drawLine(300, 100, 500, 225);
//        d.drawLine(100, 225, 300, 350);
//        d.drawLine(500, 225, 300, 350);
//        
//        d.setColor(Color.blue);
//        d.drawOval(225, 150, 150, 150);
//        
//        d.setColor(Color.black);
//        d.drawArc(228, 205, 145, 75,0,180);
//        d.drawArc(225, 185, 150, 75,0,180);

//poligono
        int xpoints[] = {300,100,300,500,300};
        int ypoints[] = {100,225,350,250,100};
        int npoints = 5;
        
        d.setColor(Color.yellow);
        d.fillPolygon(xpoints,ypoints,npoints);

    }
    
    public static void main(String[] args) {
        new AulaGraphics();
    }    
}
