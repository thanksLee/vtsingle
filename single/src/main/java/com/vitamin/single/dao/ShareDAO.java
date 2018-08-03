package com.vitamin.single.dao;

import java.util.List;

import com.vitamin.single.vo.MbrInfoVO;
import com.vitamin.single.vo.MbrShareDtlVO;

public interface ShareDAO {
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원 검색을 위하여 사용
	 */
	public List<MbrInfoVO> getMbrInfoList(MbrInfoVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 파일 및 결과 공유
	 */
	public int postShare(MbrShareDtlVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 파일 및 결과 공유 수정
	 */
	public int putShare(MbrShareDtlVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 파일 및 결과 공유 삭제
	 */
	public int deleteShare(MbrShareDtlVO paramVo) throws Exception;
}
