package BLL;

import DAL.PNhapDAL;
import DTO.PNhapDTO;
import java.util.ArrayList;



public class PNhapBLL {
    PNhapDAL pnDAL=new PNhapDAL();
    
    public int insertPN(PNhapDTO pnDTO){       
        pnDTO.setTONG_TIEN(pnDAL.TongTien(pnDTO));
        return pnDAL.insertPN(pnDTO);
    }    
    
    public int deletePN(PNhapDTO pnDTO){       
        return pnDAL.deletePN(pnDTO);
    } 
    
    public int updatePN(PNhapDTO pnDTO){  
        int result=pnDAL.updatePN(pnDTO);
        return result;
    } 
    
    public int updateTTien(PNhapDTO pnDTO){
        pnDTO.setTONG_TIEN(pnDAL.TongTien(pnDTO));
        int result=pnDAL.updateTTien(pnDTO);
        return result;
    }
    
    public String getMaPN(){
        String x=null;
        int n=pnDAL.DemSoDong();
        n++;
        if(n<10)
        x="00"+Integer.toString(n);
        else{if(n<100)
            x="0"+Integer.toString(n);
        else
        x=Integer.toString(n);
        }
        return "N"+x;
    }
    public ArrayList<PNhapDTO> getAllPN(){
        return pnDAL.getAllPN();
    }
    
    public ArrayList<PNhapDTO> searchPN(PNhapDTO pnDTO){
        return pnDAL.searchPN(pnDTO);
    }
    
    public void XuatPN(PNhapDTO pnDTO){
        pnDAL.XuatPN(pnDTO);
    }
    
    public ArrayList<PNhapDTO> TK_TienTheoNCC(){
        return pnDAL.TK_TienTheoNCC();
    }
}
