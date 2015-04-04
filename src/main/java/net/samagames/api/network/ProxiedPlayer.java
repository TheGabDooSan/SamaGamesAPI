package net.samagames.api.network;

import net.md_5.bungee.api.chat.TextComponent;

/**
 * This file is a part of the SamaGames project
 * This code is absolutely confidential.
 * Created by zyuiop
 * (C) Copyright Elydra Network 2015
 * All rights reserved.
 */
public interface ProxiedPlayer {

	/**
	 * Returns the current server name for the player
	 * @return the server name
	 */
	public String getServer();

	/**
	 * Gives the name of the proxy the player is connected to
	 * @return the proxy name
	 */
	public String getProxy();

	/**
	 * Disconnects the player from the proxy with the given reason
	 * @param reason The reason component
	 */
	public void disconnect(TextComponent reason);

	/**
	 * Connects the player to a server
	 * @param server The server you want to connect the player to
	 */
	public void connect(String server);

	/**
	 * Send a message to the player
	 * @param component The message you want to send
	 */
	public void sendMessage(TextComponent component);

}
