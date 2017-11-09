package org.springboot.repository;

import org.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/11/10.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
