
package DTO;

public class ChiTietPX_DTO 
{
    private String MA_PX;
    private String MA_HANG;
    private int SO_LUONG;
    public ChiTietPX_DTO()
    {
        MA_PX=null;
        MA_HANG=null;
        SO_LUONG=0;
    }
    public ChiTietPX_DTO(String MA_PX, String MA_HANG, int SO_LUONG)
    {
        this.MA_HANG=MA_HANG;
        this.MA_PX=MA_PX;
        this.SO_LUONG=SO_LUONG;
    }

    public String getMA_PX() {
        return MA_PX;
    }

    public String getMA_HANG() {
        return MA_HANG;
    }

    public int getSO_LUONG() {
        return SO_LUONG;
    }

    public void setMA_PX(String MA_PX) {
        this.MA_PX = MA_PX;
    }

    public void setMA_HANG(String MA_HANG) {
        this.MA_HANG = MA_HANG;
    }

    public void setSO_LUONG(int SO_LUONG) {
        this.SO_LUONG = SO_LUONG;
    }
    
}
