package com.vitamin.single.dao;

import java.util.List;

import com.vitamin.single.vo.MbrFileVO;
import com.vitamin.single.vo.MbrFolderVO;

public interface RepositoryDAO {
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 소유한 폴더 및 파일을 가져온다.
	 */
	public List<MbrFolderVO> getMbrFolderList(MbrFolderVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 폴더를 생성
	 */
	public int postMbrFolder(MbrFolderVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 폴더를 수정
	 */
	public int putMbrFolder(MbrFolderVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 폴더를 삭제
	 */
	public int deleteMbrFolder(MbrFolderVO paramVo) throws Exception;
	
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 소유한 파일 리스트를 가져온다.
	 */
	public List<MbrFileVO> getMbrFileList(MbrFileVO paramVo) throws Exception;

	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 파일 생성
	 */
	public int postMbrFile(MbrFileVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 파일 수정
	 */
	public int putMbrFile(MbrFileVO paramVo) throws Exception;
	/**
	 * @author Bhlee
	 * @Date   2018.08.03
	 * @description
	 * - 회원이 파일 삭제
	 */
	public int deleteMbrFile(MbrFileVO paramVo) throws Exception;
}
