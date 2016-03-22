package com.dz.nan.tizi.data;

/**
 * 
 * @author LYES KHERBICHE
 *
 * @param <T>
 */

public abstract class Dao<T>{
	
	public abstract T find(T obj) throws Exception;

}
