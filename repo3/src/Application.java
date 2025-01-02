import java.io.IOException;

public class Application {

	public Application() {
		
	}

	public static void main(String[] args) throws IOException {
		DataHolder name = new DataHolder();
		name.createVendorPossesions();
		System.out.println(name.getVendorPossesions().get(0).get(0));

	}

}
