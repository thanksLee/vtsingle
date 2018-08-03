package com.vitamin.single.vo;

public class MbrShareDtlVO {

	private String mbrId;
	private String shareFlgSeq;
	private String shareFlg;
	private String shareTrgtFlg;
	private String shareDt;
	
	public MbrInfoVO 	mbrInfoVo;
	public MbrFolderVO  mbrFolderVo;
	public MbrFileVO 	mbrFileVo;
	public String getMbrId() {
		return mbrId;
	}
	public void setMbrId(String mbrId) {
		this.mbrId = mbrId;
	}
	public String getShareFlgSeq() {
		return shareFlgSeq;
	}
	public void setShareFlgSeq(String shareFlgSeq) {
		this.shareFlgSeq = shareFlgSeq;
	}
	public String getShareFlg() {
		return shareFlg;
	}
	public void setShareFlg(String shareFlg) {
		this.shareFlg = shareFlg;
	}
	public String getShareTrgtFlg() {
		return shareTrgtFlg;
	}
	public void setShareTrgtFlg(String shareTrgtFlg) {
		this.shareTrgtFlg = shareTrgtFlg;
	}
	public String getShareDt() {
		return shareDt;
	}
	public void setShareDt(String shareDt) {
		this.shareDt = shareDt;
	}
	public MbrInfoVO getMbrInfoVo() {
		return mbrInfoVo;
	}
	public void setMbrInfoVo(MbrInfoVO mbrInfoVo) {
		this.mbrInfoVo = mbrInfoVo;
	}
	public MbrFolderVO getMbrFolderVo() {
		return mbrFolderVo;
	}
	public void setMbrFolderVo(MbrFolderVO mbrFolderVo) {
		this.mbrFolderVo = mbrFolderVo;
	}
	public MbrFileVO getMbrFileVo() {
		return mbrFileVo;
	}
	public void setMbrFileVo(MbrFileVO mbrFileVo) {
		this.mbrFileVo = mbrFileVo;
	}
	
	
}
