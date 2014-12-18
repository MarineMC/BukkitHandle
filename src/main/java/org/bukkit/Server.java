package org.bukkit;

import org.bukkit.entity.Player;

import java.util.Collection;

/**
 * Server Interface
 *
 * @author Citymonstret
 */
public interface Server {

    public int getIdleTimeout();

    public void setIdleTimeout(int threshold);

    public String getName();

    public String getVersion();

    public String getBukkitVersion();

    public Collection<? extends Player> getOnlinePlayers();

    public int getMaxPlayers();

    public int getPort();

    public int getViewDistance();

    public String getIp();

    public String getServerName();

    public String getServerId();

    public String getWorldType();

    public boolean getGenerateStructures();

    public boolean getAllowEnd();

    public boolean getAllowNether();

    public boolean hasWhitelist();

    public void setWhitelist(boolean value);

    public Set<OfflinePlayer> getWhitelistedPlayers();

    public void reloadWhitelist();

    public int broadcastMessage(String message);

    public String getUpdateFolder();

    public File getUpdateFolderFile();

    public long getConnectionThrottle();

    public int getTicksPerAnimalSpawns();

    public int getTicksPerMonsterSpawns();

    public Player getPlayer(String name);

    public Player getPlayerExact(String name);

    public List<Player> matchPlayer(String name);

    public Player getPlayer(UUID id);

    public PluginManager getPluginManager();

    public BukkitScheduler getScheduler();

    public ServicesManager getServicesManager();

    public List<World> getWorlds();

    public World createWorld(WorldCreator creator);

    public boolean unloadWorld(String name, boolean save);

    public boolean unloadWorld(World world, boolean save);

    public World getWorld(String name);

    public World getWorld(UUID uid);

    public MapView getMap(short id);

    public MapView createMap(World world);

    public void reload();

    public Logger getLogger();

    public PluginCommand getPluginCommand(String name);

    public void savePlayers();

    public boolean dispatchCommand(CommandSender sender, String commandLine) throws CommandException;

    public void configureDbConfig(ServerConfig config);

    public boolean addRecipe(Recipe recipe);

    public List<Recipe> getRecipesFor(ItemStack result);

    public Iterator<Recipe> recipeIterator();

    public void clearRecipes();

    public void resetRecipes();

    public Map<String, String[]> getCommandAliases();

    public int getSpawnRadius();

    public void setSpawnRadius(int value);

    public boolean getOnlineMode();

    public boolean getAllowFlight();

    public boolean isHardcore();

    public boolean useExactLoginLocation();

    public void shutdown();

    public int broadcast(String message, String permission);

    public OfflinePlayer getOfflinePlayer(String name);

    public OfflinePlayer getOfflinePlayer(UUID id);

    public Set<String> getIPBans();

    public void banIP(String address);

    public void unbanIP(String address);

    public Set<OfflinePlayer> getBannedPlayers();

    public BanList getBanList(BanList.Type type);

    public Set<OfflinePlayer> getOperators();

    public GameMode getDefaultGameMode();

    public void setDefaultGameMode(GameMode mode);

    ConsoleCommandSender getConsoleSender();

    public File getWorldContainer();

    public OfflinePlayer[] getOfflinePlayers();

    public Messenger getMessenger();

    public HelpMap getHelpMap();

    Inventory createInventory(InventoryHolder owner, InventoryType type);

    Inventory createInventory(InventoryHolder owner, InventoryType type, String title);

    Inventory createInventory(InventoryHolder owner, int size) throws IllegalArgumentException;

    int getMonsterSpawnLimit();

    int getAnimalSpawnLimit();

    int getWaterAnimalSpawnLimit();

    int getAmbientSpawnLimit();

    boolean isPrimaryThread();

    String getMotd();

    String getShutdownMessage();

    Inventory createInventory(InventoryHolder owner, int size, String title) throws IllegalArgumentException;

    public Set<OfflinePlayer> getWhitelistedPlayers();

    public WarningState getWarningState();

    ItemFactory getItemFactory();

    ScoreboardManager getScoreboardManager();

    CachedServerIcon getServerIcon();

    CachedServerIcon loadServerIcon(File file) throws Exception;

    CachedServerIcon loadServerIcon(BufferedImage image) throws Exception;

}

