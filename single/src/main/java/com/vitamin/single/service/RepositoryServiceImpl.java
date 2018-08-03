package com.vitamin.single.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.vitamin.single.dao.RepositoryDAO;
import com.vitamin.single.response.ResponseData;
import com.vitamin.single.response.ResponseStatus;
import com.vitamin.single.vo.MbrFileVO;
import com.vitamin.single.vo.MbrFolderVO;

@Service
public class RepositoryServiceImpl implements RepositoryService {
	
	@Autowired
	private RepositoryDAO repositoryDao;

	@Override
	public ResponseData getMbrFolderList(MbrFolderVO paramVo) throws Exception {
		
		ResponseData resData    = new ResponseData();
		ResponseStatus resStatus = new ResponseStatus();
		
		List<MbrFolderVO> mbrFolderVo = new ArrayList<MbrFolderVO>();
		
		mbrFolderVo = repositoryDao.getMbrFolderList(paramVo);
		
		// TODO Auto-generated method stub
		return resData;
	}

	@Override
	public ResponseData postMbrFolder(MbrFolderVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData putMbrFolder(MbrFolderVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData deleteMbrFolder(MbrFolderVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData getMbrFileList(MbrFileVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData postMbrFile(MbrFileVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData putMbrFile(MbrFileVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData deleteMbrFile(MbrFileVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
