package com.sunline.java.base.exception;

/**
 * 
 * @author GuanHao
 * @since  2017-7-7
 * @description 自定义异常，检查性异常是继承 Exception 。运行时异常 继承 RuntimeException
 */
public class DefineException extends  RuntimeException{
	
	private double amount;
	
	public DefineException(double amount){
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
