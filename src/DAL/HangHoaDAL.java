package DAL;
import DTO.HangHoaDTO;
import UTILS.ConnectionUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class HangHoaDAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    //thêm
    public int inserthang(HangHoaDTO hangDTO){
        int result=0;
        String sqlInsert="INSERT INTO hanghoa(MA_HANG, TEN_HANG, SO_LUONG, GIA, MA_LOAI) VALUES (?,?,?,?,?)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,hangDTO.getMA_HANG());
            preparedStatement.setString(2,hangDTO.getTEN_HANG());
            preparedStatement.setInt(3,hangDTO.getSO_LUONG());
            preparedStatement.setInt(4,hangDTO.getGIA());
            preparedStatement.setString(5,hangDTO.getMA_LOAI());
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
    public int deletehang(HangHoaDTO hangDTO){
        int result=0;
        String sqlDelete="DELETE FROM hanghoa WHERE MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,hangDTO.getMA_HANG());
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
    public int updatehang(HangHoaDTO hangDTO,String id){
        int result=0;
        String sqlupdate="UPDATE hanghoa SET MA_HANG=?, TEN_HANG=?, SO_LUONG=?, GIA=?, MA_LOAI=? WHERE MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,hangDTO.getMA_HANG());
            preparedStatement.setString(2,hangDTO.getTEN_HANG());
            preparedStatement.setInt(3,hangDTO.getSO_LUONG());
            preparedStatement.setInt(4,hangDTO.getGIA());
            preparedStatement.setString(5,hangDTO.getMA_LOAI());
            preparedStatement.setString(6,id);
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
    public ArrayList<HangHoaDTO> getAllHang(){
        ArrayList<HangHoaDTO> result=new ArrayList<HangHoaDTO>();
        String sqlSelectAll="SELECT * from hanghoa";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                HangHoaDTO hangDTO=new HangHoaDTO();
                hangDTO.setMA_HANG(resultset.getString("MA_HANG"));
                hangDTO.setTEN_HANG(resultset.getString("TEN_HANG"));
                hangDTO.setSO_LUONG(resultset.getInt("SO_LUONG"));
                hangDTO.setGIA(resultset.getInt("GIA"));
                hangDTO.setMA_LOAI(resultset.getString("MA_LOAI"));
                result.add(hangDTO);
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
    public ArrayList<HangHoaDTO> searchHangMa(HangHoaDTO hangDTO) {
        ArrayList<HangHoaDTO> result=new ArrayList<HangHoaDTO>();
        String sql="SELECT * FROM hanghoa WHERE MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,hangDTO.getMA_HANG());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                hangDTO.setMA_HANG(resultset.getString("MA_HANG"));
                hangDTO.setTEN_HANG(resultset.getString("TEN_HANG"));  
                hangDTO.setSO_LUONG(resultset.getInt("SO_LUONG"));
                hangDTO.setGIA(resultset.getInt("GIA"));
                hangDTO.setMA_LOAI(resultset.getString("MA_LOAI"));
                result.add(hangDTO);
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
    public ArrayList<HangHoaDTO> searchHangTen(HangHoaDTO hangDTO) {
        ArrayList<HangHoaDTO> result=new ArrayList<HangHoaDTO>();
        String sql="SELECT * FROM hanghoa WHERE TEN_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,hangDTO.getTEN_HANG());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                hangDTO.setMA_HANG(resultset.getString("MA_HANG"));
                hangDTO.setTEN_HANG(resultset.getString("TEN_HANG"));  
                hangDTO.setSO_LUONG(resultset.getInt("SO_LUONG"));
                hangDTO.setGIA(resultset.getInt("GIA"));
                hangDTO.setMA_LOAI(resultset.getString("MA_LOAI"));
                result.add(hangDTO);
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
    //lấy tên hàng từ mã hàng
    public String getTenHang(HangHoaDTO hangDTO) {
        String result=null;
        String sql="SELECT * FROM hanghoa WHERE MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,hangDTO.getMA_HANG());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
               result=resultset.getString("TEN_HANG");
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
    //lấy đơn giá từ mã hàng
    public int getGia(HangHoaDTO hangDTO) {
        int result=0;
        String sql="SELECT * FROM hanghoa WHERE MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,hangDTO.getMA_HANG());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
               result=resultset.getInt("GIA");
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
    //tăng/giảm số lượng Khi nhập/xuất hàng
    public int updateSL(HangHoaDTO hangDTO, int num){   
        int result=0;
        String sqlupdate="UPDATE hanghoa SET SO_LUONG=SO_LUONG+? WHERE MA_HANG=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setInt(1,num);            
            preparedStatement.setString(2,hangDTO.getMA_HANG());
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
    //hàm xuất file Excel
    public void ExportExcel(){
        try{
            String sql = "SELECT * FROM hanghoa";
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            resultset=preparedStatement.executeQuery();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("HangHoa");
            
                    
            XSSFFont font = workbook.createFont();
            font.setFontHeightInPoints((short) 12);
            font.setBold(true);
        
            XSSFCellStyle style = workbook.createCellStyle();
            style.setFont(font);
            
            XSSFRow row = sheet.createRow(0);
            XSSFCell cell;
            
            cell = row.createCell(0);
            cell.setCellValue("MA_HANG");
            cell.setCellStyle(style);
            cell = row.createCell(1);
            cell.setCellValue("TEN_HANG");
            cell.setCellStyle(style);
            cell = row.createCell(2);
            cell.setCellValue("SO_LUONG");
            cell.setCellStyle(style);
            cell = row.createCell(3);
            cell.setCellValue("GIA");
            cell.setCellStyle(style);
            cell = row.createCell(4);
            cell.setCellValue("MA_LOAI");
            cell.setCellStyle(style);            
            int i = 1;
        
        while(resultset.next()){
            row = sheet.createRow(i);
            cell = row.createCell(0);
            cell.setCellValue(resultset.getString("MA_HANG"));
            cell = row.createCell(1);
            cell.setCellValue(resultset.getString("TEN_HANG"));
            cell = row.createCell(2);
            cell.setCellValue(resultset.getInt("SO_LUONG"));
            cell = row.createCell(3);
            cell.setCellValue(resultset.getInt("GIA"));
            cell = row.createCell(4);
            cell.setCellValue(resultset.getString("MA_LOAI"));           
            i++;
        }
        
        for(int colNum = 0;colNum < row.getLastCellNum();colNum++) {
            sheet.autoSizeColumn((short) (colNum));
        }
        
        FileOutputStream out = new FileOutputStream(new File("src/Report/HangHoadb.xlsx"));
        workbook.write(out);
        out.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(HangHoaDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HangHoaDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HangHoaDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //hàm nhập dữ liệu từ file excel
    public void ImportExcel(File file){
        dbUtils=new ConnectionUtils();
        con=dbUtils.getMyConnection();
        try{
            FileInputStream in = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(in);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Row row;
            for(int i = 1; i <= sheet.getLastRowNum(); i++){
                row = sheet.getRow(i);
                String MA_HANG = row.getCell(0).getStringCellValue();
                String TEN_HANG = row.getCell(1).getStringCellValue();
                int SO_LUONG = (int) row.getCell(2).getNumericCellValue();
                int GIA = (int) row.getCell(3).getNumericCellValue();
                String MA_LOAI = row.getCell(4).getStringCellValue();
                
                
                String sql_check = "SELECT * FROM hanghoa WHERE MA_HANG=?";                
                preparedStatement=con.prepareStatement(sql_check);
                preparedStatement.setString(1,MA_HANG); 
                resultset=preparedStatement.executeQuery();
                if(!resultset.next()){
                    String sqlInsert="INSERT INTO hanghoa(MA_HANG, TEN_HANG, SO_LUONG, GIA, MA_LOAI) VALUES (?,?,?,?,?)";
                    preparedStatement=con.prepareStatement(sqlInsert);
                    preparedStatement.setString(1,MA_HANG);
                    preparedStatement.setString(2,TEN_HANG);
                    preparedStatement.setInt(3,SO_LUONG);
                    preparedStatement.setInt(4,GIA);
                    preparedStatement.setString(5,MA_LOAI);
                    preparedStatement.executeUpdate();
                }
                else{
                    String sqlupdate="UPDATE hanghoa SET TEN_HANG=?, SO_LUONG=?, GIA=?, MA_LOAI=? WHERE MA_HANG=?";        
                    dbUtils=new ConnectionUtils();
                    con=dbUtils.getMyConnection();
                    preparedStatement=con.prepareStatement(sqlupdate);
                    preparedStatement.setString(1,TEN_HANG);
                    preparedStatement.setInt(2,SO_LUONG);
                    preparedStatement.setInt(3,GIA);
                    preparedStatement.setString(4,MA_LOAI);
                    preparedStatement.setString(5,MA_HANG);                    
                    preparedStatement.executeUpdate();
                }
            }
            in.close();
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HangHoaDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(HangHoaDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //hàm thống kê số lượng hàng theo mã loại
    public ArrayList<HangHoaDTO> TK_SLuongTheoLoai(){
        ArrayList<HangHoaDTO> result=new ArrayList<HangHoaDTO>();
        String sql="SELECT MA_LOAI, SUM(SO_LUONG) AS SO_LUONG\n" +
                    "FROM hanghoa\n" +                    
                    "GROUP BY MA_LOAI";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                HangHoaDTO hangDTO=new HangHoaDTO();
                hangDTO.setMA_LOAI(resultset.getString("MA_LOAI"));
                hangDTO.setSO_LUONG(resultset.getInt("SO_LUONG"));                
                result.add(hangDTO);
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
