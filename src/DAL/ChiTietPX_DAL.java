package DAL;
import DTO.ChiTietPX_DTO;
import UTILS.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class ChiTietPX_DAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    public int insertCtietPX(ChiTietPX_DTO ctietPX_DTO){
        int result=0;
        String sqlInsert="INSERT INTO ct_px (MA_PX, MA_HANG, SLUONG) VALUES (?,?,?)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,ctietPX_DTO.getMA_PX());
            preparedStatement.setString(2,ctietPX_DTO.getMA_HANG());
            preparedStatement.setInt(3,ctietPX_DTO.getSO_LUONG());
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
    //xóa 1 ctpx
    public int deleteCtietPX(ChiTietPX_DTO ctietPX_DTO){
        int result=0;
        String sqlDelete="DELETE FROM ct_px WHERE MA_PX=? AND MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,ctietPX_DTO.getMA_PX());
            preparedStatement.setString(2,ctietPX_DTO.getMA_HANG());
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
    //xóa tất cả ctpx có cùng mã phiếu
    public int deleteAllCtietPX(ChiTietPX_DTO ctietPX_DTO){
        int result=0;
        String sqlDelete="DELETE FROM ct_px WHERE MA_PX=? ";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,ctietPX_DTO.getMA_PX());               
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
    public int updateCtietPX(ChiTietPX_DTO ctietPX_DTO,String id){
        int result=0;
        String sqlupdate="UPDATE ct_px SET MA_PX=?, MA_HANG=?, SLUONG=? WHERE MA_PX=? AND MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,ctietPX_DTO.getMA_PX());
            preparedStatement.setString(2,ctietPX_DTO.getMA_HANG());
            preparedStatement.setInt(3,ctietPX_DTO.getSO_LUONG());
            preparedStatement.setString(4,ctietPX_DTO.getMA_PX());
            preparedStatement.setString(5,id);
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
    public ArrayList<ChiTietPX_DTO> getAllctietPX(){
        ArrayList<ChiTietPX_DTO> result=new ArrayList<ChiTietPX_DTO>();
        String sqlSelectAll="SELECT * from ct_px";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                ChiTietPX_DTO ctietPX_DTO=new ChiTietPX_DTO();
                ctietPX_DTO.setMA_PX(resultset.getString("MA_PX"));
                ctietPX_DTO.setMA_HANG(resultset.getString("MA_HANG"));
                ctietPX_DTO.setSO_LUONG(resultset.getInt("SLUONG"));
                result.add(ctietPX_DTO);
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
    public ArrayList<ChiTietPX_DTO> searchCtietPX(ChiTietPX_DTO ctietPX_DTO) {
        ArrayList<ChiTietPX_DTO> result=new ArrayList<ChiTietPX_DTO>();
        String sql="SELECT * FROM ct_px WHERE MA_PX=? ";
        ChiTietPX_DTO ctPX;
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,ctietPX_DTO.getMA_PX());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                ctPX = new ChiTietPX_DTO();
                ctPX.setMA_HANG(resultset.getString("MA_HANG")); 
                ctPX.setSO_LUONG(resultset.getInt("SLUONG"));
                result.add(ctPX);
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
