package selenium;

import java.util.ArrayList;

public class demostream {

	public static void main(String[] args) {
		ArrayList<String> listname=new ArrayList<String>();
		listname.add("Karthiga");
		listname.add("Anbu");
		listname.add("Panbu");
		listname.add("Panivu");
		listname.add("Bakthi");
		listname.add("Saranagatham");
		int count=0;
		
		//Get names starts with "A"
		for(int i=0;i<listname.size();i++)
		{
			String actualname=listname.get(i);
			if(actualname.startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
