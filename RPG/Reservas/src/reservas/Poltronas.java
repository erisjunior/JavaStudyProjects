package reservas;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Poltronas extends javax.swing.JFrame {

    public Poltronas() {
        this.file = "";
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        hora();
        poltrona();
    }
    
    String poltrona = "";
    
    public String pegaPoltrona(String p){
        poltrona = p;
        return poltrona;
    }

    public void hora(){
        Locale locale = new Locale("pt","BR");
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat formatador = new SimpleDateFormat("HH':'mm",locale);
        jTextField1.setText(formatador.format(calendar.getTime()));
    }
    
    public void poltrona(){
        String c1="C:/Sistema Reserva/Compras/1.txt";
        String r1="C:/Sistema Reserva/Reservas/1.txt";
        File C1 = new File(c1);
        File R1 = new File(r1);
        
        if(C1.exists()){
            a1.setBackground(Color.red);
        }else if(R1.exists()){
            a1.setBackground(Color.orange);
        }else{
            a1.setBackground(Color.green);
        }
        
        String c2="C:/Sistema Reserva/Compras/2.txt";
        String r2="C:/Sistema Reserva/Reservas/2.txt";
        File C2 = new File(c2);
        File R2 = new File(r2);
        
        if(C2.exists()){
            a2.setBackground(Color.red);
        }else if(R2.exists()){
            a2.setBackground(Color.orange);
        }else{
            a2.setBackground(Color.green);
        }
        
        String c3="C:/Sistema Reserva/Compras/3.txt";
        String r3="C:/Sistema Reserva/Reservas/3.txt";
        File C3 = new File(c3);
        File R3 = new File(r3);
        
        if(C3.exists()){
            a3.setBackground(Color.red);
        }else if(R3.exists()){
            a3.setBackground(Color.orange);
        }else{
            a3.setBackground(Color.green);
        }
        
        String c4="C:/Sistema Reserva/Compras/4.txt";
        String r4="C:/Sistema Reserva/Reservas/4.txt";
        File C4 = new File(c4);
        File R4 = new File(r4);
        
        if(C4.exists()){
            a4.setBackground(Color.red);
        }else if(R4.exists()){
            a4.setBackground(Color.orange);
        }else{
            a4.setBackground(Color.green);
        }
        
        String c5="C:/Sistema Reserva/Compras/5.txt";
        String r5="C:/Sistema Reserva/Reservas/5.txt";
        File C5 = new File(c5);
        File R5 = new File(r5);
        
        if(C5.exists()){
            a5.setBackground(Color.red);
        }else if(R5.exists()){
            a5.setBackground(Color.orange);
        }else{
            a5.setBackground(Color.green);
        }
        
        String c6="C:/Sistema Reserva/Compras/6.txt";
        String r6="C:/Sistema Reserva/Reservas/6.txt";
        File C6 = new File(c6);
        File R6 = new File(r6);
        
        if(C6.exists()){
            a6.setBackground(Color.red);
        }else if(R6.exists()){
            a6.setBackground(Color.orange);
        }else{
            a6.setBackground(Color.green);
        }
        
        String c7="C:/Sistema Reserva/Compras/7.txt";
        String r7="C:/Sistema Reserva/Reservas/7.txt";
        File C7 = new File(c7);
        File R7 = new File(r7);
        
        if(C7.exists()){
            a7.setBackground(Color.red);
        }else if(R7.exists()){
            a7.setBackground(Color.orange);
        }else{
            a7.setBackground(Color.green);
        }
        
        String c8="C:/Sistema Reserva/Compras/8.txt";
        String r8="C:/Sistema Reserva/Reservas/8.txt";
        File C8 = new File(c8);
        File R8 = new File(r8);
        
        if(C8.exists()){
            a8.setBackground(Color.red);
        }else if(R8.exists()){
            a8.setBackground(Color.orange);
        }else{
            a8.setBackground(Color.green);
        }
        
        String c9="C:/Sistema Reserva/Compras/9.txt";
        String r9="C:/Sistema Reserva/Reservas/9.txt";
        File C9 = new File(c9);
        File R9 = new File(r9);
        
        if(C9.exists()){
            a9.setBackground(Color.red);
        }else if(R9.exists()){
            a9.setBackground(Color.orange);
        }else{
            a9.setBackground(Color.green);
        }
        
        String c10="C:/Sistema Reserva/Compras/10.txt";
        String r10="C:/Sistema Reserva/Reservas/10.txt";
        File C10 = new File(c10);
        File R10 = new File(r10);
        
        if(C10.exists()){
            a10.setBackground(Color.red);
        }else if(R10.exists()){
            a10.setBackground(Color.orange);
        }else{
            a10.setBackground(Color.green);
        }
        
        String c11="C:/Sistema Reserva/Compras/11.txt";
        String r11="C:/Sistema Reserva/Reservas/11.txt";
        File C11 = new File(c11);
        File R11 = new File(r11);
        
        if(C11.exists()){
            a11.setBackground(Color.red);
        }else if(R11.exists()){
            a11.setBackground(Color.orange);
        }else{
            a11.setBackground(Color.green);
        }
        
        String c12="C:/Sistema Reserva/Compras/12.txt";
        String r12="C:/Sistema Reserva/Reservas/12.txt";
        File C12 = new File(c12);
        File R12 = new File(r12);
        
        if(C12.exists()){
            a12.setBackground(Color.red);
        }else if(R12.exists()){
            a12.setBackground(Color.orange);
        }else{
            a12.setBackground(Color.green);
        }
        
        String c13="C:/Sistema Reserva/Compras/13.txt";
        String r13="C:/Sistema Reserva/Reservas/13.txt";
        File C13 = new File(c13);
        File R13 = new File(r13);
        
        if(C13.exists()){
            a13.setBackground(Color.red);
        }else if(R13.exists()){
            a13.setBackground(Color.orange);
        }else{
            a13.setBackground(Color.green);
        }
        
        String c14="C:/Sistema Reserva/Compras/14.txt";
        String r14="C:/Sistema Reserva/Reservas/14.txt";
        File C14 = new File(c14);
        File R14 = new File(r14);
        
        if(C14.exists()){
            a14.setBackground(Color.red);
        }else if(R14.exists()){
            a14.setBackground(Color.orange);
        }else{
            a14.setBackground(Color.green);
        }
        
        String c15="C:/Sistema Reserva/Compras/15.txt";
        String r15="C:/Sistema Reserva/Reservas/15.txt";
        File C15 = new File(c15);
        File R15 = new File(r15);
        
        if(C15.exists()){
            a15.setBackground(Color.red);
        }else if(R15.exists()){
            a15.setBackground(Color.orange);
        }else{
            a15.setBackground(Color.green);
        }
        
        String c16="C:/Sistema Reserva/Compras/16.txt";
        String r16="C:/Sistema Reserva/Reservas/16.txt";
        File C16 = new File(c16);
        File R16 = new File(r16);
        
        if(C16.exists()){
            a16.setBackground(Color.red);
        }else if(R16.exists()){
            a16.setBackground(Color.orange);
        }else{
            a16.setBackground(Color.green);
        }
        
        String c17="C:/Sistema Reserva/Compras/17.txt";
        String r17="C:/Sistema Reserva/Reservas/17.txt";
        File C17 = new File(c17);
        File R17 = new File(r17);
        
        if(C17.exists()){
            a17.setBackground(Color.red);
        }else if(R17.exists()){
            a17.setBackground(Color.orange);
        }else{
            a17.setBackground(Color.green);
        }
        
        String c18="C:/Sistema Reserva/Compras/18.txt";
        String r18="C:/Sistema Reserva/Reservas/18.txt";
        File C18 = new File(c18);
        File R18 = new File(r18);
        
        if(C18.exists()){
            a18.setBackground(Color.red);
        }else if(R18.exists()){
            a18.setBackground(Color.orange);
        }else{
            a18.setBackground(Color.green);
        }
        
        String c19="C:/Sistema Reserva/Compras/19.txt";
        String r19="C:/Sistema Reserva/Reservas/19.txt";
        File C19 = new File(c19);
        File R19 = new File(r19);
        
        if(C19.exists()){
            a19.setBackground(Color.red);
        }else if(R19.exists()){
            a19.setBackground(Color.orange);
        }else{
            a19.setBackground(Color.green);
        }
        
        String c20="C:/Sistema Reserva/Compras/20.txt";
        String r20="C:/Sistema Reserva/Reservas/20.txt";
        File C20 = new File(c20);
        File R20 = new File(r20);
        
        if(C20.exists()){
            a20.setBackground(Color.red);
        }else if(R20.exists()){
            a20.setBackground(Color.orange);
        }else{
            a20.setBackground(Color.green);
        }
        
        String c21="C:/Sistema Reserva/Compras/21.txt";
        String r21="C:/Sistema Reserva/Reservas/21.txt";
        File C21 = new File(c21);
        File R21 = new File(r21);
        
        if(C21.exists()){
            a21.setBackground(Color.red);
        }else if(R21.exists()){
            a21.setBackground(Color.orange);
        }else{
            a21.setBackground(Color.green);
        }
        
        String c22="C:/Sistema Reserva/Compras/22.txt";
        String r22="C:/Sistema Reserva/Reservas/22.txt";
        File C22 = new File(c22);
        File R22 = new File(r22);
        
        if(C22.exists()){
            a22.setBackground(Color.red);
        }else if(R22.exists()){
            a22.setBackground(Color.orange);
        }else{
            a22.setBackground(Color.green);
        }
        
        String c23="C:/Sistema Reserva/Compras/23.txt";
        String r23="C:/Sistema Reserva/Reservas/23.txt";
        File C23 = new File(c23);
        File R23 = new File(r23);
        
        if(C23.exists()){
            a23.setBackground(Color.red);
        }else if(R23.exists()){
            a23.setBackground(Color.orange);
        }else{
            a23.setBackground(Color.green);
        }
        
        String c24="C:/Sistema Reserva/Compras/24.txt";
        String r24="C:/Sistema Reserva/Reservas/24.txt";
        File C24 = new File(c24);
        File R24 = new File(r24);
        
        if(C24.exists()){
            a24.setBackground(Color.red);
        }else if(R24.exists()){
            a24.setBackground(Color.orange);
        }else{
            a24.setBackground(Color.green);
        }
        
        String c25="C:/Sistema Reserva/Compras/25.txt";
        String r25="C:/Sistema Reserva/Reservas/25.txt";
        File C25 = new File(c25);
        File R25 = new File(r25);
        
        if(C25.exists()){
            a25.setBackground(Color.red);
        }else if(R25.exists()){
            a25.setBackground(Color.orange);
        }else{
            a25.setBackground(Color.green);
        }
        
        String c26="C:/Sistema Reserva/Compras/26.txt";
        String r26="C:/Sistema Reserva/Reservas/26.txt";
        File C26 = new File(c26);
        File R26 = new File(r26);
        
        if(C26.exists()){
            a26.setBackground(Color.red);
        }else if(R26.exists()){
            a26.setBackground(Color.orange);
        }else{
            a26.setBackground(Color.green);
        }
        
        String c27="C:/Sistema Reserva/Compras/27.txt";
        String r27="C:/Sistema Reserva/Reservas/27.txt";
        File C27 = new File(c27);
        File R27 = new File(r27);
        
        if(C27.exists()){
            a27.setBackground(Color.red);
        }else if(R27.exists()){
            a27.setBackground(Color.orange);
        }else{
            a27.setBackground(Color.green);
        }
        
        String c28="C:/Sistema Reserva/Compras/28.txt";
        String r28="C:/Sistema Reserva/Reservas/28.txt";
        File C28 = new File(c28);
        File R28 = new File(r28);
        
        if(C28.exists()){
            a28.setBackground(Color.red);
        }else if(R28.exists()){
            a28.setBackground(Color.orange);
        }else{
            a28.setBackground(Color.green);
        }
        
    }
    
    
    
    String file="";
    String[] dados = {"","","",""};
    
    public void DadosPoltronas(int p) {
        try{ 
            file = p+".txt";
            
            BufferedReader br = new BufferedReader(new FileReader("C:/Sistema Reserva/Compras/"+file));
            int i =0;
            while(br.ready()){
            dados[i] = br.readLine();
            i++;
        }
        jLabel3.setText(""+dados[0]);
        jLabel4.setText(dados[1]);
        jLabel5.setText(dados[2]);
        jLabel11.setText(dados[3]);
        jLabel6.setText(dados[4]);
        
        
        br.close();
        dados = null;
        file = "";
        
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Poltrona Livre");
        } catch (IOException ex) {
            Logger.getLogger(Poltronas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        a25 = new javax.swing.JButton();
        a21 = new javax.swing.JButton();
        a17 = new javax.swing.JButton();
        a13 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a26 = new javax.swing.JButton();
        a22 = new javax.swing.JButton();
        a18 = new javax.swing.JButton();
        a14 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a28 = new javax.swing.JButton();
        a24 = new javax.swing.JButton();
        a20 = new javax.swing.JButton();
        a16 = new javax.swing.JButton();
        a12 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a27 = new javax.swing.JButton();
        a23 = new javax.swing.JButton();
        a19 = new javax.swing.JButton();
        a15 = new javax.swing.JButton();
        a11 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("SISTEMA DE RESERVAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jPanel2.setInheritsPopupMenu(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        a25.setBackground(new java.awt.Color(204, 204, 204));
        a25.setText("25");
        a25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a25ActionPerformed(evt);
            }
        });

        a21.setBackground(new java.awt.Color(204, 204, 204));
        a21.setText("21");
        a21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21ActionPerformed(evt);
            }
        });

        a17.setBackground(new java.awt.Color(204, 204, 204));
        a17.setText("17");
        a17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a17ActionPerformed(evt);
            }
        });

        a13.setBackground(new java.awt.Color(204, 204, 204));
        a13.setText("13");
        a13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13ActionPerformed(evt);
            }
        });

        a5.setBackground(new java.awt.Color(204, 204, 204));
        a5.setText("5");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a9.setBackground(new java.awt.Color(204, 204, 204));
        a9.setText("9");
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });

        a1.setBackground(new java.awt.Color(204, 204, 204));
        a1.setText("1");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.setBackground(new java.awt.Color(204, 204, 204));
        a2.setText("2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a26.setBackground(new java.awt.Color(204, 204, 204));
        a26.setText("26");
        a26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a26ActionPerformed(evt);
            }
        });

        a22.setBackground(new java.awt.Color(204, 204, 204));
        a22.setText("22");
        a22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22ActionPerformed(evt);
            }
        });

        a18.setBackground(new java.awt.Color(204, 204, 204));
        a18.setText("18");
        a18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a18ActionPerformed(evt);
            }
        });

        a14.setBackground(new java.awt.Color(204, 204, 204));
        a14.setText("14");
        a14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a14ActionPerformed(evt);
            }
        });

        a10.setBackground(new java.awt.Color(204, 204, 204));
        a10.setText("10");
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });

        a6.setBackground(new java.awt.Color(204, 204, 204));
        a6.setText("6");
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        a4.setBackground(new java.awt.Color(204, 204, 204));
        a4.setText("4");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a28.setBackground(new java.awt.Color(204, 204, 204));
        a28.setText("28");
        a28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a28ActionPerformed(evt);
            }
        });

        a24.setBackground(new java.awt.Color(204, 204, 204));
        a24.setText("24");
        a24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24ActionPerformed(evt);
            }
        });

        a20.setBackground(new java.awt.Color(204, 204, 204));
        a20.setText("20");
        a20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a20ActionPerformed(evt);
            }
        });

        a16.setBackground(new java.awt.Color(204, 204, 204));
        a16.setText("16");
        a16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a16ActionPerformed(evt);
            }
        });

        a12.setBackground(new java.awt.Color(204, 204, 204));
        a12.setText("12");
        a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12ActionPerformed(evt);
            }
        });

        a8.setBackground(new java.awt.Color(204, 204, 204));
        a8.setText("8");
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });

        a3.setBackground(new java.awt.Color(204, 204, 204));
        a3.setText("3");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a27.setBackground(new java.awt.Color(204, 204, 204));
        a27.setText("27");
        a27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a27ActionPerformed(evt);
            }
        });

        a23.setBackground(new java.awt.Color(204, 204, 204));
        a23.setText("23");
        a23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a23ActionPerformed(evt);
            }
        });

        a19.setBackground(new java.awt.Color(204, 204, 204));
        a19.setText("19");
        a19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a19ActionPerformed(evt);
            }
        });

        a15.setBackground(new java.awt.Color(204, 204, 204));
        a15.setText("15");
        a15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a15ActionPerformed(evt);
            }
        });

        a11.setBackground(new java.awt.Color(204, 204, 204));
        a11.setText("11");
        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });

        a7.setBackground(new java.awt.Color(204, 204, 204));
        a7.setText("7");
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(0, 0, 0));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(a27, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(a25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)))
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton30.setText("CONFIRMAR");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("RESERVAR");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        jLabel12.setText("PASSAGEIRO");

        jLabel13.setText("DESTINO");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a origem", "SÃO MIGUEL", "CAJAZEIRAS" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o destino", "SÃO MIGUEL", "CAJAZEIRAS" }));

        jLabel14.setText("ORIGEM");

        jLabel15.setText("DATA:");

        jLabel16.setText("HORA:");

        jTextField1.setEditable(false);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4)
                    .addComponent(jComboBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        jLabel2.setText("ORIGEM:");

        jLabel7.setText("DESTINO:");

        jLabel8.setText("DATA:");

        jLabel9.setText("POLTRONA:");

        jLabel10.setText("PASSAGEIRO:");

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21ActionPerformed
        pegaPoltrona("21");
        DadosPoltronas(21);
    }//GEN-LAST:event_a21ActionPerformed

    private void a17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a17ActionPerformed
        pegaPoltrona("17");
        DadosPoltronas(17);
    }//GEN-LAST:event_a17ActionPerformed

    private void a13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13ActionPerformed
        pegaPoltrona("13");
        DadosPoltronas(13);
    }//GEN-LAST:event_a13ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        pegaPoltrona("5");
        DadosPoltronas(5);
    }//GEN-LAST:event_a5ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
        pegaPoltrona("9");
        DadosPoltronas(9);
    }//GEN-LAST:event_a9ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        pegaPoltrona("1");
        DadosPoltronas(1);
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        pegaPoltrona("2");
        DadosPoltronas(2);
    }//GEN-LAST:event_a2ActionPerformed

    private void a22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22ActionPerformed
        pegaPoltrona("22");
        DadosPoltronas(22);
    }//GEN-LAST:event_a22ActionPerformed

    private void a18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a18ActionPerformed
        pegaPoltrona("18");
        DadosPoltronas(18);
    }//GEN-LAST:event_a18ActionPerformed

    private void a14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a14ActionPerformed
        pegaPoltrona("14");
        DadosPoltronas(14);
    }//GEN-LAST:event_a14ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
        pegaPoltrona("10");
        DadosPoltronas(10);
    }//GEN-LAST:event_a10ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        pegaPoltrona("6");
        DadosPoltronas(6);
    }//GEN-LAST:event_a6ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        pegaPoltrona("4");
        DadosPoltronas(4);
    }//GEN-LAST:event_a4ActionPerformed

    private void a24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24ActionPerformed
        pegaPoltrona("24");
        DadosPoltronas(24);
    }//GEN-LAST:event_a24ActionPerformed

    private void a20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a20ActionPerformed
        pegaPoltrona("20");
        DadosPoltronas(20);
    }//GEN-LAST:event_a20ActionPerformed

    private void a16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a16ActionPerformed
        pegaPoltrona("16");
        DadosPoltronas(16);
    }//GEN-LAST:event_a16ActionPerformed

    private void a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12ActionPerformed
        pegaPoltrona("12");
        DadosPoltronas(12);
    }//GEN-LAST:event_a12ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        pegaPoltrona("8");
        DadosPoltronas(8);
    }//GEN-LAST:event_a8ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        pegaPoltrona("3");
        DadosPoltronas(3);
    }//GEN-LAST:event_a3ActionPerformed

    private void a23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a23ActionPerformed
        pegaPoltrona("23");
        DadosPoltronas(23);
    }//GEN-LAST:event_a23ActionPerformed

    private void a19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a19ActionPerformed
        pegaPoltrona("19");
        DadosPoltronas(19);
    }//GEN-LAST:event_a19ActionPerformed

    private void a15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a15ActionPerformed
        pegaPoltrona("15");
        DadosPoltronas(15);
    }//GEN-LAST:event_a15ActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed
        pegaPoltrona("11");
        DadosPoltronas(11);
    }//GEN-LAST:event_a11ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        pegaPoltrona("7");
        DadosPoltronas(7);
    }//GEN-LAST:event_a7ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        if("".equals(poltrona)){
            JOptionPane.showMessageDialog(null, "SELECIONE UMA POLTRONA");
        }else {
        
            String compras = "C:/Sistema Reserva/Compras/"+poltrona+".txt";

            try {
                //Formatter saida = new Formatter(compras);

                PrintWriter dadoss = new PrintWriter(compras);

                String passageiro = jTextField3.getText();
                String cidadeO = jComboBox3.getSelectedItem().toString();
                String cidadeD = jComboBox4.getSelectedItem().toString();
                String data = jFormattedTextField1.getText();

                String dado1 = " ORIGEM: "+cidadeO;
                String dado2 =" DESTINO: "+cidadeD;
                String dado3 =" DATA: "+data;
                String dado4 =" PASSAGEIRO: "+passageiro;
                String dado5 =" POLTRONA: "+poltrona;

                dadoss.println(dado1);
                dadoss.println(dado2);
                dadoss.println(dado3);
                dadoss.println(dado4);
                dadoss.println(dado5);


                dadoss.close();
                JOptionPane.showMessageDialog(null, "VENDA REALIZADA");

                jTextField3.setText("");
                jComboBox3.setSelectedIndex(0);
                jComboBox4.setSelectedIndex(0);
                jFormattedTextField1.setText("");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Poltronas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        poltrona();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void a25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a25ActionPerformed
        pegaPoltrona("25");
        DadosPoltronas(25);
    }//GEN-LAST:event_a25ActionPerformed

    private void a26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a26ActionPerformed
        pegaPoltrona("26");
        DadosPoltronas(26);
    }//GEN-LAST:event_a26ActionPerformed

    private void a27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a27ActionPerformed
        pegaPoltrona("27");
        DadosPoltronas(27);
    }//GEN-LAST:event_a27ActionPerformed

    private void a28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a28ActionPerformed
        pegaPoltrona("28");
        DadosPoltronas(28);
    }//GEN-LAST:event_a28ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        if("".equals(poltrona)){
            JOptionPane.showMessageDialog(null, "SELECIONE UMA POLTRONA");
        }else {
        
            String reservas = "C:/Sistema Reserva/Reservas/"+poltrona+".txt";

            try {
                //Formatter saida = new Formatter(compras);

                PrintWriter dadoss = new PrintWriter(reservas);

                String passageiro = jTextField3.getText();
                String cidadeO = jComboBox3.getSelectedItem().toString();
                String cidadeD = jComboBox4.getSelectedItem().toString();
                String data = jFormattedTextField1.getText();

                String dado1 = " ORIGEM: "+cidadeO;
                String dado2 =" DESTINO: "+cidadeD;
                String dado3 =" DATA: "+data;
                String dado4 =" PASSAGEIRO: "+passageiro;
                String dado5 =" POLTRONA: "+poltrona;

                dadoss.println(dado1);
                dadoss.println(dado2);
                dadoss.println(dado3);
                dadoss.println(dado4);
                dadoss.println(dado5);


                dadoss.close();
                JOptionPane.showMessageDialog(null, "RESERVA REALIZADA");

                jTextField3.setText("");
                jComboBox3.setSelectedIndex(0);
                jComboBox4.setSelectedIndex(0);
                jFormattedTextField1.setText("");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Poltronas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        poltrona();
    }//GEN-LAST:event_jButton31ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Poltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Poltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Poltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Poltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Poltronas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a10;
    private javax.swing.JButton a11;
    private javax.swing.JButton a12;
    private javax.swing.JButton a13;
    private javax.swing.JButton a14;
    private javax.swing.JButton a15;
    private javax.swing.JButton a16;
    private javax.swing.JButton a17;
    private javax.swing.JButton a18;
    private javax.swing.JButton a19;
    private javax.swing.JButton a2;
    private javax.swing.JButton a20;
    private javax.swing.JButton a21;
    private javax.swing.JButton a22;
    private javax.swing.JButton a23;
    private javax.swing.JButton a24;
    private javax.swing.JButton a25;
    private javax.swing.JButton a26;
    private javax.swing.JButton a27;
    private javax.swing.JButton a28;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
