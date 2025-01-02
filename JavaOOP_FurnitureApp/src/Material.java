
public class Material {
	
	private String materialCode;
	private int length;
	private int width;
	private int height;
	private int cost;
	private int volume;

	public Material() {
		this.materialCode="";
		this.length=0;
		this.width=0;
		this.height=0;
		this.cost=0;
		this.volume=0;
		
	}
	public Material(String materialCode,int length,int width,int height,int cost) {
		this.materialCode=materialCode;
		this.length=length;
		this.width=width;
		this.height=height;
		this.cost=cost;
		this.volume=length*width*height;
	}
	public Material(Material otherMaterials) {
		this.materialCode=otherMaterials.materialCode;
		this.length=otherMaterials.length;
		this.width=otherMaterials.width;
		this.height=otherMaterials.height;
		this.cost=otherMaterials.cost;
		this.volume=otherMaterials.length*otherMaterials.width*otherMaterials.height;
	}
	
	public String getMaterialCode() {
		return materialCode;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getCost() {
		return cost;
	}
	public int getVolume(){
		return volume;
	}
}

