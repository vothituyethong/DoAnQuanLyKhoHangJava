
package GUI;

import BLL.NCC_BLL;
import DTO.NCC_DTO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
public class Frm_QLNhaCungCap extends javax.swing.JFrame {

    public String id;
    public Frm_QLNhaCungCap() {
        initComponents();
        addControl();
        loadAll();
    }
    private void addControl()
    {
        Font ft=new Font("Times New Roman",Font.BOLD,24);
        lbl_NCC.setFont(ft);
        pn5.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("Quản Lý Nhà Cung Cấp");
        btn1.setBackground(Color.PINK);
        btn2.setBackground(Color.PINK);
        btn3.setBackground(Color.PINK);
        btn4.setBackground(Color.PINK);  
        btn5.setBackground(Color.PINK);
        btnEXp.setBackground(Color.PINK);  
        btnImp.setBackground(Color.PINK);
        
        tf1.setText("Nhập mã nhà cc");
        tf2.setText("Nhập tên nhà cc");
        tf3.setText("Nhập địa chỉ");
        tf4.setText("Nhập sđt");
        tf5.setText("Nhập dữ liệu cần tìm");
        
        tf1.setForeground(Color.DARK_GRAY);
        tf2.setForeground(Color.DARK_GRAY);
        tf3.setForeground(Color.DARK_GRAY);
        tf4.setForeground(Color.DARK_GRAY);
        tf5.setForeground(Color.DARK_GRAY);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn5 = new javax.swing.JPanel();
        lbl_NCC = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        tf5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl5 = new javax.swing.JTable();
        cb1 = new javax.swing.JComboBox<>();
        btnEXp = new javax.swing.JButton();
        btnImp = new javax.swing.JButton();

        lbl_NCC.setText("QUẢN LÝ NHÀ CUNG CẤP");

        lbl1.setText("Mã NCC:");

        lbl2.setText("Tên NCC:");

        lbl3.setText("Địa Chỉ:");

        lbl4.setText("Số Điện Thoại:");

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

        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf2FocusLost(evt);
            }
        });
        tf2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf2MouseClicked(evt);
            }
        });
        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf2KeyPressed(evt);
            }
        });

        tf3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf3FocusGained(evt);
            }
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
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf4FocusLost(evt);
            }
        });
        tf4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf4MouseClicked(evt);
            }
        });

        btn1.setText("THÊM");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("SỬA");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.setText("XEM TẤT CẢ");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setText("XÓA");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setText("TÌM KIẾM");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
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

        tbl5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ NCC", "TÊN NCC", "ĐỊA CHỈ", "SỐ ĐIỆN THOẠI"
            }
        ));
        tbl5.setRowHeight(20);
        tbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl5MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl5);

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã NCC", "Tên NCC" }));

        btnEXp.setText("XUẤT FILE EXCEL");
        btnEXp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXpActionPerformed(evt);
            }
        });

        btnImp.setText("NHẬP FILE EXCEL");
        btnImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn5Layout = new javax.swing.GroupLayout(pn5);
        pn5.setLayout(pn5Layout);
        pn5Layout.setHorizontalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createSequentialGroup()
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn5Layout.createSequentialGroup()
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn5Layout.createSequentialGroup()
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn5Layout.createSequentialGroup()
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn5Layout.createSequentialGroup()
                                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pn5Layout.createSequentialGroup()
                                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pn5Layout.createSequentialGroup()
                                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEXp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(140, 140, 140))
        );
        pn5Layout.setVerticalGroup(
            pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn5Layout.createSequentialGroup()
                                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn5Layout.createSequentialGroup()
                        .addComponent(lbl_NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEXp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        NCC_DTO nccDTO=new NCC_DTO();
        
        if(tf1.getText().equals("Nhập mã nhà cc")||tf3.getText().equals("Nhập địa chỉ")||tf4.getText().equals("Nhập sđt")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!","Thông báo",0);
        }
        else{
            nccDTO.setMA_NCC(tf1.getText());
            nccDTO.setTEN_NCC(tf2.getText());
            nccDTO.setD_CHI(tf3.getText());
            String pattern="^0\\d{9,10}$";
            if(tf4.getText().matches(pattern )==false) JOptionPane.showMessageDialog(null, "SĐT phải bắt đầu bằng số 0, không được chứa các kí tự khác số và phải có từ 10 đến 11 chữ số!","Thông báo",0);
            else{
                nccDTO.setSDT(tf4.getText());
                NCC_BLL nccBLL=new NCC_BLL();
                if (nccBLL.insertNCC(nccDTO)!=0) {
                    loadAll();
                    JOptionPane.showMessageDialog(null, "Thêm Nhà cung cấp thành công!","Thông báo",1);
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Thêm Nhà cung cấp thất bại!","Thông báo",0);
                } 
            }  
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void tbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl5MouseClicked
        // TODO add your handling code here:
        int selectedIndex=tbl5.getSelectedRow();
                
        if(tbl5.getModel().getValueAt(selectedIndex,0)!=null&&tbl5.getModel().getValueAt(selectedIndex,1)!=null&&tbl5.getModel().getValueAt(selectedIndex,2)!=null&&tbl5.getModel().getValueAt(selectedIndex,3)!=null){        
        tf1.setText(tbl5.getModel().getValueAt(selectedIndex,1).toString());
        id=tbl5.getModel().getValueAt(selectedIndex,1).toString();
        tf2.setText(tbl5.getModel().getValueAt(selectedIndex,2).toString());
        tf3.setText(tbl5.getModel().getValueAt(selectedIndex,3).toString());
        tf4.setText(tbl5.getModel().getValueAt(selectedIndex,4).toString());
        }
    }//GEN-LAST:event_tbl5MouseClicked

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        NCC_DTO nccDTO=new NCC_DTO();
        nccDTO.setMA_NCC(tf1.getText());
        if(tf1.getText().equals("Nhập mã nhà cc")||tf1.getText()==null) 
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin Mã Nhà cung cấp cần xóa!","Thông báo",0);
        else{
            NCC_BLL nccBLL=new NCC_BLL();
            int choice = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa dữ liệu?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION){
                if (nccBLL.deleteNCC(nccDTO)!=0) {
                    loadAll();                
                    JOptionPane.showMessageDialog(null, "Xoá thành công!","Thông báo",1);
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Mã Nhà cung cấp này không tồn tại!","Thông báo",0);
                }
            }
            
        } 
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        loadAll();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        NCC_DTO nccDTO=new NCC_DTO();        
        if(tf1.getText().equals("Nhập mã nhà cc")||tf3.getText().equals("Nhập địa chỉ")||tf4.getText().equals("Nhập sđt")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!","Thông báo",0);
        }
        else{
            nccDTO.setMA_NCC(tf1.getText());
            nccDTO.setTEN_NCC(tf2.getText());
            nccDTO.setD_CHI(tf3.getText());
            String pattern="^0\\d{9,10}$";
            if(tf4.getText().matches(pattern )==false) JOptionPane.showMessageDialog(null, "SĐT phải bắt đầu bằng số 0, không được chứa các kí tự khác số và phải có từ 10 đến 11 chữ số!","Thông báo",0);
            else{
                nccDTO.setSDT(tf4.getText());
                NCC_BLL nccBLL=new NCC_BLL();
                if (nccBLL.updateNCC(nccDTO,id)!=0) {
                    loadAll();
                    JOptionPane.showMessageDialog(null, "Sửa Nhà cung cấp thành công!","Thông báo",1);
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Sửa Nhà cung cấp thất bại!","Thông báo",0);
                } 
            }   
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        NCC_DTO nccDTO=new NCC_DTO();
        if(cb1.getSelectedIndex()==0){
            nccDTO.setMA_NCC(tf5.getText());
            if(tf5.getText().equals("Nhập dữ liệu cần tìm")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập Mã Nhà cung cấp cần tìm!","Thông báo",0);
            }
            else       
                getNCCMa(nccDTO);
            }
        else{
            nccDTO.setTEN_NCC(tf5.getText());
            if(tf5.getText().equals("Nhập dữ liệu cần tìm")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập Tên Nhà cung cấp cần tìm!","Thông báo",0);
            }
            else       
                getNCCTen(nccDTO);
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnEXpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXpActionPerformed
        // TODO add your handling code here:
        NCC_BLL nccBLL=new NCC_BLL();
        nccBLL.ExportExcel();
        JOptionPane.showMessageDialog(null,"Xuất file Excel thành công","Thông báo", 1);
    }//GEN-LAST:event_btnEXpActionPerformed

    private void btnImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel", "xlsx");
        fc.setFileFilter(filter);
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile(); //Lấy URL
            NCC_BLL nccBLL=new NCC_BLL();
            nccBLL.ImportExcel(file);
            loadAll();
            JOptionPane.showMessageDialog(null, "Nhập file excel thành công!");
        }
    }//GEN-LAST:event_btnImpActionPerformed

    private void tf5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btn5.doClick();
        }
    }//GEN-LAST:event_tf5KeyPressed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            tf2.requestFocus();
        }
    }//GEN-LAST:event_tf1KeyPressed

    private void tf2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            tf3.requestFocus();
        }
    }//GEN-LAST:event_tf2KeyPressed

    private void tf3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            tf4.requestFocus();
        }
    }//GEN-LAST:event_tf3KeyPressed

    private void tf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseClicked
        // TODO add your handling code here:
        if(tf1.getText().equals("Nhập mã nhà cc")){
            tf1.setText("");
            tf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf1MouseClicked

    private void tf2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf2MouseClicked
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập tên nhà cc")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf2MouseClicked

    private void tf3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf3MouseClicked
        // TODO add your handling code here:
        if(tf3.getText().equals("Nhập địa chỉ")){
            tf3.setText("");
            tf3.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf3MouseClicked

    private void tf4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf4MouseClicked
        // TODO add your handling code here:
        if(tf4.getText().equals("Nhập sđt")){
            tf4.setText("");
            tf4.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf4MouseClicked

    private void tf5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf5MouseClicked
        // TODO add your handling code here:
        if(tf5.getText().equals("Nhập dữ liệu cần tìm")){
            tf5.setText("");
            tf5.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf5MouseClicked

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        // TODO add your handling code here:
        if(tf1.getText().equals("")){
            tf1.setText("Nhập mã nhà cc");
            tf1.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf1FocusLost

    private void tf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusLost
        // TODO add your handling code here:
        if(tf2.getText().equals("")){
            tf2.setText("Nhập tên nhà cc");
            tf2.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf2FocusLost

    private void tf3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf3FocusLost
        // TODO add your handling code here:
        if(tf3.getText().equals("")){
            tf3.setText("Nhập địa chỉ");
            tf3.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf3FocusLost

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
            tf5.setText("Nhập dữ liệu cần tìm");
            tf5.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf5FocusLost

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập tên nhà cc")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf2FocusGained

    private void tf3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf3FocusGained
        // TODO add your handling code here:
        if(tf3.getText().equals("Nhập địa chỉ")){
            tf3.setText("");
            tf3.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf3FocusGained

    private void tf4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf4FocusGained
        // TODO add your handling code here:
        if(tf4.getText().equals("Nhập sđt")){
            tf4.setText("");
            tf4.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf4FocusGained

    /**
     * @param args the command line arguments
     */
    public void loadAll() {
	String[] header = { "STT","MÃ NCC","TÊN NCC", "ĐỊA CHỈ", "SỐ ĐT"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<NCC_DTO> arr = new ArrayList<NCC_DTO>();
	 NCC_BLL nccBLL = new NCC_BLL();
	 arr = nccBLL.getAllNCC();
	 NCC_DTO nccDTO = new NCC_DTO();
	 for (int i = 0; i < arr.size(); i++) {
		 nccDTO = arr.get(i);		 
		 String id = nccDTO.getMA_NCC();
		 String name = nccDTO.getTEN_NCC();	
                 String dchi = nccDTO.getD_CHI();
		 String sdt = nccDTO.getSDT();
		  Object[] row = {i+1, id, name,dchi,sdt};
		 dtm.addRow(row);
	 }
	 tbl5.setModel(dtm);
    }
    
    public void getNCCMa(NCC_DTO nccDTO) {
	String[] header = { "STT","MÃ NCC","TÊN NCC", "ĐỊA CHỈ", "SỐ ĐT"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<NCC_DTO> arr = new ArrayList<NCC_DTO>();
	 NCC_BLL nccBLL = new NCC_BLL();
	 arr = nccBLL.searchNCCMa(nccDTO);
	 for (int i = 0; i < arr.size(); i++) {
		 nccDTO = arr.get(i);		 
		 String id = nccDTO.getMA_NCC();
		 String name = nccDTO.getTEN_NCC();	
                 String dchi = nccDTO.getD_CHI();
		 String sdt = nccDTO.getSDT();
		  Object[] row = {i+1, id, name,dchi,sdt};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Nhà cung cấp này không tồn tại.","Thông báo",0);
	 tbl5.setModel(dtm);
    }
    public void getNCCTen(NCC_DTO nccDTO) {
	String[] header = { "STT","MÃ NCC","TÊN NCC", "ĐỊA CHỈ", "SỐ ĐT"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<NCC_DTO> arr = new ArrayList<NCC_DTO>();
	 NCC_BLL nccBLL = new NCC_BLL();
	 arr = nccBLL.searchNCCTen(nccDTO);
	 for (int i = 0; i < arr.size(); i++) {
		 nccDTO = arr.get(i);		 
		 String id = nccDTO.getMA_NCC();
		 String name = nccDTO.getTEN_NCC();	
                 String dchi = nccDTO.getD_CHI();
		 String sdt = nccDTO.getSDT();
		  Object[] row = {i+1, id, name,dchi,sdt};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Nhà cung cấp này không tồn tại.","Thông báo",0);
	 tbl5.setModel(dtm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btnEXp;
    private javax.swing.JButton btnImp;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl_NCC;
    private javax.swing.JPanel pn5;
    private javax.swing.JTable tbl5;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables
}
