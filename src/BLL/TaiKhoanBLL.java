package BLL;

import DAL.TaiKhoanDAL;
import DTO.TaiKhoanDTO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class TaiKhoanBLL{
    TaiKhoanDAL tkDAL=new TaiKhoanDAL();    
    public ArrayList<TaiKhoanDTO> Login(TaiKhoanDTO tkDTO){
        tkDTO.setPASSWORD(md5(tkDTO.getPASSWORD()));
        return tkDAL.Login(tkDTO);
    }
    
    public int insertAccount(TaiKhoanDTO tkDTO){
        tkDTO.setPASSWORD(md5(tkDTO.getPASSWORD()));
        int result=tkDAL.insertAccount(tkDTO);
        return result;
    }
    
    public int deletetAccount(TaiKhoanDTO tkDTO){
        int result=tkDAL.deleteAccount(tkDTO);
        return result;
    }
    
    public int updateAccount(TaiKhoanDTO tkDTO,String username){
        tkDTO.setPASSWORD(md5(tkDTO.getPASSWORD()));
        int result=tkDAL.updateAccount(tkDTO,username);
        return result;
    }
    
    public ArrayList<TaiKhoanDTO> getAllAccount(){
        return tkDAL.getAllAccount();
    }
    
    public ArrayList<TaiKhoanDTO> searchAccountUS(TaiKhoanDTO tkDTO){
        return tkDAL.searchAccountUS(tkDTO);
    }    
    
    public ArrayList<TaiKhoanDTO> searchAccountManv(TaiKhoanDTO tkDTO){
        return tkDAL.searchAccountManv(tkDTO);
    }
    
    public String getUsernameByMANV(TaiKhoanDTO tkDTO){
        return tkDAL.getUsernameByMANV(tkDTO);
    }
    
    public int updateNewPwd(TaiKhoanDTO tkDTO){
        tkDTO.setPASSWORD(md5(tkDTO.getPASSWORD()));
        return tkDAL.updateNewPwd(tkDTO);
    }
    
    public int checkPwd(TaiKhoanDTO tkDTO){
        tkDTO.setPASSWORD(md5(tkDTO.getPASSWORD()));
        if(tkDTO.getPASSWORD().equals(tkDAL.getPwdByUsername(tkDTO))){
            return 1;
        }
        return 0;
    }
    
    public String md5(String str){
        String result = "";
	MessageDigest digest;
	try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(str.getBytes());
            BigInteger bigInteger = new BigInteger(1,digest.digest());
            result = bigInteger.toString(16);
	} catch (NoSuchAlgorithmException e) {
		e.printStackTrace();
	}
	return result;
    }
}