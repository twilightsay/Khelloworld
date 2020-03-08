package tsstech;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerChatEvent;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;
public class Main extends PluginBase implements Listener{
@Override
public void onEnable() {
	getLogger().info(getName() + "启动啦哈哈哈哈哈哈哈哈哈哈");// TODO 自动生成的方法存根
	getServer().getPluginManager().registerEvents(this, this);
	super.onEnable();
}
@Override
	public void onLoad() {
	getLogger().info(getName() + "karry最帅不接受反驳");// TODO 自动生成的方法存根
		super.onLoad();
	}
@Override
	public void onDisable() {
	getLogger().info(getName() + "我被关了woc？");// TODO 自动生成的方法存根
		super.onDisable();
	}
@EventHandler
public void Speaking(PlayerChatEvent join) {
	join.setCancelled();
	Player player = join.getPlayer();
    player.sendMessage("哈哈哈，你被禁言了");
}
@EventHandler
    public void onJoin(PlayerJoinEvent join) {
    Player player = join.getPlayer();
    player.sendTitle("欢迎来到服务器!");
    player.sendMessage("欢迎" + player.getDisplayName() + "来到服务器！！！");
	}
}
