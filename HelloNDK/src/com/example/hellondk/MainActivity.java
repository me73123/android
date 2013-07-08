package com.example.hellondk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView text = (TextView) findViewById(R.id.text1);
		text.setText("helloString= " + helloString() + "\nplus= " + 
		plus(3,5) + "\nmultiply= " + multiply(3,5) +
		"\nExcept= " + Except(5,3));
	}
	
	static{
		System.loadLibrary("HelloNDK");  //載入自定義的JNI
	}
	
	//宣告使用c的method
	public native String helloString();
	public native int plus(int a, int b);
	public native int multiply(int a, int b);
	public native int Except(int a, int b);
//	public native int Minus(int a, int b);
}
