package com.lijx.cat.repository;

import com.lijx.cat.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by jxli on 2018/9/19.
 */
public interface UserRepository extends PagingAndSortingRepository<User,String> {

  User findTopByEmail(String email);
}
