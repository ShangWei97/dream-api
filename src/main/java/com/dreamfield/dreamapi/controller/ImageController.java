package com.dreamfield.dreamapi.controller;

import com.dreamfield.dreamapi.constant.ImageConstant;
import com.dreamfield.dreamapi.constant.ReturnMsg;
import com.dreamfield.dreamapi.request.GetImageTokenReqBean;
import com.qiniu.util.Auth;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: shangwei
 * @date: 2019-04-13 14:18
 */
@RestController
@RequestMapping("image")
public class ImageController {

	@PostMapping("getImageToken")
	public ReturnMsg getImageToken(@RequestBody GetImageTokenReqBean reqBean){
		ReturnMsg returnMsg = new ReturnMsg();
		if ( reqBean.getAccessKey() != null && ImageConstant.ACCESSKEY.equals(reqBean.getAccessKey())){
			Auth auth = Auth.create(ImageConstant.QINIU_ACCESSKEY, ImageConstant.QINIU_SECRETKey);
			String upToken = auth.uploadToken(ImageConstant.QINIU_BUCKET);
			returnMsg.setData(upToken);
			return returnMsg;
		}else {
			returnMsg.setMsg("ACCESSKEY ERROR");
			returnMsg.setStatus(false);
			return returnMsg;
		}
	}


}
