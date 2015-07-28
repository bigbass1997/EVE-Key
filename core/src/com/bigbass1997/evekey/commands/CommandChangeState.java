package com.bigbass1997.evekey.commands;

import com.bigbass1997.evekey.states.State;
import com.bigbass1997.evekey.states.StateManager;

public class CommandChangeState implements Command {
	
	private StateManager handler;
	private State data;
	
	public CommandChangeState(Object handler, Object data){
		this.handler = (StateManager) handler;
		this.data = (State) data;
	}
	
	@Override
	public void execute() {
		handler.setState(data);
	}
}
