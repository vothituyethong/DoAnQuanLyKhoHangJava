package DTO;
public class LoaiHangDTO 
{
    private String MA_LOAI;
    private String TEN_LOAI;
    public LoaiHangDTO()
    {
        MA_LOAI=null;
        TEN_LOAI=null;
    }
    public LoaiHangDTO(String MA_LOAI,String TEN_HANG)
    {
        this.TEN_LOAI=TEN_LOAI;
        this.MA_LOAI=MA_LOAI;
    }

    public String getMA_LOAI() {
        return MA_LOAI;
    }

    public String getTEN_LOAI() {
        return TEN_LOAI;
    }

    public void setMA_LOAI(String MA_LOAI) {
        this.MA_LOAI = MA_LOAI;
    }

    public void setTEN_LOAI(String TEN_LOAI) {
        this.TEN_LOAI = TEN_LOAI;
    }
    
}
