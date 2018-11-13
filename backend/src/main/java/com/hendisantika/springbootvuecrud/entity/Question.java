package com.hendisantika.springbootvuecrud.entity;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-vue-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/11/18
 * Time: 06.11
 */

@RedisHash("questions")
@Data
public class Question {
    @Id
    String id;
    String question;
}
