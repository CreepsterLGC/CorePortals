package me.creepsterlgc.coreportals;

import java.util.logging.Logger;

import me.creepsterlgc.core.files.FileCommands;
import me.creepsterlgc.coreportals.commands.CommandPortal;

import org.spongepowered.api.Game;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartingServerEvent;
import org.spongepowered.api.plugin.Plugin;

import com.google.inject.Inject;

@Plugin(id = "CorePortals", name = "Portals Module for Core", dependencies = "required-after:Core")

public class CorePortals {

	@Inject
	private Game game;
	
	@Inject
	Logger logger;
	
	public static CorePortals coreportals;
	
	public static CorePortals getInstance() { return coreportals; }
	public Game getGame() { return game; }
	
    @Listener
    public void onEnable(GameStartingServerEvent event) {
    	
    	if(FileCommands.PORTAL()) game.getCommandDispatcher().register(this, new CommandPortal(), "portal");
    	
    }
    
}