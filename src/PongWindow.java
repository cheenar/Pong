package src;/*
 *  Copyright (C) 2010  Luca Wehrstedt
 *
 *  This file is released under the GPLv2
 *  Read the file 'COPYING' for more information
 */

import javax.swing.JFrame;
import javax.swing.Timer;

public class PongWindow extends JFrame {
	public PongWindow () {
		super ();
		
		setTitle ("Ping Pong");
		setSize (Application.settings.getSettingInt("windowX"), Application.settings.getSettingInt("windowY"));

		MainMenu mainMenu = new MainMenu();

		//Pong content = new Pong (Player.getPlayer(1), Player.getPlayer(2));
		//content.acceleration = true;

		getContentPane ().add (mainMenu);
		
		addMouseListener (mainMenu);
		addKeyListener (mainMenu);
		
		Timer timer = new Timer (20, mainMenu);
		timer.start ();
	}
}
