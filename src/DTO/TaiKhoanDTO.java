package DTO;
public class TaiKhoanDTO 
{
    private String USERNAME ;
    private String PASSWORD;
    private String MA_NV;
    private String MA_QUYEN;
    private int KHOA;
    public TaiKhoanDTO()
    {
        USERNAME=null;
        PASSWORD=null;
        MA_NV=null;
        MA_QUYEN=null;
        KHOA=0;
    }
    public TaiKhoanDTO(String USERNAME, String PASSWORD, String MA_NV, String MA_QUYEN, int KHOA)
    {
        this.USERNAME=USERNAME;
        this.PASSWORD=PASSWORD;
        this.MA_NV=MA_NV;
        this.MA_QUYEN=MA_QUYEN;
        this.KHOA=KHOA;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getMA_NV() {
        return MA_NV;
    }

    public String getMA_QUYEN() {
        return MA_QUYEN;
    }

    public int getKHOA() {
        return KHOA;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public void setMA_NV(String MA_NV) {
        this.MA_NV = MA_NV;
    }

    public void setMA_QUYEN(String MA_QUYEN) {
        this.MA_QUYEN = MA_QUYEN;
    }

    public void setKHOA(int KHOA) {
        this.KHOA = KHOA;
    }
    
}
