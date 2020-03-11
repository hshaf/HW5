package p1;

public class TextbookBag {
	private Textbook[] textbookArray;
	private int nElems;
	
	public TextbookBag(int maxSize) {
		textbookArray = new Textbook[maxSize];
		nElems = 0;
	}

	public int getnElems() {
		return nElems;
	}

	public void setnElems(int nElems) {
		this.nElems = nElems;
	}
	
	// remove by book title method
	public Textbook removeByBookTitle(String bookTitle) {
		int i;
		
		for (i = 0; i < nElems; i++) {
			if(textbookArray[i].getBookTitle().equals(bookTitle)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} 
		
		else {
			Textbook temp = textbookArray[i];
			
			for (int j = i; j < nElems - 1; j++) {
				textbookArray[i] = textbookArray[j + 1];
			}
			
			nElems--;
			return temp;
		}
	}
	
	// remove by isbn method
	public Textbook removeByIsbn(String isbn) {
		int i;
		
		for (i = 0; i < nElems; i++) {
			if(textbookArray[i].getIsbn().equals(isbn)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} 
		
		else {
			Textbook temp = textbookArray[i];
			
			for (int j = i; j < nElems - 1; j++) {
				textbookArray[i] = textbookArray[j + 1];
			}
			
			nElems--;
			return temp;
		}
	}
	
	// search by book title method
	public Textbook searchByBookTitle(String bookTitle) {
		for (int i = 0; i < nElems; i++) {
			if (textbookArray[i].getBookTitle().equals(bookTitle)) {
				return textbookArray[i];
			}
		}
		
		return null;
	}
	
	// search by isbn method
	public Textbook searchByIsbn(String isbn) {
		for (int i = 0; i < nElems; i++) {
			if (textbookArray[i].getIsbn().equals(isbn)) {
				return textbookArray[i];
			}
		}
		
		return null;
	}
	
	// insert method
	public void insert(Textbook textbook) {
		textbookArray[nElems++] = textbook;
	}
	
	// display method
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(textbookArray[i]);
		}
	}
}
