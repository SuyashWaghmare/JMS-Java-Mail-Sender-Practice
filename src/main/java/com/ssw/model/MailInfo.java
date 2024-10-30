package com.ssw.model;

public class MailInfo {

	private String from;
	private String to;
	private String sub;
	private String text;

	public MailInfo(String from, String to, String sub, String text) {
		super();
		this.from = from;
		this.to = to;
		this.sub = sub;
		this.text = text;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "MailInfo [from=" + from + ", to=" + to + ", sub=" + sub + ", text=" + text + "]";
	}

	public MailInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
