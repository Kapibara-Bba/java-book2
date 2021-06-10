package point_exchange;

import java.util.ArrayList;
import java.util.List;

public class PointInquiry {

	public static void main(String[] args) {

	    List<String> goodsInquiryItem = new ArrayList<String>();
	    goodsInquiryItem.add("a");
	    goodsInquiryItem.add("b");
	    goodsInquiryItem.add("c");
	    goodsInquiryItem.add("d");
	    goodsInquiryItem.add("e");
	    goodsInquiryItem.add("f");
	    goodsInquiryItem.add("g");
	    goodsInquiryItem.add("h");
	    goodsInquiryItem.add("i");
	    goodsInquiryItem.add("j");
	    goodsInquiryItem.add("k");
	    goodsInquiryItem.add("l");
	    goodsInquiryItem.add("m");
	    goodsInquiryItem.add("n");
	    goodsInquiryItem.add("o");
	    goodsInquiryItem.add("p");
	    goodsInquiryItem.add("q");
	    goodsInquiryItem.add("r");
	    goodsInquiryItem.add("s");
	    goodsInquiryItem.add("t");
	    goodsInquiryItem.add("u");

	    List<String> goodsInquiryItem1 = new ArrayList<String>();
	    List<String> goodsInquiryItem2 = new ArrayList<String>();
	    List<String> goodsInquiryItem3 = new ArrayList<String>();

	    int count = 13;
	    int pages = (int)Math.ceil(count / 9);

	    for (int i = 0; i < pages; i++) {
	      int n = 9 * 1;
	      for (int j = n; j < 3; j++) {
	    	  goodsInquiryItem1.add(goodsInquiryItem.get(i));
	    	  goodsInquiryItem2.add(goodsInquiryItem.get(i + 3));
	    	  goodsInquiryItem3.add(goodsInquiryItem.get(i + 6));
	      }
	    }

	    System.out.println(goodsInquiryItem1);
	    System.out.println(goodsInquiryItem2);
	    System.out.println(goodsInquiryItem3);
	  }
	
	
}
