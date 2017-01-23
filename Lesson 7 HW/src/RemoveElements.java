
public class RemoveElements {

	public static void main(String[] args) {

//		int[] ar = {5,7,8,9,4,1,2,6};
//		System.out.println(ar + "size: " + ar.length);
//		
//		ar = ArrayUtils.remove(ar, ar.length-1);
//		
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
		System.out.println(Arrays.toString(removed));
	}

}
