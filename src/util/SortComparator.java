package util;

public class SortComparator {

	public static boolean compareIntArrays(int[] output,int[] expect) {
		if(output.length!=expect.length) return false;
		
		for (int i=0;i<output.length;i++) {
			if(output[i]!=expect[i]) return false;
		} 
		return true;
	}
	
}
