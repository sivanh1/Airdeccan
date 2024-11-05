/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seat;

import java.awt.Toolkit;

/**
 *
 * @author Dell
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        setIcon();
        initComponents();
    }

    public RegisterForm(String seat) {
        setIcon();
        initComponents();
        SeatTextShow.setText(seat);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        VerticalSeperator1 = new javax.swing.JSeparator();
        WarningText3 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LastNameText = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        PassportNoText = new javax.swing.JLabel();
        PassportNoField = new javax.swing.JTextField();
        ContinueButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        SeatTextShow = new javax.swing.JLabel();
        OwnerName2 = new javax.swing.JLabel();
        OriginCountry = new javax.swing.JLabel();
        OriginCode = new javax.swing.JLabel();
        DestinationCountry = new javax.swing.JLabel();
        DestinationCode = new javax.swing.JLabel();
        PlaneIcon = new javax.swing.JLabel();
        HorizontalSeperator1 = new javax.swing.JSeparator();
        FlightNoHeader1 = new javax.swing.JLabel();
        FlightNo1 = new javax.swing.JLabel();
        FlightNo3 = new javax.swing.JLabel();
        OriginCountry1 = new javax.swing.JLabel();
        OriginCountry2 = new javax.swing.JLabel();
        FlightNoHeader4 = new javax.swing.JLabel();
        FlightNo4 = new javax.swing.JLabel();
        DepartHeader3 = new javax.swing.JLabel();
        FlightNoHeader8 = new javax.swing.JLabel();
        FlightNo = new javax.swing.JLabel();
        FlightNoHeader9 = new javax.swing.JLabel();
        FlightNoHeader10 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        FirstNameText1 = new javax.swing.JLabel();
        WarningText1 = new javax.swing.JLabel();
        WarningText2 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        WelcomeText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Decibel Airlines Reservation System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setForeground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VerticalSeperator1.setBackground(new java.awt.Color(0, 0, 0));
        VerticalSeperator1.setForeground(new java.awt.Color(0, 0, 0));
        VerticalSeperator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Main.add(VerticalSeperator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 10, 360));

        WarningText3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WarningText3.setForeground(new java.awt.Color(207, 0, 15));
        Main.add(WarningText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 230, 50));

        FirstNameField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameFieldActionPerformed(evt);
            }
        });
        Main.add(FirstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 390, 40));

        LastNameText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastNameText.setText("Last Name");
        Main.add(LastNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 50));

        LastNameField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Main.add(LastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 390, 40));

        PassportNoText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PassportNoText.setText("Passport No.");
        Main.add(PassportNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 50));

        PassportNoField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PassportNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassportNoFieldActionPerformed(evt);
            }
        });
        Main.add(PassportNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 390, 40));

        ContinueButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ContinueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seat/booking.png"))); // NOI18N
        ContinueButton.setText("CONTINUE");
        ContinueButton.setFocusPainted(false);
        ContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButtonActionPerformed(evt);
            }
        });
        Main.add(ContinueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 160, 60));

        jPanel1.setBackground(new java.awt.Color(0, 0, 254));

        SeatTextShow.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        SeatTextShow.setForeground(new java.awt.Color(255, 255, 255));
        SeatTextShow.setText("XX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(SeatTextShow)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SeatTextShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 100, 50));

        OwnerName2.setBackground(new java.awt.Color(204, 204, 204));
        OwnerName2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OwnerName2.setForeground(new java.awt.Color(102, 102, 102));
        OwnerName2.setText("Passenger details must match the government-issued photo ID.");
        Main.add(OwnerName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 420, 20));

        OriginCountry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OriginCountry.setForeground(new java.awt.Color(102, 102, 102));
        OriginCountry.setText("BANGLORE");
        Main.add(OriginCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 90, 20));

        OriginCode.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        OriginCode.setForeground(new java.awt.Color(0, 0, 254));
        OriginCode.setText("MAA");
        Main.add(OriginCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, 35));

        DestinationCountry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DestinationCountry.setForeground(new java.awt.Color(102, 102, 102));
        DestinationCountry.setText("TO");
        Main.add(DestinationCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, -1, 12));

        DestinationCode.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DestinationCode.setForeground(new java.awt.Color(0, 0, 254));
        DestinationCode.setText("BLR");
        Main.add(DestinationCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, 35));

        PlaneIcon.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        PlaneIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seat/black-plane.png"))); // NOI18N
        Main.add(PlaneIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 40, -1));
        Main.add(HorizontalSeperator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 280, 10));

        FlightNoHeader1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader1.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader1.setText("DATE");
        Main.add(FlightNoHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 80, 12));

        FlightNo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNo1.setForeground(new java.awt.Color(0, 0, 254));
        FlightNo1.setText("Nov 7");
        Main.add(FlightNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, 30));

        FlightNo3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNo3.setForeground(new java.awt.Color(0, 0, 254));
        FlightNo3.setText("09:15");
        Main.add(FlightNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, 30));

        OriginCountry1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OriginCountry1.setForeground(new java.awt.Color(102, 102, 102));
        OriginCountry1.setText("FROM");
        Main.add(OriginCountry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, 12));

        OriginCountry2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OriginCountry2.setForeground(new java.awt.Color(102, 102, 102));
        OriginCountry2.setText("CHENNAI");
        Main.add(OriginCountry2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 80, 20));

        FlightNoHeader4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader4.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader4.setText("ADULT");
        Main.add(FlightNoHeader4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 90, 12));

        FlightNo4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNo4.setForeground(new java.awt.Color(0, 0, 254));
        FlightNo4.setText("1");
        Main.add(FlightNo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, 30));

        DepartHeader3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        DepartHeader3.setText("Passenger Details");
        Main.add(DepartHeader3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 50));

        FlightNoHeader8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader8.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader8.setText("TIME");
        Main.add(FlightNoHeader8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 90, 12));

        FlightNo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        FlightNo.setForeground(new java.awt.Color(0, 0, 254));
        FlightNo.setText("QF 8");
        Main.add(FlightNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, 40));

        FlightNoHeader9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader9.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader9.setText("SEAT");
        Main.add(FlightNoHeader9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 70, 20));

        FlightNoHeader10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNoHeader10.setForeground(new java.awt.Color(102, 102, 102));
        FlightNoHeader10.setText("FLIGHT");
        Main.add(FlightNoHeader10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 70, 20));

        BackButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BackButton.setText("BACK");
        BackButton.setFocusPainted(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        Main.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 100, 60));

        FirstNameText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstNameText1.setText("First Name");
        Main.add(FirstNameText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 50));

        WarningText1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WarningText1.setForeground(new java.awt.Color(207, 0, 15));
        Main.add(WarningText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, 50));

        WarningText2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        WarningText2.setForeground(new java.awt.Color(207, 0, 15));
        Main.add(WarningText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 210, 50));

        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 910, 450));

        Header.setBackground(new java.awt.Color(51, 153, 255));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeText.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        WelcomeText.setForeground(new java.awt.Color(255, 255, 255));
        Header.add(WelcomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 20, 40));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PassportNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassportNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassportNoFieldActionPerformed

    private void FirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameFieldActionPerformed

    private void ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButtonActionPerformed
        if (FirstNameField.getText().isEmpty() && LastNameField.getText().isEmpty() && PassportNoField.getText().isEmpty()) {
            WarningText1.setText("* First Name is Required");
            WarningText2.setText("* Last Name is Required");
            WarningText3.setText("* Passport No. is Required");
        } else if (FirstNameField.getText().isEmpty() && LastNameField.getText().isEmpty()) {
            WarningText1.setText("* First Name is Required");
            WarningText2.setText("* Last Name is Required");
            WarningText3.setText("");
        } else if (FirstNameField.getText().isEmpty() && PassportNoField.getText().isEmpty()) {
            WarningText1.setText("* First Name is Required");
            WarningText2.setText("");
            WarningText3.setText("* Passport No. is Required");
        } else if (LastNameField.getText().isEmpty() && PassportNoField.getText().isEmpty()) {
            WarningText1.setText("");
            WarningText2.setText("* Last Name is Required");
            WarningText3.setText("* Passport No. is Required");
        } else if (FirstNameField.getText().isEmpty()) {
            WarningText1.setText("* First Name is Required");
            WarningText2.setText("");
            WarningText3.setText("");
        } else if (LastNameField.getText().isEmpty()) {
            WarningText1.setText("");
            WarningText2.setText("* Last Name is Required");
            WarningText3.setText("");
        } else if (PassportNoField.getText().isEmpty()) {
            WarningText1.setText("");
            WarningText2.setText("");
            WarningText3.setText("* Passport No. is Required");
        } else {
            String firstName = FirstNameField.getText();
            String lastName = LastNameField.getText();
            String passportNo = PassportNoField.getText();
            String seat = SeatTextShow.getText();

            new Confirmation(seat, firstName, lastName, passportNo).setVisible(true); //Passing seat, firstName, lastName, passportNo to ConfirmationForm
            System.out.println(main.flight.getSeatInfo(seat));
            this.setVisible(false);
        }
    }//GEN-LAST:event_ContinueButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ContinueButton;
    private javax.swing.JLabel DepartHeader3;
    private javax.swing.JLabel DestinationCode;
    private javax.swing.JLabel DestinationCountry;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel FirstNameText1;
    private javax.swing.JLabel FlightNo;
    private javax.swing.JLabel FlightNo1;
    private javax.swing.JLabel FlightNo3;
    private javax.swing.JLabel FlightNo4;
    private javax.swing.JLabel FlightNoHeader1;
    private javax.swing.JLabel FlightNoHeader10;
    private javax.swing.JLabel FlightNoHeader4;
    private javax.swing.JLabel FlightNoHeader8;
    private javax.swing.JLabel FlightNoHeader9;
    private javax.swing.JPanel Header;
    private javax.swing.JSeparator HorizontalSeperator1;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JLabel LastNameText;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel OriginCode;
    private javax.swing.JLabel OriginCountry;
    private javax.swing.JLabel OriginCountry1;
    private javax.swing.JLabel OriginCountry2;
    private javax.swing.JLabel OwnerName2;
    private javax.swing.JTextField PassportNoField;
    private javax.swing.JLabel PassportNoText;
    private javax.swing.JLabel PlaneIcon;
    private javax.swing.JLabel SeatTextShow;
    private javax.swing.JSeparator VerticalSeperator1;
    private javax.swing.JLabel WarningText1;
    private javax.swing.JLabel WarningText2;
    private javax.swing.JLabel WarningText3;
    private javax.swing.JLabel WelcomeText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("OIP.jpeg")));
    }
}