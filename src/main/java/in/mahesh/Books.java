package in.mahesh;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Books {
	@Id
	private Integer bookId;
	private String bookName;
	private double bookPrice;
	public int getBookId() {
		return bookId;
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	

}
