package app.greencar.customerservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import app.greencar.customerservice.entity.Orders;

@Repository
public interface OrderRepository extends MongoRepository<Orders, Long> {

}
