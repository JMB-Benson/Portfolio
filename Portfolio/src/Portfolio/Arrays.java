package Portfolio;

public class Arrays {

	public static void main(String[] args) {
		String[] gamelist = {"Halo 2", "overwatch",
				"Rainbow six seige","halo reach","halo 3",
				"halo", "halo 5", "halo 4","minecraft",
				"titan fall 2", "titan fall",
				"call of duty ghost","call of duty black opps 3",
				"destiny 2"," destiny"," enter the gungeon", "mario sunshine",
				"luigis manshion","Mario kart double dash",
				"legend of zelda breath of the wild"};
		
		System.out.println("TOP 5:");		
		for (int i=0; i<5; i++) {
			
			System.out.println(gamelist[i]);
		}
		System.out.println("TOP 3:");
		for (int i=0; i<3; i++) {
			
			System.out.println(gamelist[i]);
		}
		System.out.println("LAST 5:");
		for (int i=16; i<19; i++) {
			
			System.out.println(gamelist[i]);
		}
		System.out.println("MIDDLE 5:");
		for (int i=7; i<12; i++) {
			
			System.out.println(gamelist[i]);
			
		}

	}

}
