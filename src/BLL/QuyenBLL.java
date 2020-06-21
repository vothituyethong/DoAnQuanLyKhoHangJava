package BLL;

import DAL.QuyenDAL;
import DTO.QuyenDTO;
import java.util.ArrayList;

public class QuyenBLL{
    QuyenDAL qDAL=new QuyenDAL();    

    public int insertQuyen(QuyenDTO quyenDTO){
        int result=qDAL.insertQuyen(quyenDTO);
        return result;
    }
    
    public int deletetQuyen(QuyenDTO quyenDTO){
        int result=qDAL.deleteQuyen(quyenDTO);
        return result;
    }
    
    public int updateQuyen(QuyenDTO quyenDTO,String id){
        int result=qDAL.updateQuyen(quyenDTO,id);
        return result;
    }
    
    public ArrayList<QuyenDTO> getAllQuyen(){
        return qDAL.getAllQuyen();
    }
    
    public ArrayList<QuyenDTO> searchQuyenMa(QuyenDTO quyenDTO){
        return qDAL.searchQuyenMa(quyenDTO);
    }
    
    public ArrayList<QuyenDTO> searchQuyenTen(QuyenDTO quyenDTO){
        return qDAL.searchQuyenTen(quyenDTO);
    }
    
    public String getTenQ(QuyenDTO quyenDTO){
        return qDAL.getTenQ(quyenDTO);
    }
}
