package com.dsgn;

abstract class TemplateMethods {
	public abstract void players();
	public abstract void playerInfo();

	public final void completeTeam() {
		this.players();
		this.playerInfo();
	}
}

class PlayerInfoImpl extends TemplateMethods {
	@Override
	public void players() {
		System.out.println("Players data not found");
	}
	
	@Override
	public void playerInfo() {
		System.out.println("PlayersInfo overrided");
	}
}

class PlayersImpl1 extends TemplateMethods {
	@Override
	public void players() {
		System.out.println("Players data from Impl2");
	}
	
	@Override
	public void playerInfo() {
		System.out.println("Players Info from Impl2");
	}
}

public class TemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TemplateMethods obj1 = new PlayerInfoImpl();
		TemplateMethods obj2 = new PlayersImpl1();
		
		obj1.completeTeam();
		obj2.completeTeam();
		
		

	}

}
