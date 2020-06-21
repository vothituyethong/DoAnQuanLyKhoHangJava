package BLL;

import DAL.ChiTietPX_DAL;
import DTO.ChiTietPX_DTO;
import java.util.ArrayList;

public class ChiTietPX_BLL{
    ChiTietPX_DAL ctpxDAL=new ChiTietPX_DAL();    

    public int insertCtietPX(ChiTietPX_DTO ctietPX_DTO){
        int result=ctpxDAL.insertCtietPX(ctietPX_DTO);
        return result;
    }
    
    public int deleteCtietPX(ChiTietPX_DTO ctietPX_DTO){
        int result=ctpxDAL.deleteCtietPX(ctietPX_DTO);
        return result;
    }
    
    public int deleteAllCtietPX(ChiTietPX_DTO ctietPX_DTO){
        int result=ctpxDAL.deleteAllCtietPX(ctietPX_DTO);
        return result;
    }
    
    public int updateCtietPX(ChiTietPX_DTO ctietPX_DTO,String id){
        int result=ctpxDAL.updateCtietPX(ctietPX_DTO,id);
        return result;
    }
    
    public ArrayList<ChiTietPX_DTO> getAllctietPX(){
        return ctpxDAL.getAllctietPX();
    }
    
    public ArrayList<ChiTietPX_DTO> searchCtietPX(ChiTietPX_DTO ctietPX_DTO){
        return ctpxDAL.searchCtietPX(ctietPX_DTO);
    }
}
