package com.casestudy;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Item item1 = new Item("Item 1", 15.99);
	        Item item2 = new Item("Item 2", 25.99);

	        BinaryOperator<Item> maxPriceItem = BinaryOperator.maxBy((itemA, itemB) -> Double.compare(itemA.getPrice(), itemB.getPrice()));

	        Item itemWithMaxPrice = maxPriceItem.apply(item1, item2);

	        System.out.println("Item with max price: " + itemWithMaxPrice.getName());
	}

}
