
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timoo
 */
public class ticket extends javax.swing.JFrame {

    /**
     * Creates new form ticket
     */
     Connection conn=null;
    Statement stmt =null;
    ResultSet rs=null;
    public ticket() {
        super("dbConnection");
        initComponents();
        conn=dbConnection.connection();
    }
    int discount;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        days = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        show = new javax.swing.JButton();
        print = new javax.swing.JButton();
        Box1 = new javax.swing.JComboBox<>();
        Box2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Ticketing", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AGE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ORIGIN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESTINATION");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TICKET FOR HOW MANY DAYS");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show.setText("SHOW TICKET");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print.setText("PRINT TICKET");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        Box1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        Box1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Box1ItemStateChanged(evt);
            }
        });
        Box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box1ActionPerformed(evt);
            }
        });

        Box2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        Box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box2ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("PRICE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("G:\\student-master\\Image and files\\back.png")); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("G:\\student-master\\Image and files\\cancel.png")); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(days, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Box2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Box1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(show)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton3)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(show)
                            .addComponent(print))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    
       
    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
    
        int prices=0;
        int discount;
        int ages=0;
        int dayse=0;
    
       
       /* if (ages<=10 || ages<=50){
            discount=(prices*40)/100;
            prices=prices-discount;
            System.out.println("prices");
        }
        else if (dayse >=7 ||dayse<=59){
            discount=(prices*10)/100;
            prices=prices-discount;
            System.out.println("prices");
        }
        else if (dayse>=60){
            discount=(prices*40)/100;
            prices=prices-discount;
            System.out.println("prices");
        }*/
       area.append(
                "\t******New Wave Buses Prepaid Ticket******\n\n"+
                "\tPassenger name:" + name.getText()+"\n\n"+
                "\tOrigin:"+Box1.getSelectedItem()+"\n\n"+
                "\tDestination:"+Box2.getSelectedItem()+"\n\n"+
                "\tTicket valid for:"+this.days.getText()+ " days\n\n"+
                "\tprice:ksh "+this.price.getText()+"\n\n"+
                "\tDiscount offered= "+this.discount+" %\n\n"+
                 "\tThank you for travelling with us\n\n"
                
        );
          try {
            stmt=conn.createStatement();
            String Name=name.getText();
            int Age=Integer.parseInt(age.getText());
            String Price=price.getText();
            String Days=days.getText();
            String Orig= (String)Box1.getSelectedItem();
            String Des=(String)Box2.getSelectedItem();
         
            
            String sql="INSERT INTO ticket(name,age,origin,destination,ticket,price)VALUES('"+Name+"','"+Age+"','"+Orig+"','"+Des+"','"+Days+"','"+Price+"')";
            
            
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
          
               
    }//GEN-LAST:event_showActionPerformed

    private void Box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box1ActionPerformed

    private void Box1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Box1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Box1ItemStateChanged

    private void daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_priceActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         /* String origin= Box1.getItemAt(Box1.getSelectedIndex());
           String destination= Box2.getItemAt(Box2.getSelectedIndex());*/
           
           try{
           int origin =Integer.parseInt((String)Box1.getSelectedItem());
            int destination =Integer.parseInt((String)Box2.getSelectedItem());
        
        if(origin==destination){
            
            JOptionPane.showMessageDialog(null, "input not valid");
        }else{
                     int dy=Integer.parseInt(days.getText());
                     int ag=Integer.parseInt(age.getText());
                     
            /*String kericho ="kericho";
            String kusii="kusii";
            String nyamira="nyamira";
            String kemera="kemera";
            String mosocho="mosocho";
            String oyugis="oyugis";
            String kisumu="kisumu";
           if (((origin==kericho && destination==kusii)||(destination==kericho && origin==kusii))||
                  ((origin==nyamira && destination==kusii)||(destination==nyamira && origin==kusii))||
                   ((origin==kemera && destination==kusii)||(destination==kemera && origin==kusii))) {
                    int cost=250;*/
           
            
            if (origin==1 && destination ==2 || origin==2 && destination==1){
            int cost =200;
                    
               if (ag<=10 && dy<7) {
                   
                   cost=((60*200)/100)*dy;
                      discount=40;
                   price.setText(Integer.toString(cost));
               } else if(ag<=10&& dy>=60) {
                    cost=((20*200)/100)*dy;
                        discount=80;
               price.setText(Integer.toString(cost));
               }
                 else if(ag>=50&& dy<7) {
                    cost=((60*200)/100)*dy;
                    discount=40;
               price.setText(Integer.toString(cost));
               }
                 else if(ag>=50&& dy>=60) {
                    cost=((20*200)/100)*dy;
                    discount=80;
               price.setText(Integer.toString(cost));
               }
                 else if((ag>10|| ag<50)&&(dy>=60)) {
                    cost=((60*200)/100)*dy;
                    discount=40;
               price.setText(Integer.toString(cost));
               }
               else if((ag>=7|| dy<60)&&(ag>50)) {
                    cost=((50*200)/100)*dy;
                    discount=50;
               price.setText(Integer.toString(cost));
               }
               else if((ag>10|| ag<50)&&(dy<7)) {
                    cost=200*dy;
                    discount=0;
               price.setText(Integer.toString(cost));
               }
               else if((ag>10|| ag<50)&&(dy>=7 ||dy<60)) {
                    cost=((90*200)/100)*dy;
                    discount=10;
               price.setText(Integer.toString(cost));
               }
               
               
               
            } /*else if(((origin==mosocho && destination==kusii)||(destination==mosocho && origin==kusii))||
                  ((origin==oyugis && destination==kusii)||(destination==oyugis && origin==kusii))||
                   ((origin==kisumu && destination==kusii)||(destination==kisumu && origin==kusii))){
                int cost=200;*/
            else if (origin==1 && destination ==3 || origin==3 && destination==1){
            int cost =250;
                    
               if (ag<=10 && dy<7) {
                   cost=((60*250)/100)*dy;
                      discount=40;
                   price.setText(Integer.toString(cost));
               } else if(ag<=10&& dy>=60) {
                    cost=((20*250)/100)*dy;
                    discount=80;
               price.setText(Integer.toString(cost));
               }
                 else if(ag>=50&& dy<7) {
                    cost=((60*250)/100)*dy;
                    discount=40;
               price.setText(Integer.toString(cost));
               }
                 else if(ag>=50&& dy>=60) {
                    cost=((20*250)/100)*dy;
                    discount=80;
               price.setText(Integer.toString(cost));
               }
                 else if((ag>10|| ag<50)&&(dy>=60)) {
                    cost=((60*250)/100)*dy;
                    discount=40;
               price.setText(Integer.toString(cost));
               }
               else if((ag>=7|| dy<60)&&(ag>50)) {
                    cost=((50*250)/100)*dy;
                    discount=50;
               price.setText(Integer.toString(cost));
               }
               else if((ag>10|| ag<50)&&(dy<7)) {
                    cost=250*dy;
                    discount=0;
               price.setText(Integer.toString(cost));
               }
               else if((ag>10|| ag<50)&&(dy>=7 ||dy<60)) {
                    cost=((90*250)/100)*dy;
                    discount=10;
               price.setText(Integer.toString(cost));
               }
               
                
            }
            else if (origin==2 && destination ==3 || origin==3 && destination==2){
            int cost = 450;
            
             if (ag<=10 && dy<7) {
                   cost=((60*450)/100)*dy;
                      discount=40;
                   price.setText(Integer.toString(cost));
               } else if(ag<=10&& dy>=60) {
                    cost=((20*450)/100)*dy;
                    discount=80;
               price.setText(Integer.toString(cost));
               }
                 else if(ag>=50&& dy<7) {
                    cost=((60*450)/100)*dy;
                    discount=40;
               price.setText(Integer.toString(cost));
               }
                 else if(ag>=50&& dy>=60) {
                    cost=((20*450)/100)*dy;
                    discount=80;
               price.setText(Integer.toString(cost));
               }
                 else if((ag>10|| ag<50)&&(dy>=60)) {
                    cost=((60*450)/100)*dy;
                    discount=40;
               price.setText(Integer.toString(cost));
               }
               else if((ag>=7|| dy<60)&&(ag>50)) {
                    cost=((50*450)/100)*dy;
                    discount=50;
               price.setText(Integer.toString(cost));
               }
               else if((ag>10|| ag<50)&&(dy<7)) {
                    cost=450*dy;
                    discount=0;
               price.setText(Integer.toString(cost));
               }
               else if((ag>10|| ag<50)&&(dy>=7 ||dy<60)) {
                    cost=((90*450)/100)*dy;
                    discount=10;
               price.setText(Integer.toString(cost));
               }
  
            }
        
        }
           
           }catch(RuntimeException r){
           JOptionPane.showMessageDialog(null, r);
           
           }
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Box2ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            area.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                        setVisible(false);
                Welcome Object=new Welcome();
                Object.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        area.setText("");
        name.setText("");
        age.setText("");
        price.setText("");
        days.setText("");
        
    
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Box1;
    private javax.swing.JComboBox<String> Box2;
    private javax.swing.JTextField age;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField days;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JButton print;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}