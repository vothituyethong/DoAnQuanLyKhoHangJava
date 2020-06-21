
package BLL;

import DAL.ChiTietPN_DAL;
import DTO.ChiTietPN_DTO;
import java.util.ArrayList;

public class ChiTietPN_BLL {
    ChiTietPN_DAL ctpnDAL=new ChiTietPN_DAL();
    public int insertCtietPN(ChiTietPN_DTO ctpnDTO){
        int result=ctpnDAL.insertCtietPN(ctpnDTO);
        return result;
    }
    public int deleteAllCtietPN(ChiTietPN_DTO ctpnDTO){
        int result=ctpnDAL.deleteAllCtietPN(ctpnDTO);
        return result;
    }
    public int deleteCtietPN(ChiTietPN_DTO ctpnDTO){
        int result=ctpnDAL.deleteCtietPN(ctpnDTO);
        return result;
    }
    public ArrayList<ChiTietPN_DTO> searchCtietPN(ChiTietPN_DTO ctpnDTO){
        return ctpnDAL.searchCtietPN(ctpnDTO);
    }
    public ArrayList<ChiTietPN_DTO> getAllctietPN(){
        return ctpnDAL.getAllctietPN();
    }
    public int updateCtietPN(ChiTietPN_DTO ctpnDTO,String id){
        int result=ctpnDAL.updateCtietPN(ctpnDTO,id);
        return result;
    }
}
