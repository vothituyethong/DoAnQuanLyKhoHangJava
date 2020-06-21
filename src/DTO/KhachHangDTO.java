package DTO;
public class KhachHangDTO
{
    private String MA_KH;
    private String TEN_KH;
    private String D_CHI;
    private String SDT;
    public KhachHangDTO()
    {
        MA_KH=null;
        TEN_KH=null;
        D_CHI=null;
        SDT=null;
    }
    public KhachHangDTO(String MA_KH,String TEN_KH,String D_CHI, String SDT)
    {
        this.MA_KH=MA_KH;
        this.TEN_KH=TEN_KH;
        this.D_CHI=D_CHI;
        this.SDT=SDT;
    }

    public String getMA_KH() {
        return MA_KH;
    }

    public String getTEN_KH() {
        return TEN_KH;
    }

    public String getD_CHI() {
        return D_CHI;
    }

    public String getSDT() {
        return SDT;
    }

    public void setMA_KH(String MA_KH) {
        this.MA_KH = MA_KH;
    }

    public void setTEN_KH(String TEN_KH) {
        this.TEN_KH = TEN_KH;
    }

    public void setD_CHI(String D_CHI) {
        this.D_CHI = D_CHI;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
}
