package in.mahesh;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IBook extends CrudRepository<Books,Integer> {

}
