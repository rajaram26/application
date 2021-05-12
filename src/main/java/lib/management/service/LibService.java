package lib.management.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lib.management.model.BookModel;
import lib.management.repo.LibRepo;

@Service
public class LibService {
	
	@Autowired
	LibRepo lib;
	
	public void saveMyBook(BookModel book) {
		lib.save(book);
	}

	public void editMyBook(String bookid, String bookName, String genre, int quantity) {
//		lib.updateBooks(bookid,bookName,genre,quantity);
		lib.save(new BookModel(bookid,bookName,genre,quantity));
	}

	public ArrayList<BookModel> getAllBook() {
		ArrayList<BookModel> arr = (ArrayList<BookModel>) lib.findAll();
		return arr;
	}

	public void deleteBook(String id) {
		lib.deleteById(id);
	}

	public ArrayList<BookModel> getByGenre(String id) {
		ArrayList<BookModel> arr = (ArrayList<BookModel>) lib.findByGerne(id);
		return arr;
	}
}
