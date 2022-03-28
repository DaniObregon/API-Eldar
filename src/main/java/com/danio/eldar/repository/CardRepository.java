package com.danio.eldar.repository;

import com.danio.eldar.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository <Card, Long>{
}
