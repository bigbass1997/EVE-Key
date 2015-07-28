package com.bigbass1997.evekey.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.bigbass1997.evekey.commands.Command;
import com.bigbass1997.evekey.graphics.Draw;

public class Button {
	
	private Command command;
	private Vector2 pos, dim;
	private String text;
	
	public Button(Command command, Vector2 pos, Vector2 dim, String text){
		this.command = command;
		this.pos = pos;
		this.dim = dim;
		this.text = text;
	}
	
	public void render(ShapeRenderer sr){
		Input input = Gdx.input;
		float mx = input.getX();
		float my = -input.getY() + Gdx.graphics.getHeight();
		
		Draw.rect(sr, mx, my, 5, 5, ShapeType.Filled, 0xFF0000FF);
		
		Draw.rect(sr, pos.x, pos.y, dim.x, dim.y, ShapeType.Filled, 0xFFFFFFFF);
	}
	
	public void update(float delta){
		Input input = Gdx.input;
		float mx = input.getX();
		float my = -input.getY() + Gdx.graphics.getHeight();
		
		if(input.isButtonPressed(Buttons.LEFT) && mx >= pos.x && mx <= pos.x + dim.x && my >= pos.y && my <= pos.y + dim.y){
			callCommand();
		}
	}
	
	public void callCommand(){
		command.execute();
	}
}
