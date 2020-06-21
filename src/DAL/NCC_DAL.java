package DAL;
import DTO.NCC_DTO;
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
public class NCC_DAL {
       ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    public int insertNCC(NCC_DTO ncc_DTO){
        int result=0;
        String sqlInsert="INSERT INTO ncc(MA_NCC, TEN_NCC, D_CHI, SDT) VALUES (?,?,?,?)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,ncc_DTO.getMA_NCC());
            preparedStatement.setString(2,ncc_DTO.getTEN_NCC());
            preparedStatement.setString(3,ncc_DTO.getD_CHI());
            preparedStatement.setString(4,ncc_DTO.getSDT());
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
    public int deleteNCC(NCC_DTO ncc_DTO){
        int result=0;
        String sqlDelete="DELETE FROM ncc WHERE MA_NCC=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,ncc_DTO.getMA_NCC());
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
    public int updateNCC(NCC_DTO ncc_DTO,String id){
        int result=0;
        String sqlupdate="UPDATE ncc SET MA_NCC=?, TEN_NCC=?, D_CHI=?, SDT=? WHERE MA_NCC=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,ncc_DTO.getMA_NCC());
            preparedStatement.setString(2,ncc_DTO.getTEN_NCC());
            preparedStatement.setString(3,ncc_DTO.getD_CHI());
            preparedStatement.setString(4,ncc_DTO.getSDT());
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
    public ArrayList<NCC_DTO> getAllNCC(){
        ArrayList<NCC_DTO> result=new ArrayList<NCC_DTO>();
        String sqlSelectAll="SELECT * from ncc";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                NCC_DTO ncc_DTO=new NCC_DTO();
                ncc_DTO.setMA_NCC(resultset.getString("MA_NCC"));
                ncc_DTO.setTEN_NCC(resultset.getString("TEN_NCC"));
                ncc_DTO.setD_CHI(resultset.getString("D_CHI"));
                ncc_DTO.setSDT(resultset.getString("SDT"));
                result.add(ncc_DTO);
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
    public ArrayList<NCC_DTO> searchNCCMa(NCC_DTO ncc_DTO) {
        ArrayList<NCC_DTO> result=new ArrayList<NCC_DTO>();
        String sql="SELECT * FROM ncc WHERE MA_NCC=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,ncc_DTO.getMA_NCC());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                ncc_DTO.setMA_NCC(resultset.getString("MA_NCC"));
                ncc_DTO.setTEN_NCC(resultset.getString("TEN_NCC"));  
                ncc_DTO.setD_CHI(resultset.getString("D_CHI"));
                ncc_DTO.setSDT(resultset.getString("SDT"));
                result.add(ncc_DTO);
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
    public ArrayList<NCC_DTO> searchNCCTen(NCC_DTO ncc_DTO) {
        ArrayList<NCC_DTO> result=new ArrayList<NCC_DTO>();
        String sql="SELECT * FROM ncc WHERE TEN_NCC=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,ncc_DTO.getTEN_NCC());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                ncc_DTO.setMA_NCC(resultset.getString("MA_NCC"));
                ncc_DTO.setTEN_NCC(resultset.getString("TEN_NCC"));  
                ncc_DTO.setD_CHI(resultset.getString("D_CHI"));
                ncc_DTO.setSDT(resultset.getString("SDT"));
                result.add(ncc_DTO);
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
    //nhận tên NCC, trả về mã NCC lưu vào csdl: combo box
    public String getMaNCC(NCC_DTO ncc_DTO){  
        String result=null;
        String sql="SELECT * FROM ncc WHERE TEN_NCC=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,ncc_DTO.getTEN_NCC());            
            resultset=preparedStatement.executeQuery();            
            while(resultset.next()){                
                result=resultset.getString("MA_NCC");
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
    //lấy ra tên ncc từ mã ncc
    public String getTenNCC(NCC_DTO ncc_DTO){  
        String result=null;
        String sql="SELECT * FROM ncc WHERE MA_NCC=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,ncc_DTO.getMA_NCC());            
            resultset=preparedStatement.executeQuery();            
            while(resultset.next()){                
                result=resultset.getString("TEN_NCC");
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
     //hàm xuất file Excel
    public void ExportExcel(){
        try{
            String sql = "SELECT * FROM ncc";
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            resultset=preparedStatement.executeQuery();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("NhaCungCap");
            
                    
            XSSFFont font = workbook.createFont();
            font.setFontHeightInPoints((short) 12);
            font.setBold(true);
        
            XSSFCellStyle style = workbook.createCellStyle();
            style.setFont(font);
            
            XSSFRow row = sheet.createRow(0);
            XSSFCell cell;
            
            cell = row.createCell(0);
            cell.setCellValue("MA_NCC");
            cell.setCellStyle(style);
            cell = row.createCell(1);
            cell.setCellValue("TEN_NCC");
            cell.setCellStyle(style);            
            cell = row.createCell(2);
            cell.setCellValue("D_CHI");
            cell.setCellStyle(style);
            cell = row.createCell(3);
            cell.setCellValue("SDT");
            cell.setCellStyle(style);            
            int i = 1;
        
        while(resultset.next()){
            row = sheet.createRow(i);
            cell = row.createCell(0);
            cell.setCellValue(resultset.getString("MA_NCC"));
            cell = row.createCell(1);
            cell.setCellValue(resultset.getString("TEN_NCC"));
            cell = row.createCell(2);
            cell.setCellValue(resultset.getString("D_CHI"));
            cell = row.createCell(3);
            cell.setCellValue(resultset.getString("SDT"));                    
            i++;
        }
        
        for(int colNum = 0;colNum < row.getLastCellNum();colNum++) {
            sheet.autoSizeColumn((short) (colNum));
        }
        
        FileOutputStream out = new FileOutputStream(new File("src/Report/NhaCungCapdb.xlsx"));
        workbook.write(out);
        out.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(NCC_DAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NCC_DAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NCC_DAL.class.getName()).log(Level.SEVERE, null, ex);
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
                String MA_NCC = row.getCell(0).getStringCellValue();
                String TEN_NCC = row.getCell(1).getStringCellValue();                
                String D_CHI = row.getCell(2).getStringCellValue();
                String SDT = row.getCell(3).getStringCellValue();
                
                String sql_check = "SELECT * FROM ncc WHERE MA_NCC=?";                
                preparedStatement=con.prepareStatement(sql_check);
                preparedStatement.setString(1,MA_NCC); 
                resultset=preparedStatement.executeQuery();
                if(!resultset.next()){
                    String sqlInsert="INSERT INTO ncc(MA_NCC, TEN_NCC, D_CHI, SDT) VALUES (?,?,?,?)";
                    preparedStatement=con.prepareStatement(sqlInsert);
                    preparedStatement.setString(1,MA_NCC);
                    preparedStatement.setString(2,TEN_NCC);
                    preparedStatement.setString(3,D_CHI);
                    preparedStatement.setString(4,SDT);
                    preparedStatement.executeUpdate();
                }
                else{
                    String sqlupdate="UPDATE hanghoa SET TEN_NCC=?, D_CHI=?, SDT=? WHERE MA_NCC=?";        
                    dbUtils=new ConnectionUtils();
                    con=dbUtils.getMyConnection();
                    preparedStatement=con.prepareStatement(sqlupdate);
                    preparedStatement.setString(1,TEN_NCC);
                    preparedStatement.setString(2,D_CHI);
                    preparedStatement.setString(3,SDT);
                    preparedStatement.setString(4,MA_NCC);              
                    preparedStatement.executeUpdate();
                }
            }
            in.close();
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NCC_DAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(NCC_DAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
