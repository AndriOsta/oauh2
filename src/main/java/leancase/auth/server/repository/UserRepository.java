/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leancase.auth.server.repository;

import java.io.Serializable;

import leancase.auth.server.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Andri Osta
 */
public interface UserRepository extends MongoRepository<User, Serializable> {

    public User findByEmail(String email);

}
