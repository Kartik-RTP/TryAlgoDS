package algorithms;

import sort.InsertionSort;
import sort.Sort;
import util.CommonUtils;
import util.SortComparator;

public class TryAlgorithms {

	public static void main(String[] args) {
		trySort();
		
	}
	
/**
 * 
 */
private static void  trySort() {
	int[] input = new int[] {4,5,6,1,23,-5,77,8,4};
	int[] expect= new int[] {-5,1,4,4,5,6,8,23,77};
	
	//CommonUtils.printIntArray(input);
	Sort sorter=new InsertionSort();
	int[] output=sorter.sortInt(input);
	//CommonUtils.printIntArray(output);
	//CommonUtils.printIntArray(expect);
	System.out.println(SortComparator.compareIntArrays(output, expect));
}

}
