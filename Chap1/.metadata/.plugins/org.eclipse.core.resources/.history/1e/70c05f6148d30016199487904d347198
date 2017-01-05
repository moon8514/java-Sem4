import java.util.Scanner;

public class GCD {

	public static int GCD(int a, int b) {
		int temp;
		while (b != 0){
			temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên a và b: ");
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("GCD(a,b) = " + GCD(a,b));
		sc.close();
	}
}
