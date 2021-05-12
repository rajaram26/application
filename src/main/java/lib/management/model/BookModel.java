package lib.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_model")
public class BookModel {
	
	@Id
	@Column(name="book_id")
	private String bookId;
	@Column(name="book_name")
	private String bookName;
	@Column(name="genre")
	private String genre;
	@Column(name="quantity")
	private int quantity;
	
	
	public BookModel(String bookId, String bookName, String genre, int quantity) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.genre = genre;
		this.quantity = quantity;
	}
	
	
	public BookModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BookModel [bookId=" + bookId + ", bookName=" + bookName + ", genre=" + genre + ", quantity=" + quantity
				+ "]";
	}
	
	
}
