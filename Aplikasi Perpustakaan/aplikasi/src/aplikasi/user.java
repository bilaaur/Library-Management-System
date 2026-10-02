package aplikasi;

 public class user {
    private int NomorBuku;
    private String JudulBuku;
    private String PenulisBuku;
    private String PenerbitBuku;
    private int StockBuku;
    
    public user (int id,String Judulbuku,String Penulisbuku,String Penerbitbuku,int Stockbuku){
    this.NomorBuku = id;
    this.JudulBuku =  Judulbuku;
    this.PenulisBuku = Penulisbuku;
    this.PenerbitBuku = Penerbitbuku;
    this.StockBuku = Stockbuku;
    }

    user(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    user(int aInt, String string, String string0, String string1, String string2, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getid(){
        return NomorBuku;
    }
    
    public String getJudulbuku(){
        return JudulBuku;
    }
    
    public String getPenulisbuku(){
        return PenulisBuku;
    }
    
    public String getPenerbitbuku(){
        return PenerbitBuku;
    }
    
    public int getStockbuku(){
        return StockBuku;
    }
}
