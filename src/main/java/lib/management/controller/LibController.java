package lib.management.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lib.management.model.BookModel;
import lib.management.service.LibService;

@RestController
public class LibController {

	@Autowired
	LibService service;
	
	@PostMapping("/saveBook")
	public String saveBook(@RequestParam(name="bookId") String bookid,@RequestParam(name="quantity") int quantity,@RequestParam(name="bookName") String bookName,@RequestParam(name="genre") String genre){
		service.saveMyBook(new BookModel(bookid,bookName,genre,quantity));
		return "Book is saved";
	}
	
	@PostMapping("/editBook")
	public String editBook(@RequestParam(name="bookId") String bookid,@RequestParam(name="quantity") int quantity,@RequestParam(name="bookName") String bookName,@RequestParam(name="genre") String genre){
		service.editMyBook(bookid,bookName,genre,quantity);
		return "Changes are updated";
	}
	
	
	@GetMapping("/getBooks")
	public ArrayList<BookModel> getAllBook(){
		ArrayList<BookModel> arr = service.getAllBook();
		return arr;
	}
	
	@PostMapping("/deleteBook")
	public String deleteBook(@RequestParam(name="bookId") String id) {
		service.deleteBook(id);
		return "Deleted Successfully";
	}
	
	@PostMapping("/getByType")
	public ArrayList<BookModel> getByGenre(@RequestParam(name="id") String id) {
		ArrayList<BookModel> arr = service.getByGenre(id);
		return arr;
	}
	
	
}
