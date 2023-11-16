package test.dto;


public class TodidListDto {
	private int diddate;
	private String title;
	private String content;
	private int howlong;
	public TodidListDto () {}
	public TodidListDto(int diddate, String title, String content, int howlong) {
		super();
		this.diddate = diddate;
		this.title = title;
		this.content = content;
		this.howlong = howlong;
	}
	public int getDiddate() {
		return diddate;
	}
	public void setDiddate(int diddate) {
		this.diddate = diddate;
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
	public int getHowlong() {
		return howlong;
	}
	public void setHowlong(int howlong) {
		this.howlong = howlong;
	}
	
}
