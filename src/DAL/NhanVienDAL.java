package DAL;
import DTO.NhanVienDTO;
import UTILS.ConnectionUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
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
public class NhanVienDAL {
    ConnectionUtils dbUtils;
    Connection con;
    PreparedStatement preparedStatement;
    ResultSet resultset=null;
    //thêm
    public int insertnvien(NhanVienDTO nvienDTO){
        int result=0;
        String sqlInsert="INSERT INTO nhanvien(MA_NV, TEN_NV, NG_SINH, G_TINH, D_CHI, SDT, CHUC_VU) VALUES (?,?,?,?,?,?,?)";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlInsert);
            preparedStatement.setString(1,nvienDTO.getMA_NV());
            preparedStatement.setString(2,nvienDTO.getTEN_NV());
            preparedStatement.setDate(3,nvienDTO.getNG_SINH());
            preparedStatement.setString(4,nvienDTO.getG_TINH());
            preparedStatement.setString(5,nvienDTO.getD_CHI());
            preparedStatement.setString(6,nvienDTO.getSDT());
            preparedStatement.setString(7,nvienDTO.getCHUC_VU());
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
    public int deletenvien(NhanVienDTO nvienDTO){
        int result=0;
        String sqlDelete="DELETE FROM nhanvien WHERE MA_NV=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlDelete);
            preparedStatement.setString(1,nvienDTO.getMA_NV());
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
    public int updatenvien(NhanVienDTO nvienDTO,String id){
        int result=0;
        String sqlupdate="UPDATE nhanvien SET MA_NV=?, TEN_NV=?, NG_SINH=?, G_TINH=?, D_CHI=?, SDT=?, CHUC_VU=? WHERE MA_NV=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlupdate);
            preparedStatement.setString(1,nvienDTO.getMA_NV());
            preparedStatement.setString(2,nvienDTO.getTEN_NV());
            preparedStatement.setDate(3,nvienDTO.getNG_SINH());
            preparedStatement.setString(4,nvienDTO.getG_TINH());
            preparedStatement.setString(5,nvienDTO.getD_CHI());
            preparedStatement.setString(6,nvienDTO.getSDT());
            preparedStatement.setString(7,nvienDTO.getCHUC_VU());
            preparedStatement.setString(8,id);
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
    public ArrayList<NhanVienDTO> getAllNvien(){
        ArrayList<NhanVienDTO> result=new ArrayList<NhanVienDTO>();
        String sqlSelectAll="SELECT * from nhanvien";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sqlSelectAll);
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                NhanVienDTO nvienDTO=new NhanVienDTO();
                nvienDTO.setMA_NV(resultset.getString("MA_NV"));
                nvienDTO.setTEN_NV(resultset.getString("TEN_NV"));
                nvienDTO.setNG_SINH(resultset.getDate("NG_SINH"));
                nvienDTO.setG_TINH(resultset.getString("G_TINH"));
                nvienDTO.setD_CHI(resultset.getString("D_CHI"));
                nvienDTO.setSDT(resultset.getString("SDT"));
                nvienDTO.setCHUC_VU(resultset.getString("CHUC_VU"));
                result.add(nvienDTO);
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
    public ArrayList<NhanVienDTO> searchNvienMa(NhanVienDTO nvienDTO) {
        ArrayList<NhanVienDTO> result=new ArrayList<NhanVienDTO>();
        String sql="SELECT * FROM nhanvien WHERE MA_NV=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,nvienDTO.getMA_NV());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                nvienDTO.setMA_NV(resultset.getString("MA_NV"));
                nvienDTO.setTEN_NV(resultset.getString("TEN_NV"));
                nvienDTO.setNG_SINH(resultset.getDate("NG_SINH"));
                nvienDTO.setG_TINH(resultset.getString("G_TINH"));
                nvienDTO.setD_CHI(resultset.getString("D_CHI"));
                nvienDTO.setSDT(resultset.getString("SDT"));
                nvienDTO.setCHUC_VU(resultset.getString("CHUC_VU"));
                result.add(nvienDTO);
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
    public ArrayList<NhanVienDTO> searchNvienTen(NhanVienDTO nvienDTO) {
        ArrayList<NhanVienDTO> result=new ArrayList<NhanVienDTO>();
        String sql="SELECT * FROM nhanvien WHERE TEN_NV=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,nvienDTO.getTEN_NV());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                nvienDTO.setMA_NV(resultset.getString("MA_NV"));
                nvienDTO.setTEN_NV(resultset.getString("TEN_NV"));
                nvienDTO.setNG_SINH(resultset.getDate("NG_SINH"));
                nvienDTO.setG_TINH(resultset.getString("G_TINH"));
                nvienDTO.setD_CHI(resultset.getString("D_CHI"));
                nvienDTO.setSDT(resultset.getString("SDT"));
                nvienDTO.setCHUC_VU(resultset.getString("CHUC_VU"));
                result.add(nvienDTO);
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
    //lấy tên Nhân viên từ Mã nhân viên
    public String getTenNV(NhanVienDTO nvienDTO) {
        String result=null;
        String sql="SELECT * FROM nhanvien WHERE MA_NV=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,nvienDTO.getMA_NV());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                result=resultset.getString("TEN_NV");
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
    //lấy mã Nhân viên từ Tên nhân viên
    public String getMaNV(NhanVienDTO nvienDTO) {
        String result=null;
        String sql="SELECT * FROM nhanvien WHERE TEN_NV=?";
        try{
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,nvienDTO.getTEN_NV());            
            resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                result=resultset.getString("MA_NV");
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
            String sql = "SELECT * FROM nhanvien";
            dbUtils=new ConnectionUtils();
            con=dbUtils.getMyConnection();
            preparedStatement=con.prepareStatement(sql);
            resultset=preparedStatement.executeQuery();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("NhanVien");
            
                    
            XSSFFont font = workbook.createFont();
            font.setFontHeightInPoints((short) 12);
            font.setBold(true);
        
            XSSFCellStyle style = workbook.createCellStyle();
            style.setFont(font);
            
            XSSFRow row = sheet.createRow(0);
            XSSFCell cell;
            
            cell = row.createCell(0);
            cell.setCellValue("MA_NV");
            cell.setCellStyle(style);
            cell = row.createCell(1);
            cell.setCellValue("TEN_NV");
            cell.setCellStyle(style);
            cell = row.createCell(2);
            cell.setCellValue("NG_SINH");
            cell.setCellStyle(style);
            cell = row.createCell(3);
            cell.setCellValue("G_TINH");
            cell.setCellStyle(style);
            cell = row.createCell(4);
            cell.setCellValue("D_CHI");
            cell.setCellStyle(style);  
            cell = row.createCell(5);
            cell.setCellValue("SDT");
            cell.setCellStyle(style);
            cell = row.createCell(6);
            cell.setCellValue("CHUC_VU");
            cell.setCellStyle(style);
            int i = 1;
        
        while(resultset.next()){
            row = sheet.createRow(i);
            cell = row.createCell(0);
            cell.setCellValue(resultset.getString("MA_NV"));
            cell = row.createCell(1);
            cell.setCellValue(resultset.getString("TEN_NV"));
            cell = row.createCell(2);
            cell.setCellValue(resultset.getDate("NG_SINH"));
            cell = row.createCell(3);
            cell.setCellValue(resultset.getString("G_TINH"));
            cell = row.createCell(4);
            cell.setCellValue(resultset.getString("D_CHI"));  
            cell = row.createCell(5);
            cell.setCellValue(resultset.getString("SDT"));  
            cell = row.createCell(6);
            cell.setCellValue(resultset.getString("CHUC_VU"));  
            i++;
        }
        
        for(int colNum = 0;colNum < row.getLastCellNum();colNum++) {
            sheet.autoSizeColumn((short) (colNum));
        }
        
        FileOutputStream out = new FileOutputStream(new File("src/Report/NhanViendb.xlsx"));
        workbook.write(out);
        out.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
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
                String MA_NV = row.getCell(0).getStringCellValue();
                String TEN_NV = row.getCell(1).getStringCellValue();
                Date NG_SINH =Date.valueOf(row.getCell(2).getStringCellValue());
                String G_TINH = row.getCell(3).getStringCellValue();
                String D_CHI = row.getCell(4).getStringCellValue();
                String SDT = row.getCell(5).getStringCellValue();
                String CHUC_VU = row.getCell(6).getStringCellValue();
                
                
                String sql_check = "SELECT * FROM nhanvien WHERE MA_NV=?";                
                preparedStatement=con.prepareStatement(sql_check);
                preparedStatement.setString(1,MA_NV); 
                resultset=preparedStatement.executeQuery();
                if(!resultset.next()){
                    String sqlInsert="INSERT INTO nhanvien(MA_NV, TEN_NV, NG_SINH, G_TINH, SDT,CHUC_VU) VALUES (?,?,?,?,?,?)";
                    preparedStatement=con.prepareStatement(sqlInsert);
                    preparedStatement.setString(1,MA_NV);
                    preparedStatement.setString(2,TEN_NV);
                    preparedStatement.setDate(3,NG_SINH);
                    preparedStatement.setString(4,G_TINH);
                    preparedStatement.setString(5,SDT);
                    preparedStatement.setString(6,CHUC_VU);
                    preparedStatement.executeUpdate();
                }
                else{
                    String sqlupdate="UPDATE hanghoa SET TEN_NV=?, NG_SINH=?, G_TINH=?, SDT=?, CHUC_VU=? WHERE MA_NV=?";        
                    dbUtils=new ConnectionUtils();
                    con=dbUtils.getMyConnection();
                    preparedStatement=con.prepareStatement(sqlupdate);
                    preparedStatement.setString(1,TEN_NV);
                    preparedStatement.setDate(2,NG_SINH);
                    preparedStatement.setString(3,G_TINH);
                    preparedStatement.setString(4,SDT);
                    preparedStatement.setString(5,CHUC_VU);      
                    preparedStatement.setString(6,MA_NV);       
                    preparedStatement.executeUpdate();
                }
            }
            in.close();
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
