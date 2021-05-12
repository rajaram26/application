package lib.management.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lib.management.model.BookModel;


@Repository
public interface LibRepo extends CrudRepository<BookModel, String>{
	
	
	@Query(value="select * from book_model where genre=?1",nativeQuery=true)
	ArrayList<BookModel> findByGerne(String id);

	
}
