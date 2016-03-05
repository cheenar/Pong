package src;/*
 *  Copyright (C) 2010  Luca Wehrstedt
 *
 *  This file is released under the GPLv2
 *  Read the file 'COPYING' for more information
 */

import javax.swing.JOptionPane;

public class Player {
	// Type of player
	public static final int CPU_EASY = 0;
	public static final int CPU_HARD = 1;
	public static final int MOUSE = 2;
	public static final int KEYBOARD = 3;
	public static final int ONLINE = 4;
	
	private int type;
	public int position = 0;
	public int destination = 0;
	public int points = 0;
	
	public Player (int type) {
		if (type < 0 || type > 4) {
			type = CPU_EASY;
			JOptionPane.showMessageDialog (null, "Some errors in player definition");
		}
		this.type = type;
	}

	public static int getPlayer(int pos)
	{
		if(Application.settings.getSetting("player" + pos).startsWith("mouse"))
		{
			return 2;
		}
		else if(Application.settings.getSetting("player" + pos).startsWith("keyboard"))
		{
			return 3;
		}
		else if(Application.settings.getSetting("player" + pos).startsWith("cpu_easy"))
		{
			return 0;
		}
		else if(Application.settings.getSetting("player" + pos).startsWith("cpu_hard"))
		{
			return 1;
		}
		else if(Application.settings.getSetting("player" + pos).startsWith("online"))
		{
			return ONLINE;
		}
		else
		{
			return 0;
		}
	}

	public int getType () {
		return type;
	}
}
