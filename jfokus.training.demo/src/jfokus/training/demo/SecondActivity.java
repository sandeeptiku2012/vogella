package jfokus.training.demo;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new MyView(this));
	}
}
