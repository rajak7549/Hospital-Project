
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author GAURAV
 */
public class BookAppointment extends javax.swing.JFrame {

    /**
     * Creates new form BookApointment
     */
    public BookAppointment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpid = new javax.swing.JTextField();
        txtbloodgroup = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdoctorname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtnmae = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Buttonbook = new javax.swing.JButton();
        Buttonhome = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        DateChooserdate = new com.toedter.calendar.JDateChooser();
        Buttonfeatch = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtdid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfee = new javax.swing.JTextField();
        cmbdepartment = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOSPITAL MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOOK APPOINTMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText(" INFORMATIONS");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("PID");

        txtpid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtbloodgroup.setEditable(false);
        txtbloodgroup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("BLOOD GROUP");

        txtage.setEditable(false);
        txtage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("NAME");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("DOCTOR NAME ");

        txtdoctorname.setEditable(false);
        txtdoctorname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("AGE");

        txtnmae.setEditable(false);
        txtnmae.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("DEPARTMENT ");

        Buttonbook.setBackground(new java.awt.Color(51, 51, 51));
        Buttonbook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buttonbook.setForeground(new java.awt.Color(255, 255, 255));
        Buttonbook.setText("BOOK");
        Buttonbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonbookActionPerformed(evt);
            }
        });

        Buttonhome.setBackground(new java.awt.Color(51, 51, 51));
        Buttonhome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buttonhome.setForeground(new java.awt.Color(255, 255, 255));
        Buttonhome.setText("HOME");
        Buttonhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonhomeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DATE");

        Buttonfeatch.setBackground(new java.awt.Color(51, 51, 51));
        Buttonfeatch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buttonfeatch.setForeground(new java.awt.Color(255, 255, 255));
        Buttonfeatch.setText("FETCH");
        Buttonfeatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonfeatchActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("DID");

        txtdid.setEditable(false);
        txtdid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtdid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdidMouseClicked(evt);
            }
        });
        txtdid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdidActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("FEE");

        txtfee.setEditable(false);
        txtfee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cmbdepartment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbdepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " <SELECT>", "Pediatrics", "Obstetrics and Gynecology", "Surgery", "Orthopedics", "Cardiology", "Oncology", "Neurology", "Dermatology", "Radiology", "Anesthesiology", "Emergency Medicine", "Psychiatry", "Ophthalmology", "Otolaryngology (ENT)", "Gastroenterology", "Nephrology", "Infectious Diseases" }));
        cmbdepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5))
                                                    .addGap(59, 59, 59))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addGap(157, 157, 157)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel10))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(39, 39, 39))))))
                                    .addComponent(jLabel19))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfee, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateChooserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdoctorname, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdid, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtnmae, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(154, 154, 154)
                                        .addComponent(Buttonfeatch)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(Buttonbook)
                .addGap(157, 157, 157)
                .addComponent(Buttonhome)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(Buttonfeatch, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtnmae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel19))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtbloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel15))
                            .addComponent(txtdid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtdoctorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(DateChooserdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonbook)
                    .addComponent(Buttonhome))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonbookActionPerformed
        if (DateChooserdate.getDate() == null || txtfee.getText().trim().isEmpty() || cmbdepartment.getSelectedIndex() == 0 || txtage.getText().trim().isEmpty() || txtbloodgroup.getText().trim().isEmpty() || txtdid.getText().trim().isEmpty() || txtdoctorname.getText().trim().isEmpty() || cmbdepartment.getSelectedIndex() == 0 || txtnmae.getText().trim().isEmpty() || txtpid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "One or more fields are empty");
            return;
        }

        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(DateChooserdate.getDate()));

        try {
            int pid = Integer.parseInt(txtpid.getText()); // Example patient ID
            String pname = txtnmae.getText();
            int age = Integer.parseInt(txtage.getText());
            String bloodgroup = txtbloodgroup.getText();
            String department = cmbdepartment.getSelectedItem().toString();
            int did = Integer.parseInt(txtdid.getText()); // Example doctor ID
            String doctorname = txtdoctorname.getText();
            int consultantfee = Integer.parseInt(txtfee.getText());
            String date = new SimpleDateFormat("dd/MM/yyyy").format(DateChooserdate.getDate()); // Example date
            //System.out.println(DateChooserdate.getDate().toString());

            Database db = new Database();
            String query = "INSERT INTO appointment (pid, pname, age, bloodgroup, department, did, doctorname, consultantfee, date) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = db.con.prepareStatement(query);
            pst.setInt(1, pid);
            pst.setString(2, pname);
            pst.setInt(3, age);
            pst.setString(4, bloodgroup);
            pst.setString(5, department);
            pst.setInt(6, did);
            pst.setString(7, doctorname);
            pst.setInt(8, consultantfee);
            pst.setString(9, date);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Appointment Booked successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to Book appointment.");

            }

            pst.close();
            db.con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_ButtonbookActionPerformed

    private void ButtonhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonhomeActionPerformed
        new ReceptionistDashBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonhomeActionPerformed

    private void ButtonfeatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonfeatchActionPerformed
        try {
            String input = txtpid.getText().trim();
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter the patient ID");
            } else {
                int pid = Integer.parseInt(input);

                Database db = new Database();
                String query = "SELECT pname, age, bloodgroup FROM patient WHERE pid=?";
                PreparedStatement pst = db.con.prepareStatement(query);
                pst.setInt(1, pid);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String pname = rs.getString("pname");
                    int age = rs.getInt("age");
                    String bloodGroup = rs.getString("bloodgroup");

                    txtnmae.setText(pname);
                    txtage.setText(String.valueOf(age));
                    txtbloodgroup.setText(bloodGroup);
                } else {
                    JOptionPane.showMessageDialog(this, "Patient not registered");
                }

                rs.close();
                pst.close();
                db.con.close();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid patient ID");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_ButtonfeatchActionPerformed

    private void txtdidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdidActionPerformed

    private void txtdidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdidMouseClicked

        try {
            // String department = txtpid.getText().trim();
            if (cmbdepartment.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please Select Department");
            } else {
                String department = cmbdepartment.getSelectedItem().toString();

                Database db = new Database();
                String query = "SELECT did, dname,fee FROM doctor WHERE department=?";
                PreparedStatement pst = db.con.prepareStatement(query);
                pst.setString(1, department);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {

                    int did = rs.getInt("did");
                    String dname = rs.getString("dname");
                    int fee = rs.getInt("fee");
                    txtdid.setText(String.valueOf(did));
                    txtdoctorname.setText(dname);
                    txtfee.setText(String.valueOf(fee));
                } else {
                    JOptionPane.showMessageDialog(this, "Doctor  Not Found");
                }

                rs.close();
                pst.close();
                db.con.close();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid patient ID");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtdidMouseClicked

    private void cmbdepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdepartmentActionPerformed

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
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonbook;
    private javax.swing.JButton Buttonfeatch;
    private javax.swing.JButton Buttonhome;
    private com.toedter.calendar.JDateChooser DateChooserdate;
    private javax.swing.JComboBox<String> cmbdepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtbloodgroup;
    private javax.swing.JTextField txtdid;
    private javax.swing.JTextField txtdoctorname;
    private javax.swing.JTextField txtfee;
    private javax.swing.JTextField txtnmae;
    private javax.swing.JTextField txtpid;
    // End of variables declaration//GEN-END:variables
}
