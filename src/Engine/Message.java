package Engine;

import java.awt.Color;

import SpriteFont.SpriteFont;

public class Message {
	private String content;
	private int BackgroundSize;
	
	public Message(String content, int BackgroundSize)
	{
		this.content = content;
		this.BackgroundSize = BackgroundSize;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public void setMessage(String newContent)
	{
		content = newContent;
	}
	
	public int getBackgroundSize()
	{
		return BackgroundSize;		
	}
	
	public void setBackgroundSize(int newBackgroundSize)
	{
		BackgroundSize = newBackgroundSize;
	}
	
	

}
