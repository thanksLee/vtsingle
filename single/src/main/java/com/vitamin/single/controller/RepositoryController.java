package com.vitamin.single.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vitamin.single.response.ResponseData;
import com.vitamin.single.service.RepositoryService;
import com.vitamin.single.vo.MbrFolderVO;

@RestController
@RequestMapping("/data")
public class RepositoryController {

	@Autowired
	private RepositoryService repositoryService;
	
	@RequestMapping(value="/directoryInfo", method=RequestMethod.GET, produces="application/json; charset=UTF-8")
	public ResponseData getdirectoryInfo(MbrFolderVO paramVo) throws Exception {
		return repositoryService.getMbrFolderList(paramVo);		
	}

}
