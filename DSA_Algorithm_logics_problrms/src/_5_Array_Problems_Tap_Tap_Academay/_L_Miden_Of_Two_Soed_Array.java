package _5_Array_Problems_Tap_Tap_Academay;

import javax.sound.midi.MidiChannel;


/**
 * median of two sorted array with time complexity is O(m+n) 
 */
public class _L_Miden_Of_Two_Soed_Array {

	public static double medianOfTwoSortedArray(int[] a,int[] b)
	{int i=0; int j=0; int k=0;
	int m[]=new int[a.length+b.length];
		while(i<a.length && j<b.length)
		{
			
			if(a[i]<b[j])
			{
				m[k++]=a[i];
//				k++;
				i++;
			}else
			{
				m[k++]=b[j];
				j++;
//				k++;		
			}
		}
		
		while(i<a.length)
		{
			m[k]=a[i];
			k++;
			i++;
		}
		while(i<a.length)
		{
			m[k]=b[j];
			j++;
			k++;
		}
		
		if(m.length%2==0)
		{
			int mid=m.length/2;
			
			return (m[mid]+m[mid-1])/2;
		}else
		{
			return m[m.length/2];	
		}
	}
	
	public static void main(String[] args) {
		int[] a= {1,4,5,6};
		int [] b= {2,3,7,8,9,10};//1,2,3,4,5,6,7,8,9,10
		System.out.println(medianOfTwoSortedArray(a,b));
		
	}
}
