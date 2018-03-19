
import java.util.ArrayList;
import java.util.List;

public class permGen {

	public static List<List<Integer>> recur(List<List<Integer>> listNum,Integer num[])
	{

		
		if(listNum.size()!=0)
			if(listNum.get(0).size()==num.length)
				return listNum;
		
		List<List<Integer>> NewlistNum = new ArrayList<List<Integer>>();
		for(int j=0;j<listNum.size();j++)
		{	

			for(int i=0;i<num.length;i++)
			{
				List<Integer> temLst = new ArrayList<>(listNum.get(j));
				
				if(!temLst.contains(num[i]))
				{
					temLst.add(num[i]);
					NewlistNum.add(temLst);
				}
						
			}
		}

	return recur(NewlistNum,num);
	
	}
	
	
	public static void main(String args[])
	{
		
		//permutation of a string
		String name = "cabd";
		Integer[] a = new Integer[name.length()];
		for(int i=0;i<name.length();i++)
			a[i] = i;
		
		
//		//permutation of a number
//		Integer arr[] ={1,1,0,4};
//		Integer[] a = new Integer[arr.length];
//		for(int i=0;i<arr.length;i++)
//			a[i] = i;
//		
		
		
		
		List<List<Integer>> listNum = new ArrayList<List<Integer>>();
		
		for(int i=0;i<a.length;i++)
		{
			List<Integer> li = new ArrayList<Integer>();
			li.add(a[i]);
			listNum.add(li);
			
		}
		
		
		listNum = recur(listNum,a);
		
		System.out.println("The Permutations are \n");
		
		for(int i=0;i<listNum.size();i++)
		{
			for(int j=0;j<listNum.get(i).size();j++)		
				{
					//permutation of a number
					//System.out.print(arr[listNum.get(i).get(j)]);
				
					//permutation of a string
					System.out.print(name.charAt(listNum.get(i).get(j)));	
				
				}
			System.out.println();
		}
		
		
		System.out.println("\nSize = "+listNum.size());
		
	}

}
