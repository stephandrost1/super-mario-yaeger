package org.example;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import org.example.scenes.LevelScene;
import org.example.scenes.TitleScene;

public class SuperMarioYaeger extends YaegerGame
{

    public String selectedCharacter; // TODO: Implement character selection logic
    public int selectedCharacterLives; // TODO: Implement character lives logic

    public static void main( String[] args )
    {
    	 launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Super Mario Yaeger");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
        addScene(0, new TitleScene(this));
        addScene(1, new LevelScene(this));
    }
}
