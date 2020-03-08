package d10;

import java.util.Comparator;

public class agecomparator implements Comparator  {

	@Override
	public int compare(Object oo, Object pp) {
		cc ct = (cc)oo;
		cc ctr = (cc)pp;
		if(ct.age==ctr.age){
			return 1;
		}else {
			return -1;
				
			}
		
		
		
		
		
	}

}
