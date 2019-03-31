package com.dreamfield.dreamapi;

import com.dreamfield.dreamapi.utils.HttpUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: shangwei
 * @date: 2019-03-29 10:31
 */
public class CROSTest {


	public static void main(String[] args){


		String host = "http://120.78.149.86:8080";
		String path = "/dream/getDistrict?parentId=0";
		String method = "GET";
		//String appcode = "dbb50391be304f44890578654f04e99e";
		Map<String, String> headers = new HashMap<>();
		//最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
//		headers.put("Authorization", "APPCODE " + appcode);
		Map<String, String> querys = new HashMap<>();
		querys.put("mobile", "13212787820");
		querys.put("param", "code:1234");
		querys.put("tpl_id", "TP1809092");
		Map<String, String> bodys = new HashMap<>();
		try {
			HttpResponse response = HttpUtils.doGet(host, path, method, headers, bodys);
			String json = EntityUtils.toString(response.getEntity());
			System.out.println(json);
		}catch (Exception e){
			System.out.println(e.toString());
		}
	}

}
