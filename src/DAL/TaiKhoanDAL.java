
package DAL;

import DTO.TaiKhoanDTO;
import UTILS.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TaiKhoanDAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    
    //đăng nhập
    public ArrayList<TaiKhoanDTO> Login(TaiKhoanDTO tkDTO){
        ArrayList<TaiKhoanDTO> result=new ArrayList<TaiKhoanDTO>();
        String sql="SELECT * FROM taikhoan WHERE USERNAME=? and PASSWORD=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,tkDTO.getUSERNAME());
            preparedStatement.setString(2,tkDTO.getPASSWORD()); 
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                tkDTO.setUSERNAME(resultset.getString("USERNAME"));
                tkDTO.setPASSWORD(resultset.getString("PASSWORD")); 
                tkDTO.setMA_QUYEN(resultset.getString("MA_QUYEN"));
                tkDTO.setMA_NV(resultset.getString("MA_NV"));
                tkDTO.setKHOA(resultset.getInt("KHOA"));
                result.add(tkDTO);
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
    
    //thêm
    public int insertAccount(TaiKhoanDTO tkDTO){
        int result=0;
        String sqlInsert="INSERT INTO taikhoan(USERNAME, PASSWORD,MA_NV,MA_QUYEN,KHOA) VALUES (?,?,?,?,?)";
        
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,tkDTO.getUSERNAME());
            preparedStatement.setString(2,tkDTO.getPASSWORD());   
            preparedStatement.setString(3,tkDTO.getMA_NV());
            preparedStatement.setString(4,tkDTO.getMA_QUYEN());            
            preparedStatement.setInt(5,tkDTO.getKHOA());              
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
    public int deleteAccount(TaiKhoanDTO tkDTO){
        int result=0;
        String sqlDelete="DELETE FROM taikhoan WHERE USERNAME=?";
        
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,tkDTO.getUSERNAME());                
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
    
    //sửa
    public int updateAccount(TaiKhoanDTO tkDTO,String username){
        int result=0;
        String sqlUpdate="UPDATE taikhoan SET USERNAME=?, PASSWORD=?, MA_NV=?, MA_QUYEN=?, KHOA=? WHERE USERNAME=?";
        
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlUpdate);
            preparedStatement.setString(1,tkDTO.getUSERNAME());
            preparedStatement.setString(2,tkDTO.getPASSWORD());   
            preparedStatement.setString(3,tkDTO.getMA_NV());
            preparedStatement.setString(4,tkDTO.getMA_QUYEN());  
            preparedStatement.setInt(5,tkDTO.getKHOA());
            preparedStatement.setString(6,username);
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
    //đổi mật khẩu
    public int updateNewPwd(TaiKhoanDTO tkDTO){
        int result=0;
        String sqlUpdate="UPDATE taikhoan SET PASSWORD=? WHERE USERNAME=?";
        
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlUpdate);
            preparedStatement.setString(1,tkDTO.getPASSWORD());  
            preparedStatement.setString(2,tkDTO.getUSERNAME());
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
    public ArrayList<TaiKhoanDTO> getAllAccount(){
        ArrayList<TaiKhoanDTO> result=new ArrayList<TaiKhoanDTO>();
        String sqlSelectAll="SELECT * from taikhoan";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                TaiKhoanDTO tkDTO=new TaiKhoanDTO();
                tkDTO.setUSERNAME(resultset.getString("USERNAME"));
                tkDTO.setPASSWORD(resultset.getString("PASSWORD")); 
                tkDTO.setMA_NV(resultset.getString("MA_NV"));
                tkDTO.setMA_QUYEN(resultset.getString("MA_QUYEN"));
                tkDTO.setKHOA(resultset.getInt("KHOA"));                
                result.add(tkDTO);
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
    
    //tìm kiếm theo username
    public ArrayList<TaiKhoanDTO> searchAccountUS(TaiKhoanDTO tkDTO) {
        ArrayList<TaiKhoanDTO> result=new ArrayList<TaiKhoanDTO>();
        String sql="SELECT * FROM taikhoan WHERE USERNAME=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,tkDTO.getUSERNAME());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                tkDTO.setUSERNAME(resultset.getString("USERNAME"));
                tkDTO.setPASSWORD(resultset.getString("PASSWORD")); 
                tkDTO.setMA_NV(resultset.getString("MA_NV"));
                tkDTO.setMA_QUYEN(resultset.getString("MA_QUYEN"));
                tkDTO.setKHOA(resultset.getInt("KHOA"));                
                result.add(tkDTO);
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
    //tìm kiếm theo mã nhân viên
    public ArrayList<TaiKhoanDTO> searchAccountManv(TaiKhoanDTO tkDTO) {
        ArrayList<TaiKhoanDTO> result=new ArrayList<TaiKhoanDTO>();
        String sql="SELECT * FROM taikhoan WHERE MA_NV=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,tkDTO.getMA_NV());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                tkDTO.setUSERNAME(resultset.getString("USERNAME"));
                tkDTO.setPASSWORD(resultset.getString("PASSWORD")); 
                tkDTO.setMA_NV(resultset.getString("MA_NV"));
                tkDTO.setMA_QUYEN(resultset.getString("MA_QUYEN"));
                tkDTO.setKHOA(resultset.getInt("KHOA"));                
                result.add(tkDTO);
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
    //lấy username từ mã nhân viên
    public String getUsernameByMANV(TaiKhoanDTO tkDTO) {
        String result=null;
        String sql="SELECT * FROM taikhoan WHERE MA_NV=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,tkDTO.getMA_NV());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                result=resultset.getString("USERNAME");
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
    //lấy password từ username
    public String getPwdByUsername(TaiKhoanDTO tkDTO) {
        String result=null;
        String sql="SELECT * FROM taikhoan WHERE USERNAME=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,tkDTO.getUSERNAME());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                result=resultset.getString("PASSWORD");
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
}
