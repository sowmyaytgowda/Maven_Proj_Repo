package com.qsp.genericutility;

import java.time.LocalDateTime;

public class javaUtility {
	/**
	 * This method will return date and time to the caller.
	 * @return
	 */
public String getSystemTime()
{
	return LocalDateTime.now().toString().replace(":", "-");
}
}
