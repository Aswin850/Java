package arrayss;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SingleDimensionalArray sd=new SingleDimensionalArray(5);
//		sd.insert("A", 0);
//		sd.insert("B", 1);
//		sd.insert("C", 2);
//		sd.insert("D", 3);
//		sd.insert("E", 4);
//		
//		sd.searchInArray("A");
//		sd.delete(5);
//		sd.display();
		
		TwoDimensionalArray sd=new TwoDimensionalArray(2, 4);
		sd.insert(0, 0, 1);
		sd.insert(0, 1, 2);
		sd.insert(0, 2, 3);
		sd.insert(0, 3, 4);
		sd.insert(1, 0, 5);
		sd.insert(1, 1, 6);
		sd.insert(1, 2, 7);
		sd.insert(1, 3, 8);
		
//		sd.accessingElements(1, 3);
		sd.traverseArray();
		sd.search(5);
//		sd.display();
		

	}

}
