
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
		String name = "blag";
		Integer[] a = new Integer[name.length()];
		for(int i=0;i<name.length();i++)
			a[i] = i;
		
		
		//permutation of a number
		//Integer a[] ={1,2,3,4};
		
		
		
		List<List<Integer>> listNum = new ArrayList<List<Integer>>();
		
		for(int i=0;i<a.length;i++)
		{
			List<Integer> li = new ArrayList<Integer>();
			li.add(a[i]);
			listNum.add(li);
			
		}
		
		
		listNum = recur(listNum,a);
		
		System.out.println("The Permutations are \n");
		
//		//permutation of a number
//		for(int i=0;i<listNum.size();i++)
//			System.out.println(listNum.get(i));
//		
		//permutation of a string
		for(int i=0;i<listNum.size();i++)
		{
			for(int j=0;j<listNum.get(i).size();j++)		
				System.out.print(name.charAt(listNum.get(i).get(j)));	
		
			System.out.println();
		}
		
		
		System.out.println("Size = "+listNum.size());
		
	}

}
