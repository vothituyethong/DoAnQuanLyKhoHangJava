
package BLL;

import DAL.NCC_DAL;
import DTO.NCC_DTO;
import java.io.File;
import java.util.ArrayList;

public class NCC_BLL {
    NCC_DAL nccDAL=new NCC_DAL();
    
    public ArrayList<NCC_DTO> getAllNCC(){
        return nccDAL.getAllNCC();
    }
       
    public String getTenNCC(NCC_DTO nccDTO){
        return nccDAL.getTenNCC(nccDTO);
    }
    
     public String getMaNCC(NCC_DTO nccDTO){
        return nccDAL.getMaNCC(nccDTO);
    }
    
    public int insertNCC(NCC_DTO nccDTO){
        int result=nccDAL.insertNCC(nccDTO);
        return result;
    }
    
    public int deleteNCC(NCC_DTO nccDTO){
        int result=nccDAL.deleteNCC(nccDTO);
        return result;
    }
    
    public int updateNCC(NCC_DTO nccDTO,String id){
        int result=nccDAL.updateNCC(nccDTO,id);
        return result;
    }
        
    public ArrayList<NCC_DTO> searchNCCMa(NCC_DTO nccDTO){
        return nccDAL.searchNCCMa(nccDTO);
    }
    
    public ArrayList<NCC_DTO> searchNCCTen(NCC_DTO nccDTO){
        return nccDAL.searchNCCTen(nccDTO);
    }
    
    public void ExportExcel(){        
        nccDAL.ExportExcel();
    }
    public void ImportExcel(File file){        
        nccDAL.ImportExcel(file);
    }
}
