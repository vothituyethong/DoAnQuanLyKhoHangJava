package DTO;
public class HangHoaDTO 
{
    private String MA_HANG;
    private String TEN_HANG;
    private int SO_LUONG;
    private int GIA;
    private String MA_LOAI;
    public HangHoaDTO()
    {
        MA_HANG=null;
        TEN_HANG=null;
        SO_LUONG=0;
        GIA=0;
        MA_LOAI=null;
    }
    public HangHoaDTO(String MA_HANG,String TEN_HANG,int SO_LUONG, int GIA, String MA_LOAI)
    {
        this.MA_HANG=MA_HANG;
        this.TEN_HANG=TEN_HANG;
        this.SO_LUONG=SO_LUONG;
        this.GIA=GIA;
        this.MA_LOAI=MA_LOAI;
    }

    public String getMA_HANG() {
        return MA_HANG;
    }

    public String getTEN_HANG() {
        return TEN_HANG;
    }

    public int getSO_LUONG() {
        return SO_LUONG;
    }

    public int getGIA() {
        return GIA;
    }

    public String getMA_LOAI() {
        return MA_LOAI;
    }

    public void setMA_HANG(String MA_HANG) {
        this.MA_HANG = MA_HANG;
    }

    public void setTEN_HANG(String TEN_HANG) {
        this.TEN_HANG = TEN_HANG;
    }

    public void setSO_LUONG(int SO_LUONG) {
        this.SO_LUONG = SO_LUONG;
    }

    public void setGIA(int GIA) {
        this.GIA = GIA;
    }

    public void setMA_LOAI(String MA_LOAI) {
        this.MA_LOAI = MA_LOAI;
    }
    
}
