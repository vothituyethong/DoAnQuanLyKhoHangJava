package DTO;
public class NCC_DTO 
{
   private String MA_NCC;
   private String TEN_NCC;
   private String D_CHI ;
   private String SDT;
   public NCC_DTO()
   {
       MA_NCC=null;
       TEN_NCC=null;
       D_CHI=null;
   }
   public NCC_DTO(String MA_NCC, String TEN_NCC, String D_CHI, String SDT)
   {
       this.MA_NCC=MA_NCC;
       this.TEN_NCC=TEN_NCC;
       this.D_CHI=D_CHI;
       this.SDT=SDT;
   }

    public String getMA_NCC() {
        return MA_NCC;
    }

    public String getTEN_NCC() {
        return TEN_NCC;
    }

    public String getD_CHI() {
        return D_CHI;
    }

    public String getSDT() {
        return SDT;
    }

    public void setMA_NCC(String MA_NCC) {
        this.MA_NCC = MA_NCC;
    }

    public void setTEN_NCC(String TEN_NCC) {
        this.TEN_NCC = TEN_NCC;
    }

    public void setD_CHI(String D_CHI) {
        this.D_CHI = D_CHI;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
   
}
