package DTO;
public class QuyenDTO 
{
    private String MA_QUYEN;
    private String TEN_QUYEN;
    public QuyenDTO()
    {
        MA_QUYEN=null;
        TEN_QUYEN=null;
    }
    public QuyenDTO(String MA_QUYEN, String TEN_QUYEN)
    {
        this.MA_QUYEN=MA_QUYEN;
        this.TEN_QUYEN=TEN_QUYEN;
    }

    public String getMA_QUYEN() {
        return MA_QUYEN;
    }

    public String getTEN_QUYEN() {
        return TEN_QUYEN;
    }

    public void setMA_QUYEN(String MA_QUYEN) {
        this.MA_QUYEN = MA_QUYEN;
    }

    public void setTEN_QUYEN(String TEN_QUYEN) {
        this.TEN_QUYEN = TEN_QUYEN;
    }
    
}
