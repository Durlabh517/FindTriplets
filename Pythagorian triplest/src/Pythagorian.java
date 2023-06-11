import java.util.ArrayList;
import java.util.List;

public class Pythagorian {
	
	public void findTriplets(List<Integer> list1) {
		List<Integer> list2=list1;
		int i=0;
		int j=0;
		int k=0;
		
		for(i=0;i <list2.size();i++) {
			
			for(j=i+1;j<list2.size();j++) {
				
				for(k=j+1;k<list2.size();k++) {
					
					int d=list2.get(i);
					int e=list2.get(j);
					int f=list2.get(k);
					
					int a=(int) Math.pow(d , 2);
					int b=(int) Math.pow(e, 2);
					int c= (int) Math.pow(f, 2);
					
					
					
					if((a+b) == c) {
						System.out.println("Success");
						
					
					
				}
				
				
				
			}
			
		}
		}
		System.out.println("Failure");
		
	}
	
	public static void main(String[] args) {
		
		//Create a list 
		List<Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		
		
		Pythagorian py= new Pythagorian();
		py.findTriplets(list);
		
		
		
	}

}
