package com.baby_menu.game.desktop;

import com.baby_menu.game.BabyGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class BabyLauncher {
    public static void main (String[] args)
    {
        BabyGame myProgram = new BabyGame();
        LwjglApplication launcher = new LwjglApplication(myProgram );
    }
}
