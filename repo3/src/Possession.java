
public class Possession {

	private String materialCode;
	private int quality;


    public Possession(){
		materialCode = "";
		quality = 0;
	}
	public Possession(String materialCode, int quality) {
		this.materialCode = materialCode;
		this.quality = quality;
	}
	public Possession(Possession otherPossesion){
		this.materialCode = otherPossesion.materialCode;
		this.quality = otherPossesion.quality;
	}

	/**
	 * @return the materialCode
	 */
	public String getMaterialCode() {
		return materialCode;
	}
	/**
	 * @return the quality
	 */
	public int getQuality() {
		return quality;
	}
}
