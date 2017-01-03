package com.bupummarket.vo;

import java.util.Date;

public class Article {
	protected int no; // 글 번호
	protected int writerNo; // 글쓴이 no
	protected String writerName; // 글쓴이 no
	protected String title; // 글 제목
	protected String content; // 글 본문
	protected int read_cnt; // 조회수
	protected String category_part; // 장착부위
	protected String category_parts; // 장착부위
	protected String category_company; // 제조사
	protected String category_model; // 모델
	protected Date regDate; // 등록날짜
	protected Date modDate; // 수정날짜
	protected int condition; // 글 상태
	protected int amount; // 판매금액
	protected String location; // 판매지역
	protected int isPost; // 배송여부
	protected String titleImg; // 대표이미지
	protected String[] images; // 이미지 기본 5장
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getWriterNo() {
		return writerNo;
	}
	public void setWriterNo(int writerNo) {
		this.writerNo = writerNo;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRead_cnt() {
		return read_cnt;
	}
	public void setRead_cnt(int read_cnt) {
		this.read_cnt = read_cnt;
	}
	public String getCategory_part() {
		return category_part;
	}
	public void setCategory_part(String category_part) {
		this.category_part = category_part;
	}
	public String getCategory_parts() {
		return category_parts;
	}
	public void setCategory_parts(String category_parts) {
		this.category_parts = category_parts;
	}
	public String getCategory_company() {
		return category_company;
	}
	public void setCategory_company(String category_company) {
		this.category_company = category_company;
	}
	public String getCategory_model() {
		return category_model;
	}
	public void setCategory_model(String category_model) {
		this.category_model = category_model;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public int getCondition() {
		return condition;
	}
	public void setCondition(int condition) {
		this.condition = condition;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getIsPost() {
		return isPost;
	}
	public void setIsPost(int isPost) {
		this.isPost = isPost;
	}
	public String getTitleImg() {
		return titleImg;
	}
	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}

}