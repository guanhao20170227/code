package com.sunline.java.base.exception;

/**
 * 
 * @author GuanHao
 * @since  2017-7-7
 * @description 异常类测试
 */
public class DefineExceptionTest {
	
	public static void main(String[] args) {
		if(1 > 0){
			throw new DefineException(12.23);
		}
	}
	

}
