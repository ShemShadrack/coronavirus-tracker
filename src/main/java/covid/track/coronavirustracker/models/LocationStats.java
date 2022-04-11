package covid.track.coronavirustracker.models;

/**
 * @author okech
 *
 */
public class LocationStats {
	private String country;
	private String state;
	private int latestTotalCases;
	private int diffFromPrefDay;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	public int getDiffFromPrefDay() {
		return diffFromPrefDay;
	}
	public void setDiffFromPrefDay(int diffFromPrefDay) {
		this.diffFromPrefDay = diffFromPrefDay;
	}	

	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ "]";
	}
	
}
