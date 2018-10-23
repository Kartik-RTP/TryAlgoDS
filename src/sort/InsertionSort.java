package sort;

import util.CommonUtils;

public class InsertionSort implements Sort {

	@Override
	public int[] sortInt(int[] input) {
		int temp;
		for(int i=0;i<input.length;i++) {
			CommonUtils.printIntArray(input);
			for(int j=i;j>0;j--) {
				if(input[j-1]>input[j]) {
					temp=input[j-1];
					input[j-1]=input[j];
					input[j]=temp;
					CommonUtils.printIntArray(input);
				} 
			}
		}
		return input;
	}
	
}
