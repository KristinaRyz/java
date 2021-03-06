
public class ArrayException {

	public static void main(String[] args) {
//                  0 1 2 3 4 5 6 7 8
		int[] ar = {4,7,9,8,6,2,3,1,5};
		int indexFrom =0;
		int indexTo = 9;

		try{
			printSubArray(ar, indexFrom, indexTo);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("\t ArrayIndexOutOfBoundsException" + e.getMessage());
		}

		catch(NullPointerException e){
			System.out.println("\t NullPointerException" + e.getMessage());
		}

	}
	public static void printSubArray(int[] ar, int from, int to) throws NullPointerException, ArrayIndexOutOfBoundsException {
		if(ar== null){
			throw new NullPointerException("Array is NULL");
		}
		if(from >= to || from < 0){
			throw new ArrayIndexOutOfBoundsException("Error indexFrom");
		}
		if(ar.length == 0 || to > ar.length){
			throw new ArrayIndexOutOfBoundsException("Error indexTo");

		}

		for(int i=0; i<ar.length; i++){
			if(i>=from && i<=to)
				System.out.print(" " + ar[i]);
		}

		System.out.println("\t End of programm ");
	}

}
