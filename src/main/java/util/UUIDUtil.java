package util;

import java.util.UUID;

public abstract class UUIDUtil {
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
