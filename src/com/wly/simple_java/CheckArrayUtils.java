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
	
	/**
	 * 错的！！！
	 * @param arr
	 * @param targetValue
	 * @return
	 */
	public static boolean useArraysBinarySearch(String[] arr, String targetValue){
		int a = Arrays.binarySearch(arr, targetValue);
		return (a > 0) ? true : false;
	}
	
	public static void main(String[] args) {
		String[] arr = new String[]{"123","456","789","0AB","cde","fjh"};
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			useList(arr, "A");
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("use list: ---->" + duration);
		
		
		long startTime2 = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			useSet(arr, "A");
		}
		long endTime2 = System.currentTimeMillis();
		long duration2 =  endTime2 - startTime2;
		System.out.println("use set: ---->" + duration2);
		
		
		long startTime3 = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			useLoop(arr, "A");
		}
		long endTime3 = System.currentTimeMillis();
		long duration3 = endTime3 - startTime3;
		System.out.println("use loop: ---->" + duration3);
		
		
		long startTime4 = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			useArraysBinarySearch(arr, "A");
		}
		long endTime4 = System.currentTimeMillis();
		long duration4 = endTime4 - startTime4;
		System.out.println("use binaryt: ---->" + duration4);
	}
}
