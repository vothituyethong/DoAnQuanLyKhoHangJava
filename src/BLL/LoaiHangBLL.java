package BLL;

import DAL.LoaiHangDAL;
import DTO.LoaiHangDTO;
import java.util.ArrayList;

public class LoaiHangBLL{
    LoaiHangDAL lhDAL=new LoaiHangDAL();    

    public int insertl_hang(LoaiHangDTO l_hangDTO){
        int result=lhDAL.insertl_hang(l_hangDTO);
        return result;
    }
    
    public int deletetl_hang(LoaiHangDTO l_hangDTO){
        int result=lhDAL.deletel_hang(l_hangDTO);
        return result;
    }
    
    public int updatel_hang(LoaiHangDTO l_hangDTO,String id){
        int result=lhDAL.updatel_hang(l_hangDTO,id);
        return result;
    }
    
    public ArrayList<LoaiHangDTO> getAllL_Hang(){
        return lhDAL.getAllL_Hang();
    }
    
    public ArrayList<LoaiHangDTO> searchL_HangMa(LoaiHangDTO l_hangDTO){
        return lhDAL.searchL_HangMa(l_hangDTO);
    }
    public ArrayList<LoaiHangDTO> searchL_HangTen(LoaiHangDTO l_hangDTO){
        return lhDAL.searchL_HangTen(l_hangDTO);
    }
    public String getTenLoai (LoaiHangDTO l_hangDTO){
        return lhDAL.getTenLoai(l_hangDTO);
    }
   
}