package BLL;

import DAL.PXuatDAL;
import DTO.PXuatDTO;
import java.util.ArrayList;

public class PXuatBLL{
    PXuatDAL pxDAL=new PXuatDAL();    

    public int insertPXuat(PXuatDTO px_DTO){
        px_DTO.setTONG_TIEN(pxDAL.TongTien(px_DTO));
        int result=pxDAL.insertPX(px_DTO);
        return result;
    }
    
    public int deletetPXuat(PXuatDTO px_DTO){
        int result=pxDAL.deletePX(px_DTO);
        return result;
    }
    
    public int updatePXuat(PXuatDTO px_DTO){
        int result=pxDAL.updatePX(px_DTO);
        return result;
    }
    
    public int updateTTien(PXuatDTO pxDTO){
        pxDTO.setTONG_TIEN(pxDAL.TongTien(pxDTO));
        int result=pxDAL.updateTTien(pxDTO);
        return result;
    }
    
    public ArrayList<PXuatDTO> getAllPXuat(){
        return pxDAL.getAllPX();
    }
    
    public ArrayList<PXuatDTO> searchPXuat(PXuatDTO px_DTO){
        return pxDAL.searchPX(px_DTO);
    }
    public String getMaPX(){
        String x=null;
        int n=pxDAL.DemSoDong();
        n++;
        if(n<10)
        x="00"+Integer.toString(n);
        else{if(n<100)
            x="0"+Integer.toString(n);
        else
        x=Integer.toString(n);
        }
        return "X"+x;
    }
     public void XuatPX(PXuatDTO pxDTO){
        pxDAL.XuatPX(pxDTO);
    }
     
     public ArrayList<PXuatDTO> TK_TienTheoKH(){
        return pxDAL.TK_TienTheoKH();
    }
}
