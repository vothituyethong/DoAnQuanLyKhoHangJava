
package DTO;

public class ChiTietPN_DTO 
{
    private String MA_PN;
    private String MA_HANG;
    private int SO_LUONG;
    public ChiTietPN_DTO()
    {
        MA_PN=null;
        MA_HANG=null;
        SO_LUONG=0;
    }
    public ChiTietPN_DTO(String MA_PN, String MA_HANG, int SO_LUONG)
    {
        this.MA_HANG=MA_HANG;
        this.MA_PN=MA_PN;
        this.SO_LUONG=SO_LUONG;
    }

    public String getMA_PN() {
        return MA_PN;
    }

    public String getMA_HANG() {
        return MA_HANG;
    }

    public int getSO_LUONG() {
        return SO_LUONG;
    }

    public void setMA_PN(String MA_PN) {
        this.MA_PN = MA_PN;
    }

    public void setMA_HANG(String MA_HANG) {
        this.MA_HANG = MA_HANG;
    }

    public void setSO_LUONG(int SO_LUONG) {
        this.SO_LUONG = SO_LUONG;
    }
    
}