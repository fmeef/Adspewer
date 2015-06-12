package io.github.estrongsfield.Adspew.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import io.github.estrongsfield.Adspew.AdMessages;

import java.util.ArrayList;
import java.util.Random;

public class AdChatListener implements Listener {
	
	Random gen;
	
	public AdChatListener()
	{
		gen = new Random();
	}
	
	/*
	 * replaces what people are saying with ads.
	 */
	@EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) 
	{
		if (!event.isCancelled()) 
		{
			
			ArrayList<String> ad = AdMessages.ads;
			if(gen.nextInt(15) == 3 && ad.size() != 0)
			{
				int pick = gen.nextInt(ad.size());
				event.setMessage(ad.get(pick));
			}
		}
    }
	
	
}
