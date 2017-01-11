package bai2_MyMath;

public class MyMath {
	
	public static int comDiv(int a, int b){
		int temp;
		while(b > 0){
			temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
	
	public static float min(float a, float b, float c){
		float ans = a;
		if(b < a) ans = b;
		if(c < a) ans = c;
		return ans;
	}
	
	public static float max(float a, float b, float c){
		float ans = a;
		if(b > a) ans = b;
		if(c > a) ans = c;
		return ans;
	}
	
	public static boolean isPrimeNumber(int a){
		if(a < 2) return false;
		if(a == 2) return true;
		if(a % 2 == 0) return false;
		for(int i = 3; i < Math.sqrt(a); i+=2){
			if(a % i == 0) return false;
		}
		return true;
	}
	
	public static int sumRange(int n){
		return n*(n+1)/2;
	}
	
	public static int abs(int a){
		return Math.abs(a);
	}
	
	public static int round(float a){
		return (int) a;
	}
}
