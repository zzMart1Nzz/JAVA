package erronka2;

public class Produktua {

    private int id;
    private int produktuMotaId;
    private String marka;
    private String modeloa;
    private String memoria;
    private String ram;
    private String prozesagailua;
    private String tamaina;
    private String sistemaEragilea;
    private String kamara;
    private String erresoluzioa;
    private String frekuentzia;
    private String kolorea;
    private double salmentaPrezioa;
    private int stock;

    public Produktua(int id, int produktuMotaId, String marka, String modeloa, String memoria, String ram,
                     String prozesagailua, String tamaina, String sistemaEragilea, String kamara, String erresoluzioa,
                     String frekuentzia, String kolorea, double salmentaPrezioa, int stock) {
        this.id = id;
        this.produktuMotaId = produktuMotaId;
        this.marka = marka;
        this.modeloa = modeloa;
        this.memoria = memoria;
        this.ram = ram;
        this.prozesagailua = prozesagailua;
        this.tamaina = tamaina;
        this.sistemaEragilea = sistemaEragilea;
        this.kamara = kamara;
        this.erresoluzioa = erresoluzioa;
        this.frekuentzia = frekuentzia;
        this.kolorea = kolorea;
        this.salmentaPrezioa = salmentaPrezioa;
        this.stock = stock;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getProduktuMotaId() { return produktuMotaId; }
    public void setProduktuMotaId(int produktuMotaId) { this.produktuMotaId = produktuMotaId; }
    public String getMarka() { return marka; }
    public void setMarka(String marka) { this.marka = marka; }
    public String getModeloa() { return modeloa; }
    public void setModeloa(String modeloa) { this.modeloa = modeloa; }
    public String getMemoria() { return memoria; }
    public void setMemoria(String memoria) { this.memoria = memoria; }
    public String getRam() { return ram; }
    public void setRam(String ram) { this.ram = ram; }
    public String getProzesagailua() { return prozesagailua; }
    public void setProzesagailua(String prozesagailua) { this.prozesagailua = prozesagailua; }
    public String getTamaina() { return tamaina; }
    public void setTamaina(String tamaina) { this.tamaina = tamaina; }
    public String getSistemaEragilea() { return sistemaEragilea; }
    public void setSistemaEragilea(String sistemaEragilea) { this.sistemaEragilea = sistemaEragilea; }
    public String getKamara() { return kamara; }
    public void setKamara(String kamara) { this.kamara = kamara; }
    public String getErresoluzioa() { return erresoluzioa; }
    public void setErresoluzioa(String erresoluzioa) { this.erresoluzioa = erresoluzioa; }
    public String getFrekuentzia() { return frekuentzia; }
    public void setFrekuentzia(String frekuentzia) { this.frekuentzia = frekuentzia; }
    public String getKolorea() { return kolorea; }
    public void setKolorea(String kolorea) { this.kolorea = kolorea; }
    public double getSalmentaPrezioa() { return salmentaPrezioa; }
    public void setSalmentaPrezioa(double salmentaPrezioa) { this.salmentaPrezioa = salmentaPrezioa; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
