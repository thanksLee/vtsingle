package com.vitamin.single.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vitamin.single.response.ResponseData;
import com.vitamin.single.service.ShareService;
import com.vitamin.single.vo.MbrInfoVO;
import com.vitamin.single.vo.MbrShareDtlVO;

@RestController
@RequestMapping("/data")
public class ShareController {

	@Autowired
	private ShareService shareService;

	@RequestMapping(value="/share", method=RequestMethod.GET, produces="application/json; charset=UTF-8")
	public ResponseData getShareMbr(MbrInfoVO paramVo) throws Exception {
		return shareService.getMbrInfoList(paramVo);		
	}
	
	@RequestMapping(value="/share", method=RequestMethod.POST, produces="application/json; charset=UTF-8")
	public ResponseData postShareMbr(MbrShareDtlVO paramVo) throws Exception {
		return shareService.postShare(paramVo);		
	}
	
	@RequestMapping(value="/share/{mbrId}", method=RequestMethod.PUT, produces="application/json; charset=UTF-8")
	public ResponseData pustShareMbr(MbrShareDtlVO paramVo) throws Exception {
		return shareService.putShare(paramVo);		
	}
	
	@RequestMapping(value="/share/{mbrId}", method=RequestMethod.DELETE, produces="application/json; charset=UTF-8")
	public ResponseData deleteShareMbr(MbrShareDtlVO paramVo) throws Exception {
		return shareService.deleteShare(paramVo);		
	}
}
