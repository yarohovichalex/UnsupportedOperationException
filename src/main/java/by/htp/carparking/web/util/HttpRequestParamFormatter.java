package by.htp.carparking.web.util;

public final class HttpRequestParamFormatter {

	private HttpRequestParamFormatter() {

	}

	public static int formatString(String param) {
		System.out.println(Integer.parseInt(param));
		return Integer.parseInt(param);
	}
}
