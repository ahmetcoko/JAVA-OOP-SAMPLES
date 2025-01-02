import java.util.ArrayList;
import java.util.List;

public class Vendor {

	private List<Possession>   possessions;
	private Deque<Possession>   pl011Deque;
	private Deque<Possession>	pl012Deque;
	private Deque<Possession>	pl013Deque;
	private Deque<Possession>	wb121Deque;
	private Deque<Possession>	wb122Deque;
	private Deque<Possession>	wb123Deque;
	private Deque<Possession>	wb131Deque; 
	private Deque<Possession>	wb132Deque; 
	private Deque<Possession>	wp401Deque;
	private Deque<Possession>	wp402Deque;
	private Deque<Possession>	wp403Deque;
	private Deque<Possession>	wp404Deque;
	private Deque<Possession>	hd501Deque;
	private Deque<Possession>	hd502Deque;
    
	public Vendor(List<List<String>> vendorData){	
		seperatePossession(vendorData);
	}
	
	private void seperatePossession(List<List<String>> vendorData){
		List<Possession> possessions=new ArrayList<>();
		for(List<String> temp:vendorData){
			possessions.add(new Possession(temp.get(0),Integer.parseInt(temp.get(1))));
		}
		for(Possession tempPossession :this.possessions){
			switch(tempPossession.getMaterialCode()){
				case "PL011":
					pl011Deque.add(tempPossession);
				case "PL012":
					pl012Deque.add(tempPossession);
				case "PL013":
					pl013Deque.add(tempPossession);
				case "WB121":
					wb121Deque.add(tempPossession);
				case "WB122":
					wb122Deque.add(tempPossession);
				case "WB123":
					wb123Deque.add(tempPossession);
				case "WB131":
					wb131Deque.add(tempPossession);
				case "WP132":
					wb132Deque.add(tempPossession);
				case "WP401":
					wp401Deque.add(tempPossession);
				case "WP402":
					wp402Deque.add(tempPossession);
				case "WP403":
					wp403Deque.add(tempPossession);
				case "WP404":
					wp404Deque.add(tempPossession);
				case "HD501":
					hd501Deque.add(tempPossession);
				case "HD502":
					hd502Deque.add(tempPossession);
			}
		}
	}

	/**
	 * @return the possessions
	 */
	public List<Possession> getPossessions() {
		return possessions;
	}

	/**
	 * @return the pl011Deque
	 */
	public Deque<Possession> getPl011Deque() {
		return pl011Deque;
	}

	/**
	 * @return the pl012Deque
	 */
	public Deque<Possession> getPl012Deque() {
		return pl012Deque;
	}

	/**
	 * @return the pl013Deque
	 */
	public Deque<Possession> getPl013Deque() {
		return pl013Deque;
	}

	/**
	 * @return the wb121Deque
	 */
	public Deque<Possession> getWb121Deque() {
		return wb121Deque;
	}

	/**
	 * @return the wb122Deque
	 */
	public Deque<Possession> getWb122Deque() {
		return wb122Deque;
	}

	/**
	 * @return the wb123Deque
	 */
	public Deque<Possession> getWb123Deque() {
		return wb123Deque;
	}

	/**
	 * @return the wb131Deque
	 */
	public Deque<Possession> getWb131Deque() {
		return wb131Deque;
	}

	/**
	 * @return the wb132Deque
	 */
	public Deque<Possession> getWb132Deque() {
		return wb132Deque;
	}

	/**
	 * @return the wp401Deque
	 */
	public Deque<Possession> getWp401Deque() {
		return wp401Deque;
	}

	/**
	 * @return the wp402Deque
	 */
	public Deque<Possession> getWp402Deque() {
		return wp402Deque;
	}

	/**
	 * @return the wp403Deque
	 */
	public Deque<Possession> getWp403Deque() {
		return wp403Deque;
	}

	/**
	 * @return the wp404Deque
	 */
	public Deque<Possession> getWp404Deque() {
		return wp404Deque;
	}

	/**
	 * @return the hd501Deque
	 */
	public Deque<Possession> getHd501Deque() {
		return hd501Deque;
	}

	/**
	 * @return the hd502Deque
	 */
	public Deque<Possession> getHd502Deque() {
		return hd502Deque;
	}
	
}
