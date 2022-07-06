package ru.learnup.learnup.spring.mvc.homework28.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.learnup.spring.mvc.homework28.entity.Buyer;

@Repository
public interface BuyerRepository extends CrudRepository <Buyer, Integer> {
}
