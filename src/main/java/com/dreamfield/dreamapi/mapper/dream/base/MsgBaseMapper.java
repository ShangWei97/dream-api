package com.dreamfield.dreamapi.mapper.dream.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dreamfield.dreamapi.model.dream.Msg;
/**
*  @author shangwei
*/
public interface MsgBaseMapper {

    int insertMsg(Msg object);

    int updateMsg(Msg object);

    int update(Msg.UpdateBuilder object);

    List<Msg> queryMsg(Msg object);

    Msg queryMsgLimit1(Msg object);

}