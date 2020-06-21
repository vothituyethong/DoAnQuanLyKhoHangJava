/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.ChiTietPX_BLL;
import BLL.KhachHangBLL;
import BLL.NhanVienBLL;
import BLL.PXuatBLL;
import DTO.ChiTietPX_DTO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import DTO.PXuatDTO;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class Frm_QLPhieuXuat extends javax.swing.JFrame {

    /**
     * Creates new form Frm_QLPhieuXuat
     */
    public Frm_QLPhieuXuat() {
        initComponents();
        addControl();
        addComboBoxDate();
        addComboBoxMaPN();
        addComboBoxKH();
        addComboBoxNV();
        loadAll();
    }
    
    private void addControl(){
        this.setLocationRelativeTo(null);
        panel.setBackground(Color.WHITE);
        btn1.setBackground(Color.PINK);
        btn2.setBackground(Color.PINK);
        btn3.setBackground(Color.PINK);
        btn4.setBackground(Color.PINK);
        btn5.setBackground(Color.PINK);
        btnReport.setBackground(Color.PINK);
    }
    private void addComboBoxDate(){       
	 for (int i = 2015; i <=2025; i++) {		 
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
    private void addComboBoxMaPN(){
        ArrayList<PXuatDTO> arr = new ArrayList<PXuatDTO>();
	 PXuatBLL pxBLL = new PXuatBLL();
	 arr = pxBLL.getAllPXuat();	 
	 PXuatDTO pxDTO = new PXuatDTO();
	 for (int i = 0; i < arr.size(); i++) {
		 pxDTO = arr.get(i);
		 cb6.addItem(pxDTO.getMA_PX());		 
	 }
    }
    private void addComboBoxKH(){
        ArrayList<KhachHangDTO> arr = new ArrayList<KhachHangDTO>();
	 KhachHangBLL khBLL = new KhachHangBLL();
	 arr = khBLL.getAllK_Hang();	 
	 KhachHangDTO khDTO = new KhachHangDTO();
	 for (int i = 0; i < arr.size(); i++) {
		 khDTO = arr.get(i);
		 cb5.addItem(khDTO.getMA_KH()+"-"+khDTO.getTEN_KH());		 
	 }
    }
    private void addComboBoxNV(){
        ArrayList<NhanVienDTO> arr = new ArrayList<NhanVienDTO>();
	 NhanVienBLL nvBLL = new NhanVienBLL();
	 arr = nvBLL.getAllNvien();	 
	 NhanVienDTO nvDTO = new NhanVienDTO();
	 for (int i = 0; i < arr.size(); i++) {
		 nvDTO = arr.get(i);
		 cb4.addItem(nvDTO.getMA_NV()+"-"+nvDTO.getTEN_NV());		 
	 }
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMaPX = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox<>();
        cb4 = new javax.swing.JComboBox<>();
        cb5 = new javax.swing.JComboBox<>();
        lblTien = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cb6 = new javax.swing.JComboBox<>();
        btn5 = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ PHIẾU XUẤT HÀNG");

        tb1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MÃ PX", "NGÀY XUẤT", "NHÂN VIÊN", "TÊN KHÁCH HÀNG", "TỔNG TIỀN"
            }
        ));
        tb1.setPreferredSize(new java.awt.Dimension(450, 198));
        tb1.setRowHeight(18);
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);

        jLabel2.setText("MÃ PHIẾU:");

        jLabel3.setText("NGÀY XUẤT HÀNG:");

        jLabel4.setText("NHÂN VIÊN:");

        jLabel5.setText("KHÁCH HÀNG:");

        jLabel6.setText("TỔNG TIỀN:");

        lblMaPX.setText("    ");

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[năm]" }));

        jLabel7.setText(" /");

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[tháng]" }));

        jLabel8.setText(" /");

        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[ngày]" }));

        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Chọn Nhân viên]" }));

        cb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Chọn Khách hàng]" }));

        lblTien.setText("   0");

        btn1.setText("XÓA");
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

        btn3.setText("HIỂN THỊ TẤT CẢ");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("XEM CHI TIẾT");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        jLabel9.setText("MÃ PHIẾU:");

        cb6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Chọn Mã phiếu]" }));
        cb6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb6ItemStateChanged(evt);
            }
        });

        btn5.setText("TÌM");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btnReport.setText("IN PHIẾU");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMaPX, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTien, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cb6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(379, 379, 379))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaPX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        PXuatDTO pxDTO=new PXuatDTO();
        pxDTO.setMA_PX(lblMaPX.getText());
        if(lblMaPX.getText().equals("")||lblMaPX.getText()==null) 
            JOptionPane.showMessageDialog(null, "Vui lòng nhập chọn Phiếu xuất cần xóa!","Thông báo",0);
        else{
            PXuatBLL pxBLL=new PXuatBLL();
            ChiTietPX_DTO ctpxDTO=new ChiTietPX_DTO();
            ctpxDTO.setMA_PX(lblMaPX.getText());
            ChiTietPX_BLL ctpxBLL=new ChiTietPX_BLL();            
            int choice = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa dữ liệu?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION){
                if (pxBLL.deletetPXuat(pxDTO)!=0 && ctpxBLL.deleteAllCtietPX(ctpxDTO)!=0) {
                    loadAll();                    
                    JOptionPane.showMessageDialog(null, "Xoá thành công!","Thông báo",1);
                    lblMaPX.setText("");
                    cb1.setSelectedIndex(0);
                    cb2.setSelectedIndex(0);
                    cb3.setSelectedIndex(0);
                    cb4.setSelectedIndex(0);
                    cb5.setSelectedIndex(0);
                    lblTien.setText("0");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Phiếu xuất hàng này không tồn tại!","Thông báo",0);
                }
            }
            
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        // TODO add your handling code here:
        int selectedIndex=tb1.getSelectedRow();
                
        if(tb1.getModel().getValueAt(selectedIndex,0)!=null&&tb1.getModel().getValueAt(selectedIndex,1)!=null&&tb1.getModel().getValueAt(selectedIndex,2)!=null&&tb1.getModel().getValueAt(selectedIndex,3)!=null){
            
            lblMaPX.setText(tb1.getModel().getValueAt(selectedIndex,1).toString());
            
            String nam=tb1.getModel().getValueAt(selectedIndex,2).toString().substring(0,4);
            String thang=tb1.getModel().getValueAt(selectedIndex,2).toString().substring(5,7);
            String ngay=tb1.getModel().getValueAt(selectedIndex,2).toString().substring(8,10);
            cb1.setSelectedItem(nam);
            cb2.setSelectedItem(thang);
            cb3.setSelectedItem(ngay);
            
            NhanVienDTO nvDTO=new NhanVienDTO();
            nvDTO.setTEN_NV(tb1.getModel().getValueAt(selectedIndex,3).toString());
            NhanVienBLL nvBLL=new NhanVienBLL();
            cb4.setSelectedItem(nvBLL.getMaNV(nvDTO)+"-"+nvDTO.getTEN_NV());
            
            KhachHangDTO khDTO=new KhachHangDTO();
            khDTO.setTEN_KH(tb1.getModel().getValueAt(selectedIndex,4).toString());
            KhachHangBLL khBLL=new KhachHangBLL();
            cb5.setSelectedItem(khBLL.getMaKH(khDTO)+"-"+khDTO.getTEN_KH());
            
            lblTien.setText(tb1.getModel().getValueAt(selectedIndex,5).toString());
        }
    }//GEN-LAST:event_tb1MouseClicked

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if(cb6.getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Vui lòng chọn Mã phiếu nhập cần tìm!","Thông báo",0);
        else{
            PXuatDTO pxDTO=new PXuatDTO();
            pxDTO.setMA_PX(cb6.getSelectedItem().toString());
            getPX(pxDTO);
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        loadAll();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        PXuatDTO pxDTO=new PXuatDTO();
        pxDTO.setMA_PX(lblMaPX.getText());
        if(cb1.getSelectedIndex()==0||cb2.getSelectedIndex()==0||cb3.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(null,"Vui lòng chọn Ngày xuất hàng","Thông báo",0);
        else{
            int year=Integer.parseInt( (String)cb1.getSelectedItem());
            int month=Integer.parseInt( (String)cb2.getSelectedItem());
            int day=Integer.parseInt( (String)cb3.getSelectedItem());
            if(ktNgayHopLe(year,month,day)==0) JOptionPane.showMessageDialog(null, "Ngày xuất hàng không hợp lệ. Vui lòng kiểm tra lại!","Thông báo",0);
            else{
                Date ngay=Date.valueOf(String.valueOf(year) +"-"+String.valueOf(month)+"-"+String.valueOf(day));
                pxDTO.setNGAY_LAP(ngay);
                if(cb4.getSelectedIndex()==0)
                    JOptionPane.showMessageDialog(null,"Vui lòng chọn Nhân viên thực hiện","Thông báo",0);
                else{
                    String value1=(String) cb4.getSelectedItem();
                    String maNV=""; 
                    for(int i=0;i<value1.length();i++){
                        if(value1.charAt(i)!='-') maNV+=value1.charAt(i);
                        else break;
                    }
                    pxDTO.setMA_NV(maNV);
                    if(cb5.getSelectedIndex()==0)
                        JOptionPane.showMessageDialog(null,"Vui lòng chọn Khách hàng","Thông báo",0);
                    else{
                        String value2=(String) cb5.getSelectedItem();
                        String maKH=""; 
                        for(int i=0;i<value2.length();i++){
                            if(value2.charAt(i)!='-') maKH+=value2.charAt(i);
                            else break;
                        }
                        pxDTO.setMA_KH(maKH);
                        pxDTO.setTONG_TIEN(Integer.parseInt(lblTien.getText()));
                        PXuatBLL pxBLL=new PXuatBLL();                       
                        if(pxBLL.updatePXuat(pxDTO)==0) 
                            JOptionPane.showMessageDialog(null,"Sửa Phiếu xuất thất bại!","Thông báo",0);
                        else {
                            JOptionPane.showMessageDialog(null,"Sửa Phiếu xuất thành công!","Thông báo",1);
                            loadAll();
                            lblMaPX.setText("");
                            cb1.setSelectedIndex(0);
                            cb2.setSelectedIndex(0);
                            cb3.setSelectedIndex(0);
                            cb4.setSelectedIndex(0);
                            cb5.setSelectedIndex(0);
                            lblTien.setText("0");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if(this.lblMaPX.getText().equals(" ")) JOptionPane.showMessageDialog(null,"Vui lòng chọn Phiếu xuất cần tra cứu chi tiết!","Thông báo",0);
        else {
            Frm_ChiTietPhieu ctpx=new Frm_ChiTietPhieu();
            ctpx.setVisible(true);
            ctpx.lblCTPX.setVisible(false);
            ctpx.btn1CTPN.setVisible(false);
            ctpx.btn2CTPN.setVisible(false);
            ctpx.QLPX=this;
            ctpx.lblMaPhieu.setText(lblMaPX.getText());           
            ChiTietPX_DTO ctpxDTO=new ChiTietPX_DTO();            
            ctpxDTO.setMA_PX(ctpx.lblMaPhieu.getText());
            ctpx.getCTPX(ctpxDTO);
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        PXuatDTO pxDTO=new PXuatDTO();        
        PXuatBLL pxBLL=new PXuatBLL();        
        if(lblMaPX.getText().equals(" ")) JOptionPane.showMessageDialog(null,"Vui lòng chọn phiếu trước khi in!","Thông báo",0);
        else{
            pxDTO.setMA_PX(lblMaPX.getText());            
            pxBLL.XuatPX(pxDTO);
        }
    }//GEN-LAST:event_btnReportActionPerformed

    private void cb6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb6ItemStateChanged
        // TODO add your handling code here:
        btn5.doClick();
    }//GEN-LAST:event_cb6ItemStateChanged

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
	String[] header = { "STT","MÃ PN","NGÀY XUẤT","NHÂN VIÊN","KHÁCH HÀNG", "TỔNG TIỀN"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<PXuatDTO> arr = new ArrayList<PXuatDTO>();
	 PXuatBLL pxBLL = new PXuatBLL();
	 arr = pxBLL.getAllPXuat();
	 PXuatDTO pxDTO = new PXuatDTO();
	 for (int i = 0; i < arr.size(); i++) {
		 pxDTO = arr.get(i);		 
		 String id = pxDTO.getMA_PX();	
                 
                 Date date=pxDTO.getNGAY_LAP();
                 
                 NhanVienDTO nvDTO=new NhanVienDTO();
                 nvDTO.setMA_NV(pxDTO.getMA_NV());
                 NhanVienBLL nvBLL=new NhanVienBLL();
                 String nv=nvBLL.getTenNV(nvDTO);    
                 
                 KhachHangDTO khDTO=new KhachHangDTO();
                 khDTO.setMA_KH(pxDTO.getMA_KH());
                 KhachHangBLL khBLL=new KhachHangBLL();
                 String kh=khBLL.getTenKH(khDTO);
                 
                 int tien=pxDTO.getTONG_TIEN();
                 
		  Object[] row = {i+1, id, date,nv,kh,tien};
		 dtm.addRow(row);
	 }
	 tb1.setModel(dtm);
    }
    public void getPX(PXuatDTO pxDTO) {
	String[] header = { "STT","MÃ PN","NGÀY XUẤT","NHÂN VIÊN","KHÁCH HÀNG", "TỔNG TIỀN"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<PXuatDTO> arr = new ArrayList<PXuatDTO>();
	 PXuatBLL pxBLL = new PXuatBLL();
	 arr = pxBLL.searchPXuat(pxDTO);
	 for (int i = 0; i < arr.size(); i++) {
		 pxDTO = arr.get(i);		 
		 String id = pxDTO.getMA_PX();	
                 
                 Date date=pxDTO.getNGAY_LAP();
                 
                 NhanVienDTO nvDTO=new NhanVienDTO();
                 nvDTO.setMA_NV(pxDTO.getMA_NV());
                 NhanVienBLL nvBLL=new NhanVienBLL();
                 String nv=nvBLL.getTenNV(nvDTO);    
                 
                 KhachHangDTO khDTO=new KhachHangDTO();
                 khDTO.setMA_KH(pxDTO.getMA_KH());
                 KhachHangBLL khBLL=new KhachHangBLL();
                 String kh=khBLL.getTenKH(khDTO);
                 
                 int tien=pxDTO.getTONG_TIEN();
                 
		  Object[] row = {i+1, id, date,nv,kh,tien};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Phiếu nhập hàng này không tồn tại!","Thông báo",0);
	 tb1.setModel(dtm);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btnReport;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private javax.swing.JComboBox<String> cb6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaPX;
    private javax.swing.JLabel lblTien;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
