package com.hk.mapper;
import com.hk.entity.UserEntity;
import java.util.List;
public interface UserMapper {
    
    List<UserEntity> selectAllUserInfo();
    
    
    void insertUserInfo(UserEntity users);
}
