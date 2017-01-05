
import java.util.Scanner;

public class QuadEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, x1, x2, delta;

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập hệ số a, b, c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		delta = Math.pow(b, 2.0) - 4 * a * c;

		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					System.out.println("Phương trình vô số nghiệm");
				else
					System.out.println("Phương trình vô nghiệm");
			} else {
				x1 = -c / b;
				System.out.println("Phương trình có nghiệm x = " + x1);
			}
		} else if (delta > 0) {
			x1 = (-b - Math.sqrt(delta)) / (2 * a);
			x2 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Phương trình có 2 nghiệm: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else if (delta == 0) {
			x1 = x2 = -b / (2 * a);
			System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
		} else {
			System.out.println("Phương trình vô nghiệm!");
		}

		sc.close();
	}
}
