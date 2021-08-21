package calc.ass1;


public class Calculator {
	public double multi(int n1, int n2)
	{
		return n1*n2;
	}
	public double div(int n1, int n2){
		return n1/n2;
	}
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		System.out.println(obj.multi(20,10));
		System.out.println(obj.div(20,10));

	    
	  }

	}

