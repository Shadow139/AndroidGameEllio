package com.jamescho.simpleandroidgdf;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.WindowManager;

public class GameMainActivity extends Activity {
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 450;
	public static GameView gameView;
	public static AssetManager assetManager;
	
	private static SharedPreferences prefs;
	private static final String highScoreKey = "highScoreKey";
	private static int highScore;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		assetManager = getAssets();
		gameView = new GameView(this, GAME_WIDTH, GAME_HEIGHT);
		setContentView(gameView);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}

	public static void setHighScore(int highScore) {
	/*	GameMainActivity.highScore = highScore;
		Editor editor = prefs.edit();
		editor.putInt(highScoreKey, highScore);
		editor.commit();*/
	}

	private int retrieveHighScore() {
		return prefs.getInt(highScoreKey, 0);
	}

	public static int getHighScore() {
		return highScore;
	}
}
