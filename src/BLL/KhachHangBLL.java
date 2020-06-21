package BLL;

import DAL.K_HangDAL;
import DTO.KhachHangDTO;
import java.io.File;
import java.util.ArrayList;

public class KhachHangBLL{
    K_HangDAL khDAL=new K_HangDAL();    

    public int insertk_hang(KhachHangDTO k_hangDTO){
        int result=khDAL.insertk_hang(k_hangDTO);
        return result;
    }
    
    public int deletetk_hang(KhachHangDTO k_hangDTO){
        int result=khDAL.deletek_hang(k_hangDTO);
        return result;
    }
    
    public int updatek_hang(KhachHangDTO k_hangDTO,String id){
        int result=khDAL.updatek_hang(k_hangDTO,id);
        return result;
    }
    
    public ArrayList<KhachHangDTO> getAllK_Hang(){
        return khDAL.getAllK_Hang();
    }
    
    public ArrayList<KhachHangDTO> searchK_HangMa(KhachHangDTO k_hangDTO){
        return khDAL.searchK_HangMa(k_hangDTO);
    }
    
    public ArrayList<KhachHangDTO> searchK_HangTen(KhachHangDTO k_hangDTO){
        return khDAL.searchK_HangTen(k_hangDTO);
    }
    
    public String getTenKH(KhachHangDTO khDTO){
        return khDAL.getTenKH(khDTO);
    }
    
    public String getMaKH(KhachHangDTO khDTO){
        return khDAL.getMaKH(khDTO);
    }
    
    public void ExportExcel(){        
        khDAL.ExportExcel();
    }
    
    public void ImportExcel(File file){        
        khDAL.ImportExcel(file);
    }
}