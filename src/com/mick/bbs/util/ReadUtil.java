package com.mick.bbs.util;

import java.util.Properties;

public class ReadUtil {
	private static Properties pro = new Properties();
	private static Properties dao = new Properties();
	static {
		try {
			pro.load(ReadUtil.class.getResourceAsStream("/data.properties"));
			dao.load(ReadUtil.class.getResourceAsStream("/dao.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getMessage(String propertiesName) {
		return pro.getProperty(propertiesName);
	}

	public static String getDao(String propertiesName) {
		return dao.getProperty(propertiesName);
	}
}
