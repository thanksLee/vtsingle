package com.vitamin.single.vo;

public class MbrFileVO {

	private String fileSeq;
	private String folderSeq;
	private String fileNm;
	private String fileFlg;
	private String fileStatus;
	private String fileExt;
	private String fileSize;
	private String fileRegDt;	
	private String fileMdfyDt;
	
	public MbrFolderVO mbrFolderVo;

	public String getFileSeq() {
		return fileSeq;
	}

	public void setFileSeq(String fileSeq) {
		this.fileSeq = fileSeq;
	}

	public String getFolderSeq() {
		return folderSeq;
	}

	public void setFolderSeq(String folderSeq) {
		this.folderSeq = folderSeq;
	}

	public String getFileNm() {
		return fileNm;
	}

	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}

	public String getFileFlg() {
		return fileFlg;
	}

	public void setFileFlg(String fileFlg) {
		this.fileFlg = fileFlg;
	}

	public String getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileRegDt() {
		return fileRegDt;
	}

	public void setFileRegDt(String fileRegDt) {
		this.fileRegDt = fileRegDt;
	}

	public String getFileMdfyDt() {
		return fileMdfyDt;
	}

	public void setFileMdfyDt(String fileMdfyDt) {
		this.fileMdfyDt = fileMdfyDt;
	}

	public MbrFolderVO getMbrFolderVo() {
		return mbrFolderVo;
	}

	public void setMbrFolderVo(MbrFolderVO mbrFolderVo) {
		this.mbrFolderVo = mbrFolderVo;
	}
	
	
}
