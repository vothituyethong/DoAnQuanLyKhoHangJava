package DAL;

import DTO.QuyenDTO;
import UTILS.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class QuyenDAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    //thêm
    public int insertQuyen(QuyenDTO quyenDTO){
        int result=0;
        String sqlInsert="INSERT INTO quyen(MA_QUYEN, TEN_QUYEN) VALUES (?,?)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,quyenDTO.getMA_QUYEN());
            preparedStatement.setString(2,quyenDTO.getTEN_QUYEN());            
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
    public int deleteQuyen(QuyenDTO quyenDTO){
        int result=0;
        String sqlDelete="DELETE FROM quyen WHERE MA_QUYEN=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,quyenDTO.getMA_QUYEN());
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
    public int updateQuyen(QuyenDTO quyenDTO,String id){
        int result=0;
        String sqlupdate="UPDATE quyen SET MA_QUYEN=?, TEN_QUYEN=? WHERE MA_QUYEN=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,quyenDTO.getMA_QUYEN());
            preparedStatement.setString(2,quyenDTO.getTEN_QUYEN());
            preparedStatement.setString(3,id);            
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
    public ArrayList<QuyenDTO> getAllQuyen(){
        ArrayList<QuyenDTO> result=new ArrayList<QuyenDTO>();
        String sqlSelectAll="SELECT * from quyen";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                QuyenDTO quyenDTO=new QuyenDTO();
                quyenDTO.setMA_QUYEN(resultset.getString("MA_QUYEN"));
                quyenDTO.setTEN_QUYEN(resultset.getString("TEN_QUYEN"));                
                result.add(quyenDTO);
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
    //tìm kiếm theo mã
    public ArrayList<QuyenDTO> searchQuyenMa(QuyenDTO quyenDTO) {
        ArrayList<QuyenDTO> result=new ArrayList<QuyenDTO>();
        String sql="SELECT * FROM quyen WHERE MA_QUYEN=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,quyenDTO.getMA_QUYEN());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                quyenDTO.setMA_QUYEN(resultset.getString("MA_QUYEN"));
                quyenDTO.setTEN_QUYEN(resultset.getString("TEN_QUYEN"));                  
                result.add(quyenDTO);
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
    //tìm kiếm theo tên
    public ArrayList<QuyenDTO> searchQuyenTen(QuyenDTO quyenDTO) {
        ArrayList<QuyenDTO> result=new ArrayList<QuyenDTO>();
        String sql="SELECT * FROM quyen WHERE TEN_QUYEN=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,quyenDTO.getTEN_QUYEN());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                quyenDTO.setMA_QUYEN(resultset.getString("MA_QUYEN"));
                quyenDTO.setTEN_QUYEN(resultset.getString("TEN_QUYEN"));                  
                result.add(quyenDTO);
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
    //lấy tên quyền từ mã quyền
    public String getTenQ(QuyenDTO quyenDTO) {
        String result=null;
        String sql="SELECT * FROM quyen WHERE MA_QUYEN=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,quyenDTO.getMA_QUYEN());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next())           
                result=resultset.getString("TEN_QUYEN"); 
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
