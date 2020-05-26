package app.greencar.customerservice.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import app.greencar.customerservice.entity.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long>{

}
