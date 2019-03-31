package com.dreamfield.dreamapi.mapper.dream.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.dreamfield.dreamapi.model.dream.District;
/**
*  @author shangwei
*/
public interface DistrictBaseMapper {

    int insertDistrict(District object);

    int updateDistrict(District object);

    int update(District.UpdateBuilder object);

    List<District> queryDistrict(District object);

    District queryDistrictLimit1(District object);

}