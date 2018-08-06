package com.vitamin.single.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vitamin.single.response.ResponseData;
import com.vitamin.single.service.RepositoryService;
import com.vitamin.single.vo.MbrFileVO;
import com.vitamin.single.vo.MbrFolderVO;

@RestController
@RequestMapping("/data")
public class RepositoryController {

	@Autowired
	private RepositoryService repositoryService;
	
	@RequestMapping(value="/directorys", method=RequestMethod.GET, produces="application/json; charset=UTF-8")
	public ResponseData getDirectory(MbrFolderVO paramVo) throws Exception {
		return repositoryService.getMbrFolderList(paramVo);		
	}

	@RequestMapping(value="/directorys", method=RequestMethod.POST, produces="application/json; charset=UTF-8")
	public ResponseData postDirectory(MbrFolderVO paramVo) throws Exception {
		return repositoryService.postMbrFolder(paramVo);		
	}

	@RequestMapping(value="/directorys/{folderSeq}", method=RequestMethod.PUT, produces="application/json; charset=UTF-8")
	public ResponseData putDirectory(MbrFolderVO paramVo) throws Exception {
		return repositoryService.putMbrFolder(paramVo);		
	}
	
	@RequestMapping(value="/directorys/{folderSeq}", method=RequestMethod.DELETE, produces="application/json; charset=UTF-8")
	public ResponseData deleteDirectory(MbrFolderVO paramVo) throws Exception {
		return repositoryService.deleteMbrFolder(paramVo);		
	}

	@RequestMapping(value="/files", method=RequestMethod.GET, produces="application/json; charset=UTF-8")
	public ResponseData getFileInfo(MbrFileVO paramVo) throws Exception {
		return repositoryService.getMbrFileList(paramVo);		
	}

	@RequestMapping(value="/files", method=RequestMethod.POST, produces="application/json; charset=UTF-8")
	public ResponseData postFile(MbrFileVO paramVo) throws Exception {
		return repositoryService.postMbrFile(paramVo);		
	}

	@RequestMapping(value="/files/{fileSeq}", method=RequestMethod.PUT, produces="application/json; charset=UTF-8")
	public ResponseData putFile(MbrFileVO paramVo) throws Exception {
		return repositoryService.putMbrFile(paramVo);		
	}

	@RequestMapping(value="/files/{fileSeq}", method=RequestMethod.DELETE, produces="application/json; charset=UTF-8")
	public ResponseData deleteFile(MbrFileVO paramVo) throws Exception {
		return repositoryService.deleteMbrFile(paramVo);		
	}
}
