package com.yfzm.web.chatroom.dao;

import com.yfzm.web.chatroom.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserEntity, String> {

    UserEntity findFirstByUsernameAndPassword(String username, String password);

    Boolean existsByUsernameAndPassword(String username, String password);

}
