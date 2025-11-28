package codingpractice.codingpractice;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=50;
		boolean tf=checkPrime(num);
		if(tf==true)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
				
	}

	private static boolean checkPrime(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0) {
				return true;
			}
		}	
		return false;
	}

}
