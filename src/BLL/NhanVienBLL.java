package BLL;

import DAL.NhanVienDAL;
import DTO.NhanVienDTO;
import java.io.File;
import java.util.ArrayList;

public class NhanVienBLL{
    NhanVienDAL nvDAL=new NhanVienDAL();    

    public int insertnvien(NhanVienDTO nvienDTO){
        int result=nvDAL.insertnvien(nvienDTO);
        return result;
    }
    
    public int deletetnvien(NhanVienDTO nvienDTO){
        int result=nvDAL.deletenvien(nvienDTO);
        return result;
    }
    
    public int updatenvien(NhanVienDTO nvienDTO,String id){
        int result=nvDAL.updatenvien(nvienDTO,id);
        return result;
    }
    
    public ArrayList<NhanVienDTO> getAllNvien(){
        return nvDAL.getAllNvien();
    }
    
    public ArrayList<NhanVienDTO> searchNvienMa(NhanVienDTO nvienDTO){
        return nvDAL.searchNvienMa(nvienDTO);
    }
    
    public ArrayList<NhanVienDTO> searchNvienTen(NhanVienDTO nvienDTO){
        return nvDAL.searchNvienTen(nvienDTO);
    }
    
    public String getTenNV(NhanVienDTO nvienDTO){
        return nvDAL.getTenNV(nvienDTO);
    }
    
    public String getMaNV(NhanVienDTO nvienDTO){
        return nvDAL.getMaNV(nvienDTO);
    }
    
    public void ExportExcel(){        
        nvDAL.ExportExcel();
    }
    public void ImportExcel(File file){        
        nvDAL.ImportExcel(file);
    }
}
