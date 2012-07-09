package com.stickmangame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.mmm.gameengine.GameEngine;
import com.mmm.gameengine.GameView;
import com.stickmangame.gamestates.MainGameState;
import com.stickmangame.gamestates.MenuState;
import com.stickmangame.gamestates.SplashState;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Create the GameEngine
        GameEngine ge = GameEngine.getInstance();
        
        // Add required states...
        ge.addState(new SplashState());        
        ge.addState(new MenuState());
        ge.addState(new MainGameState());
        
        // Init states...
        ge.initAllStates();
        
        // Make sure we switch to the correct initial state...
        ge.switchToState(SplashState.ID);
        
        // Create a GameView
        GameView gv = new GameView(this);
        
        setContentView(gv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
