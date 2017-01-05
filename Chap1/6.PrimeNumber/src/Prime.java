import java.util.Scanner;

public class Prime {

	public static boolean checkPrime(int n) {
		boolean check = true;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		if (n < 2)
			return false;
		else
			for (int i = 3; i < Math.round(Math.sqrt(n)); i += 2)
				if (n % i == 0)	check = false;
		return check;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Nhập số nguyên n: ");
		n = sc.nextInt();

		if (checkPrime(n))
			System.out.println(n + " là số nguyên tố!");
		else
			System.out.println(n + " không là số nguyên tố!");
		sc.close();
		
	}
}
