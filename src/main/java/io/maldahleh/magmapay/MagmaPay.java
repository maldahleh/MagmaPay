package io.maldahleh.magmapay;

import io.maldahleh.magmapay.api.MagmaPayAPI;
import io.maldahleh.magmapay.config.ConfigManager;
import io.maldahleh.magmapay.gateways.GatewayManager;
import io.maldahleh.magmapay.messages.MessageManager;

import org.bukkit.plugin.java.JavaPlugin;

public class MagmaPay extends JavaPlugin {
    private static MagmaPay magmaPay;

    private ConfigManager configManager;
    private MessageManager messageManager;
    private GatewayManager gatewayManager;

    private MagmaPayAPI magmaPayAPI;

    @Override
    public void onEnable() {
        getLogger().info("MagmaPay - Enabling...");
        magmaPay = this;

        messageManager = new MessageManager(this);
        gatewayManager = new GatewayManager(this);
        configManager = new ConfigManager(this);

        magmaPayAPI = new MagmaPayAPI(this);
        getLogger().info("MagmaPay - Enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("MagmaPay - Disabled...");
        magmaPay = null;
        getLogger().info("MagmaPay - Disabled.");
    }

    public MagmaPayAPI getAPI() { return magmaPayAPI; }

    public ConfigManager getConfigManager() { return configManager; }

    public GatewayManager getGatewayManager() { return gatewayManager; }

    public MessageManager getMessageManager() { return messageManager; }

    public static MagmaPay getInstance() { return magmaPay; }
}