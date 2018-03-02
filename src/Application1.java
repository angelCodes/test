
public class Application1{
	public static void main(String[] args) {
		Operation op = (a,b)->a+b;
		Operation op1 = (a,b)->a-b;
		Operation op2 = (a,b)->a*b;
		Operation op3 = (a,b)->a/b;
		affiche(90,30,op3);
	}
	
	static void affiche(int a, int b, Operation o) {
		System.out.println(o.calcul(a, b));
	}
}
