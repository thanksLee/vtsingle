package com.vitamin.single.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitamin.single.dao.ShareDAO;
import com.vitamin.single.response.ResponseData;
import com.vitamin.single.vo.MbrInfoVO;
import com.vitamin.single.vo.MbrShareDtlVO;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDAO shareDAO;

	@Override
	public ResponseData getMbrInfoList(MbrInfoVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData postShare(MbrShareDtlVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData putShare(MbrShareDtlVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData deleteShare(MbrShareDtlVO paramVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
