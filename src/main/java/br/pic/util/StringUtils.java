package br.pic.util;

public class StringUtils {
	
	public static boolean isNullOrEmpty(String str) {
		return isNull(str) || isEmpty(str);
	}

	public static boolean isNull(String arg) {
		return arg == null || "null".equalsIgnoreCase(arg);
	}
	
	public static boolean isEmpty(String arg) {
		return "".equals(arg);
	}
	
	public static boolean isBlank(String arg) {
		return "".equalsIgnoreCase(arg.trim());
	}
	
	public static boolean isNullOrBlank(String arg) {
		return isNullOrEmpty(arg) || isBlank(arg);  
	}
	
}
