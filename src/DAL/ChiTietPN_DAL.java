package DAL;
import DTO.ChiTietPN_DTO;
import UTILS.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class ChiTietPN_DAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    public int insertCtietPN(ChiTietPN_DTO ctietPN_DTO){
        int result=0;
        String sqlInsert="INSERT INTO ct_pn (MA_PN, MA_HANG, SLUONG) VALUES (?,?,?)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,ctietPN_DTO.getMA_PN());
            preparedStatement.setString(2,ctietPN_DTO.getMA_HANG());
            preparedStatement.setInt(3,ctietPN_DTO.getSO_LUONG());
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
    //xóa 1 ctpn
    public int deleteCtietPN(ChiTietPN_DTO ctietPN_DTO){
        int result=0;
        String sqlDelete="DELETE FROM ct_pn WHERE MA_PN=? AND MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,ctietPN_DTO.getMA_PN());  
            preparedStatement.setString(2,ctietPN_DTO.getMA_HANG());   
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
    //xóa tất cả ctpn có cùng mã phiếu
    public int deleteAllCtietPN(ChiTietPN_DTO ctietPN_DTO){
        int result=0;
        String sqlDelete="DELETE FROM ct_pn WHERE MA_PN=? ";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,ctietPN_DTO.getMA_PN());               
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
    public int updateCtietPN(ChiTietPN_DTO ctietPN_DTO,String id){
        int result=0;
        String sqlupdate="UPDATE ct_pn SET  MA_PN=?,MA_HANG=?, SLUONG=? WHERE MA_PN=? AND MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate); 
            preparedStatement.setString(1,ctietPN_DTO.getMA_PN());
            preparedStatement.setString(2,ctietPN_DTO.getMA_HANG());
            preparedStatement.setInt(3,ctietPN_DTO.getSO_LUONG());
            preparedStatement.setString(4,ctietPN_DTO.getMA_PN());
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
    public ArrayList<ChiTietPN_DTO> getAllctietPN(){
        ArrayList<ChiTietPN_DTO> result=new ArrayList<ChiTietPN_DTO>();
        String sqlSelectAll="SELECT * from ct_pn";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                ChiTietPN_DTO ctietPN_DTO=new ChiTietPN_DTO();
                ctietPN_DTO.setMA_PN(resultset.getString("MA_PN"));
                ctietPN_DTO.setMA_HANG(resultset.getString("MA_HANG"));
                ctietPN_DTO.setSO_LUONG(resultset.getInt("SLUONG"));
                result.add(ctietPN_DTO);
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
    public ArrayList<ChiTietPN_DTO> searchCtietPN(ChiTietPN_DTO ctietPN_DTO) {
        ArrayList<ChiTietPN_DTO> result=new ArrayList<ChiTietPN_DTO>();
        String sql="SELECT * FROM ct_pn WHERE MA_PN=? ";
        ChiTietPN_DTO ctPN; 
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,ctietPN_DTO.getMA_PN());            
            resultset=preparedStatement.executeQuery();
                while(resultset.next()){
                    ctPN = new ChiTietPN_DTO();  
                    ctPN.setMA_HANG(resultset.getString("MA_HANG"));                     
                    ctPN.setSO_LUONG(resultset.getInt("SLUONG"));
                    result.add(ctPN);
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
