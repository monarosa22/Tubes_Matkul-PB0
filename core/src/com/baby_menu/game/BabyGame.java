package com.baby_menu.game;

import com.badlogic.gdx.Game;

public class BabyGame extends Game
{
    public void create()
    {
        BabyMenu cm = new BabyMenu(this);
        setScreen( cm );

    }
}
