package pl.redstonefun.rsutils.message;

import org.bukkit.ChatColor;

public class Messages {

	public static String hasNoPermission = ChatColor.RED + "Nie masz dost�pu do tej komendy!";
	public static String notEnoughArguments = ChatColor.RED + "Zbyt ma�o argument�w!";
	public static String saveFileError = ChatColor.RED + "Problem z zapisem pliku!";
	public static String youAreBanned = "Zosta�e� zbanowany na sta�e za: %reason";
	public static String youAreTempBanned = "Zosta�e� zbanowany do: %time za: %reason";
	public static String userBanned = ChatColor.RED + "Gracz %user zosta� zbanowany na sta�e za: %reason";
	public static String userTempBanned = ChatColor.RED + "Gracz %user zosta� zbanowany do %time za: %reason";
	public static String unBanned = ChatColor.GREEN + "Gracz %user zosta� odbanowany!";
	public static String join = ChatColor.AQUA + "%user do��czy� do serwera!";
}
