package com.cp.springbootmybatisflex.mapper;

import com.cp.springbootmybatisflex.model.UserModel;
import com.mybatisflex.core.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserModel> {
}
