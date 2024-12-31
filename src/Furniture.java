import java.util.ArrayList;
import java.util.List;


public class Furniture {
	private String furnitureCode;
	private int cost;
	private int income ; 
	private double quality;
	private List<Material> materialList;
	private	List<Integer> countOfMaterials;
	
	public Furniture(String furnitureCode,List<Material> materialList, List<Integer> countOfMaterials,List<Double> vendorQuality){
		this.furnitureCode=furnitureCode;
		this.cost = costCalculate();
		this.income = incomeCalculate();
		this.quality = qualityCalculate(vendorQuality);
		this.materialList=materialList;
		this.countOfMaterials=countOfMaterials;
	}
	public Furniture(){
		this.furnitureCode="";
		this.cost = 0;
		this.income = 0;
		this.quality = 0.0;
		this.materialList= new ArrayList<Material>();
		this.countOfMaterials= new ArrayList<Integer>();
	}
	public Furniture(Furniture otherFurniture){
		this.furnitureCode=otherFurniture.furnitureCode;
		this.cost = otherFurniture.cost;
		this.income = otherFurniture.income;
		this.quality = otherFurniture.quality;
		this.materialList=otherFurniture.materialList;
		this.countOfMaterials=otherFurniture.countOfMaterials;
	}
	private int costCalculate() {
		int result=0;
		int i =0;
		for(Material temp:materialList){
			result+=temp.getCost()*countOfMaterials.get(i);
			i++;
		}
		return result;
	}
	private int incomeCalculate(){
		int incomeConstant;
		switch (furnitureCode.substring(0)) {
		case "T":
			incomeConstant=300;
			break;
		case "W":
			incomeConstant=320;
			break;
		case "S":
			incomeConstant=280;
		default:
			incomeConstant=0;
			break;
		}
		return (getCost()*incomeConstant)/100;
	}
	private double qualityCalculate(List<Double> vendorQuality){
		double furnitureQuality = 0.0;
		double qualityxVolume=0;
		double totalVolume=0;
		int i=0;
		for(Material temp:materialList){
			qualityxVolume+=vendorQuality.get(i)*temp.getVolume();
			totalVolume+=temp.getVolume();
			i++;
		}
		furnitureQuality = qualityxVolume/totalVolume ; 
		return furnitureQuality;
	}
	public int getCost(){
		return cost;
	}
	public int getIncome(){
		return income;
	}
	public double getQuality(){
		return quality;
	}
}
