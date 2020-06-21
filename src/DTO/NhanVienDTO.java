package DTO;
import java.sql.Date;

public class NhanVienDTO 
{
    private String MA_NV;
    private String TEN_NV;
    private Date NG_SINH;
    private String G_TINH;
    private String D_CHI;
    private String SDT;
    private String CHUC_VU;
    public NhanVienDTO()
    {
        MA_NV=null;
        TEN_NV=null;
        NG_SINH=null;
        G_TINH=null;
        D_CHI=null;
        SDT=null;
        CHUC_VU=null;
    }
    public NhanVienDTO(String MA_NV, String TEN_NV, Date NG_SINH, String G_TINH, String SDT, String CHUC_VU)
    {
        this.MA_NV=MA_NV;
        this.TEN_NV=TEN_NV;
        this.NG_SINH=NG_SINH;
        this.G_TINH=G_TINH;
        this.D_CHI=D_CHI;
        this.SDT=SDT;
        this.CHUC_VU=CHUC_VU;
    }

    public String getMA_NV() {
        return MA_NV;
    }

    public String getTEN_NV() {
        return TEN_NV;
    }

    public Date getNG_SINH() {
        return NG_SINH;
    }

    public String getG_TINH() {
        return G_TINH;
    }

    public String getD_CHI() {
        return D_CHI;
    }

    public String getSDT() {
        return SDT;
    }

    public String getCHUC_VU() {
        return CHUC_VU;
    }

    public void setMA_NV(String MA_NV) {
        this.MA_NV = MA_NV;
    }

    public void setTEN_NV(String TEN_NV) {
        this.TEN_NV = TEN_NV;
    }

    public void setNG_SINH(Date NG_SINH) {
        this.NG_SINH = NG_SINH;
    }

    public void setG_TINH(String G_TINH) {
        this.G_TINH = G_TINH;
    }

    public void setD_CHI(String D_CHI) {
        this.D_CHI = D_CHI;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setCHUC_VU(String CHUC_VU) {
        this.CHUC_VU = CHUC_VU;
    }
    
}
