package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Shape shapes[] = new Shape[5];
		input(shapes);
		print(shapes);
		maxDienTich(shapes);
		maxChuVi(shapes);
	}

	private static void print(Shape[] shapes) {
		// TODO Auto-generated method stub
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}

	private static void maxDienTich(Shape[] shapes) {
		// TODO Auto-generated method stub
		Shape max = shapes[0];
		for (Shape shape : shapes) {
			if (max.dienTich() < shape.dienTich()) {
				max = shape;
			}
		}
		System.out.println("Hinh co dien tich lon nhat la: ");
		System.out.println(max);
	}
	private static void maxChuVi(Shape[] shapes) {
		// TODO Auto-generated method stub
		Shape max = shapes[0];
		for (Shape shape : shapes) {
			if (max.chuVi() < shape.chuVi()) {
				max = shape;
			}
		}
		System.out.println("Hinh co chu vi lon nhat la: ");
		System.out.println(max);
	}

	private static void input(Shape[] shapes) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 2 hinh chu nhat: ");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap canh a = ");
			double a = sc.nextDouble();
			System.out.println("Nhap canh b = ");
			double b = sc.nextDouble();
			shapes[i] = new Rectangle(a,b);
			System.out.println("--------------");
			sc.nextLine();
		}
		System.out.println("Nhap 2 hinh tron: ");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap r = ");
			double r = sc.nextDouble();
			shapes[i+2] = new Circle(r);
			System.out.println("--------------");
			sc.nextLine();
		}
		System.out.println("Nhap 1 hinh tam giac: ");
		System.out.println("Nhap canh a1: ");
		double a1 = sc.nextDouble();
		System.out.println("Nhap canh a2: ");
		double a2 = sc.nextDouble();
		System.out.println("Nhap canh a3: ");
		double a3 = sc.nextDouble();
		shapes[4] = new Triangle(a1,a2,a3);
		sc.close();
	}
}
