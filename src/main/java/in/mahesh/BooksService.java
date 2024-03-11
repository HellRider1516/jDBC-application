package in.mahesh;

import org.springframework.stereotype.Service;

@Service
public class BooksService {
	
	private IBook iBook;

	public BooksService(IBook iBook) {
		super();
		this.iBook = iBook;
	}
	public void m1() {
		Books b=new Books();
		b.setBookId(1);
		b.setBookName("java");
		b.setBookPrice(1000.00);
		iBook.save(b);
		System.out.println("sucessfuly done...");
	}
	

}
