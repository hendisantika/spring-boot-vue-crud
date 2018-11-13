package com.hendisantika.springbootvuecrud.repository;

import com.hendisantika.springbootvuecrud.entity.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-vue-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/11/18
 * Time: 06.12
 */
@RepositoryRestResource(path = "questions")
public interface QuestionRepository extends CrudRepository<Question, String> {
}