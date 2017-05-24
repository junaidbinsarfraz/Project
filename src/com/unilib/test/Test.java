package com.unilib.test;

import java.rmi.RemoteException;

import com.unilib.controller.BookOrderingControllerImpl;

public class Test {

	public static void main(String[] args) {
		
		BookOrderingControllerImpl controller = new BookOrderingControllerImpl();
		
		try {
			controller.orderBook(1, "1111", "");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
