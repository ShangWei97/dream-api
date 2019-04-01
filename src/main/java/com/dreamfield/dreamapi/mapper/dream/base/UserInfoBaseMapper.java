package com.dreamfield.dreamapi.mapper.dream.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dreamfield.dreamapi.model.dream.UserInfo;
/**
*  @author shangwei
*/
public interface UserInfoBaseMapper {

    int insertUserInfo(UserInfo object);

    int updateUserInfo(UserInfo object);

    int update(UserInfo.UpdateBuilder object);

    List<UserInfo> queryUserInfo(UserInfo object);

    UserInfo queryUserInfoLimit1(UserInfo object);

}