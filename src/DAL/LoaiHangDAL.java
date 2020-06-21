package DAL;
import DTO.LoaiHangDTO;
import UTILS.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class LoaiHangDAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    public int insertl_hang(LoaiHangDTO l_hangDTO){
        int result=0;
        String sqlInsert="INSERT INTO loaihang(MA_LOAI, TEN_LOAI) VALUES (?,?)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,l_hangDTO.getMA_LOAI());
            preparedStatement.setString(2,l_hangDTO.getTEN_LOAI());
            
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
    public int deletel_hang(LoaiHangDTO l_hangDTO){
        int result=0;
        String sqlDelete="DELETE FROM loaihang WHERE MA_LOAI=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,l_hangDTO.getMA_LOAI());
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
    public int updatel_hang(LoaiHangDTO l_hangDTO,String id){
        int result=0;
        String sqlupdate="UPDATE loaihang SET MA_LOAI=?, TEN_LOAI=? WHERE MA_LOAI=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,l_hangDTO.getMA_LOAI());
            preparedStatement.setString(2,l_hangDTO.getTEN_LOAI());
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
    public ArrayList<LoaiHangDTO> getAllL_Hang(){
        ArrayList<LoaiHangDTO> result=new ArrayList<LoaiHangDTO>();
        String sqlSelectAll="SELECT * from loaihang";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                LoaiHangDTO l_hangDTO=new LoaiHangDTO();
                l_hangDTO.setMA_LOAI(resultset.getString("MA_LOAI"));
                l_hangDTO.setTEN_LOAI(resultset.getString("TEN_LOAI"));
                result.add(l_hangDTO);
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
    public ArrayList<LoaiHangDTO> searchL_HangMa(LoaiHangDTO l_hangDTO) {
        ArrayList<LoaiHangDTO> result=new ArrayList<LoaiHangDTO>();
        String sql="SELECT * FROM loaihang WHERE MA_LOAI=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,l_hangDTO.getMA_LOAI());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                l_hangDTO.setMA_LOAI(resultset.getString("MA_LOAI"));
                l_hangDTO.setTEN_LOAI(resultset.getString("TEN_LOAI"));  
                result.add(l_hangDTO);
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
    public ArrayList<LoaiHangDTO> searchL_HangTen(LoaiHangDTO l_hangDTO) {
        ArrayList<LoaiHangDTO> result=new ArrayList<LoaiHangDTO>();
        String sql="SELECT * FROM loaihang WHERE TEN_LOAI=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,l_hangDTO.getTEN_LOAI());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                l_hangDTO.setMA_LOAI(resultset.getString("MA_LOAI"));
                l_hangDTO.setTEN_LOAI(resultset.getString("TEN_LOAI"));  
                result.add(l_hangDTO);
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
    //lấy tên loại
    public String getTenLoai(LoaiHangDTO l_hangDTO) {
        //ArrayList<LoaiHangDTO> result=new ArrayList<LoaiHangDTO>();
        String result=null;
        String sql="SELECT * FROM loaihang WHERE MA_LOAI=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,l_hangDTO.getMA_LOAI());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                //l_hangDTO.setMA_LOAI(resultset.getString("MA_LOAI"));
                result=resultset.getString("TEN_LOAI");  
                //result.add(l_hangDTO);
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
