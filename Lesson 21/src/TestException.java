
public class TestException {
	public static void main(String[] args) {
		int a = 4, b= 0, res =0;
		String str = null;
		int size = 6;
		while(true){ //poka//beskonechnii cikl
			try{//blok try//opredelili potencialnuu opastnost
				res  = a/b;

				//		catch(Exception e){//object tipa exception//elsli owibka est on poimal, esli net poidet dalwe
				//			System.out.println("Exeption : " + e.getMessage());
				//		}
				System.out.println("Res  = " + res);

				res = str.length();
				//		catch(Exception e){
				//			System.out.println("Exeption : " + e.getMessage());
				//			System.out.println("Res = " + res);
				//		}
				int[] ar={5,8,9,46};

				for(int i=0; i<size; i++){
					System.out.print(" " + ar[i]);
				}
				break;//viidem is try kogda net owibok, a tak po krygy hodit i iwet owibky
			}

			catch(ArithmeticException e){
				System.out.println("\t ArithmeticException : " + e.getMessage());
				b=1;
			}
			catch(NullPointerException e){
				System.out.println("\t NullPointerException : " + e.getMessage());
				str = "Hello";
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("\t ArrayIndexOutOfBoundsException : " + e.getMessage());
				size --;
			}
		}
		System.out.println("End of programm");
	}

}

