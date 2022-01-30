package me.ryanhamshire.GPFlags.flags;

import me.ryanhamshire.GPFlags.Flag;
import me.ryanhamshire.GPFlags.FlagManager;
import me.ryanhamshire.GPFlags.GPFlags;
import me.ryanhamshire.GPFlags.MessageSpecifier;
import me.ryanhamshire.GPFlags.Messages;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.Arrays;
import java.util.List;

public class FlagDef_NoDeathMessage extends FlagDefinition {

    public FlagDef_NoDeathMessage(FlagManager manager, GPFlags plugin) {
        super(manager, plugin);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Flag flag = this.getFlagInstanceAtLocation(player.getLocation(), player);
        System.out.println("Normal death message: " + event.getDeathMessage());
        if (flag == null)
            {
            System.out.println("Flag is null, returning");
            return;
            }
        System.out.println("Flag is not null");
   //     event.setDeathMessage(null);
    }

    @Override
    public String getName() {
        return "NoDeathMessage";
    }

    @Override
    public MessageSpecifier getSetMessage(String parameters) {
        return new MessageSpecifier(Messages.EnableNoDeathMessage);
    }

    @Override
    public MessageSpecifier getUnSetMessage() {
        return new MessageSpecifier(Messages.DisableNoDeathMessage);
    }

    @Override
    public List<FlagType> getFlagType() {
        return Arrays.asList(FlagType.CLAIM, FlagType.WORLD, FlagType.SERVER);
    }

}
