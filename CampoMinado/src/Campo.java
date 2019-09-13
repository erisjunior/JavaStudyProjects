import javax.swing.JOptionPane;

public class Campo extends javax.swing.JFrame {
    public Campo() {
        initComponents();
        set();
    }

    int bombs [] = new int [8];
    int casa [] = new int [68];
    int nb=0,m=0;
    
    public void set(){
        int n=1;
        while (n<9) {
        int nums = (int) (Math.random()*64+1);
        
        if ((nums != bombs[0]) || (nums != bombs[1]) || (nums != bombs[2]) || (nums != bombs[3]) || (nums != bombs[4]) || (nums != bombs[5]) || (nums != bombs[6]) || (nums != bombs[7])){
            casa[nums]=1;
            n++;
        }
        }
    }
    
    
    public void Encerra (){
        if(casa[m]==1){
            JOptionPane.showMessageDialog(null,"VC PERDEU");
            System.exit(0);
        }
    }
    
    public void cond(){
        if (casa[m+1]==1){
            nb=nb+1;
        }
        if (casa[m+7]==1){
            nb=nb+1;
        }
        if (casa[m+8]==1){
            nb=nb+1;
        }
        if (casa[m+9]==1){
            nb=nb+1;
        }
        if (casa[m-1]==1){
            nb=nb+1;
        }
        if (casa[m-7]==1){
            nb=nb+1;
        }
        if (casa[m-8]==1){
            nb=nb+1;
        }
        if (casa[m-9]==1){
            nb=nb+1;
        }
    }
    
    public void cond1(){
        if (casa[m+1]==1){
            nb=nb+1;
        }
        if (casa[m+8]==1){
            nb=nb+1;
        }
        if (casa[m+9]==1){
            nb=nb+1;
        }
    }
    
    public void cond2(){
        if (casa[m+1]==1){
            nb=nb+1;
        }
        if (casa[m+7]==1){
            nb=nb+1;
        }
        if (casa[m+8]==1){
            nb=nb+1;
        }
        if (casa[m+9]==1){
            nb=nb+1;
        }
        if (casa[m-1]==1){
            nb=nb+1;
        }
    }
    
    public void cond8(){
        if (casa[m+7]==1){
            nb=nb+1;
        }
        if (casa[m+8]==1){
            nb=nb+1;
        }
        if (casa[m-1]==1){
            nb=nb+1;
        }
    }
    
    public void cond9(){
        if (casa[m+1]==1){
            nb=nb+1;
        }
        if (casa[m+8]==1){
            nb=nb+1;
        }
        if (casa[m+9]==1){
            nb=nb+1;
        }
        if (casa[m-7]==1){
            nb=nb+1;
        }
        if (casa[m-8]==1){
            nb=nb+1;
        }
    }
    
    public void cond16(){
        if (casa[m+7]==1){
            nb=nb+1;
        }
        if (casa[m+8]==1){
            nb=nb+1;
        }
        if (casa[m-1]==1){
            nb=nb+1;
        }
        if (casa[m-8]==1){
            nb=nb+1;
        }
        if (casa[m-9]==1){
            nb=nb+1;
        }
    }
    
    public void cond57(){
        if (casa[m+1]==1){
            nb=nb+1;
        }
        if (casa[m-7]==1){
            nb=nb+1;
        }
        if (casa[m-8]==1){
            nb=nb+1;
        }
    }
    
    public void cond58(){
        if (casa[m+1]==1){
            nb=nb+1;
        }
        if (casa[m-1]==1){
            nb=nb+1;
        }
        if (casa[m-7]==1){
            nb=nb+1;
        }
        if (casa[m-8]==1){
            nb=nb+1;
        }
        if (casa[m-9]==1){
            nb=nb+1;
        }
    }
    
    public void cond64(){
        if (casa[m-1]==1){
            nb=nb+1;
        }
        if (casa[m-8]==1){
            nb=nb+1;
        }
        if (casa[m-9]==1){
            nb=nb+1;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a16 = new javax.swing.JButton();
        a15 = new javax.swing.JButton();
        a14 = new javax.swing.JButton();
        a13 = new javax.swing.JButton();
        a12 = new javax.swing.JButton();
        a11 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a24 = new javax.swing.JButton();
        a23 = new javax.swing.JButton();
        a22 = new javax.swing.JButton();
        a21 = new javax.swing.JButton();
        a20 = new javax.swing.JButton();
        a19 = new javax.swing.JButton();
        a18 = new javax.swing.JButton();
        a17 = new javax.swing.JButton();
        a32 = new javax.swing.JButton();
        a31 = new javax.swing.JButton();
        a30 = new javax.swing.JButton();
        a29 = new javax.swing.JButton();
        a28 = new javax.swing.JButton();
        a27 = new javax.swing.JButton();
        a26 = new javax.swing.JButton();
        a25 = new javax.swing.JButton();
        a40 = new javax.swing.JButton();
        a39 = new javax.swing.JButton();
        a38 = new javax.swing.JButton();
        a37 = new javax.swing.JButton();
        a36 = new javax.swing.JButton();
        a35 = new javax.swing.JButton();
        a34 = new javax.swing.JButton();
        a33 = new javax.swing.JButton();
        a48 = new javax.swing.JButton();
        a47 = new javax.swing.JButton();
        a46 = new javax.swing.JButton();
        a45 = new javax.swing.JButton();
        a44 = new javax.swing.JButton();
        a43 = new javax.swing.JButton();
        a42 = new javax.swing.JButton();
        a41 = new javax.swing.JButton();
        a56 = new javax.swing.JButton();
        a55 = new javax.swing.JButton();
        a54 = new javax.swing.JButton();
        a53 = new javax.swing.JButton();
        a52 = new javax.swing.JButton();
        a51 = new javax.swing.JButton();
        a50 = new javax.swing.JButton();
        a49 = new javax.swing.JButton();
        a64 = new javax.swing.JButton();
        a63 = new javax.swing.JButton();
        a62 = new javax.swing.JButton();
        a61 = new javax.swing.JButton();
        a60 = new javax.swing.JButton();
        a59 = new javax.swing.JButton();
        a58 = new javax.swing.JButton();
        a57 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 0));

        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });

        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });

        a16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a16ActionPerformed(evt);
            }
        });

        a15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a15ActionPerformed(evt);
            }
        });

        a14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a14ActionPerformed(evt);
            }
        });

        a13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13ActionPerformed(evt);
            }
        });

        a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12ActionPerformed(evt);
            }
        });

        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });

        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });

        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });

        a24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24ActionPerformed(evt);
            }
        });

        a23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a23ActionPerformed(evt);
            }
        });

        a22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22ActionPerformed(evt);
            }
        });

        a21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21ActionPerformed(evt);
            }
        });

        a20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a20ActionPerformed(evt);
            }
        });

        a19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a19ActionPerformed(evt);
            }
        });

        a18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a18ActionPerformed(evt);
            }
        });

        a17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a17ActionPerformed(evt);
            }
        });

        a32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a32ActionPerformed(evt);
            }
        });

        a31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a31ActionPerformed(evt);
            }
        });

        a30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a30ActionPerformed(evt);
            }
        });

        a29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a29ActionPerformed(evt);
            }
        });

        a28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a28ActionPerformed(evt);
            }
        });

        a27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a27ActionPerformed(evt);
            }
        });

        a26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a26ActionPerformed(evt);
            }
        });

        a25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a25ActionPerformed(evt);
            }
        });

        a40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a40ActionPerformed(evt);
            }
        });

        a39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a39ActionPerformed(evt);
            }
        });

        a38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a38ActionPerformed(evt);
            }
        });

        a37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a37ActionPerformed(evt);
            }
        });

        a36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a36ActionPerformed(evt);
            }
        });

        a35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a35ActionPerformed(evt);
            }
        });

        a34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a34ActionPerformed(evt);
            }
        });

        a33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a33ActionPerformed(evt);
            }
        });

        a48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a48ActionPerformed(evt);
            }
        });

        a47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a47ActionPerformed(evt);
            }
        });

        a46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a46ActionPerformed(evt);
            }
        });

        a45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a45ActionPerformed(evt);
            }
        });

        a44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a44ActionPerformed(evt);
            }
        });

        a43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a43ActionPerformed(evt);
            }
        });

        a42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a42ActionPerformed(evt);
            }
        });

        a41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a41ActionPerformed(evt);
            }
        });

        a56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a56ActionPerformed(evt);
            }
        });

        a55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a55ActionPerformed(evt);
            }
        });

        a54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a54ActionPerformed(evt);
            }
        });

        a53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a53ActionPerformed(evt);
            }
        });

        a52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a52ActionPerformed(evt);
            }
        });

        a51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a51ActionPerformed(evt);
            }
        });

        a50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a50ActionPerformed(evt);
            }
        });

        a49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a49ActionPerformed(evt);
            }
        });

        a64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a64ActionPerformed(evt);
            }
        });

        a63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a63ActionPerformed(evt);
            }
        });

        a62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a62ActionPerformed(evt);
            }
        });

        a61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a61ActionPerformed(evt);
            }
        });

        a60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a60ActionPerformed(evt);
            }
        });

        a59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a59ActionPerformed(evt);
            }
        });

        a58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a58ActionPerformed(evt);
            }
        });

        a57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a57ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(a25, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a27, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a29, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a30, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a34, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a35, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a36, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a37, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a38, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a39, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a40, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a41, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a42, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a43, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a44, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a45, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a46, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a47, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a48, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a49, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a50, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a51, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a52, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a53, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a54, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a55, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a56, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a57, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a58, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a59, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a60, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a61, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a62, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a63, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a64, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a9, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a8, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(a7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(a6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(a5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(a4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(a3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(a2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a29, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a27, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a25, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a40, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a39, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a38, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a37, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a36, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a35, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a34, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a48, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a47, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a46, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a45, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a44, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a43, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a42, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a41, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a56, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a55, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a54, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a53, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a52, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a51, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a50, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a49, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a64, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a63, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a62, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a61, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a60, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a59, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a58, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a57, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        m=1;
        Encerra();
        cond1();
        a1.setText(""+nb);
        nb=0;
        a1.setEnabled(false);
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        m=2;
        Encerra();
        cond2();
        a2.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        m=3;
        Encerra();
        cond2();
        a3.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        m=4;
        Encerra();
        cond2();
        a4.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        m=5;
        Encerra();
        cond2();
        a5.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a5ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        m=6;
        Encerra();
        cond2();
        a6.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a6ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        m=7;
        Encerra();
        cond2();
        a7.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a7ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        m=8;
        Encerra();
        cond8();
        a8.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a8ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
        m=9;
        Encerra();
        cond9();
        a9.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a9ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
        m=10;
        Encerra();
        cond();
        a10.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a10ActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed
        m=11;
        Encerra();
        cond();
        a11.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a11ActionPerformed

    private void a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12ActionPerformed
        m=12;
        Encerra();
        cond();
        a12.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a12ActionPerformed

    private void a13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13ActionPerformed
        m=13;
        Encerra();
        cond();
        a13.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a13ActionPerformed

    private void a14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a14ActionPerformed
        m=14;
        Encerra();
        cond();
        a14.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a14ActionPerformed

    private void a15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a15ActionPerformed
        m=15;
        Encerra();
        cond();
        a15.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a15ActionPerformed

    private void a16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a16ActionPerformed
        m=16;
        Encerra();
        cond16();
        a16.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a16ActionPerformed

    private void a17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a17ActionPerformed
        m=17;
        Encerra();
        cond9();
        a17.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a17ActionPerformed

    private void a18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a18ActionPerformed
        m=18;
        Encerra();
        cond();
        a18.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a18ActionPerformed

    private void a19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a19ActionPerformed
        m=19;
        Encerra();
        cond();
        a19.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a19ActionPerformed

    private void a20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a20ActionPerformed
        m=20;
        Encerra();
        cond();
        a20.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a20ActionPerformed

    private void a21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21ActionPerformed
        m=21;
        Encerra();
        cond();
        a21.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a21ActionPerformed

    private void a22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22ActionPerformed
        m=22;
        Encerra();
        cond();
        a22.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a22ActionPerformed

    private void a23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a23ActionPerformed
        m=23;
        Encerra();
        cond();
        a23.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a23ActionPerformed

    private void a24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24ActionPerformed
        m=24;
        Encerra();
        cond16();
        a24.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a24ActionPerformed

    private void a25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a25ActionPerformed
        m=25;
        Encerra();
        cond9();
        a25.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a25ActionPerformed

    private void a26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a26ActionPerformed
        m=26;
        Encerra();
        cond();
        a26.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a26ActionPerformed

    private void a27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a27ActionPerformed
        m=27;
        Encerra();
        cond();
        a27.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a27ActionPerformed

    private void a28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a28ActionPerformed
        m=28;
        Encerra();
        cond();
        a28.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a28ActionPerformed

    private void a29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a29ActionPerformed
        m=29;
        Encerra();
        cond();
        a29.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a29ActionPerformed

    private void a30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a30ActionPerformed
        m=30;
        Encerra();
        cond();
        a30.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a30ActionPerformed

    private void a31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a31ActionPerformed
        m=31;
        Encerra();
        cond();
        a31.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a31ActionPerformed

    private void a32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a32ActionPerformed
        m=32;
        Encerra();
        cond16();
        a32.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a32ActionPerformed

    private void a33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a33ActionPerformed
        m=33;
        Encerra();
        cond9();
        a33.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a33ActionPerformed

    private void a34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a34ActionPerformed
        m=34;
        Encerra();
        cond();
        a34.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a34ActionPerformed

    private void a35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a35ActionPerformed
        m=35;
        Encerra();
        cond();
        a35.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a35ActionPerformed

    private void a36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a36ActionPerformed
        m=36;
        Encerra();
        cond();
        a36.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a36ActionPerformed

    private void a37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a37ActionPerformed
        m=37;
        Encerra();
        cond();
        a37.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a37ActionPerformed

    private void a38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a38ActionPerformed
        m=38;
        Encerra();
        cond();
        a38.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a38ActionPerformed

    private void a39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a39ActionPerformed
        m=39;
        Encerra();
        cond();
        a39.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a39ActionPerformed

    private void a40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a40ActionPerformed
        m=40;
        Encerra();
        cond16();
        a40.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a40ActionPerformed

    private void a41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a41ActionPerformed
        m=41;
        Encerra();
        cond9();
        a41.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a41ActionPerformed

    private void a42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a42ActionPerformed
        m=42;
        Encerra();
        cond();
        a42.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a42ActionPerformed

    private void a43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a43ActionPerformed
        m=43;
        Encerra();
        cond();
        a43.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a43ActionPerformed

    private void a44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a44ActionPerformed
        m=44;
        Encerra();
        cond();
        a44.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a44ActionPerformed

    private void a45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a45ActionPerformed
        m=45;
        Encerra();
        cond();
        a45.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a45ActionPerformed

    private void a46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a46ActionPerformed
        m=46;
        Encerra();
        cond();
        a46.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a46ActionPerformed

    private void a47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a47ActionPerformed
        m=47;
        Encerra();
        cond();
        a47.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a47ActionPerformed

    private void a48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a48ActionPerformed
        m=48;
        Encerra();
        cond16();
        a48.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a48ActionPerformed

    private void a49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a49ActionPerformed
        m=49;
        Encerra();
        cond9();
        a49.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a49ActionPerformed

    private void a50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a50ActionPerformed
        m=50;
        Encerra();
        cond();
        a50.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a50ActionPerformed

    private void a51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a51ActionPerformed
        m=51;
        Encerra();
        cond();
        a51.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a51ActionPerformed

    private void a52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a52ActionPerformed
        m=52;
        Encerra();
        cond();
        a52.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a52ActionPerformed

    private void a53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a53ActionPerformed
        m=53;
        Encerra();
        cond();
        a53.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a53ActionPerformed

    private void a54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a54ActionPerformed
        m=54;
        Encerra();
        cond();
        a54.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a54ActionPerformed

    private void a55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a55ActionPerformed
        m=55;
        Encerra();
        cond();
        a55.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a55ActionPerformed

    private void a56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a56ActionPerformed
        m=56;
        Encerra();
        cond16();
        a56.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a56ActionPerformed

    private void a57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a57ActionPerformed
        m=57;
        Encerra();
        cond57();
        a57.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a57ActionPerformed

    private void a58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a58ActionPerformed
        m=58;
        Encerra();
        cond58();
        a58.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a58ActionPerformed

    private void a59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a59ActionPerformed
        m=59;
        Encerra();
        cond58();
        a59.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a59ActionPerformed

    private void a60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a60ActionPerformed
        m=60;
        Encerra();
        cond58();
        a60.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a60ActionPerformed

    private void a61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a61ActionPerformed
        m=61;
        Encerra();
        cond58();
        a61.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a61ActionPerformed

    private void a62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a62ActionPerformed
        m=62;
        Encerra();
        cond58();
        a62.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a62ActionPerformed

    private void a63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a63ActionPerformed
        m=63;
        Encerra();
        cond58();
        a63.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a63ActionPerformed

    private void a64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a64ActionPerformed
        m=64;
        Encerra();
        cond64();
        a64.setText(""+nb);
        nb=0;
    }//GEN-LAST:event_a64ActionPerformed

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
            java.util.logging.Logger.getLogger(Campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Campo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campo().setVisible(true);
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
    private javax.swing.JButton a29;
    private javax.swing.JButton a3;
    private javax.swing.JButton a30;
    private javax.swing.JButton a31;
    private javax.swing.JButton a32;
    private javax.swing.JButton a33;
    private javax.swing.JButton a34;
    private javax.swing.JButton a35;
    private javax.swing.JButton a36;
    private javax.swing.JButton a37;
    private javax.swing.JButton a38;
    private javax.swing.JButton a39;
    private javax.swing.JButton a4;
    private javax.swing.JButton a40;
    private javax.swing.JButton a41;
    private javax.swing.JButton a42;
    private javax.swing.JButton a43;
    private javax.swing.JButton a44;
    private javax.swing.JButton a45;
    private javax.swing.JButton a46;
    private javax.swing.JButton a47;
    private javax.swing.JButton a48;
    private javax.swing.JButton a49;
    private javax.swing.JButton a5;
    private javax.swing.JButton a50;
    private javax.swing.JButton a51;
    private javax.swing.JButton a52;
    private javax.swing.JButton a53;
    private javax.swing.JButton a54;
    private javax.swing.JButton a55;
    private javax.swing.JButton a56;
    private javax.swing.JButton a57;
    private javax.swing.JButton a58;
    private javax.swing.JButton a59;
    private javax.swing.JButton a6;
    private javax.swing.JButton a60;
    private javax.swing.JButton a61;
    private javax.swing.JButton a62;
    private javax.swing.JButton a63;
    private javax.swing.JButton a64;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    // End of variables declaration//GEN-END:variables
}
