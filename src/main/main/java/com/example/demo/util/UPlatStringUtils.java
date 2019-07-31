package com.example.demo.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UPlatStringUtils {
	private static Logger logger = LoggerFactory.getLogger(UPlatStringUtils.class);
	private static String localIp = "";
	{
		try {
			localIp = InetAddress.getLocalHost().getHostAddress(); // 本地IP地址
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}


	public static String GetUUID() {

		return UUID.randomUUID().toString();
	}

}
