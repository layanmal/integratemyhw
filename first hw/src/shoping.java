import java.util.ArrayList;
public class shoping {
	ArrayList<Book> ala ;

	shoping() {
	
		ala =new ArrayList<Book>();	
		
	} 
	
	public int getcount() {
		int total=0 ;
		int i = ala.size() ; 
		for (int x =0 ; x<i;x++) { 
		total += ala.get(x).priceBook ;
		}
		return total ;
	}
}
