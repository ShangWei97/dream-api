package com.dreamfield.dreamapi.controller;

import com.dreamfield.dreamapi.constant.ReturnMsg;
import com.dreamfield.dreamapi.mapper.dream.DistrictMapper;
import com.dreamfield.dreamapi.response.DistricResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author: shangwei
 * @date: 2019-03-28 19:42
 */
@Slf4j
@RestController
@RequestMapping("dream")
public class DistrictController {

	@Autowired
	private DistrictMapper districtMapper;

	@GetMapping("getDistrict")
	public ReturnMsg getDistrict(@RequestParam("parentId")Integer parentId){
		log.info("getDistrict param:"+parentId);
		ReturnMsg returnMsg = new ReturnMsg();
		returnMsg.setData(districtMapper.getDistrict(parentId));
        return returnMsg;
	}


}
