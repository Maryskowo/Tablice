import java.util.*;
public class Wektory {

	int i;
	double n;
	double tablica[];
	
	public Wektory( int i ){
		tablica = new double[i];
		this.i = i-1;
	}
	
	public Wektory( double t[] ){
		int i = t.length;
		this.i = i-1;
		tablica = new double[i];
		
		for( i = i-1; i >= 0 ; i-- ){
			tablica[i] = t[i];
		}
	}
	
	
	
	void set( int i, int n ){
		tablica[i] = n;
	}
	
	double get( int i ){
		return tablica[i];
	}
	
	double max( ){
		Arrays.sort(tablica);
		return tablica[i];
	}
	
	double min(){
		Arrays.sort(tablica);;
		return tablica[0];
	}
	
	String add( double t1[], double t2[]){
		int b = t1.length;
		tablica = new double[b];
		for( int c = 0; b > 0; c++, b--){
			tablica[c] = t1[c]+t2[c];
		}
		return Arrays.toString(tablica);
	}
	
	int size( ){
		return tablica.length;
	}
	
	String tostring(){
		return Arrays.toString(tablica);
	}
	
	/*String sort( int a ){
		int dl = tablica.length;
		dl = dl -1;
		if( a == 1){
			Arrays.sort(tablica, 0, dl);
		}
		else{
			Arrays.s
			}
		return Arrays.toString(tablica);
	}*/
}