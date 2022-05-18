package com.ict.di;

import com.ict.di.classfile.Singer;
import com.ict.di.classfile.Stage;

public class DIMainJavaver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singer singer = new Singer();
		singer.sing();
		Stage stage = new Stage(singer);
		stage.perform();

	}

}
