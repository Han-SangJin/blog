package kr.or.ddit.blog.model;

import java.sql.Date;

public class BlogVO {
	
	
	int bgNo;		//BLOG_NO		// 블로그(게시판) 번호
	String memId;	//MEM_ID		// 아이디
	String bgTitle;	//BLOG_TITLE	// 블로그 제목
	String bgCont;	//BLOG_CONT		// 블로그 내용
	Date bgDate;	//BLOG_DATE		// 블로그 작성 날짜
	String imgId;	//IMG_ID		// 이미지 파일 아이디
	String fileId;	//FILE_ID		// 첨부파일 아이디
	int ctgrNo;		//CTGR_NO		// 카테고리 번호
	
	
	public int getBgNo() {
		return bgNo;
	}
	public void setBgNo(int bgNo) {
		this.bgNo = bgNo;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getBgTitle() {
		return bgTitle;
	}
	public void setBgTitle(String bgTitle) {
		this.bgTitle = bgTitle;
	}
	public String getBgCont() {
		return bgCont;
	}
	public void setBgCont(String bgCont) {
		this.bgCont = bgCont;
	}
	public Date getBgDate() {
		return bgDate;
	}
	public void setBgDate(Date bgDate) {
		this.bgDate = bgDate;
	}
	public String getImgId() {
		return imgId;
	}
	public void setImgId(String imgId) {
		this.imgId = imgId;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public int getCtgrNo() {
		return ctgrNo;
	}
	public void setCtgrNo(int ctgrNo) {
		this.ctgrNo = ctgrNo;
	}
	
	
	@Override
	public String toString() {
		return "BlogVO [bgNo=" + bgNo + ", memId=" + memId + ", bgTitle=" + bgTitle + ", bgCont=" + bgCont + ", bgDate="
				+ bgDate + ", imgId=" + imgId + ", fileId=" + fileId + ", ctgrNo=" + ctgrNo + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bgCont == null) ? 0 : bgCont.hashCode());
		result = prime * result + ((bgDate == null) ? 0 : bgDate.hashCode());
		result = prime * result + bgNo;
		result = prime * result + ((bgTitle == null) ? 0 : bgTitle.hashCode());
		result = prime * result + ctgrNo;
		result = prime * result + ((fileId == null) ? 0 : fileId.hashCode());
		result = prime * result + ((imgId == null) ? 0 : imgId.hashCode());
		result = prime * result + ((memId == null) ? 0 : memId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlogVO other = (BlogVO) obj;
		if (bgCont == null) {
			if (other.bgCont != null)
				return false;
		} else if (!bgCont.equals(other.bgCont))
			return false;
		if (bgDate == null) {
			if (other.bgDate != null)
				return false;
		} else if (!bgDate.equals(other.bgDate))
			return false;
		if (bgNo != other.bgNo)
			return false;
		if (bgTitle == null) {
			if (other.bgTitle != null)
				return false;
		} else if (!bgTitle.equals(other.bgTitle))
			return false;
		if (ctgrNo != other.ctgrNo)
			return false;
		if (fileId == null) {
			if (other.fileId != null)
				return false;
		} else if (!fileId.equals(other.fileId))
			return false;
		if (imgId == null) {
			if (other.imgId != null)
				return false;
		} else if (!imgId.equals(other.imgId))
			return false;
		if (memId == null) {
			if (other.memId != null)
				return false;
		} else if (!memId.equals(other.memId))
			return false;
		return true;
	}
	
}
