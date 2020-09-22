package com.online.ui;

import com.online.bo.ProductBO;
import com.online.util.Factory;
import com.online.util.TakeInput;

public class Women implements UICategory {

	@Override
	public void category() {
		String categories[] = { "Sarees", "Kurtis", "Top" };
		Factory.getStyle().printMenu("Women", categories, false);
		int choice = TakeInput.takeChoice(categories.length);
		ProductBO productBO = Factory.getProductBO();
		switch (choice) {
		case 1:
			UI.printSubCategory(productBO.getSareeList(), "Sarees");
			break;
		case 2:
			UI.printSubCategory(productBO.getKurtas(), "Kurtas & Kurtis");
			break;
		case 3:
			UI.printSubCategory(productBO.getLc(), "Lehenga Choli");
			break;
		}
	}
}
