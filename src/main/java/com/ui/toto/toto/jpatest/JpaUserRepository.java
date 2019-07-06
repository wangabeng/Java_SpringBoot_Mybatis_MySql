package com.ui.toto.toto.jpatest;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface  JpaUserRepository extends CrudRepository<JpaUser, Integer> {
    @Query(value = "SELECT * FROM t_user u WHERE u.USER_ID =:userId", nativeQuery = true)
    public JpaUser getUser(@Param("userId") Integer userId);
}
