package pl.redstonefun.rsutils.message;

import org.bukkit.ChatColor;

public class Messages {

	public static String hasNoPermission = ChatColor.RED + "Nie masz dost�pu do tej komendy!";
	public static String notEnoughArguments = ChatColor.RED + "Z�a ilo�� argument�w!";
	public static String saveFileError = ChatColor.RED + "Problem z zapisem pliku!";
	public static String youAreBanned = "Zosta�e� zbanowany na sta�e za: %reason";
	public static String youAreTempBanned = "Zosta�e� zbanowany do: %time za: %reason";
	public static String userOffline = ChatColor.RED + "Gracz %user jest niedost�pny!";
	public static String userBanned = ChatColor.RED + "Gracz %user zosta� zbanowany na sta�e za: %reason";
	public static String userTempBanned = ChatColor.RED + "Gracz %user zosta� zbanowany do %time za: %reason";
	public static String unBanned = ChatColor.GREEN + "Gracz %user zosta� odbanowany!";
	public static String join = ChatColor.AQUA + "%user do��czy� do serwera!";
	public static String teleport = ChatColor.GREEN + "Teleportowanie do: %loc. ";
	public static String msgToMe = "&7&o[ %user &7&o-> Ja ]&r ";
	public static String msgToHim = "&7&o[ Ja &7-> %user &7&o]&r ";
	public static String warpNotFound = ChatColor.RED + "Warp nie istnieje!";
}
