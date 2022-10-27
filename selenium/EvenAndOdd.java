package selenium;
import java.util.ArrayList;
import java.util.Collections;
public class EvenAndOdd {
	
		public static ArrayList<Integer> even= new ArrayList<Integer>() ;
		public static ArrayList<Integer> odd= new ArrayList<Integer>() ;
		
		
	   void calculate(int[] arr) {	
			for(int i=0;i<arr.length;i++)
			{	
				if(arr[i] %2 ==0)
				{
					even.add(arr[i]);
					
				}
				else
				{
					odd.add(arr[i]);
					
				}
			}
			Collections.sort(even);
			Collections.sort(odd);
			even.addAll(odd);
			System.out.println( even);
		}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int arr[]={0,5,7,6,2,1,8} ;
				EvenAndOdd p=new EvenAndOdd();
				p.calculate(arr);
			}
		}

