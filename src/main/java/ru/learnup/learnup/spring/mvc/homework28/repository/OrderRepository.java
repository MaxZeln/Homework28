package ru.learnup.learnup.spring.mvc.homework28.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.learnup.spring.mvc.homework28.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository <Order, Integer> {
}
