package advance.dev;

public class Triangle extends Shape{
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		double p = (a + b + c)/2;
		return p = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Triangle: dt: %.2f - cv: %.2f", dienTich(), chuVi());
		
	}
}
