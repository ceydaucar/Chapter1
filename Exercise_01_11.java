
public class Exercise_01_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double secToYear = 31536000;
		double birthInYear = secToYear / 7;
		double deathInYear = secToYear / 13;
		double immigrantInYear = secToYear / 45;
		double effection = birthInYear - deathInYear + immigrantInYear;
		
		double populationNow = 312032486;
		
		for (double year = 1; year<6; year++) {
			System.out.println(populationNow + (effection * year));
		}	
	}
}
