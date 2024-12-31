import java.io.IOException;
import java.util.List;

import DataAccess.FileOpen;

public class DataHolder {
	private List<List<String>> vendorPossesions;
	private List<List<String>> furnitureParts;
	private List<List<String>> manifacturer1Furnitures;
	private List<List<String>> manifacturer2Furnitures;
	private List<List<String>> manifacturer1Materials;
	private List<List<String>> manifacturer2Materials;
	private List<List<String>> rawMaterialProperties;


	public DataHolder() {
		// TODO Auto-generated constructor stub
	}

	public void createVendorPossesions() throws IOException {
		this.vendorPossesions=FileOpen.getTwoDim("VendorPossessions.csv");}
	
	public void createFurnitureParts() throws IOException {
		this.furnitureParts=FileOpen.getTwoDim("FurnitureParts.csv");}
	
	public void createManifacturer1Furnitures() throws IOException {
		this.manifacturer1Furnitures=FileOpen.getTwoDim("Manifacturer1Furnitures.csv");}
	
	public void createManifacturer1Materials() throws IOException {
		this.manifacturer1Materials=FileOpen.getTwoDim("Manifacturer1Materials.csv");}
	
	public void createManifacturer2Furnitures() throws IOException {
		this.manifacturer2Furnitures=FileOpen.getTwoDim("Manifacturer2Furnitures.csv");}
	
	public void createManifacturer2Materials() throws IOException {
		this.manifacturer2Materials=FileOpen.getTwoDim("Manifacturer2Materials.csv");}
	
	public void createRawMaterialProperties() throws IOException {
		this.rawMaterialProperties=FileOpen.getTwoDim("RawMaterialProperties.csv");}
	
	/**
	 * @return the vendorPossesions
	 */
	public List<List<String>> getVendorPossesions() {
		return vendorPossesions;
	}
	
	/**
	 * @return the furnitureParts
	 */
	public List<List<String>> getFurnitureParts() {
		return furnitureParts;
	}
	
	/**
	 * @return the manifacturer1Furnitures
	 */
	public List<List<String>> getManifacturer1Furnitures() {
		return manifacturer1Furnitures;
	}
	
	/**
	 * @return the manifacturer2Furnitures
	 */
	public List<List<String>> getManifacturer2Furnitures() {
		return manifacturer2Furnitures;
	}
	
	/**
	 * @return the manifacturer1Materials
	 */
	public List<List<String>> getManifacturer1Materials() {
		return manifacturer1Materials;
	}
	
	/**
	 * @return the manifacturer2Materials
	 */
	public List<List<String>> getManifacturer2Materials() {
		return manifacturer2Materials;
	}
	
	/**
	 * @return the rawMaterialProperties
	 */
	public List<List<String>> getRawMaterialProperties() {
		return rawMaterialProperties;
	}

}
