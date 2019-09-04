package com.csust.zx.entity;

public class NoticeInfo {

	private long notice_id;//公告ID
	private String notice_head;//标题
	private String notice_main;//内容
	private String notice_time;//时间
	public NoticeInfo(long notice_id, String notice_head, String notice_main, String notice_time) {
		this.notice_id = notice_id;
		this.notice_head = notice_head;
		this.notice_main = notice_main;
		this.notice_time = notice_time;
	}
	public NoticeInfo() {

	}
	public long getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(long notice_id) {
		this.notice_id = notice_id;
	}
	public String getNotice_head() {
		return notice_head;
	}
	public void setNotice_head(String notice_head) {
		this.notice_head = notice_head;
	}
	public String getNotice_main() {
		return notice_main;
	}
	public void setNotice_main(String notice_main) {
		this.notice_main = notice_main;
	}
	public String getNotice_time() {
		return notice_time;
	}
	public void setNotice_time(String notice_time) {
		this.notice_time = notice_time;
	}
}
