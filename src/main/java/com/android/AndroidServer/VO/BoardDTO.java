package com.android.AndroidServer.VO;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardDTO {

	private long no;
	private String uid;
	private String title;
	private String author;
	private String content;
	private String regdate;
	private String updateDay;

}
