
package GUI;

import BLL.HangHoaBLL;
import BLL.LoaiHangBLL;
import DTO.HangHoaDTO;
import DTO.LoaiHangDTO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Frm_KiemKe extends javax.swing.JFrame {

   
    public Frm_KiemKe() {
        initComponents();
        addControl();
        //addComboBox();
    }
    
    private void addControl(){
        Font ft=new Font("Times New Roman",Font.BOLD,24);
        lbl1.setFont(ft);
        panel.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        this.setTitle("Kiểm kê");
        btnkiemke.setBackground(Color.PINK);
        lbl3.setIcon(createIcon("/resources/kiemke.png"));
        txtmasp.setText("Nhập dữ liệu cần kiểm kê");
        txtmasp.setForeground(Color.DARK_GRAY);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        txtmasp = new javax.swing.JTextField();
        btnkiemke = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl3 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl1.setText("KIỂM KÊ");

        txtmasp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmaspFocusLost(evt);
            }
        });
        txtmasp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmaspMouseClicked(evt);
            }
        });
        txtmasp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmaspKeyPressed(evt);
            }
        });

        btnkiemke.setText("KIỂM KÊ");
        btnkiemke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkiemkeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ SẢN PHẨM", "TÊN SẢN PHẨM", "SỐ LƯỢNG", "GIÁ", "TÊN LOẠI HÀNG"
            }
        ));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sản phẩm", "Tên sản phẩm" }));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(502, 502, 502)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnkiemke, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btnkiemke, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkiemkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkiemkeActionPerformed
        // TODO add your handling code here:
        HangHoaDTO hangDTO=new HangHoaDTO();
        if(cb1.getSelectedIndex()==0){
            hangDTO.setMA_HANG(txtmasp.getText());
            if(txtmasp.getText().equals("Nhập dữ liệu cần kiểm kê")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập Mã sản phẩm cần kiểm kê!","Thông báo",0);
            }
            else       
                getHangMa(hangDTO);
        }
        else{
            hangDTO.setTEN_HANG(txtmasp.getText());
            if(txtmasp.getText().equals("Nhập dữ liệu cần kiểm kê")){
                JOptionPane.showMessageDialog(null, "Vui lòng nhập Tên sản phẩm cần kiểm kê!","Thông báo",0);
            }
            else       
                getHangTen(hangDTO);
        }
    }//GEN-LAST:event_btnkiemkeActionPerformed

    private void txtmaspKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmaspKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
            btnkiemke.doClick();
        }
    }//GEN-LAST:event_txtmaspKeyPressed

    private void txtmaspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmaspMouseClicked
        // TODO add your handling code here:
        if(txtmasp.getText().equals("Nhập dữ liệu cần kiểm kê")){
            txtmasp.setText("");
            txtmasp.setForeground(Color.BLACK);
        }
            
    }//GEN-LAST:event_txtmaspMouseClicked

    private void txtmaspFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmaspFocusLost
        // TODO add your handling code here:
        if(txtmasp.getText().equals("")){
            txtmasp.setText("Nhập dữ liệu cần kiểm kê");
            txtmasp.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_txtmaspFocusLost

    /**
     * @param args the command line arguments
     */
     private static ImageIcon createIcon(String path){
        java.net.URL iconURL=Frm_KiemKe.class.getResource(path);
        if(iconURL!=null){
            return new ImageIcon(iconURL);
        }
        else{
            System.out.println("Không tìm thấy icon.");
            return null;
        }
    }
     public void getHangMa(HangHoaDTO hangDTO) {
	 String[] header = { "Mã sản phẩm","Tên sản phẩm", "Số lượng","Giá","Loại hàng"};
	 DefaultTableModel dtm = new DefaultTableModel(header, 0);
	 //lấy danh sách UserDTO (gọi hàm getAllUsers() trong UserBUS)
	 ArrayList<HangHoaDTO> arr = new ArrayList<HangHoaDTO>();
	 HangHoaBLL hangBLL = new HangHoaBLL();         
	 arr = hangBLL.searchHangMa(hangDTO);
	 for (int i = 0; i < arr.size(); i++) {
		 hangDTO = arr.get(i);
		 String id = hangDTO.getMA_HANG();
		 String name = hangDTO.getTEN_HANG();		 
		 int num = hangDTO.getSO_LUONG();
                 int price = hangDTO.getGIA();
                 LoaiHangDTO loaiDTO=new LoaiHangDTO();
                 LoaiHangBLL loaiBLL=new LoaiHangBLL();
                 loaiDTO.setMA_LOAI(hangDTO.getMA_LOAI());
                 /*if(loaiBLL.getTenLoai(loaiDTO)!=null)*/ String type=loaiBLL.getTenLoai(loaiDTO);
		 Object[] row = {  id,name, num, price,type};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Mã Sản phẩm này không tồn tại.","Thông báo",0);
	 jTable1.setModel(dtm);
    }
     public void getHangTen(HangHoaDTO hangDTO) {
	 String[] header = { "Mã sản phẩm","Tên sản phẩm", "Số lượng","Giá","Loại hàng"};
	 DefaultTableModel dtm = new DefaultTableModel(header, 0);
	 //lấy danh sách UserDTO (gọi hàm getAllUsers() trong UserBUS)
	 ArrayList<HangHoaDTO> arr = new ArrayList<HangHoaDTO>();
	 HangHoaBLL hangBLL = new HangHoaBLL();         
	 arr = hangBLL.searchHangTen(hangDTO);
	 for (int i = 0; i < arr.size(); i++) {
		 hangDTO = arr.get(i);
		 String id = hangDTO.getMA_HANG();
		 String name = hangDTO.getTEN_HANG();		 
		 int num = hangDTO.getSO_LUONG();
                 int price = hangDTO.getGIA();
                 LoaiHangDTO loaiDTO=new LoaiHangDTO();
                 LoaiHangBLL loaiBLL=new LoaiHangBLL();
                 loaiDTO.setMA_LOAI(hangDTO.getMA_LOAI());
                 /*if(loaiBLL.getTenLoai(loaiDTO)!=null)*/ String type=loaiBLL.getTenLoai(loaiDTO);
		 Object[] row = {  id,name, num, price,type};
		 dtm.addRow(row);
	 }
         if(arr.size()==0) JOptionPane.showMessageDialog(null, "Mã Sản phẩm này không tồn tại.","Thông báo",0);
	 jTable1.setModel(dtm);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkiemke;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl3;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtmasp;
    // End of variables declaration//GEN-END:variables
}
