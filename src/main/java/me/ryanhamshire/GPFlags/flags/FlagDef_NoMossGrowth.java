package me.ryanhamshire.GPFlags.flags;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.ryanhamshire.GPFlags.Flag;
import me.ryanhamshire.GPFlags.FlagManager;
import me.ryanhamshire.GPFlags.GPFlags;
import me.ryanhamshire.GPFlags.MessageSpecifier;
import me.ryanhamshire.GPFlags.Messages;
import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.ClaimPermission;
import me.ryanhamshire.GriefPrevention.GriefPrevention;

public class FlagDef_NoMossGrowth extends FlagDefinition {

    public FlagDef_NoMossGrowth(FlagManager manager, GPFlags plugin) {
        super(manager, plugin);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void mossBonemealGrowth(PlayerInteractEvent event) {
    	if (event.getItem() != null && event.getClickedBlock() != null) {
	    	Location loc = event.getClickedBlock().getLocation();
	    	Claim claim = GriefPrevention.instance.dataStore.getClaimAt(loc, false, null);
	    	if (claim != null &&
	    			event.getAction().equals(Action.RIGHT_CLICK_BLOCK) &&
	    			(event.getClickedBlock().getType().equals(Material.MOSS_BLOCK) ||
	    					event.getClickedBlock().getType().equals(Material.GLOW_LICHEN)) &&
	    			event.getItem().getType().equals(Material.BONE_MEAL) &&
	    			claim.hasExplicitPermission(event.getPlayer().getUniqueId(), ClaimPermission.Build)) {
	    		Flag flagNoMoss = GPFlags.getInstance().getFlagManager().getFlag(claim, "NoMossGrowth");
	    		if (flagNoMoss != null) {
	    			event.setCancelled(true);
	    		}
	    	}
    	}
    }

    @Override
    public String getName() {
        return "NoMossGrowth";
    }

    @Override
    public MessageSpecifier getSetMessage(String parameters) {
        return new MessageSpecifier(Messages.EnableNoMossGrowth);
    }

    @Override
    public MessageSpecifier getUnSetMessage() {
        return new MessageSpecifier(Messages.DisableNoMossGrowth);
    }

    @Override
    public List<FlagType> getFlagType() {
        return Arrays.asList(FlagType.CLAIM);
    }

}
