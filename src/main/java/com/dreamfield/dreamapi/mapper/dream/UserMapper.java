package com.dreamfield.dreamapi.mapper.dream;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dreamfield.dreamapi.model.dream.User;
import com.dreamfield.dreamapi.mapper.dream.base.UserBaseMapper;
/**
*  @author shangwei
*/
public interface UserMapper extends UserBaseMapper{

	void updateByUserTel(@Param("userTel")String userTel,@Param("loginCode")String loginCode);


}