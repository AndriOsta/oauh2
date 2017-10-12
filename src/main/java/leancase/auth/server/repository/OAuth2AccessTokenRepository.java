/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package leancase.auth.server.repository;

import java.io.Serializable;

import leancase.auth.server.model.OAuth2AuthenticationAccessToken;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Andri Osta
 */
public interface OAuth2AccessTokenRepository extends MongoRepository<OAuth2AuthenticationAccessToken, Serializable> {

}
