package com.wly.simple_java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 检查数组是否包含某一值的几种方法
 * @author ly
 *
 */
public class CheckArrayUtils {
	
	private CheckArrayUtils(){}
	
	public static boolean useList(String[] arr, String targetValue){
		boolean result = Arrays.asList(arr).contains(targetValue);
		return result;
	}
	
	public static boolean useSet(String[] arr, String targetValue){
		Set<String> set = new HashSet<>(Arrays.asList(arr));
		boolean result = set.contains(targetValue);
		return result;
	}
	
	public static boolean useLoop(String[] arr, String targetValue){
		for(String s : arr){
			if(targetValue != null && targetValue.equals(s)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean useArraysBinarySearch(String[] arr, String targetValue){
		int a = Arrays.binarySearch(arr, targetValue);
		return (a > 0) ? true : false;
	}
}
