package com.online.util;

import com.online.bo.CartBO;
import com.online.bo.ProductBO;

public class Factory {
	private static Style style = new Style();
	private static final String SHOP_NAME = "      Online Store";
	private static CartBO cartBO = new CartBO();
	private static ProductBO productBO = new ProductBO();

	public static Style getStyle() {
		return style;
	}

	public static String getShopName() {
		return String.format("%-2s", SHOP_NAME);
	}

	public static CartBO getCartBO() {
		return cartBO;
	}

	public static ProductBO getProductBO() {
		return productBO;
	}

}
