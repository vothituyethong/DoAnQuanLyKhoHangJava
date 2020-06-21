
package DAL;

import DTO.PNhapDTO;
import UTILS.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class PNhapDAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    //thêm
    public int insertPN(PNhapDTO pnDTO){
        int result=0;
        String sqlInsert="INSERT INTO p_nhap(MA_PN, NGAY_LAP, MA_NV, MA_NCC, TONG_TIEN) VALUES (?,?,?,?,?)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,pnDTO.getMA_PN());
            preparedStatement.setDate(2,pnDTO.getNGAY_LAP());
            preparedStatement.setString(3,pnDTO.getMA_NV());
            preparedStatement.setString(4,pnDTO.getMA_NCC());
            preparedStatement.setInt(5,pnDTO.getTONG_TIEN());
            result= preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }    
    //xóa
    public int deletePN(PNhapDTO pnDTO){
        int result=0;
        String sqlDelete="DELETE FROM p_nhap WHERE MA_PN=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,pnDTO.getMA_PN());
            result=preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
    //sửa
    public int updatePN(PNhapDTO pnDTO){
        int result=0;
        String sqlupdate="UPDATE p_nhap SET MA_PN=?, NGAY_LAP=?, MA_NV=?, MA_NCC=?, TONG_TIEN=? WHERE MA_PN=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,pnDTO.getMA_PN());
            preparedStatement.setDate(2,pnDTO.getNGAY_LAP());
            preparedStatement.setString(3,pnDTO.getMA_NV());
            preparedStatement.setString(4,pnDTO.getMA_NCC());
            preparedStatement.setInt(5,pnDTO.getTONG_TIEN());
            preparedStatement.setString(6,pnDTO.getMA_PN());
            result= preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
            e.printStackTrace();
            }
        }
        return result;
    }
    //lấy tất cả các dòng dữ liệu
    public ArrayList<PNhapDTO> getAllPN(){
        ArrayList<PNhapDTO> result=new ArrayList<PNhapDTO>();
        String sqlSelectAll="SELECT * from p_nhap";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                PNhapDTO pnDTO=new PNhapDTO();
                pnDTO.setMA_PN(resultset.getString("MA_PN"));
                pnDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                pnDTO.setMA_NV(resultset.getString("MA_NV"));
                pnDTO.setMA_NCC(resultset.getString("MA_NCC"));
                pnDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(pnDTO);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
    //tìm kiếm
    public ArrayList<PNhapDTO> searchPN(PNhapDTO pnDTO) {
        ArrayList<PNhapDTO> result=new ArrayList<PNhapDTO>();
        String sql="SELECT * FROM p_nhap WHERE MA_PN=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,pnDTO.getMA_PN());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                pnDTO.setMA_PN(resultset.getString("MA_PN"));
                pnDTO.setNGAY_LAP(resultset.getDate("NGAY_LAP"));
                pnDTO.setMA_NV(resultset.getString("MA_NV"));
                pnDTO.setMA_NCC(resultset.getString("MA_NCC"));
                pnDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(pnDTO);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
                resultset.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
    //tính tổng tiền
    public int TongTien(PNhapDTO pnDTO){             
        int tongTien=0;        
        String sql="SELECT hanghoa.GIA,ct_pn.SLUONG FROM hanghoa,ct_pn WHERE hanghoa.MA_HANG=ct_pn.MA_HANG AND ct_pn.MA_PN=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);   
            preparedStatement.setString(1,pnDTO.getMA_PN()); 
            resultset=preparedStatement.executeQuery();            
            while(resultset.next()){
                tongTien+=resultset.getInt("GIA")*resultset.getInt("SLUONG");               
            }                                  
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
                resultset.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return tongTien;    
    }
    //hàm tính tổng số phiếu nhập hiện có
    public int DemSoDong(){
        ArrayList<PNhapDTO> result=new ArrayList<PNhapDTO>();
        String sql="SELECT * FROM p_nhap";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);           
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                PNhapDTO pnDTO=new PNhapDTO();
                pnDTO.setMA_PN(resultset.getString("MA_PN"));
                result.add(pnDTO);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
                resultset.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result.size();
    }
    //tăng/giảm tổng tiền Khi chỉnh sửa chi tiết phiếu nhập
    public int updateTTien(PNhapDTO pnDTO){   
        int result=0;
        String sqlupdate="UPDATE p_nhap SET TONG_TIEN=? WHERE MA_PN=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setInt(1,pnDTO.getTONG_TIEN());            
            preparedStatement.setString(2,pnDTO.getMA_PN());
            result=preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
            e.printStackTrace();
            }
        }        
        return result;
    }
    //lấy kết nối
    public Connection con(){
        Connection conn=null;
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            conn=con;
            con.close();
            
            
        }     
        
        catch(SQLException e){
            e.printStackTrace();
            }
        return conn;
    }
    //hàm report phiếu nhập
    public void XuatPN(PNhapDTO pnDTO){
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            Hashtable map=new Hashtable();
            JasperReport report=JasperCompileManager.compileReport("src/Report/reportPN.jrxml");
            map.put("MA_PN", pnDTO.getMA_PN());
            JasperPrint p=JasperFillManager.fillReport(report,map,con);
            JasperViewer.viewReport(p,false);
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //hàm thống kê số tiền nhập hàng theo Nhà cung cấp
    public ArrayList<PNhapDTO> TK_TienTheoNCC(){
        ArrayList<PNhapDTO> result=new ArrayList<PNhapDTO>();
        String sql="SELECT MA_NCC, SUM(TONG_TIEN) AS TONG_TIEN\n" +
                            "FROM p_nhap\n" +
                            "GROUP BY MA_NCC";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                PNhapDTO pnDTO=new PNhapDTO();                
                pnDTO.setMA_NCC(resultset.getString("MA_NCC"));
                pnDTO.setTONG_TIEN(resultset.getInt("TONG_TIEN"));
                result.add(pnDTO);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                con.close();
                preparedStatement.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return result;
    }
}
