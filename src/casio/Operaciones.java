package casio;

import java.text.DecimalFormat;

public class Operaciones {
	double n1;
	double n2;
	
	public Operaciones(double n1, double n2) {
		super();
		this.n1=n1;
		this.n2=n2;
	}
	
	public double getN1() {
		return n1;
	}
	
	public void setN1(double n1) {
		this.n1 = n1;
	}
	
	public double getN2() {
		return n2;
	}
	
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public double sumaNumeros() {
		return (n1+n2);
	}

	public double restaNumeros() {
		if (n1>n2) {
			return (n1-n2);
		} else {
			return (n2-n1);	
		}
		
	}
	
	public double multiNumeros() {
		return (n1*n2);
	}
	
	public double diviNumeros() {
		DecimalFormat df = new DecimalFormat("#.00");

		if (n1==0 || n2==0) {
			return (0);
		} else {
			String red = df.format(n1/n2);
			double d=Double.parseDouble(red);
			return (d);	
		}
		
	}
}

