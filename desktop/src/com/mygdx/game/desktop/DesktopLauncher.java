package com.mygdx.game.desktop;

import game.LaatikkojenSota;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Laatikkojen Sota";
		config.useGL30 = false;
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new LaatikkojenSota(), config);
	}
}
