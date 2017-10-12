/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leancase.auth.server.repository;

import leancase.auth.server.model.OAuth2AuthenticationRefreshToken;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Andri Osta
 */

public interface OAuth2RefreshTokenRepository extends MongoRepository<OAuth2AuthenticationRefreshToken, String> {

   
}