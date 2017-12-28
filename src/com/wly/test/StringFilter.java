package com.wly.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringFilter {
	public static void main(String[] args) {
		List<String> strs = new ArrayList<>();
		strs.add("A");
		strs.add("A");
		strs.add("A");
		strs.add("B");
		strs.add("B");
		StringFilter stringFilter = new StringFilter();
		List<String> a = stringFilter.filterAStr(strs);	//方法调用
		List<String> b = stringFilter.filterBStr(strs);
		System.out.println("count A:" + a.size());
		System.out.println("count B:" + b.size());
		System.out.println("-------------------------");
		
		List<String> aa = stringFilter.filterStr(strs, StringFilter::isA);	//方法传递
		List<String> bb = stringFilter.filterStr(strs, StringFilter::isB);	
		System.out.println("count AA:" + aa.size());
		System.out.println("count BB:" + bb.size());
		System.out.println("-------------------------");
		
		List<String> aaa = stringFilter.filterStr(strs, (String str) -> "A".equals(str)); //直接传递代码。。NB
		List<String> bbb = stringFilter.filterStr(strs, (String str) -> "B".equals(str));
		System.out.println("count AAA:" + aaa.size());
		System.out.println("count BBB:" + bbb.size());
		System.out.println("-------------------------");
		
	}
	
	public List<String> filterAStr(List<String> strs){
		List<String> resultAs = new ArrayList<>();
		for(String str : strs){
			if("A".equals(str)){
				resultAs.add(str);
			}
		}
		return resultAs;
	}
	
	public List<String> filterBStr(List<String> strs){
		List<String> resultAs = new ArrayList<>();
		for(String str : strs){
			if("B".equals(str)){
				resultAs.add(str);
			}
		}
		return resultAs;
	} 
	
	////////////////////////////////////////////////////////
	public static boolean isA(String str){
		return "A".equals(str);
	}

	public static boolean isB(String str){
		return "B".equals(str);
	}

	public List<String> filterStr(List<String> strs, Predicate<String> p){
		List<String> result = new ArrayList<>();
		for(String str : strs){
			if(p.test(str)){
				result.add(str);
			}
		}
		return result;
	}
	
	
	//////////////////////////////////////////
	public void test(List<String> param){
		List<String> Alist = param.stream().filter(str ->str.equals("A")).collect(null);
	}
	
}
