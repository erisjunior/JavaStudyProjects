package spiderman;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main extends JFrame{
    
    ImageIcon p = new ImageIcon(getClass().getResource("parede.jpg"));
    ImageIcon smp = new ImageIcon(getClass().getResource("spiderman.png"));
    ImageIcon sma = new ImageIcon(getClass().getResource("spiderman.gif"));
    ImageIcon vs = new ImageIcon(getClass().getResource("barata.gif"));
    ImageIcon vm = new ImageIcon(getClass().getResource("barata.png"));
    ImageIcon vc = new ImageIcon(getClass().getResource("vaso.png"));
    
    JLabel vaso = new JLabel(vc);
    JLabel vaso2 = new JLabel(vc);
    JLabel vaso3 = new JLabel(vs);
    JLabel vaso4 = new JLabel(vs);
    JLabel vaso5 = new JLabel(vs);
    JLabel parede = new JLabel(p);
    JLabel s = new JLabel(smp);
    
    JLabel posicao = new JLabel("Boosts: Pontos:");
    
    int pont = 0;
    int contad = 0;
    int contado=0;
    int cont = 3;
    int SpidemanX = 250;
    int SpidemanY = 250;
    int vaiX = 0;
    int vaiY = 0;
    
    boolean oi = true;
    
    int vasoX = 0;
    int vasoY = -80;
    int vasoX2 = 0;
    int vasoY2 = -80;
    int vasoX3 = 0;
    int vasoY3 = -80;
    int vasoX4 = 0;
    int vasoY4 = -80;
    int vasoX5 = 0;
    int vasoY5 = -80;
    
    
    public void comeco(){
        vasoY = -100;
        vaso.setBounds(vasoX,vasoY,100,100);
        vasoY2 = -200;
        vaso2.setBounds(vasoX2,vasoY2,100,100);
        vasoY3 = -300;
        vaso3.setBounds(vasoX3,vasoY3,100,100);
        vasoY4 = -400;
        vaso4.setBounds(vasoX4,vasoY4,100,100);
        vasoY5 = -500;
        vaso5.setBounds(vasoX5,vasoY5,100,100);
    }
    
    public void morte(){
        try {sleep(10);} catch (Exception e) {}
                    if(SpidemanY<550){
                        SpidemanY += 20;
                        s.setBounds(SpidemanX,SpidemanY,103,202);
                    } else{
                        oi=true;
                    }
    }
    
    public void som() {
        try {
            AudioInputStream as =  AudioSystem.getAudioInputStream(new File ("C:/Urna.wav").getAbsoluteFile());
           
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(as);
                clip.start();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public class som1 extends Thread{
        public void run(){
            while(true){
                try {sleep(1000);} catch (Exception e) {}
                som();
            }
        }
    }
    
    public void ReVaso(){
        vasoY = -80;
        vasoX = (int) (Math.random()*450)+20;
        vasoY2 = -80;
        vasoX2 = (int) (Math.random()*450)+20;
        vasoY3 = -80;
        vasoX3 = (int) (Math.random()*450)+20;
        vasoY4 = -80;
        vasoX4 = (int) (Math.random()*450)+20;
        vasoY5 = -80;
        vasoX5 = (int) (Math.random()*450)+20;
    }
    
    public class Teia extends Thread{
        public void run(){
            while(true){
                try {sleep(5);} catch (Exception e) {}
                if(SpidemanX>vaiX){
                    s.setIcon(sma);
                    SpidemanX = SpidemanX -1;
                    s.setBounds(SpidemanX,SpidemanY,103,202);
                }else if(SpidemanX<vaiX){
                    s.setIcon(sma);
                    SpidemanX = SpidemanX +1;
                    s.setBounds(SpidemanX,SpidemanY,103,202);
                } 
                
                if(SpidemanY>vaiY){
                    s.setIcon(sma);
                    SpidemanY = SpidemanY -1;
                    s.setBounds(SpidemanX,SpidemanY,103,202);
                }else if(SpidemanY<vaiY){
                    s.setIcon(sma);
                    SpidemanY = SpidemanY +1;
                    s.setBounds(SpidemanX,SpidemanY,103,202);
                }
                if(SpidemanX==vaiX && SpidemanY==vaiY){
                    s.setIcon(smp);
                    break;
                }
            }
        }
    }
    
    public class Vaso extends Thread{
        public void run(){
            comeco();
            while(true){
                
                
                
                try {sleep(20);} catch (Exception e) {}
                
                vasoY +=3;
                vaso.setBounds(vasoX,vasoY,100,100);
                
                vasoY2 +=3;
                vaso2.setBounds(vasoX2,vasoY2,100,100);
                
                vasoY3 +=3;
                vaso3.setBounds(vasoX3,vasoY3,100,100);
                
                vasoY4 +=3;
                vaso4.setBounds(vasoX4,vasoY4,100,100);
               
                vasoY5 +=3;
                vaso5.setBounds(vasoX5,vasoY5,100,100);
                
                
                if(vasoY>600){
                    vasoY = -80;
                    vasoX = (int) (Math.random()*450)+20;
                    
                }
                if(vasoY2>600){
                    vasoY2 = -80;
                    vasoX2 = (int) (Math.random()*450)+20;
                }
                if(vasoY3>600){
                    vasoY3 = -80;
                    vasoX3 = (int) (Math.random()*450)+20;
                    vaso3.setIcon(vs);
                    pont--;
                    posicao.setText("Boosts: "+cont+" Pontos: "+pont);
                }
                if(vasoY4>600){
                    vasoY4 = -80;
                    vasoX4 = (int) (Math.random()*450)+20;
                    vaso4.setIcon(vs);
                    pont--;
                    posicao.setText("Boosts: "+cont+" Pontos: "+pont);
                }
                if(vasoY5>600){
                    vasoY5 = -80;
                    vasoX5 = (int) (Math.random()*450)+20;
                    vaso5.setIcon(vs);
                    pont--;
                    posicao.setText("Boosts: "+cont+" Pontos: "+pont);
                }
                
                if(((vasoY-60)>(SpidemanY-100) ) && ((vasoX+50)>(SpidemanX) && (vasoX-50)<(SpidemanX)) ){
                    vasoY = -80;
                    vasoX = (int) (Math.random()*450)+20;
                    
                    pont--;
                    
                    oi=false;
                    
                    posicao.setText("Boosts: "+cont+" Pontos: "+pont);
                    
                    
                }
                
                if(((vasoY2-60)>(SpidemanY-100) ) && ((vasoX2+50)>(SpidemanX) && (vasoX2-50)<(SpidemanX)) ){
                    vasoY2 = -80;
                    vasoX2 = (int) (Math.random()*450)+20;
                    
                    oi=false;
                    
                    pont--;
                    
                    posicao.setText("Boosts: "+cont+" Pontos: "+pont);
                    
                }
                
                if(((vasoY3-60)>(SpidemanY-100) ) && ((vasoX3+50)>(SpidemanX) && (vasoX3-50)<(SpidemanX)) ){
                    vasoY3 = -80;
                    vasoX3 = (int) (Math.random()*450)+20;
                    
                    
                    pont++;
                    
                    posicao.setText("Boosts: "+cont+" Pontos: "+pont);
                    
                    
                }
                
                if(((vasoY4-60)>(SpidemanY-100) ) && ((vasoX4+50)>(SpidemanX) && (vasoX4-50)<(SpidemanX)) ){
                    vasoY4 = -80;
                    vasoX4 = (int) (Math.random()*450)+20;
                    
                    oi=false;
                    
                    pont++;
                    
                    posicao.setText("Boosts: "+cont+" Pontos: "+pont);
                    
                }
                
                if(((vasoY5-60)>(SpidemanY-100) ) && ((vasoX5+50)>(SpidemanX) && (vasoX5-50)<(SpidemanX)) ){
                    vasoY5 = -80;
                    vasoX5 = (int) (Math.random()*450)+20;
                    
                    oi=false;
                    
                    pont++;
                    
                    posicao.setText("Boosts: "+cont+" Pontos: "+pont);
                    
                }
                
                
                
                
            }
        }
    }
    
    public void Controles(){
            if(oi==true){
                    addKeyListener(new KeyListener() {
                        @Override
                        public void keyTyped(KeyEvent e) {

                        }
                        @Override
                        public void keyPressed(KeyEvent e) {
                            if(e.getKeyChar()=='w'){
                                s.setIcon(sma);
                                SpidemanY = SpidemanY -10;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }else if(e.getKeyChar()=='d'){
                                s.setIcon(sma);
                                SpidemanX = SpidemanX +10;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }else if(e.getKeyChar()=='a'){
                                s.setIcon(sma);
                                SpidemanX = SpidemanX -10;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }else if(e.getKeyChar()=='x'){
                                s.setIcon(sma);
                                SpidemanY = SpidemanY +10;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }else if(e.getKeyChar()=='z'){
                                s.setIcon(sma);
                                SpidemanY = SpidemanY +10;
                                SpidemanX = SpidemanX -10;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }else if(e.getKeyChar()=='c'){
                                s.setIcon(sma);
                                SpidemanY = SpidemanY +10;
                                SpidemanX = SpidemanX +10;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }else if(e.getKeyChar()=='q'){
                                s.setIcon(sma);
                                SpidemanY = SpidemanY -10;
                                SpidemanX = SpidemanX -10;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }else if(e.getKeyChar()=='e'){
                                s.setIcon(sma);
                                SpidemanY = SpidemanY -10;
                                SpidemanX = SpidemanX +10;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }
                            if(SpidemanX>570){
                                SpidemanX = -80;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }
                            else if(SpidemanX<-80){
                                SpidemanX = 570;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }else if(SpidemanY>650){
                                SpidemanY = -180;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }else if(SpidemanY<-180){
                                SpidemanY = 650;
                                s.setBounds(SpidemanX,SpidemanY,103,202);
                            }
                        }

                        @Override
                        public void keyReleased(KeyEvent e) {
                            s.setIcon(smp);
                        }
                    });
            } 
        }
    
    public void Click(){
            parede.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
                if(cont>0){
                    Point pa = getMousePosition();
                    vaiY = pa.y;
                    vaiX = pa.x;

                    Teia teia = new Teia();
                    teia.start();
                    cont--;
                    posicao.setText("Boosts: "+cont+" Pontos: "+pont);
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            
            }

            @Override
            public void mouseExited(MouseEvent me) {
            
            }
            });
        }
    
    public Main(){
        setTitle("Spiderman");
        setVisible(true);
        setSize(600,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        som1 som1 = new som1();
        som1.start();
        
        
        parede.setBounds(0,0,600,800);
        s.setBounds(SpidemanX,SpidemanY,103,202);
        vaso.setBounds(vasoX,vasoY,100,100);
        vaso2.setBounds(vasoX2,vasoY2,100,100);
        vaso3.setBounds(vasoX3,vasoY3,100,100);
        vaso4.setBounds(vasoX4,vasoY4,100,100);
        vaso5.setBounds(vasoX5,vasoY5,100,100);
        
        posicao.setText("Boosts: "+cont+" Pontos: "+pont);
        
        ReVaso();
        
        add(parede);
        
        posicao.setFont(new Font(null,Font.BOLD,18));
        posicao.setForeground(Color.white);
        posicao.setBounds(50,50,300,50);
        parede.add(posicao);
        
        parede.add(s);
        parede.add(vaso);
        parede.add(vaso2);
        parede.add(vaso3);
        parede.add(vaso4);
        parede.add(vaso5);
        
        Vaso vas = new Vaso();
        vas.start();
        
        Controles();
        
        Click();
    }
    
    public static void main(String[] args) {
        new Main();
    }
    
}