package com.vitamin.single.service;

import java.util.List;

import com.vitamin.single.response.ResponseData;
import com.vitamin.single.vo.MbrFileVO;
import com.vitamin.single.vo.MbrFolderVO;

public interface RepositoryService {
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 소유한 폴더 및 파일을 가져온다.
	 */
	public ResponseData getMbrFolderList(MbrFolderVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 폴더를 생성
	 */
	public ResponseData postMbrFolder(MbrFolderVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 폴더를 수정
	 */
	public ResponseData putMbrFolder(MbrFolderVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 폴더를 삭제
	 */
	public ResponseData deleteMbrFolder(MbrFolderVO paramVo) throws Exception;
	
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 소유한 파일 리스트를 가져온다.
	 */
	public ResponseData getMbrFileList(MbrFileVO paramVo) throws Exception;

	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 파일 생성
	 */
	public ResponseData postMbrFile(MbrFileVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 파일 수정
	 */
	public ResponseData putMbrFile(MbrFileVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 파일 삭제
	 */
	public ResponseData deleteMbrFile(MbrFileVO paramVo) throws Exception;
}
