package net.antra1;

import java.util.Comparator;

public class SortOfTree implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		if(i1>i2) {
			//returns -ve iff obj1 has come before obj2
			return -1;
		}else if(i1<i2) {
			//returns +ve iff obj1 has come after obj2
			
			return +1;
		}else{
			return 0;
		}
		
	}

}
