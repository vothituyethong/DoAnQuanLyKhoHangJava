/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.NhanVienBLL;
import BLL.TaiKhoanBLL;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.Date;
import javax.swing.*;
/**
 *
 * @author ACER
 */
public class Frm_TTTaiKhoan extends javax.swing.JFrame {

    /**
     * Creates new form Frm_TTHangHoa
     */
    Frm_NhanVien NV;
    Frm_QuanLy QL;
        
    public Frm_TTTaiKhoan() {
        
        initComponents();
        addControl();
    }
    
    private void addControl(){
        Font ft=new Font("Times New Roman",Font.BOLD,24);
        lbl1.setFont(ft);
        panel.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("Thông tin tài khoản");
        lblhinh.setIcon(createIcon("/resources/images.jpg"));
        btn1.setBackground(Color.PINK);
        btn2.setBackground(Color.PINK);
        btn3.setBackground(Color.PINK);
        btnPwd.setBackground(Color.PINK);
        lbl1.requestFocus();
        
        tf3.setText("yyyy-mm-dd");
        tf1.setText("Nhập giới tính");
        tf4.setText("Nhập sđt");
        tf5.setText("Nhập địa chỉ");
        
        tf1.setForeground(Color.DARK_GRAY);
        tf3.setForeground(Color.DARK_GRAY);
        tf4.setForeground(Color.DARK_GRAY);
        tf5.setForeground(Color.DARK_GRAY);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lblmanv = new javax.swing.JLabel();
        lblten = new javax.swing.JLabel();
        lblngsinh = new javax.swing.JLabel();
        lblsđt = new javax.swing.JLabel();
        lbldiachi = new javax.swing.JLabel();
        lblchucvu = new javax.swing.JLabel();
        lblhinh = new javax.swing.JLabel();
        lblManv = new javax.swing.JLabel();
        lblTennv = new javax.swing.JLabel();
        lblDB = new javax.swing.JLabel();
        lblSdt = new javax.swing.JLabel();
        lblDchi = new javax.swing.JLabel();
        lblCvu = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        lblngsinh1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        btnPwd = new javax.swing.JButton();

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl1.setText("THÔNG TIN TÀI KHOẢN");

        lblmanv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblmanv.setText("MÃ NHÂN VIÊN:");

        lblten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblten.setText("TÊN NHÂN VIÊN:");

        lblngsinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblngsinh.setText("GIỚI TÍNH:");

        lblsđt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblsđt.setText("SĐT:");

        lbldiachi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldiachi.setText("ĐỊA CHỈ:");

        lblchucvu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblchucvu.setText("CHỨC VỤ:");

        lblManv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblTennv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblDB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSdt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblDchi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblCvu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tf3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf3FocusLost(evt);
            }
        });
        tf3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf3MouseClicked(evt);
            }
        });
        tf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf3KeyPressed(evt);
            }
        });

        tf4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf4FocusLost(evt);
            }
        });
        tf4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf4MouseClicked(evt);
            }
        });
        tf4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf4KeyPressed(evt);
            }
        });

        tf5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf5FocusLost(evt);
            }
        });
        tf5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf5MouseClicked(evt);
            }
        });
        tf5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf5KeyPressed(evt);
            }
        });

        btn1.setText("SỬA");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("HỦY");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl.setText("   .....");

        btn3.setText("HỦY");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        lblngsinh1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblngsinh1.setText("NGÀY SINH:");

        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf1FocusLost(evt);
            }
        });
        tf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf1MouseClicked(evt);
            }
        });
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl2.setText("     .....");

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl3.setText(".....");
        lbl3.setPreferredSize(new java.awt.Dimension(6, 26));

        btnPwd.setText("ĐỔI MẬT KHẨU");
        btnPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblten, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsđt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblngsinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPwd, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf5, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(tf3)
                            .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(tf1)
                            .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(tf4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addComponent(lblhinh, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(403, 403, 403)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCvu, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManv, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(lblTennv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDB, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDchi, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblManv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblten, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTennv)))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDB)
                            .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblngsinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblSdt)
                                .addGap(63, 63, 63)
                                .addComponent(lblDchi))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblsđt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblCvu))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbldiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblhinh, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        //TODO add your handling code here:
        NV.btn1.doClick();
        this.dispose();
       
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        QL.btn9.doClick();
        this.dispose();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        NhanVienDTO nvDTO=new NhanVienDTO();
        nvDTO.setMA_NV(lbl.getText());
        nvDTO.setTEN_NV(lbl3.getText());
            
            if(tf3.getText().equals("yyyy-mm-dd"))
                JOptionPane.showMessageDialog(null,"Vui lòng nhập ngày sinh!","Thông báo", 0);
            else{
                int nam=Integer.parseInt(tf3.getText().substring(0,4));
                int thang=Integer.parseInt(tf3.getText().substring(5,7));
                int ngay=Integer.parseInt(tf3.getText().substring(8,10));
                if(ktNgayHopLe(nam,thang,ngay)==0)
                    JOptionPane.showMessageDialog(null,"Ngày sinh không hợp lệ. Vui lòng kiểm tra lại!","Thông báo", 0);
                else{
                    nvDTO.setNG_SINH(Date.valueOf(tf3.getText()));
                    if(tf1.getText().equals("Nhập giới tính"))
                        JOptionPane.showMessageDialog(null,"Vui lòng nhập giới tính!","Thông báo", 0);
                    else{
                        if(!tf1.getText().equals("Nam")&&!tf1.getText().equals("Nữ"))
                            JOptionPane.showMessageDialog(null,"Giới tính có thể là Nam hoặc Nữ","Thông báo", 0);
                        else{
                            nvDTO.setG_TINH(tf1.getText());
                            String pattern="^0\\d{9,10}$";
                            if(tf4.getText().matches(pattern )==false) JOptionPane.showMessageDialog(null, "SĐT phải bắt đầu bằng số 0, không được chứa các kí tự khác số và phải có từ 10 đến 11 chữ số!","Thông báo",0);
                            else{
                                nvDTO.setSDT(tf4.getText());
                                if(tf5.getText().equals("Nhập địa chỉ"))
                                    JOptionPane.showMessageDialog(null,"Vui lòng nhập địa chỉ!","Thông báo", 0);
                                else{
                                    nvDTO.setD_CHI(tf5.getText());
                                    nvDTO.setCHUC_VU(lbl2.getText());
                                    NhanVienBLL nvBLL=new NhanVienBLL();
                                    if(nvBLL.updatenvien(nvDTO, lbl.getText())!=0) 
                                        JOptionPane.showMessageDialog(null,"Cập nhật thông tin thành công!","Thông báo", 1);
                                    else JOptionPane.showMessageDialog(null,"Cập nhật thông tin thất bại!","Thông báo", 0);
                                }
                            }
                        }
                    }
                    
                }
            }
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void tf3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf3MouseClicked
        // TODO add your handling code here:
        if(tf3.getText().equals("yyyy-mm-dd")){
            tf3.setText("");
            tf3.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf3MouseClicked

    private void tf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseClicked
        // TODO add your handling code here:
        if(tf1.getText().equals("Nhập giới tính")){
            tf1.setText("");
            tf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf1MouseClicked

    private void tf4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf4MouseClicked
        // TODO add your handling code here:
        if(tf4.getText().equals("Nhập sđt")){
            tf4.setText("");
            tf4.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf4MouseClicked

    private void tf5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf5MouseClicked
        // TODO add your handling code here:
        if(tf5.getText().equals("Nhập địa chỉ")){
            tf5.setText("");
            tf5.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf5MouseClicked

    private void tf3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf3FocusLost
        // TODO add your handling code here:
        if(tf3.getText().equals("")){
            tf3.setText("yyyy-mm-dd");
            tf3.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf3FocusLost

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        // TODO add your handling code here:
        if(tf1.getText().equals("")){
            tf1.setText("Nhập giới tính");
            tf1.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf1FocusLost

    private void tf4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf4FocusLost
        // TODO add your handling code here:
        if(tf4.getText().equals("")){
            tf4.setText("Nhập sđt");
            tf4.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf4FocusLost

    private void tf5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf5FocusLost
        // TODO add your handling code here:
        if(tf5.getText().equals("")){
            tf5.setText("Nhập địa chỉ");
            tf5.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf5FocusLost

    private void tf3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btn1.doClick();
        }
    }//GEN-LAST:event_tf3KeyPressed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btn1.doClick();
        }
    }//GEN-LAST:event_tf1KeyPressed

    private void tf4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf4KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btn1.doClick();
        }
    }//GEN-LAST:event_tf4KeyPressed

    private void tf5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btn1.doClick();
        }
    }//GEN-LAST:event_tf5KeyPressed

    private void btnPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPwdActionPerformed
        // TODO add your handling code here:
        Frm_DoiPasswd form=new Frm_DoiPasswd();
        form.setVisible(true);
        TaiKhoanDTO tkDTO=new TaiKhoanDTO();
        tkDTO.setMA_NV(lbl.getText());
        TaiKhoanBLL tkBLL=new TaiKhoanBLL();
        form.lblUser.setText(tkBLL.getUsernameByMANV(tkDTO));
    }//GEN-LAST:event_btnPwdActionPerformed

    /**
     * @param args the command line arguments
     */
    private static ImageIcon createIcon(String path){
        java.net.URL iconURL=Frm_TTTaiKhoan.class.getResource(path);
        if(iconURL !=null){
            return new ImageIcon(iconURL);
        }
        else{                
            System.out.println("Không tìm thấy icon.");
            return null;
        }
    }
    
    private int ktNamNhuan(int n){
        if(n%400==0||((n%4==0)&&(n%100!=0))) return 1;
        return 0;
    }
    private int ktNgayHopLe(int yyyy, int mm,int dd){
        switch(mm){            		
            case 4:case 6:case 9:case 11:
		if(dd>30) return 0;
                else return 1;			
                		
            case 2:{
		if(((ktNamNhuan(yyyy)==1)&&dd>29)||(ktNamNhuan(yyyy)==0&&dd>28)) return 0;
                else return 1;
		
            }
            default:return 1;
	}		
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    public javax.swing.JButton btn2;
    public javax.swing.JButton btn3;
    private javax.swing.JButton btnPwd;
    public javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    public javax.swing.JLabel lbl2;
    public javax.swing.JLabel lbl3;
    public javax.swing.JLabel lblCvu;
    public javax.swing.JLabel lblDB;
    public javax.swing.JLabel lblDchi;
    public javax.swing.JLabel lblManv;
    public javax.swing.JLabel lblSdt;
    public javax.swing.JLabel lblTennv;
    private javax.swing.JLabel lblchucvu;
    private javax.swing.JLabel lbldiachi;
    private javax.swing.JLabel lblhinh;
    private javax.swing.JLabel lblmanv;
    private javax.swing.JLabel lblngsinh;
    private javax.swing.JLabel lblngsinh1;
    private javax.swing.JLabel lblsđt;
    private javax.swing.JLabel lblten;
    private javax.swing.JPanel panel;
    public javax.swing.JTextField tf1;
    public javax.swing.JTextField tf3;
    public javax.swing.JTextField tf4;
    public javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables
}
