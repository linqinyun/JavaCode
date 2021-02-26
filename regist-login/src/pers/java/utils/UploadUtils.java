package pers.java.utils;

import java.util.UUID;

public class UploadUtils {
	/**
	 * �ļ���Ψһ
	 * @param fileName ԭʼ�ļ���
	 * @return ��ʽ���ļ���
	 */
	public static String getUuidFileName(String fileName) {
		int idx = fileName.lastIndexOf(".");
		String exName = fileName.substring(idx);
		String uuidFileName = UUID.randomUUID().toString().replace("-", "")+exName;
		return uuidFileName;
	}
}
