package eretec;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ERETEC extends JFrame{
    
    ImageIcon p = new ImageIcon(getClass().getResource("parede.jpg"));
    ImageIcon smp = new ImageIcon(getClass().getResource("spiderman.png"));
    ImageIcon vc = new ImageIcon(getClass().getResource("vaso.png"));
    
    int SpidemanX = 100;
    int SpidemanY = 300;
    
    JLabel vaso = new JLabel(vc);
    JLabel vaso2 = new JLabel(vc);
    JLabel vaso3 = new JLabel(vc);
    JLabel vaso4 = new JLabel(vc);
    
    int vasoX = 0;
    int vasoY = -80;
    int vasoX2 = 0;
    int vasoY2 = -80;
    int vasoX3 = 0;
    int vasoY3 = -80;
    int vasoX4 = 0;
    int vasoY4 = -80;
    
    JLabel s = new JLabel(smp);
    JLabel parede = new JLabel(p);
    
    public void Controles(){
            
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==37){
                    if(SpidemanX<400 || SpidemanX>-100){
                        SpidemanX = SpidemanX -100;
                        s.setBounds(SpidemanX,SpidemanY,103,202);
                    }
                    
                }else if(e.getKeyCode()==39){
                    if(SpidemanX<400 || SpidemanX>-100){
                        SpidemanX = SpidemanX +100;
                        s.setBounds(SpidemanX,SpidemanY,103,202);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                            
            }
        });
    } 
        
    /*public void ReVaso(){
        
                vasoY = -80;
                int ale = (int) (Math.random()*3)+1;
                vasoX=ale*100;
                
                vasoY2 = -80;
                int ale2 = (int) (Math.random()*3);
                vasoX2=ale2*100;
                
                vasoY3 = -80;
                int ale3 = (int) (Math.random()*3);
                vasoX3=ale3*100;
                
                vasoY4 = -80;
                int ale4 = (int) (Math.random()*3);
                vasoX4=ale4*100;
                    
        vaso.setBounds(vasoX,vasoY,100,100);
        vaso2.setBounds(vasoX2,vasoY2,100,100);
        vaso3.setBounds(vasoX3,vasoY3,100,100);
        vaso4.setBounds(vasoX4,vasoY4,100,100);
    }*/
    
    public void comeco(){
        vasoY = -100;
                int ale = (int) (Math.random()*3)+1;
                vasoX=ale*100;
                
                vasoY2 = -200;
                int ale2 = (int) (Math.random()*3);
                vasoX2=ale2*100;
                
                vasoY3 = -300;
                int ale3 = (int) (Math.random()*3);
                vasoX3=ale3*100;
                
                vasoY4 = -400;
                int ale4 = (int) (Math.random()*3);
                vasoX4=ale4*100;
                    
        vaso.setBounds(vasoX,vasoY,100,100);
        vaso2.setBounds(vasoX2,vasoY2,100,100);
        vaso3.setBounds(vasoX3,vasoY3,100,100);
        vaso4.setBounds(vasoX4,vasoY4,100,100);
    }
    
    public class Vaso extends Thread{
        public void run(){
            comeco();
            while(true){
                
                
                
                try {sleep(500);} catch (Exception e) {}
                
                vasoY +=100;
                vaso.setBounds(vasoX,vasoY,100,100);
                
                vasoY2 +=100;
                vaso2.setBounds(vasoX2,vasoY2,100,100);
                
                vasoY3 +=100;
                vaso3.setBounds(vasoX3,vasoY3,100,100);
                
                vasoY4 +=100;
                vaso4.setBounds(vasoX4,vasoY4,100,100);
                
                
                if(vasoY>600){
                    vasoY = -80;
                    int ale = (int) (Math.random()*3)+1;
                    vasoX=ale*100;
                }
                if(vasoY2>600){
                    vasoY2 = -80;
                    int ale2 = (int) (Math.random()*3);
                    vasoX2=ale2*100;
                }
                if(vasoY3>600){
                    vasoY3 = -80;
                    int ale3 = (int) (Math.random()*3);
                    vasoX3=ale3*100;
                }
                if(vasoY4>600){
                    vasoY4 = -80;
                    int ale4 = (int) (Math.random()*3);
                    vasoX4=ale4*100;
                }
                
                if(((vasoY)>(SpidemanY) ) && ((vasoX+50)>(SpidemanX) && (vasoX-50)<(SpidemanX)) ){
                    vasoY = -80;
                    vasoX = (int) (Math.random()*3);
                }
                
                if(((vasoY2)>(SpidemanY) ) && ((vasoX2+50)>(SpidemanX) && (vasoX2-50)<(SpidemanX)) ){
                    vasoY2 = -80;
                    vasoX2 = (int) (Math.random()*450)+20;
                    
                    
                    
                }
                
                if(((vasoY3)>(SpidemanY) ) && ((vasoX3+50)>(SpidemanX) && (vasoX3-50)<(SpidemanX)) ){
                    vasoY3 = -80;
                    vasoX3 = (int) (Math.random()*450)+20;
                    
                    
                }
                
                if(((vasoY4)>(SpidemanY) ) && ((vasoX4+50)>(SpidemanX) && (vasoX4-50)<(SpidemanX)) ){
                    vasoY4 = -80;
                    vasoX4 = (int) (Math.random()*450)+20;
                    
                    
                }
                
                
            }
        }
    }
    
    public ERETEC(){
        setTitle("Spiderman");
        setVisible(true);
        setSize(300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        parede.setBounds(0,0,300,500);
        
        Vaso vas = new Vaso();
        vas.start();
        
        vaso.setBounds(vasoX,vasoY,100,100);
        vaso2.setBounds(vasoX2,vasoY2,100,100);
        vaso3.setBounds(vasoX3,vasoY3,100,100);
        vaso4.setBounds(vasoX4,vasoY4,100,100);
        
        s.setBounds(SpidemanX,SpidemanY,100,200);
        
        add(parede);
        
        parede.add(s);
        parede.add(vaso);
        parede.add(vaso2);
        parede.add(vaso3);
        parede.add(vaso4);
        
        
        
        Controles();
    }

    public static void main(String[] args) {
        new ERETEC();
    }
    
}