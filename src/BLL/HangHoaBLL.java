package BLL;

import DAL.HangHoaDAL;
import DTO.HangHoaDTO;
import java.io.File;
import java.util.ArrayList;

public class HangHoaBLL{
    HangHoaDAL hhDAL=new HangHoaDAL();    

    public int inserthang(HangHoaDTO hangDTO){
        int result=hhDAL.inserthang(hangDTO);
        return result;
    }
    
    public int deletethang(HangHoaDTO hangDTO){
        int result=hhDAL.deletehang(hangDTO);
        return result;
    }
    
    public int updatehang(HangHoaDTO hangDTO,String id){
        int result=hhDAL.updatehang(hangDTO,id);
        return result;
    }
    
    public ArrayList<HangHoaDTO> getAllHang(){
        return hhDAL.getAllHang();
    }
    
    public ArrayList<HangHoaDTO> searchHangMa(HangHoaDTO hangDTO){
        return hhDAL.searchHangMa(hangDTO);
    }
    
    public ArrayList<HangHoaDTO> searchHangTen(HangHoaDTO hangDTO){
        return hhDAL.searchHangTen(hangDTO);
    }
    
    public String getTenHang(HangHoaDTO hangDTO){
        return hhDAL.getTenHang(hangDTO);
    }
    
    public int getGia(HangHoaDTO hangDTO){
        return hhDAL.getGia(hangDTO);
    }   
    
    public int updateSL(HangHoaDTO hangDTO, int num){
        return hhDAL.updateSL(hangDTO,num);
    }
    
    public void ExportExcel(){        
        hhDAL.ExportExcel();
    }
    public void ImportExcel(File file){        
        hhDAL.ImportExcel(file);
    }
    
    public ArrayList<HangHoaDTO> TK_SLuongTheoLoai(){
        return hhDAL.TK_SLuongTheoLoai();
    }
}