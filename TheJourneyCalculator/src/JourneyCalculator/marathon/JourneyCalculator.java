package JourneyCalculator.marathon;

public class JourneyCalculator {
	public static void main(String[] args) {
		JourneyCalculator j = new JourneyCalculator();
		System.out.printf("%.2f", j.calculateDistance(60.0, 1.5));
		
	}
	
		public double calculateDistance(double speed, double time) {
			return speed*time;
		
		}
	

}
