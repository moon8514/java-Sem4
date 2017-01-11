package bai6_Fraction;

public class Fraction {
	private int numerator, denominator;
	
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		reduce();
	}
	
	private int GCD(int a, int b) {
		int temp;
		while(b > 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
	
	public void reduce() {
		int MSC = GCD(Math.abs(numerator), Math.abs(denominator));
		numerator /= MSC;
		denominator /= MSC;
	}
	
	public void add(Fraction f) {
		if(this.denominator == f.denominator) {
			this.numerator += f.numerator;
		} else {
			this.numerator = this.numerator*f.denominator + f.numerator*this.denominator;
			this.denominator *= f.denominator;
		}
		reduce();
	}
	
	public void sub(Fraction f) {
		if(this.denominator == f.denominator) {
			this.numerator -= f.numerator;
		} else {
			this.numerator = this.numerator*f.denominator - f.numerator*this.denominator;
			this.denominator *= f.denominator;
		}
		reduce();
	}
	
	public void mul(Fraction f) {
		this.numerator *= f.numerator;
		this.denominator *= f.denominator;
		reduce();
	}
	
	public void div(Fraction f) {
		this.numerator *= f.denominator;
		this.denominator *= f.numerator;
	}
	
	public void inverse() {
		this.numerator = this.numerator ^ this.denominator;
		this.denominator = this.numerator ^ this.denominator;
		this.numerator = this.numerator ^ this.denominator;
	}
	
	public void display() {
		System.out.println(numerator + "/" + denominator);
	}
}
