package src;/*
 *  Copyright (C) 2010  Luca Wehrstedt
 *
 *  This file is released under the GPLv2
 *  Read the file 'COPYING' for more information
 */

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Application
{

	public static Settings settings = new Settings();

	public static void main (String[] args)
	{
		PongWindow window = new PongWindow ();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible (true);

		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event)
			{
				settings.saveSettingsFile();
			}
		});
	}
}
