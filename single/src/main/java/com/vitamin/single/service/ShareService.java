package com.vitamin.single.service;

import java.util.List;

import com.vitamin.single.response.ResponseData;
import com.vitamin.single.vo.MbrInfoVO;
import com.vitamin.single.vo.MbrShareDtlVO;

public interface ShareService {
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원 검색을 위하여 사용
	 */
	public ResponseData getMbrInfoList(MbrInfoVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 파일 및 결과 공유
	 */
	public ResponseData postShare(MbrShareDtlVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 파일 및 결과 공유 수정
	 */
	public ResponseData putShare(MbrShareDtlVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 파일 및 결과 공유 삭제
	 */
	public ResponseData deleteShare(MbrShareDtlVO paramVo) throws Exception;
}
