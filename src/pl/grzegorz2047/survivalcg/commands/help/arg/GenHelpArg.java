package pl.grzegorz2047.survivalcg.commands.help.arg;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import pl.grzegorz2047.api.command.Arg;
import pl.grzegorz2047.survivalcg.SCG;
import pl.grzegorz2047.survivalcg.managers.MsgManager;

/**
 * Created by grzegorz2047 on 30.12.2015.
 */
public class GenHelpArg extends Arg {

    SCG plugin;

    public GenHelpArg(Plugin plugin) {
        this.plugin = (SCG) plugin;
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player p = (Player) sender;
        p.sendMessage(MsgManager.noprefmsg("Dostepne komendy: "));
        p.sendMessage(MsgManager.noprefmsg("/g - Pokazuje komendy zwiazane z gildiami "));
        p.sendMessage(MsgManager.noprefmsg("/drop - Pokazuje drop na serwerze "));
        p.sendMessage(MsgManager.noprefmsg("/vip Pokazuje mozliwosci dla rangi vip "));
    }
}
