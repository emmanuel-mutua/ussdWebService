package com.example.ussdWebService.repositories;

import com.example.ussdWebService.data.UssdSession;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UssdSessionRepository extends CrudRepository<UssdSession, String> {

}
