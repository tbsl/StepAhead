package RND;

public class stringa {

	public static void main(String[] args) {

	
		System.out.println(calcEmi(9500, 12, 3));
		
	}
	
	public static Double calcEmi(double p, double r, double n) {
        double R = (r / 12) / 100;
        double e = (p * R * (Math.pow((1 + R), n)) / ((Math.pow((1 + R), n)) - 1));

        return e;
      }

}
