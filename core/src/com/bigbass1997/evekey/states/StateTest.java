package com.bigbass1997.evekey.states;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.bigbass1997.evekey.graphics.Draw;

public class StateTest extends State {
	
	//test state
	
	public StateTest(StateManager sm) {
		super(sm, "TEST");
	}
	
	public void render(){
		Draw.rect(sr, 50, 50, 50, 50, ShapeType.Filled, 0x00FF00FF);
	}
}
