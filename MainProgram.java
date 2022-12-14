import java.util.Random;

public class MainProgram {
	
	public static void main(String[] args) {
		
		
		SinglyLinkedListInteger master = new SinglyLinkedListInteger();
		SinglyLinkedListInteger[] bins = new SinglyLinkedListInteger[10];

		Random rand = new Random();
		for (int i=0; i<1000000; i++) {
			master.createList(rand.nextInt(999999));

		}
		//System.out.println(master.printList());  //this was to test with a smaller list to make sure program works
		for (int i=0; i<bins.length; i++) {        //this loop creates the actual lists that the array of Singly Linked Lists reference variables reference
			bins[i] = new SinglyLinkedListInteger();
		}
		
		long start = System.currentTimeMillis();
		int n = 1;
		for (int i=0; i<6; i++){
			while (!master.empty()){
				int p = master.head.data;
				int digit = getDigit(p, n);
				master.insertRear(bins[digit]); 
				
			}
			for (int a = 0; a<10; a++) {  //this loop appends each of the lists to the master list
				master.append(bins[a]);
			}
		
			n = n*10;
		}
		
		//System.out.println(master.printList()); //this was to test with smaller list to make sure program works
		long time = System.currentTimeMillis()-start;
		System.out.println("The program took " + time + " milliseconds to run");

	}


	public static int getDigit(int Key, int n){               //n = 1 on pass , n=10 on pass 2, n= 100 on pass 3

		int digit;
		digit = (Key/n)%10;
		return digit;

	}



}
