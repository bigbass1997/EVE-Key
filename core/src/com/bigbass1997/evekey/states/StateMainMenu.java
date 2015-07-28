package com.bigbass1997.evekey.states;

import com.badlogic.gdx.math.Vector2;
import com.bigbass1997.evekey.commands.CommandChangeState;
import com.bigbass1997.evekey.objects.ButtonFactory;

public class StateMainMenu extends State {
	
	private ButtonFactory bFactory;
	
	public StateMainMenu(StateManager sm){
		super(sm, "MAIN_MENU");
		
		bFactory = new ButtonFactory();
		bFactory.createButton(new CommandChangeState(sm, new StateTest(sm)), new Vector2(10, 10), new Vector2(100, 40), ""); //test
	}
	
	public void render(){
		bFactory.render(sr);
	}
	
	public void update(float delta){
		bFactory.update(delta);
	}
}
