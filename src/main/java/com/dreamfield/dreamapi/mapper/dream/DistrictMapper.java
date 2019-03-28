package com.dreamfield.dreamapi.mapper.dream;

import com.dreamfield.dreamapi.response.DistricResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: shangwei
 * @date: 2019-03-28 19:26
 */
@Mapper
public interface DistrictMapper {
	List<DistricResponse> getDistrict(@Param("parentId")Integer parent);
}
