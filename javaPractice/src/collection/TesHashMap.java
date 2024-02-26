package collection;

import java.util.HashMap;
import java.util.Map;

public class TesHashMap {

	public static void main(String[] args) 
	{
	  Map<String,String> objMap = new HashMap<String,String>();
	  objMap.put("Name", "Suzuki");
	  objMap.put("Power", "220");
	  objMap.put("Type","2wheeler");
	  objMap.put("Prize","80000");
	  System.out.println("Elements of the Map:");
	  System.out.println(objMap);

	}

}
