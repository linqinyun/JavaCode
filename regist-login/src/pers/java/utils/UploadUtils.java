package pers.java.utils;

import java.util.UUID;

public class UploadUtils {
	/**
	 * 文件名唯一
	 * @param fileName 原始文件名
	 * @return 格式化文件名
	 */
	public static String getUuidFileName(String fileName) {
		int idx = fileName.lastIndexOf(".");
		String exName = fileName.substring(idx);
		String uuidFileName = UUID.randomUUID().toString().replace("-", "")+exName;
		return uuidFileName;
	}
}
