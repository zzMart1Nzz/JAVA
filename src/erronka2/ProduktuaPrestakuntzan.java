package erronka2;

public class ProduktuaPrestakuntzan {
	
	private int idProdPrest;
	private int ProduktuMota_idProduktuMota;
	private int Bezeroa_idBezeroa;
	private String marka;
	private String modeloa;
	private String ezaugarriak;
	private String egoera;
	
	//KONSTRUKOTEREAK
	public ProduktuaPrestakuntzan(int idProdPrest, int produktuMota_idProduktuMota, int bezeroa_idBezeroa, String marka,
			String modeloa, String ezaugarriak, String egoera) {
		this.idProdPrest = idProdPrest;
		ProduktuMota_idProduktuMota = produktuMota_idProduktuMota;
		Bezeroa_idBezeroa = bezeroa_idBezeroa;
		this.marka = marka;
		this.modeloa = modeloa;
		this.ezaugarriak = ezaugarriak;
		this.egoera = egoera;
	}
	
	//GETTERRAK ETA SETTERRAK
	public int getIdProdPrest() {
		return idProdPrest;
	}

	public void setIdProdPrest(int idProdPrest) {
		this.idProdPrest = idProdPrest;
	}

	public int getProduktuMota_idProduktuMota() {
		return ProduktuMota_idProduktuMota;
	}

	public void setProduktuMota_idProduktuMota(int produktuMota_idProduktuMota) {
		ProduktuMota_idProduktuMota = produktuMota_idProduktuMota;
	}

	public int getBezeroa_idBezeroa() {
		return Bezeroa_idBezeroa;
	}

	public void setBezeroa_idBezeroa(int bezeroa_idBezeroa) {
		Bezeroa_idBezeroa = bezeroa_idBezeroa;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModeloa() {
		return modeloa;
	}

	public void setModeloa(String modeloa) {
		this.modeloa = modeloa;
	}

	public String getEzaugarriak() {
		return ezaugarriak;
	}

	public void setEzaugarriak(String ezaugarriak) {
		this.ezaugarriak = ezaugarriak;
	}

	public String getEgoera() {
		return egoera;
	}

	public void setEgoera(String egoera) {
		this.egoera = egoera;
	}
	
	
	

}
