package caçan;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jogo extends javax.swing.JFrame {

    int num=0;
    int num2=0;
    int num3=0;
    
    public Jogo() {
        initComponents();
        setTitle("Caça Niquel");
        setSize(470,290);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        JOptionPane.showMessageDialog(null, "Clique uma vez para girar e outra parar");
        JOptionPane.showMessageDialog(null, "Maçãs = 200 ponto \n Limões = 500 pontos \n Setes = 1000 pontos \n Caveiras = -300 pontos");
    }
    
    public void Tela(){
        Tela tela = new Tela();
        tela.setVisible(true);
        dispose();
    }
    
    public void cond(){
        
        /*try {
            
            Thread.sleep(300);
        } catch (InterruptedException ex) {
           Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
       }*/
        if (num==1){
            A.setIcon(new ImageIcon("C:/Maçã.jpg"));
        } else if(num==2){
            A.setIcon(new ImageIcon("C:/Limão.jpg"));
        } else if(num==3){
            A.setIcon(new ImageIcon("C:/Sete.jpg"));
        } else if(num==4){
            A.setIcon(new ImageIcon("C:/Cav.jpg"));
        }
    }
    
    public void cond2(){
        /*try {
            
            Thread.sleep(600);
       } catch (InterruptedException ex) {
           Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
       }*/
        if (num2==1){
            B.setIcon(new ImageIcon("C:/Maçã.jpg"));
        } else if(num2==2){
            B.setIcon(new ImageIcon("C:/Limão.jpg"));
        } else if(num2==3){
            B.setIcon(new ImageIcon("C:/Sete.jpg"));
        } else if(num2==4){
            B.setIcon(new ImageIcon("C:/Cav.jpg"));
        }
    }
    
    public void cond3(){
        
        /*try {
            
            Thread.sleep(900);
        } catch (InterruptedException ex) {
           Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
       }*/
        if (num3==1){
            C.setIcon(new ImageIcon("C:/Maçã.jpg"));
        } else if(num3==2){
            C.setIcon(new ImageIcon("C:/Limão.jpg"));
        } else if(num3==3){
            C.setIcon(new ImageIcon("C:/Sete.jpg"));
        } else if(num3==4){
            C.setIcon(new ImageIcon("C:/Cav.jpg"));
        }
    }
    int condd=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        A = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        B = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        C = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Pont = new javax.swing.JLabel();
        pont = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        A.setBackground(new java.awt.Color(153, 153, 153));
        A.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        B.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        C.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("JOGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Pont.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pont.setText("Pontuação: ");

        pont.setText("1000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(Pont)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pont))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pont)
                    .addComponent(pont))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(condd==0){
        A.setIcon(new ImageIcon("C:/girar.gif"));
        B.setIcon(new ImageIcon("C:/girar.gif"));
        C.setIcon(new ImageIcon("C:/girar.gif"));
        
        condd=condd+1;
    }
        else if(condd==1){    
        int pg = Integer.parseInt(pont.getText());
        pg = pg-50;
        pont.setText(""+pg);
        
        num = (int) (Math.random()*4+1);
        num2 = (int) (Math.random()*4+1);
        num3 = (int) (Math.random()*4+1);
        
        
        
        cond();
        cond2();
        cond3();
        
        if((num==1)&&(num2==num3)&&(num==num2)){
            JOptionPane.showMessageDialog(null,"Você ganhou 200 créditos");
            pg = Integer.parseInt(pont.getText());
            pg = pg+200;
            pont.setText(""+pg);
            if (pg<1){
                JOptionPane.showMessageDialog(null,"Acabaram seus créditos, pague mais");
                Tela();
            }
    } else if((num==2)&&(num2==num3)&&(num==num2)){
            JOptionPane.showMessageDialog(null,"Você ganhou 500 créditos");
            pg = Integer.parseInt(pont.getText());
            pg = pg+500;
            pont.setText(""+pg);
            if (pg<1){
                JOptionPane.showMessageDialog(null,"Acabaram seus créditos, pague mais");
                Tela();
            }
    } else if((num==3)&&(num2==num3)&&(num==num2)){
            JOptionPane.showMessageDialog(null,"Você ganhou 1000 créditos");
            pg = Integer.parseInt(pont.getText());
            pg = pg+1000;
            pont.setText(""+pg);
            if (pg<1){
                JOptionPane.showMessageDialog(null,"Acabaram seus créditos, pague mais");
                Tela();
            }
    } else if((num==4)&&(num2==num3)&&(num==num2)){
            JOptionPane.showMessageDialog(null,"Você perdeu 300 créditos");
            pg = Integer.parseInt(pont.getText());
            pg = pg-300;
            pont.setText(""+pg);
            if (pg<1){
                JOptionPane.showMessageDialog(null,"Acabaram seus créditos, pague mais");
                Tela();
            }
    } else {
        //JOptionPane.showMessageDialog(null,"Você perdeu");
        if (pg<1){
                JOptionPane.showMessageDialog(null,"Acabaram seus créditos, pague mais");
                Tela();
            }
    }
    condd=condd-1;
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel Pont;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel pont;
    // End of variables declaration//GEN-END:variables
}
