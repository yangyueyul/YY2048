package com.example.yy2048;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

	public MainActivity() {
		mainActivity = this;
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore = (TextView) findViewById(R.id.tvScore);
		root = (LinearLayout) findViewById(R.id.container);
		root.setBackgroundColor(0xfffaf8ef);
        
        gameView = (GameView) findViewById(R.id.gameView);
        
		btnNewGame = (Button) findViewById(R.id.btnNewGame);
		btnNewGame.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) {
			gameView.startGame();
			
		}});

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void clearScore(){
    	score = 0;
    	showScore();
    }
    
    public void addScore(int s){
    	score+=s;
    	showScore();
    }
    
    public void showScore(){
    	tvScore.setText(score+"");
    }
	
    
    
    private int score = 0;
    
    private TextView tvScore;
	private LinearLayout root = null;
	private Button btnNewGame;
	private GameView gameView;
    private static MainActivity mainActivity = null;
    public static MainActivity getMainActivity() {
		return mainActivity;
	}
    

}
