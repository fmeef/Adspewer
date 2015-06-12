package io.github.estrongsfield.Adspew;

import io.github.estrongsfield.Adspew.listeners.AdChatListener;

import org.bukkit.plugin.java.JavaPlugin;

public class Adspew extends JavaPlugin{

	
	@Override
	public void onEnable()
	{
		getLogger().info("This server is enhanced with the adware experience!");
		AdMessages ls = new AdMessages();
		ls.init();
        getServer().getPluginManager().registerEvents(new AdChatListener(), this);
	}
	
	
	@Override
	public void onDisable()
	{
		getLogger().info("Ads going night-night. *yawn*");
	}
	
	
	
}
