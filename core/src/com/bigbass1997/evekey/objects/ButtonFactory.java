package com.bigbass1997.evekey.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.bigbass1997.evekey.commands.Command;

public class ButtonFactory {
	
	private ArrayList<Button> buttonList;
	
	public ButtonFactory(){
		buttonList = new ArrayList<Button>();
	}
	
	public Button createButton(Command command, Vector2 pos, Vector2 dim, String text){
		Button b = new Button(command, pos, dim, text);
		buttonList.add(b);
		return b;
	}
	
	public void render(ShapeRenderer sr){
		for(Button b : buttonList){
			b.render(sr);
		}
	}
	
	public void update(float delta){
		for(Button b : buttonList){
			b.update(delta);
		}
	}
}
