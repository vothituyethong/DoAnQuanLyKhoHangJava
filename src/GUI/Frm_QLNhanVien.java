
package GUI;
import BLL.NhanVienBLL;
import DTO.NhanVienDTO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Frm_QLNhanVien extends javax.swing.JFrame {
    public String id;
    public Frm_QLNhanVien() {
        initComponents();
        addControl();
        addComboBoxDate();
        loadAll();
    }
    private void addControl()
    {
        Font ft=new Font("Times New Roman",Font.BOLD,24);
        lbl_NV.setFont(ft);
        pn3.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("Quản Lý Nhân Viên ");
        btn1.setBackground(Color.PINK);
        btn2.setBackground(Color.PINK);
        btn3.setBackground(Color.PINK);
        btn4.setBackground(Color.PINK);   
        btn5.setBackground(Color.PINK);
        btnExp.setBackground(Color.PINK);   
        btnImp.setBackground(Color.PINK);
        
        tf1.setText("Nhập mã n.viên");
        tf2.setText("Nhập tên n.viên");
        tf5.setText("Nhập địa chỉ");
        tf6.setText("Nhập sđt");
        tf7.setText("Nhập dữ liệu cần tìm");
        
        tf1.setForeground(Color.DARK_GRAY);
        tf2.setForeground(Color.DARK_GRAY);
        tf5.setForeground(Color.DARK_GRAY);
        tf6.setForeground(Color.DARK_GRAY);
        tf7.setForeground(Color.DARK_GRAY);
    }

    private void addComboBoxDate(){       
	 for (int i = 1980; i <=2002; i++) {		 
		 cb1.addItem(String.valueOf(i));		 
	 }
         for (int i = 1; i <=12; i++) {	
             if(i<10) cb2.addItem(String.valueOf("0"+i));
             else cb2.addItem(String.valueOf(i));
	 }         
         for (int i = 1; i <=31; i++) {		 
            if(i<10) cb3.addItem(String.valueOf("0"+i));
            else cb3.addItem(String.valueOf(i));	                 
	 }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pn3 = new javax.swing.JPanel();
        lbl_NV = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        tf7 = new javax.swing.JTextField();
        btn5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb4 = new javax.swing.JComboBox<>();
        cb5 = new javax.swing.JComboBox<>();
        btnExp = new javax.swing.JButton();
        btnImp = new javax.swing.JButton();

        lbl_NV.setText("QUẢN LÝ NHÂN VIÊN");

        lbl1.setText(" Mã Nhân Viên:");

        lbl2.setText(" Tên Nhân Viên:");

        lbl3.setText(" Ngày Sinh:");

        lbl4.setText(" Giới Tính:");

        lbl5.setText(" Địa Chỉ:");

        lbl6.setText(" Số Điện Thoại:");

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

        tf6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf6FocusLost(evt);
            }
        });
        tf6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf6MouseClicked(evt);
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

        btn3.setText("XÓA");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("XEM TẤT CẢ");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        tf7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf7MouseClicked(evt);
            }
        });
        tf7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf7KeyPressed(evt);
            }
        });

        btn5.setText("TÌM KIẾM");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ NHÂN VIÊN", "TÊN NHÂN VIÊN", "NGÀY SINH", "GIỚI TÍNH", "ĐỊA CHỈ", "SỐ ĐIỆN THOẠI"
            }
        ));
        tbl3.setRowHeight(20);
        tbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl3);

        buttonGroup1.add(rd1);
        rd1.setSelected(true);
        rd1.setText("Nam");

        buttonGroup1.add(rd2);
        rd2.setText("Nữ");

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Năm]" }));

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Tháng]" }));

        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Ngày]" }));

        jLabel2.setText("/");

        jLabel3.setText("/");

        jLabel4.setText(" Chức vụ:");

        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Chọn Chức vụ]", "Quản trị viên", "Quản lý", "Nhân viên xuất-nhập" }));

        cb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Nhân viên", "Tên Nhân viên" }));

        btnExp.setText("XUẤT FILE EXCEL");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnImp.setText("NHẬP FILE EXCEL");
        btnImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn3Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf6)
                                    .addComponent(cb4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pn3Layout.createSequentialGroup()
                                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pn3Layout.createSequentialGroup()
                                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(rd1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rd2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pn3Layout.createSequentialGroup()
                                                .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 510, Short.MAX_VALUE)
                        .addComponent(btnImp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(100, 100, 100))
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(121, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pn3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        loadAll();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        NhanVienDTO nvDTO=new NhanVienDTO();
        if(tf1.getText().equals("Nhập mã n.viên")||tf2.getText().equals("Nhập tên n.viên")||tf5.getText().equals("Nhập địa chỉ")||tf6.getText().equals("Nhập sđt")) 
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin Nhân viên cần thêm mới!","Thông báo",0);
        else{
            nvDTO.setMA_NV(tf1.getText());
            nvDTO.setTEN_NV(tf2.getText());
            if(cb1.getSelectedIndex()==0||cb2.getSelectedIndex()==0||cb3.getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Vui lòng chọn Ngày sinh!","Thông báo",0);
            else{
                int year=Integer.parseInt( (String)cb1.getSelectedItem());
                int month=Integer.parseInt( (String)cb2.getSelectedItem());
                int day=Integer.parseInt( (String)cb3.getSelectedItem());
                if(ktNgayHopLe(year,month,day)==0) JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ. Vui lòng kiểm tra lại!","Thông báo",0);
                else{
                    Date ngay=Date.valueOf(String.valueOf(year) +"-"+String.valueOf(month)+"-"+String.valueOf(day));                    
                    nvDTO.setNG_SINH(ngay);
                    if(rd1.isSelected()) nvDTO.setG_TINH("Nam");
                    else   nvDTO.setG_TINH("Nữ");
                    nvDTO.setD_CHI(tf5.getText());
                    
                    String pattern="^0\\d{9,10}$";
                    if(tf6.getText().matches(pattern )==false) JOptionPane.showMessageDialog(null, "SĐT phải bắt đầu bằng số 0, không được chứa các kí tự khác số và phải có từ 10 đến 11 chữ số!","Thông báo",0);
                    else{
                        nvDTO.setSDT(tf6.getText());
                        if(cb4.getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Vui lòng chọn Chức vụ!","Thông báo",0);
                        else{
                            nvDTO.setCHUC_VU((String)cb4.getSelectedItem());
                            NhanVienBLL nvBLL=new NhanVienBLL();
                            if (nvBLL.insertnvien(nvDTO)!=0) {
                                loadAll();
                                JOptionPane.showMessageDialog(null, "Thêm Nhân viên mới thành công!","Thông báo",1);
                                tf1.setText("");
                                tf2.setText("");
                                cb1.setSelectedIndex(0);
                                cb2.setSelectedIndex(0);
                                cb3.setSelectedIndex(0);
                                tf5.setText("");
                                tf6.setText("");
                                cb4.setSelectedIndex(0);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Thêm Nhân viên mới thất bại!","Thông báo",0);
                            }
                        }
                    }                   
                    
                }
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void tbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl3MouseClicked
        // TODO add your handling code here:
        int selectedIndex=tbl3.getSelectedRow();
                
        if(tbl3.getModel().getValueAt(selectedIndex,0)!=null&&tbl3.getModel().getValueAt(selectedIndex,1)!=null&&tbl3.getModel().getValueAt(selectedIndex,2)!=null&&tbl3.getModel().getValueAt(selectedIndex,3)!=null){        
        tf1.setText(tbl3.getModel().getValueAt(selectedIndex,1).toString());
        id=tbl3.getModel().getValueAt(selectedIndex,1).toString();
        tf2.setText(tbl3.getModel().getValueAt(selectedIndex,2).toString());
        String nam=tbl3.getModel().getValueAt(selectedIndex,3).toString().substring(0,4);
        String thang=tbl3.getModel().getValueAt(selectedIndex,3).toString().substring(5,7);
        String ngay=tbl3.getModel().getValueAt(selectedIndex,3).toString().substring(8,10);
        cb1.setSelectedItem(nam);
        cb2.setSelectedItem(thang);
        cb3.setSelectedItem(ngay);
        String gtinh=tbl3.getModel().getValueAt(selectedIndex,4).toString();
        if(gtinh.equals("Nam")) rd1.setSelected(true);
        else rd2.setSelected(true);
        tf5.setText(tbl3.getModel().getValueAt(selectedIndex,5).toString());
        tf6.setText(tbl3.getModel().getValueAt(selectedIndex,6).toString());
        String cvu=tbl3.getModel().getValueAt(selectedIndex,7).toString();
        cb4.setSelectedItem(cvu);
        }
    }//GEN-LAST:event_tbl3MouseClicked

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        NhanVienDTO nvDTO=new NhanVienDTO();
        nvDTO.setMA_NV(tf1.getText());
        if(tf1.getText().equals("Nhập mã n.viên")||tf1.getText()==null) 
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin Mã Nhân viên cần xóa!","Thông báo",0);
        else{
            NhanVienBLL nvBLL=new NhanVienBLL();
            int choice = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa dữ liệu?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION){
                if (nvBLL.deletetnvien(nvDTO)!=0) {
                    loadAll();                
                    JOptionPane.showMessageDialog(null, "Xoá thành công!","Thông báo",1);
                    tf1.setText("");
                    tf2.setText("");
                    cb1.setSelectedIndex(0);
                    cb2.setSelectedIndex(0);
                    cb3.setSelectedIndex(0);
                    tf5.setText("");
                    tf6.setText("");
                    cb4.setSelectedIndex(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Mã Nhân viên này không tồn tại!","Thông báo",0);
                }
            }
            
        } 
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        NhanVienDTO nvDTO=new NhanVienDTO();
        if(tf1.getText().equals("Nhập mã n.viên")||tf2.getText().equals("Nhập tên n.viên")||tf5.getText().equals("Nhập địa chỉ")||tf6.getText().equals("Nhập sđt")) 
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin Nhân viên cần sửa!","Thông báo",0);
        else{
            nvDTO.setMA_NV(tf1.getText());
            nvDTO.setTEN_NV(tf2.getText());
            if(cb1.getSelectedIndex()==0||cb2.getSelectedIndex()==0||cb3.getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Vui lòng chọn Ngày sinh!","Thông báo",0);
            else{
                int year=Integer.parseInt( (String)cb1.getSelectedItem());
                int month=Integer.parseInt( (String)cb2.getSelectedItem());
                int day=Integer.parseInt( (String)cb3.getSelectedItem());
                if(ktNgayHopLe(year,month,day)==0) JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ. Vui lòng kiểm tra lại!","Thông báo",0);
                else{
                    Date ngay=Date.valueOf(String.valueOf(year) +"-"+String.valueOf(month)+"-"+String.valueOf(day));                    
                    nvDTO.setNG_SINH(ngay);
                    if(rd1.isSelected()) nvDTO.setG_TINH("Nam");
                    else   nvDTO.setG_TINH("Nữ");
                    nvDTO.setD_CHI(tf5.getText());
                    //test số điện thoại
                    String pattern="^0\\d{9,10}$";
                    if(tf6.getText().matches(pattern )==false) JOptionPane.showMessageDialog(null, "SĐT phải bắt đầu bằng số 0, không được chứa các kí tự khác số và phải có từ 10 đến 11 chữ số!","Thông báo",0);
                    else{
                        nvDTO.setSDT(tf6.getText());
                        if(cb4.getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Vui lòng chọn Chức vụ!","Thông báo",0);
                        else{
                            nvDTO.setCHUC_VU((String)cb4.getSelectedItem());
                            NhanVienBLL nvBLL=new NhanVienBLL();
                            if (nvBLL.updatenvien(nvDTO,id)!=0) {
                                loadAll();
                                JOptionPane.showMessageDialog(null, "Sửa Nhân viên thành công!","Thông báo",1);
                                tf1.setText("");
                                tf2.setText("");
                                cb1.setSelectedIndex(0);
                                cb2.setSelectedIndex(0);
                                cb3.setSelectedIndex(0);
                                tf5.setText("");
                                tf6.setText("");
                                cb4.setSelectedIndex(0);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Sửa Nhân viên thất bại!","Thông báo",0);
                            }
                        }
                    }           
                    
                }
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        NhanVienDTO nvDTO=new NhanVienDTO();
        if(cb5.getSelectedIndex()==0){
            nvDTO.setMA_NV(tf7.getText());
            if(tf7.getText().equals("Nhập dữ liệu cần tìm")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập Mã Nhân viên cần tìm!","Thông báo",0);
            }
            else
                getNvMa(nvDTO);            
        }
        else{
            nvDTO.setTEN_NV(tf7.getText());
            if(tf7.getText().equals("Nhập dữ liệu cần tìm")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập Tên Nhân viên cần tìm!","Thông báo",0);
            }
            else
                getNvTen(nvDTO);
        }
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        // TODO add your handling code here:
        NhanVienBLL nvBLL=new NhanVienBLL();
        nvBLL.ExportExcel();
        JOptionPane.showMessageDialog(null,"Xuất file Excel thành công","Thông báo", 1);
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel", "xlsx");
        fc.setFileFilter(filter);
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile(); //Lấy URL
            NhanVienBLL nvBLL=new NhanVienBLL();
            nvBLL.ImportExcel(file);
            loadAll();
            JOptionPane.showMessageDialog(null, "Nhập file excel thành công!");
       }
    }//GEN-LAST:event_btnImpActionPerformed

    private void tf7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf7KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btn5.doClick();
        }
    }//GEN-LAST:event_tf7KeyPressed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            tf2.requestFocus();
        }
    }//GEN-LAST:event_tf1KeyPressed

    private void tf5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            tf6.requestFocus();
        }
    }//GEN-LAST:event_tf5KeyPressed

    private void tf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseClicked
        // TODO add your handling code here:
        if(tf1.getText().equals("Nhập mã n.viên")){
            tf1.setText("");
            tf1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf1MouseClicked

    private void tf2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf2MouseClicked
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập tên n.viên")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf2MouseClicked

    private void tf5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf5MouseClicked
        // TODO add your handling code here:
        if(tf5.getText().equals("Nhập địa chỉ")){
            tf5.setText("");
            tf5.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf5MouseClicked

    private void tf6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf6MouseClicked
        // TODO add your handling code here:
        if(tf6.getText().equals("Nhập sđt")){
            tf6.setText("");
            tf6.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf6MouseClicked

    private void tf7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf7MouseClicked
        // TODO add your handling code here:
        if(tf7.getText().equals("Nhập dữ liệu cần tìm")){
            tf7.setText("");
            tf7.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf7MouseClicked

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        // TODO add your handling code here:
        if(tf1.getText().equals("")){
            tf1.setText("Nhập mã n.viên");
            tf1.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf1FocusLost

    private void tf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusLost
        // TODO add your handling code here:
        if(tf2.getText().equals("")){
            tf2.setText("Nhập tên n.viên");
            tf2.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf2FocusLost

    private void tf5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf5FocusLost
        // TODO add your handling code here:
        if(tf5.getText().equals("")){
            tf5.setText("Nhập địa chỉ");
            tf5.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf5FocusLost

    private void tf6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf6FocusLost
        // TODO add your handling code here:
        if(tf6.getText().equals("")){
            tf6.setText("Nhập sđt");
            tf6.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf6FocusLost

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập tên n.viên")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf2FocusGained

    private void tf6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf6FocusGained
        // TODO add your handling code here:
        if(tf6.getText().equals("Nhập sđt")){
            tf6.setText("");
            tf6.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tf6FocusGained

    /**
     * @param args the command line arguments
     */
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
    
    public void loadAll() {
	String[] header = { "STT","MÃ NV","TÊN NV","NGÀY SINH","GIỚI TÍNH", "ĐỊA CHỈ", "SỐ ĐT","CHỨC VỤ"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<NhanVienDTO> arr = new ArrayList<NhanVienDTO>();
	 NhanVienBLL nvBLL = new NhanVienBLL();
	 arr = nvBLL.getAllNvien();
	 NhanVienDTO nvDTO = new NhanVienDTO();
	 for (int i = 0; i < arr.size(); i++) {
		 nvDTO = arr.get(i);		 
		 String id = nvDTO.getMA_NV();
		 String name = nvDTO.getTEN_NV();
                 Date date=nvDTO.getNG_SINH();
                 String sex=nvDTO.getG_TINH();
                 String dchi = nvDTO.getD_CHI();
		 String sdt = nvDTO.getSDT();
                 String cv=nvDTO.getCHUC_VU();
		  Object[] row = {i+1, id, name,date,sex,dchi,sdt,cv};
		 dtm.addRow(row);
	 }
	 tbl3.setModel(dtm);
    }
    
    public void getNvMa(NhanVienDTO nvDTO) {
	String[] header = { "STT","MÃ NV","TÊN NV","NGÀY SINH","GIỚI TÍNH", "ĐỊA CHỈ", "SỐ ĐT","CHỨC VỤ"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<NhanVienDTO> arr = new ArrayList<NhanVienDTO>();
	 NhanVienBLL nvBLL = new NhanVienBLL();
	 arr = nvBLL.searchNvienMa(nvDTO);	 
	 for (int i = 0; i < arr.size(); i++) {
		 nvDTO = arr.get(i);		 
		 String id = nvDTO.getMA_NV();
		 String name = nvDTO.getTEN_NV();
                 Date date=nvDTO.getNG_SINH();
                 String sex=nvDTO.getG_TINH();
                 String dchi = nvDTO.getD_CHI();
		 String sdt = nvDTO.getSDT();
		  String cv=nvDTO.getCHUC_VU();
		  Object[] row = {i+1, id, name,date,sex,dchi,sdt,cv};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Nhân viên này không tồn tại.","Thông báo",0);
	 tbl3.setModel(dtm);
    }
    public void getNvTen(NhanVienDTO nvDTO) {
	String[] header = { "STT","MÃ NV","TÊN NV","NGÀY SINH","GIỚI TÍNH", "ĐỊA CHỈ", "SỐ ĐT","CHỨC VỤ"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<NhanVienDTO> arr = new ArrayList<NhanVienDTO>();
	 NhanVienBLL nvBLL = new NhanVienBLL();
	 arr = nvBLL.searchNvienTen(nvDTO);	 
	 for (int i = 0; i < arr.size(); i++) {
		 nvDTO = arr.get(i);		 
		 String id = nvDTO.getMA_NV();
		 String name = nvDTO.getTEN_NV();
                 Date date=nvDTO.getNG_SINH();
                 String sex=nvDTO.getG_TINH();
                 String dchi = nvDTO.getD_CHI();
		 String sdt = nvDTO.getSDT();
		  String cv=nvDTO.getCHUC_VU();
		  Object[] row = {i+1, id, name,date,sex,dchi,sdt,cv};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Nhân viên này không tồn tại.","Thông báo",0);
	 tbl3.setModel(dtm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnImp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl_NV;
    private javax.swing.JPanel pn3;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JTable tbl3;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    // End of variables declaration//GEN-END:variables
}
