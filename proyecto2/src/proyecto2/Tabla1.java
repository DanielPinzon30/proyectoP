package proyecto2;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Tabla1 extends javax.swing.JFrame {
    DefaultTableModel modelo;
    String cant;
    int aux;
    

    public Tabla1() {
        initComponents();
        modelo = new DefaultTableModel();
        this.jTable1.setModel(modelo);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        okbt = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();
        enviarbt = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        okbt.setText("OK");
        okbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtActionPerformed(evt);
            }
        });

        enviarbt.setText("Enviar");
        enviarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarbtActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });

        jLabel1.setText("Numeros Ingresados");

        jLabel2.setText("Orenados Menor-Mayor");

        jLabel3.setText("Orenados Mayor-Menor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enviarbt)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(okbt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okbt)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(enviarbt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtActionPerformed
       cant = cantidad.getText();
       if(Integer.parseInt(cant)<=0||Integer.parseInt(cant)>10){do{
          cant= JOptionPane.showInputDialog("Ingrese un dato valido entre 0-10");
       }while(Integer.parseInt(cant)<=0||Integer.parseInt(cant)>10);
          for(int i=0;i<Integer.parseInt(cant);i++){
         modelo.addColumn("No. "+(i+1));
    }}else{
            for(int i=0;i<Integer.parseInt(cant);i++){
         modelo.addColumn("No. "+(i+1));
       }}
         if(Integer.parseInt(cant)==1){
          jTextField2.setText("*");
          jTextField3.setText("*");
          jTextField4.setText("*");
          jTextField5.setText("*");
          jTextField6.setText("*");
          jTextField7.setText("*");  
          jTextField8.setText("*");
          jTextField9.setText("*");
          jTextField10.setText("*");
         } if(Integer.parseInt(cant)==2){
          jTextField3.setText("*");
          jTextField4.setText("*");
          jTextField5.setText("*");
          jTextField6.setText("*");
          jTextField7.setText("*");  
          jTextField8.setText("*");
          jTextField9.setText("*");
          jTextField10.setText("*");
         } if(Integer.parseInt(cant)==3){
          jTextField4.setText("*");
          jTextField5.setText("*");
          jTextField6.setText("*");
          jTextField7.setText("*");  
          jTextField8.setText("*");
          jTextField9.setText("*");
          jTextField10.setText("*");
         } if(Integer.parseInt(cant)==4){
          jTextField5.setText("*");
          jTextField6.setText("*");
          jTextField7.setText("*");  
          jTextField8.setText("*");
          jTextField9.setText("*");
          jTextField10.setText("*");
         } if(Integer.parseInt(cant)==5){
          jTextField6.setText("*");
          jTextField7.setText("*");  
          jTextField8.setText("*");
          jTextField9.setText("*");
          jTextField10.setText("*");
         }if(Integer.parseInt(cant)==6){
          jTextField7.setText("*");  
          jTextField8.setText("*");
          jTextField9.setText("*");
          jTextField10.setText("*");
         }if(Integer.parseInt(cant)==7){
          jTextField8.setText("*");
          jTextField9.setText("*");
          jTextField10.setText("*");
         }if(Integer.parseInt(cant)==8){
          jTextField9.setText("*");
          jTextField10.setText("*");
         }if(Integer.parseInt(cant)==9){
          jTextField10.setText("*");
         }
         
    }//GEN-LAST:event_okbtActionPerformed

   
   
    private void enviarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarbtActionPerformed
         String []num =new String[Integer.parseInt(cant)];
    
   
    
          if(Integer.parseInt(cant)==1){
              num[0]=jTextField1.getText();
              num[0]=jTextField1.getText();
          
              modelo.addRow(num);
          } if(Integer.parseInt(cant)==2){
              num[0]=jTextField1.getText();
          num[1]=jTextField2.getText();
              modelo.addRow(num);
              for(int i=0;i<Integer.parseInt(cant)-1;i++){
                  
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])>Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
                 
                 
             }  
                 
            } 
       modelo.addRow(num);
       for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])<Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                     
                 }
             }    
            } 
       modelo.addRow(num);
      
          }
            if(Integer.parseInt(cant)==3){
               num[0]=jTextField1.getText();
          num[1]=jTextField2.getText();
          num[2]=jTextField3.getText();
              modelo.addRow(num);
                          for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])>Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
       for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])<Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
          }
            if(Integer.parseInt(cant)==4){
                num[0]=jTextField1.getText();
          num[1]=jTextField2.getText();
          num[2]=jTextField3.getText();
          num[3]=jTextField4.getText();
              modelo.addRow(num);
              for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])>Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
       for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])<Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
          }
            if(Integer.parseInt(cant)==5){
                num[0]=jTextField1.getText();
          num[1]=jTextField2.getText();
          num[2]=jTextField3.getText();
          num[3]=jTextField4.getText();
          num[4]=jTextField5.getText();
              modelo.addRow(num);
              for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])>Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
       for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])<Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
          }
            if(Integer.parseInt(cant)==6){
                 num[0]=jTextField1.getText();
          num[1]=jTextField2.getText();
          num[2]=jTextField3.getText();
          num[3]=jTextField4.getText();
          num[4]=jTextField5.getText();
          num[5]=jTextField6.getText();
              modelo.addRow(num);
              for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])>Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
       for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])<Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
          }
            if(Integer.parseInt(cant)==7){
                 num[0]=jTextField1.getText();
          num[1]=jTextField2.getText();
          num[2]=jTextField3.getText();
          num[3]=jTextField4.getText();
          num[4]=jTextField5.getText();
          num[5]=jTextField6.getText();
          num[6]=jTextField7.getText();
              modelo.addRow(num);
              for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])>Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
       for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])<Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
          }
            if(Integer.parseInt(cant)==8){
                 
          num[0]=jTextField1.getText();
          num[1]=jTextField2.getText();
          num[2]=jTextField3.getText();
          num[3]=jTextField4.getText();
          num[4]=jTextField5.getText();
          num[5]=jTextField6.getText();
          num[6]=jTextField7.getText();  
          num[7]=jTextField8.getText();
              modelo.addRow(num);
              for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])>Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
       for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])<Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
          }
            if(Integer.parseInt(cant)==9){
                 
         num[0]=jTextField1.getText();
          num[1]=jTextField2.getText();
          num[2]=jTextField3.getText();
          num[3]=jTextField4.getText();
          num[4]=jTextField5.getText();
          num[5]=jTextField6.getText();
          num[6]=jTextField7.getText();  
          num[7]=jTextField8.getText();
          num[8]=jTextField9.getText();
              modelo.addRow(num);
              for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])>Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
       for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])<Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
          }
            if(Integer.parseInt(cant)==10){
          num[0]=jTextField1.getText();
          num[1]=jTextField2.getText();
          num[2]=jTextField3.getText();
          num[3]=jTextField4.getText();
          num[4]=jTextField5.getText();
          num[5]=jTextField6.getText();
          num[6]=jTextField7.getText();  
          num[7]=jTextField8.getText();
          num[8]=jTextField9.getText();
          num[9]=jTextField10.getText();
          modelo.addRow(num);
          for(int i=0;i<Integer.parseInt(cant)-1;i++){              
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){                     
                 if(Integer.parseInt(num[j])>Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }  
            } 
       modelo.addRow(num);
       for(int i=0;i<Integer.parseInt(cant)-1;i++){
                 for(int j=0;j<Integer.parseInt(cant)-1;j++){
                 if(Integer.parseInt(num[j])<Integer.parseInt(num[j+1])){
                     aux=Integer.parseInt(num[j]);
                     num[j]=num[j+1];
                     num[j+1]= Integer.toString(aux);
                     
                 }
             }    
            } 
       modelo.addRow(num);
            }
    }//GEN-LAST:event_enviarbtActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10KeyPressed

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
            java.util.logging.Logger.getLogger(Tabla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton enviarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton okbt;
    // End of variables declaration//GEN-END:variables
}
