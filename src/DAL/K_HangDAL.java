package DAL;
import DTO.KhachHangDTO;
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
public class K_HangDAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    public int insertk_hang(KhachHangDTO k_hangDTO){
        int result=0;
        String sqlInsert="INSERT INTO k_hang(MA_KH, TEN_KH, D_CHI, SDT) VALUES (?,?,?,?)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,k_hangDTO.getMA_KH());
            preparedStatement.setString(2,k_hangDTO.getTEN_KH());
            preparedStatement.setString(3,k_hangDTO.getD_CHI());
            preparedStatement.setString(4,k_hangDTO.getSDT());
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
    public int deletek_hang(KhachHangDTO k_hangDTO){
        int result=0;
        String sqlDelete="DELETE FROM k_hang WHERE MA_KH=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,k_hangDTO.getMA_KH());
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
    public int updatek_hang(KhachHangDTO k_hangDTO,String id){
        int result=0;
        String sqlupdate="UPDATE k_hang SET MA_KH=?, TEN_KH=?, D_CHI=?, SDT=? WHERE MA_KH=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,k_hangDTO.getMA_KH());
            preparedStatement.setString(2,k_hangDTO.getTEN_KH());
            preparedStatement.setString(3,k_hangDTO.getD_CHI());
            preparedStatement.setString(4,k_hangDTO.getSDT());
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
    public ArrayList<KhachHangDTO> getAllK_Hang(){
        ArrayList<KhachHangDTO> result=new ArrayList<KhachHangDTO>();
        String sqlSelectAll="SELECT * from k_hang";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                KhachHangDTO k_hangDTO=new KhachHangDTO();
                k_hangDTO.setMA_KH(resultset.getString("MA_KH"));
                k_hangDTO.setTEN_KH(resultset.getString("TEN_KH"));
                k_hangDTO.setD_CHI(resultset.getString("D_CHI"));
                k_hangDTO.setSDT(resultset.getString("SDT"));
                result.add(k_hangDTO);
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
    public ArrayList<KhachHangDTO> searchK_HangMa(KhachHangDTO k_hangDTO) {
        ArrayList<KhachHangDTO> result=new ArrayList<KhachHangDTO>();
        String sql="SELECT * FROM k_hang WHERE MA_KH=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,k_hangDTO.getMA_KH());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                k_hangDTO.setMA_KH(resultset.getString("MA_KH"));
                k_hangDTO.setTEN_KH(resultset.getString("TEN_KH"));  
                k_hangDTO.setD_CHI(resultset.getString("D_CHI"));
                k_hangDTO.setSDT(resultset.getString("SDT"));
                result.add(k_hangDTO);
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
    public ArrayList<KhachHangDTO> searchK_HangTen(KhachHangDTO k_hangDTO) {
        ArrayList<KhachHangDTO> result=new ArrayList<KhachHangDTO>();
        String sql="SELECT * FROM k_hang WHERE TEN_KH=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,k_hangDTO.getTEN_KH());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                k_hangDTO.setMA_KH(resultset.getString("MA_KH"));
                k_hangDTO.setTEN_KH(resultset.getString("TEN_KH"));  
                k_hangDTO.setD_CHI(resultset.getString("D_CHI"));
                k_hangDTO.setSDT(resultset.getString("SDT"));
                result.add(k_hangDTO);
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
    //lấy ra tên khách hàng từ mã khách hàng
    public String getTenKH(KhachHangDTO khDTO){  
        String result=null;
        String sql="SELECT * FROM k_hang WHERE MA_KH=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,khDTO.getMA_KH());            
            resultset=preparedStatement.executeQuery();            
            while(resultset.next()){                
                result=resultset.getString("TEN_KH");
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
    //lấy ra mã từ tên khách hàng     
    public String getMaKH(KhachHangDTO khDTO){  
        String result=null;
        String sql="SELECT * FROM k_hang WHERE TEN_KH=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,khDTO.getTEN_KH());            
            resultset=preparedStatement.executeQuery();            
            while(resultset.next()){                
                result=resultset.getString("MA_KH");
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
            String sql = "SELECT * FROM k_hang";
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            resultset=preparedStatement.executeQuery();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("KhachHang");
            
                    
            XSSFFont font = workbook.createFont();
            font.setFontHeightInPoints((short) 12);
            font.setBold(true);
        
            XSSFCellStyle style = workbook.createCellStyle();
            style.setFont(font);
            
            XSSFRow row = sheet.createRow(0);
            XSSFCell cell;
            
            cell = row.createCell(0);
            cell.setCellValue("MA_KH");
            cell.setCellStyle(style);
            cell = row.createCell(1);
            cell.setCellValue("TEN_KH");
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
            cell.setCellValue(resultset.getString("MA_KH"));
            cell = row.createCell(1);
            cell.setCellValue(resultset.getString("TEN_KH"));
            cell = row.createCell(2);
            cell.setCellValue(resultset.getString("D_CHI"));
            cell = row.createCell(3);
            cell.setCellValue(resultset.getString("SDT"));                    
            i++;
        }
        
        for(int colNum = 0;colNum < row.getLastCellNum();colNum++) {
            sheet.autoSizeColumn((short) (colNum));
        }
        
        FileOutputStream out = new FileOutputStream(new File("src/Report/KhachHangdb.xlsx"));
        workbook.write(out);
        out.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(K_HangDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(K_HangDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(K_HangDAL.class.getName()).log(Level.SEVERE, null, ex);
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
                String MA_KH = row.getCell(0).getStringCellValue();
                String TEN_KH = row.getCell(1).getStringCellValue();                
                String D_CHI = row.getCell(2).getStringCellValue();
                String SDT = row.getCell(3).getStringCellValue();
                
                String sql_check = "SELECT * FROM k_hang WHERE MA_KH=?";                
                preparedStatement=con.prepareStatement(sql_check);
                preparedStatement.setString(1,MA_KH); 
                resultset=preparedStatement.executeQuery();
                if(!resultset.next()){
                    String sqlInsert="INSERT INTO k_hang(MA_KH, TEN_KH, D_CHI, SDT) VALUES (?,?,?,?)";
                    preparedStatement=con.prepareStatement(sqlInsert);
                    preparedStatement.setString(1,MA_KH);
                    preparedStatement.setString(2,TEN_KH);
                    preparedStatement.setString(3,D_CHI);
                    preparedStatement.setString(4,SDT);
                    preparedStatement.executeUpdate();
                }
                else{
                    String sqlupdate="UPDATE hanghoa SET TEN_KH=?, D_CHI=?, SDT=? WHERE MA_KH=?";        
                    dbUtils=new ConnectionUtils();
                    con=dbUtils.getMyConnection();
                    preparedStatement=con.prepareStatement(sqlupdate);
                    preparedStatement.setString(1,TEN_KH);
                    preparedStatement.setString(2,D_CHI);
                    preparedStatement.setString(3,SDT);
                    preparedStatement.setString(4,MA_KH);              
                    preparedStatement.executeUpdate();
                }
            }
            in.close();
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(K_HangDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(K_HangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

