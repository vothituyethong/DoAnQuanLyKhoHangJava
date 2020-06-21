
package GUI;

import BLL.ChiTietPN_BLL;
import BLL.ChiTietPX_BLL;
import BLL.HangHoaBLL;
import BLL.PNhapBLL;
import BLL.PXuatBLL;
import DTO.ChiTietPN_DTO;
import DTO.ChiTietPX_DTO;
import DTO.HangHoaDTO;
import DTO.PNhapDTO;
import DTO.PXuatDTO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frm_ChiTietPhieu extends javax.swing.JFrame {

   
    Frm_QLPhieuNhap QLPN;
    Frm_QLPhieuXuat QLPX;
    String MaPhieu_cu=null;
    int SL_cu=0;
    
    public Frm_ChiTietPhieu() {
        initComponents();        
        addControl();
        
    }

    private void addControl(){
        this.setLocationRelativeTo(null);
        panel.setBackground(Color.WHITE);
        btn1CTPN.setBackground(Color.PINK);
        btn2CTPN.setBackground(Color.PINK);
        btn1CTPX.setBackground(Color.PINK);
        btn2CTPX.setBackground(Color.PINK);
        tf1.setText("Nhập Mã hàng");
        tf2.setText("Nhập số lượng");
        tf1.setForeground(Color.DARK_GRAY);
        tf2.setForeground(Color.DARK_GRAY);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblCTPN = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        btn1CTPN = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblMaPhieu = new javax.swing.JLabel();
        btn2CTPN = new javax.swing.JButton();
        lblCTPX = new javax.swing.JLabel();
        btn1CTPX = new javax.swing.JButton();
        btn2CTPX = new javax.swing.JButton();

        lblCTPN.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblCTPN.setText("CHI TIẾT PHIẾU NHẬP");

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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MÃ HÀNG", "TÊN HÀNG", "ĐƠN GIÁ", "SỐ LƯỢNG", "THÀNH TIỀN"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);

        jLabel2.setText("MÃ HÀNG:");

        jLabel3.setText("SỐ LƯỢNG:");

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

        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf2FocusLost(evt);
            }
        });
        tf2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf2MouseClicked(evt);
            }
        });

        btn1CTPN.setText("SỬA");
        btn1CTPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1CTPNActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setText(".");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel4.setText("MÃ PHIẾU:");

        btn2CTPN.setText("XÓA");
        btn2CTPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2CTPNActionPerformed(evt);
            }
        });

        lblCTPX.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblCTPX.setText("CHI TIẾT PHIẾU XUẤT");

        btn1CTPX.setText("SỬA");
        btn1CTPX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1CTPXActionPerformed(evt);
            }
        });

        btn2CTPX.setText("XÓA");
        btn2CTPX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2CTPXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(btn1CTPX)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn2CTPX))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(btn1CTPN)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn2CTPN))
                                .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(479, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCTPX)
                    .addComponent(lblCTPN))
                .addGap(403, 403, 403))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblCTPN)
                .addGap(1, 1, 1)
                .addComponent(lblCTPX)
                .addGap(50, 50, 50)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1CTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2CTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1CTPX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2CTPX, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Frm_ThemHang addItem=new Frm_ThemHang();
        addItem.setVisible(true);
        addItem.CTP=this;
        addItem.btn3.setVisible(false);
        addItem.btn2.setVisible(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        // TODO add your handling code here:
        int selectedIndex=tb1.getSelectedRow();
        if(tb1.getModel().getValueAt(selectedIndex,0)!=null&&tb1.getModel().getValueAt(selectedIndex,1)!=null&&tb1.getModel().getValueAt(selectedIndex,2)!=null&&tb1.getModel().getValueAt(selectedIndex,3)!=null){
            
            tf1.setText(tb1.getModel().getValueAt(selectedIndex,1).toString());
            tf2.setText(tb1.getModel().getValueAt(selectedIndex,4).toString());
            MaPhieu_cu=tb1.getModel().getValueAt(selectedIndex,1).toString();
            SL_cu=Integer.parseInt(tb1.getModel().getValueAt(selectedIndex,4).toString());
        }
        
    }//GEN-LAST:event_tb1MouseClicked

    private void btn1CTPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1CTPNActionPerformed
        // TODO add your handling code here:
        
        ChiTietPN_DTO ctpnDTO=new ChiTietPN_DTO();
        ctpnDTO.setMA_PN(lblMaPhieu.getText());
        ctpnDTO.setMA_HANG(tf1.getText());        
        String pattern="\\d{1,}";
        if(tf2.getText().matches(pattern )==false) JOptionPane.showMessageDialog(null, "Số lượng phải là số nguyên dương!","Thông báo",0);                
        else{
            int SL_moi=Integer.parseInt(tf2.getText());
            ctpnDTO.setSO_LUONG(Integer.parseInt(tf2.getText()));
            if(tf1.getText().equals("Nhập Mã hàng")||tf2.getText().equals("Nhập số lượng")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin Mã hàng và Số lượng cần sửa!","Thông báo",0);
            }
            else{
                ChiTietPN_BLL ctpnBLL=new ChiTietPN_BLL();
                if (ctpnBLL.updateCtietPN(ctpnDTO,MaPhieu_cu)!=0) {
                    getCTPN(ctpnDTO);
                    //trường hợp giữ nguyên mã hàng, thay đổi số lượng                
                    if(tf1.getText().equals(MaPhieu_cu)){                    
                            HangHoaDTO hangDTO=new HangHoaDTO();
                            hangDTO.setMA_HANG(tf1.getText());
                            HangHoaBLL hangBLL=new HangHoaBLL();
                            if(hangBLL.updateSL(hangDTO, SL_moi-SL_cu)==0) 
                                JOptionPane.showMessageDialog(null, "Cập nhật số lượng hàng còn lại thất bại!","Thông báo",0);
                            else JOptionPane.showMessageDialog(null, "Cập nhật số lượng hàng còn lại thành công!","Thông báo",1);
                    }
                    //trường hợp thay đổi mặt hàng mới
                    else{
                        HangHoaDTO hang_cuDTO=new HangHoaDTO();
                        hang_cuDTO.setMA_HANG(MaPhieu_cu);
                        HangHoaBLL hang_cuBLL=new HangHoaBLL();                       
                        
                        HangHoaDTO hang_moiDTO=new HangHoaDTO();
                        hang_moiDTO.setMA_HANG(tf1.getText());
                        HangHoaBLL hang_moiBLL=new HangHoaBLL();
                        if(hang_cuBLL.updateSL(hang_cuDTO,-SL_cu)==0||hang_moiBLL.updateSL(hang_moiDTO, SL_moi)==0) 
                            JOptionPane.showMessageDialog(null, "Cập nhật số lượng hàng còn lại thất bại!","Thông báo",0);
                        else JOptionPane.showMessageDialog(null, "Cập nhật số lượng hàng còn lại thành công!","Thông báo",1);
                    }
                    JOptionPane.showMessageDialog(null, "Sửa chi tiết phiếu nhập thành công!","Thông báo",1);
                    tf1.setText("");
                    tf2.setText("");
                    PNhapDTO pnDTO=new PNhapDTO();
                    pnDTO.setMA_PN(lblMaPhieu.getText());
                    PNhapBLL pnBLL=new PNhapBLL();
                    pnBLL.updateTTien(pnDTO);
                    QLPN.loadAll();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Sửa chi tiết phiếu nhập thất bại!","Thông báo",0);
                }          
            }
        }
        
    }//GEN-LAST:event_btn1CTPNActionPerformed

    private void btn2CTPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2CTPNActionPerformed
        // TODO add your handling code here:
        ChiTietPN_DTO ctpnDTO=new ChiTietPN_DTO();
        ctpnDTO.setMA_PN(lblMaPhieu.getText());
        ctpnDTO.setMA_HANG(tf1.getText());
        if(tf1.getText().equals("Nhập Mã hàng")) 
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin mã hàng cần xóa!","Thông báo",0);
        else{
            ChiTietPN_BLL ctpnBLL=new ChiTietPN_BLL();
            int choice = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa dữ liệu?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION){
                if (ctpnBLL.deleteCtietPN(ctpnDTO)!=0) {
                    getCTPN(ctpnDTO);
                    HangHoaDTO hangDTO=new HangHoaDTO();
                    hangDTO.setMA_HANG(tf1.getText());
                    int num=Integer.parseInt(tf2.getText());
                    HangHoaBLL hangBLL=new HangHoaBLL();
                    hangBLL.updateSL(hangDTO, num);
                    JOptionPane.showMessageDialog(null, "Xoá thành công!","Thông báo",1);
                    PNhapDTO pnDTO=new PNhapDTO();
                    pnDTO.setMA_PN(lblMaPhieu.getText());
                    PNhapBLL pnBLL=new PNhapBLL();
                    pnBLL.updateTTien(pnDTO);
                    QLPN.loadAll();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Mã hàng này không tồn tại!","Thông báo",0);
                }
            }
            
        } 
    }//GEN-LAST:event_btn2CTPNActionPerformed

    private void btn1CTPXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1CTPXActionPerformed
        // TODO add your handling code here:
        ChiTietPX_DTO ctpxDTO=new ChiTietPX_DTO();
        ctpxDTO.setMA_PX(lblMaPhieu.getText());
        ctpxDTO.setMA_HANG(tf1.getText());        
        String pattern="\\d{1,}";
        if(tf2.getText().matches(pattern )==false) JOptionPane.showMessageDialog(null, "Số lượng phải là số nguyên dương!","Thông báo",0);                
        else{
            int SL_moi=Integer.parseInt(tf2.getText());
            ctpxDTO.setSO_LUONG(Integer.parseInt(tf2.getText()));
            if(tf1.getText().equals("Nhập Mã hàng")||tf2.getText().equals("Nhập số lượng")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin Mã hàng và Số lượng cần sửa!","Thông báo",0);
            }
            else{
                ChiTietPX_BLL ctpxBLL=new ChiTietPX_BLL();
                if (ctpxBLL.updateCtietPX(ctpxDTO,MaPhieu_cu)!=0) {
                    getCTPX(ctpxDTO);
                    //trường hợp giữ nguyên mã hàng, thay đổi số lượng                
                    if(tf1.getText().equals(MaPhieu_cu)){                    
                            HangHoaDTO hangDTO=new HangHoaDTO();
                            hangDTO.setMA_HANG(tf1.getText());
                            HangHoaBLL hangBLL=new HangHoaBLL();
                            if(hangBLL.updateSL(hangDTO, SL_cu-SL_moi)==0) 
                                JOptionPane.showMessageDialog(null, "Cập nhật số lượng hàng còn lại thất bại!","Thông báo",0);
                            else JOptionPane.showMessageDialog(null, "Cập nhật số lượng hàng còn lại thành công!","Thông báo",1);
                            
                    }
                    //trường hợp thay đổi mặt hàng mới
                    else{
                        HangHoaDTO hang_cuDTO=new HangHoaDTO();
                        hang_cuDTO.setMA_HANG(MaPhieu_cu);
                        HangHoaBLL hang_cuBLL=new HangHoaBLL();                       
                        
                        HangHoaDTO hang_moiDTO=new HangHoaDTO();
                        hang_moiDTO.setMA_HANG(tf1.getText());
                        HangHoaBLL hang_moiBLL=new HangHoaBLL();
                        if(hang_cuBLL.updateSL(hang_cuDTO,SL_cu)==0||hang_moiBLL.updateSL(hang_moiDTO, -SL_moi)==0) 
                            JOptionPane.showMessageDialog(null, "Cập nhật số lượng hàng còn lại thất bại!","Thông báo",0);
                        else JOptionPane.showMessageDialog(null, "Cập nhật số lượng hàng còn lại thành công!","Thông báo",1);
                    }
                    JOptionPane.showMessageDialog(null, "Sửa chi tiết phiếu xuất thành công!","Thông báo",1);
                    tf1.setText("");
                    tf2.setText("");
                    PXuatDTO pxDTO=new PXuatDTO();
                    pxDTO.setMA_PX(lblMaPhieu.getText());
                    PXuatBLL pxBLL=new PXuatBLL();
                    pxBLL.updateTTien(pxDTO);
                    QLPX.loadAll();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Sửa chi tiết phiếu xuất thất bại!","Thông báo",0);
                }          
            }
        }
    }//GEN-LAST:event_btn1CTPXActionPerformed

    private void btn2CTPXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2CTPXActionPerformed
        // TODO add your handling code here:
        ChiTietPX_DTO ctpxDTO=new ChiTietPX_DTO();
        ctpxDTO.setMA_PX(lblMaPhieu.getText());
        ctpxDTO.setMA_HANG(tf1.getText());
        if(tf1.getText().equals("Nhập Mã hàng")||tf1.getText()==null) 
            JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin mã hàng cần xóa!","Thông báo",0);
        else{
            ChiTietPX_BLL ctpxBLL=new ChiTietPX_BLL();
            int choice = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa dữ liệu?", "Xác nhận",JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION){
                if (ctpxBLL.deleteCtietPX(ctpxDTO)!=0) {
                    getCTPX(ctpxDTO);
                    HangHoaDTO hangDTO=new HangHoaDTO();
                    hangDTO.setMA_HANG(tf1.getText());
                    int num=Integer.parseInt(tf2.getText());
                    HangHoaBLL hangBLL=new HangHoaBLL();
                    hangBLL.updateSL(hangDTO, -num);
                    JOptionPane.showMessageDialog(null, "Xoá thành công!","Thông báo",1);
                    tf1.setText("");
                    tf2.setText("");
                    PXuatDTO pxDTO=new PXuatDTO();
                    pxDTO.setMA_PX(lblMaPhieu.getText());
                    PXuatBLL pxBLL=new PXuatBLL();
                    pxBLL.updateTTien(pxDTO);
                    QLPX.loadAll();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Mã hàng này không tồn tại!","Thông báo",0);
                }
            }            
        } 
    }//GEN-LAST:event_btn2CTPXActionPerformed

    private void tf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf1MouseClicked
        // TODO add your handling code here:
        if(tf1.getText().equals("Nhập Mã hàng")){
            tf1.setText("");
            tf1.setForeground(Color.BLACK);
        }
            
    }//GEN-LAST:event_tf1MouseClicked

    private void tf2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf2MouseClicked
        // TODO add your handling code here:
        if(tf2.getText().equals("Nhập số lượng")){
            tf2.setText("");
            tf2.setForeground(Color.BLACK);
        }
            
    }//GEN-LAST:event_tf2MouseClicked

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        // TODO add your handling code here:
        if(tf1.getText().equals("")){
            tf1.setText("Nhập Mã hàng");
            tf1.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf1FocusLost

    private void tf2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusLost
        // TODO add your handling code here:
        if(tf2.getText().equals("")){
            tf2.setText("Nhập số lượng");
            tf2.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_tf2FocusLost

    /**
     * @param args the command line arguments
     */
   public void getCTPN(ChiTietPN_DTO ctpnDTO) {
	String[] header = { "STT","MÃ HÀNG","TÊN HÀNG","ĐƠN GIÁ","SỐ LƯỢNG","THÀNH TIỀN"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<ChiTietPN_DTO> arr = new ArrayList<ChiTietPN_DTO>();
	 ChiTietPN_BLL ctpnBLL = new ChiTietPN_BLL();
	 arr = ctpnBLL.searchCtietPN(ctpnDTO);	         
	 for (int i = 0; i < arr.size(); i++) {
		 ctpnDTO = arr.get(i);		 
		 String id = ctpnDTO.getMA_HANG();
                 HangHoaDTO hangDTO=new HangHoaDTO();
                 hangDTO.setMA_HANG(id);
                 HangHoaBLL hangBLL=new HangHoaBLL();
		 String name = hangBLL.getTenHang(hangDTO);
                 int price=hangBLL.getGia(hangDTO);
                 int num=ctpnDTO.getSO_LUONG();
                 int ttien=price*num;
		  Object[] row = { i+1,id, name,price,num,ttien};
		 dtm.addRow(row);
	 }
	 tb1.setModel(dtm);
    }
   public void getCTPX(ChiTietPX_DTO ctpxDTO) {
	String[] header = { "STT","MÃ HÀNG","TÊN HÀNG","ĐƠN GIÁ","SỐ LƯỢNG","THÀNH TIỀN"};
	DefaultTableModel dtm = new DefaultTableModel(header, 0);	 
	ArrayList<ChiTietPX_DTO> arr = new ArrayList<ChiTietPX_DTO>();
	 ChiTietPX_BLL ctpxBLL = new ChiTietPX_BLL();
	 arr = ctpxBLL.searchCtietPX(ctpxDTO);	         
	 for (int i = 0; i < arr.size(); i++) {
		 ctpxDTO = arr.get(i);		 
		 String id = ctpxDTO.getMA_HANG();
                 HangHoaDTO hangDTO=new HangHoaDTO();
                 hangDTO.setMA_HANG(id);
                 HangHoaBLL hangBLL=new HangHoaBLL();
		 String name = hangBLL.getTenHang(hangDTO);
                 int price=hangBLL.getGia(hangDTO);
                 int num=ctpxDTO.getSO_LUONG();
                 int ttien=price*num;
		  Object[] row = { i+1,id, name,price,num,ttien};
		 dtm.addRow(row);
	 }
	 tb1.setModel(dtm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn1CTPN;
    public javax.swing.JButton btn1CTPX;
    public javax.swing.JButton btn2CTPN;
    public javax.swing.JButton btn2CTPX;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblCTPN;
    public javax.swing.JLabel lblCTPX;
    public javax.swing.JLabel lblMaPhieu;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tb1;
    public javax.swing.JTextField tf1;
    public javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
