package com.ict.di.classfile;

public class Stage {
	
	//Stage needs singer
	private Singer singer;
	
	public Stage(Singer singer) {
		this.singer = singer;
	}
	
	public void perform() {
		System.out.println("performing");
		this.singer.sing();
	}

}
