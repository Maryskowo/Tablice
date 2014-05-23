
public class Main {

	public static void main(String[] args) {
		
		Wektory test = new Wektory( 5 );
		
		test.set(1, 3);
		System.out.println(test.get(1));
		//System.out.println(test.size);
		
		double[] y = {3,5,3,1};
		Wektory test2 = new Wektory( y );
		System.out.println(test2.get(3));
		
		System.out.println(test2.max());
		System.out.println(test.max());
		
		double[] x = {3, 5, 3, 1};
		Wektory test3 = new Wektory( x );
		System.out.println(test3.add( x, y));
		
		System.out.println(test2.size());
		System.out.println(test.size());
		
		//System.out.println(test2.sort(2));

	}

}
