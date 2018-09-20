package com.zcg.learning.common;
/**
 * 字符串内存模型学习
 * 字符串常量池被移到堆中，存放字面量和符号引用
 * https://blog.csdn.net/tophawk/article/details/78704074
 * https://blog.csdn.net/qq_31337311/article/details/78799262
 * @author zhancg
 *
 */
public class StringTest {
	public static void main(String[] args) {
		/**
		 *  Returns a canonical representation for the string object. 

			A pool of strings, initially empty, is maintained privately by the class String. 
			
			When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned. 
			
			It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true. 
			
			All literal strings and string-valued constant expressions are interned. String literals are defined in section 3.10.5 of the The Java™ Language Specification.

		 */
		String s1 = new String("aaa");//堆里生成对象
	    String s2 = "aaa";//常量池生成引用,堆里生成对象
		System.out.println(s1 == s2);
		
		String s5 = new String("aaa");
		String s7 = s5.intern();
		String s6 = "aaa";
		System.out.println(s5 == s7);    //false
		System.out.println(s6 == s7);    // true
		
		String s10 = "aba";
		String s8 = "ab";
		String s9 = s8 + "a";
		System.out.println(s9.intern()==s10);//有一个是字面量的相加，常量池不生成"a"的字面量，生成s9的引用，堆里生成s9的引用对象
		
		
	}
}
