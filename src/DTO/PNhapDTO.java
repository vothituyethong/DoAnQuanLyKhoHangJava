package DTO;

import java.sql.Date;
public class PNhapDTO 
{
    private String MA_PN;
    private Date NGAY_LAP;
    private String MA_NV;
    private String MA_NCC;
    private int TONG_TIEN;
    public PNhapDTO()
    {
        MA_PN=null;
        NGAY_LAP=null;
        MA_NV=null;
        MA_NCC=null;
        TONG_TIEN=0;
    }
    public PNhapDTO(String MA_PN, Date NGAY_LAP, String MA_NV, String MA_NCC, int TONG_TIEN)
    {
        this.MA_PN=MA_PN;
        this.NGAY_LAP=NGAY_LAP;
        this.MA_NV=MA_NV;
        this.MA_NCC=MA_NCC;
        this.TONG_TIEN=TONG_TIEN;
    }

    public String getMA_PN() {
        return MA_PN;
    }

    public Date getNGAY_LAP() {
        return NGAY_LAP;
    }

    public String getMA_NV() {
        return MA_NV;
    }

    public String getMA_NCC() {
        return MA_NCC;
    }

    public int getTONG_TIEN() {
        return TONG_TIEN;
    }

    public void setMA_PN(String MA_PN) {
        this.MA_PN = MA_PN;
    }

    public void setNGAY_LAP(Date NGAY_LAP) {
        this.NGAY_LAP = NGAY_LAP;
    }

    public void setMA_NV(String MA_NV) {
        this.MA_NV = MA_NV;
    }

    public void setMA_NCC(String MA_NCC) {
        this.MA_NCC = MA_NCC;
    }

    public void setTONG_TIEN(int TONG_TIEN) {
        this.TONG_TIEN = TONG_TIEN;
    }
    
}
