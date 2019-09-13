public class JogadaVeia extends javax.swing.JFrame {

    public JogadaVeia() {
        initComponents();
    }
    
    public void cond(){
        if((aa==1) && (bb==1) && (cc==1)){
            joga();
        }
        else if((aa==1) && (dd==1) && (gg==1)){
            joga();
        }
        else if((aa==1) && (ee==1) && (ii==1)){
            joga();
        }
        else if((bb==1) && (ee==1) && (hh==1)){
            joga();
        }
        else if((cc==1) && (ff==1) && (ii==1)){
            joga();
        }
        else if((cc==1) && (ee==1) && (gg==1)){
            joga();
        }
        else if((dd==1) && (ee==1) && (ff==1)){
            joga();
        }
        else if((gg==1) && (hh==1) && (ii==1)){
            joga();
        }
        
        
        else if((aa==2) && (bb==2) && (cc==2)){
            jogb();
        }
        else if((aa==2) && (dd==2) && (gg==2)){
            jogb();
        }
        else if((aa==2) && (ee==2) && (ii==2)){
            jogb();
        }
        else if((bb==2) && (ee==2) && (hh==2)){
            jogb();
        }
        else if((cc==2) && (ff==2) && (ii==2)){
            jogb();
        }
        else if((cc==2) && (ee==2) && (gg==2)){
            jogb();
        }
        else if((dd==2) && (ee==2) && (ff==2)){
            jogb();
        }
        else if((gg==2) && (hh==2) && (ii==2)){
            jogb();
        }
        else if (((aa==1) || (aa==2)) && ((bb==1) || (bb==2)) && ((cc==1) || (cc==2)) && ((dd==1) || (dd==2)) && ((ee==1) || (ee==2)) && ((ff==1) || (ff==2)) && ((gg==1) || (gg==2)) && ((hh==1) || (hh==2)) && ((ii==1) || (ii==2))){
            
            pe = Integer.parseInt(em.getText());
            pe = pe+1;
            em.setText(""+pe);
        }
    }
    
    public void joga(){
            px = Integer.parseInt(x.getText());
            px = px+1;
            x.setText(""+px);
            a.setEnabled(false);
            b.setEnabled(false);
            c.setEnabled(false);
            d.setEnabled(false);
            e.setEnabled(false);
            f.setEnabled(false);
            g.setEnabled(false);
            h.setEnabled(false);
            i.setEnabled(false);
    }
    
    public void jogb(){
            pg = Integer.parseInt(bo.getText());
            pg = pg+1;
            bo.setText(""+pg);
            a.setEnabled(false);
            b.setEnabled(false);
            c.setEnabled(false);
            d.setEnabled(false);
            e.setEnabled(false);
            f.setEnabled(false);
            g.setEnabled(false);
            h.setEnabled(false);
            i.setEnabled(false);
    }
    
    int n=0,pg=0,px=0,pe=0;
    int aa=0,bb=0,cc=0,dd=0,ee=0,ff=0,gg=0,hh=0,ii=0;
    
    int letra [] = new int [9];
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        a = new javax.swing.JButton();
        b = new javax.swing.JButton();
        c = new javax.swing.JButton();
        f = new javax.swing.JButton();
        e = new javax.swing.JButton();
        d = new javax.swing.JButton();
        i = new javax.swing.JButton();
        h = new javax.swing.JButton();
        g = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        bo = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 0, 0));

        a.setBackground(new java.awt.Color(255, 255, 255));
        a.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        b.setBackground(new java.awt.Color(255, 255, 255));
        b.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        c.setBackground(new java.awt.Color(255, 255, 255));
        c.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        f.setBackground(new java.awt.Color(255, 255, 255));
        f.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        e.setBackground(new java.awt.Color(255, 255, 255));
        e.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        d.setBackground(new java.awt.Color(255, 255, 255));
        d.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        i.setBackground(new java.awt.Color(255, 255, 255));
        i.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        h.setBackground(new java.awt.Color(255, 255, 255));
        h.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });

        g.setBackground(new java.awt.Color(255, 255, 255));
        g.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("INFORMAÇÕES");

        jLabel2.setText("JOGADOR A ( X ):");

        jLabel3.setText("JOGADOR B ( º ):");

        bo.setText("0");

        x.setText("0");

        jLabel6.setText("EMPATE: ");

        em.setText("0");

        jButton1.setText("Novo Jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(48, 48, 48)
                                .addComponent(em)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(x))
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bo))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(em))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        n++;
             
        if (n==1) {
            a.setText("X");
            aa=1;
        }
        if (n==2){
            a.setText("º");
            aa=2;
        }
        if (n==3) {
            a.setText("X");
            aa=1;
        }
        if (n==4){
            a.setText("º");
            aa=2;
        }
        if (n==5) {
            a.setText("X");
            aa=1;
        }
        if (n==6){
            a.setText("º");
            aa=2;
        }
        if (n==7) {
            a.setText("X");
            aa=1;
        }
        if (n==8){
            a.setText("º");
            aa=2;
        }
        if (n==9) {
            a.setText("X");
            aa=1;
        }
        a.setEnabled(false);
        
        cond();
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        n++;
        if (n==1) {
            b.setText("X");
            bb=1;
        }
        if (n==2){
            b.setText("º");
            bb=2;
        }
        if (n==3) {
            b.setText("X");
            bb=1;
        }
        if (n==4){
            b.setText("º");
            bb=2;
        }
        if (n==5) {
            b.setText("X");
            bb=1;
        }
        if (n==6){
            b.setText("º");
            bb=2;
        }
        if (n==7) {
            b.setText("X");
            bb=1;
        }
        if (n==8){
            b.setText("º");
            bb=2;
        }
        if (n==9) {
            b.setText("X");
            bb=1;
        }
        b.setEnabled(false);
        
        cond();
    }//GEN-LAST:event_bActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        n++;
        if (n==1) {
            c.setText("X");
            cc=1;
        }
        if (n==2){
            c.setText("º");
            cc=2;
        }
        if (n==3) {
            c.setText("X");
            cc=1;
        }
        if (n==4){
            c.setText("º");
            cc=2;
        }
        if (n==5) {
            c.setText("X");
            cc=1;
        }
        if (n==6){
            c.setText("º");
            cc=2;
        }
        if (n==7) {
            c.setText("X");
            cc=1;
        }
        if (n==8){
            c.setText("º");
            cc=2;
        }
        if (n==9) {
            c.setText("X");
            cc=1;
        }
        c.setEnabled(false);
        
        cond();
    }//GEN-LAST:event_cActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        n++;
        if (n==1) {
            d.setText("X");
            dd=1;
        }
        if (n==2){
            d.setText("º");
            dd=2;
        }
        if (n==3) {
            d.setText("X");
            dd=1;
        }
        if (n==4){
            d.setText("º");
            dd=2;
        }
        if (n==5) {
            d.setText("X");
            dd=1;
        }
        if (n==6){
            d.setText("º");
            dd=2;
        }
        if (n==7) {
            d.setText("X");
            dd=1;
        }
        if (n==8){
            d.setText("º");
            dd=2;
        }
        if (n==9) {
            d.setText("X");
            dd=1;
        }
        d.setEnabled(false);
        
        cond();
    }//GEN-LAST:event_dActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        n++;
        if (n==1) {
            e.setText("X");
            ee=1;
        }
        if (n==2){
            e.setText("º");
            ee=2;
        }
        if (n==3) {
            e.setText("X");
            ee=1;
        }
        if (n==4){
            e.setText("º");
            ee=2;
        }
        if (n==5) {
            e.setText("X");
            ee=1;
        }
        if (n==6){
            e.setText("º");
            ee=2;
        }
        if (n==7) {
            e.setText("X");
            ee=1;
        }
        if (n==8){
            e.setText("º");
            ee=2;
        }
        if (n==9) {
            e.setText("X");
            ee=1;
        }
        e.setEnabled(false);
        
        cond();
    }//GEN-LAST:event_eActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        n++;
        if (n==1) {
            f.setText("X");
            ff=1;
        }
        if (n==2){
            f.setText("º");
            ff=2;
        }
        if (n==3) {
            f.setText("X");
            ff=1;
        }
        if (n==4){
            f.setText("º");
            ff=2;
        }
        if (n==5) {
            f.setText("X");
            ff=1;
        }
        if (n==6){
            f.setText("º");
            ff=2;
        }
        if (n==7) {
            f.setText("X");
            ff=1;
        }
        if (n==8){
            f.setText("º");
            ff=2;
        }
        if (n==9) {
            f.setText("X");
            ff=1;
        }
        f.setEnabled(false);
        
        cond();
    }//GEN-LAST:event_fActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        n++;
        if (n==1) {
            g.setText("X");
            gg=1;
        }
        if (n==2){
            g.setText("º");
            gg=2;
        }
        if (n==3) {
            g.setText("X");
            gg=1;
        }
        if (n==4){
            g.setText("º");
            gg=2;
        }
        if (n==5) {
            g.setText("X");
            gg=1;
        }
        if (n==6){
            g.setText("º");
            gg=2;
        }
        if (n==7) {
            g.setText("X");
            gg=1;
        }
        if (n==8){
            g.setText("º");
            gg=2;
        }
        if (n==9) {
            g.setText("X");
            gg=1;
        }
        g.setEnabled(false);
        
        cond();
    }//GEN-LAST:event_gActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        n++;
        if (n==1) {
            h.setText("X");
            hh=1;
        }
        if (n==2){
            h.setText("º");
            hh=2;
        }
        if (n==3) {
            h.setText("X");
            hh=1;
        }
        if (n==4){
            h.setText("º");
            hh=2;
        }
        if (n==5) {
            h.setText("X");
            hh=1;
        }
        if (n==6){
            h.setText("º");
            hh=2;
        }
        if (n==7) {
            h.setText("X");
            hh=1;
        }
        if (n==8){
            h.setText("º");
            hh=2;
        }
        if (n==9) {
            h.setText("X");
            hh=1;
        }
        h.setEnabled(false);
        
        cond();
    }//GEN-LAST:event_hActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        n++;
        if (n==1) {
            i.setText("X");
            ii=1;
        }
        if (n==2){
            i.setText("º");
            ii=2;
        }
        if (n==3) {
            i.setText("X");
            ii=1;
        }
        if (n==4){
            i.setText("º");
            ii=2;
        }
        if (n==5) {
            i.setText("X");
            ii=1;
        }
        if (n==6){
            i.setText("º");
            ii=2;
        }
        if (n==7) {
            i.setText("X");
            ii=1;
        }
        if (n==8){
            i.setText("º");
            ii=2;
        }
        if (n==9) {
            i.setText("X");
            ii=1;
        }
        i.setEnabled(false);
        
        cond();
    }//GEN-LAST:event_iActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
        g.setEnabled(true);
        h.setEnabled(true);
        i.setEnabled(true);
        
        aa=0;
        bb=0;
        cc=0;
        dd=0;
        ee=0;
        ff=0;
        gg=0;
        hh=0;
        ii=0;
        
        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");
        e.setText("");
        f.setText("");
        g.setText("");
        h.setText("");
        i.setText("");
        
        n=0;
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JogadaVeia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogadaVeia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogadaVeia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogadaVeia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogadaVeia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JLabel bo;
    private javax.swing.JButton c;
    private javax.swing.JButton d;
    private javax.swing.JButton e;
    private javax.swing.JLabel em;
    private javax.swing.JButton f;
    private javax.swing.JButton g;
    private javax.swing.JButton h;
    private javax.swing.JButton i;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
