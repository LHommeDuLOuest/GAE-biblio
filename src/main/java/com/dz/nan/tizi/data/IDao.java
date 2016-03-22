package com.dz.nan.tizi.data;

import java.util.List;

public interface IDao<T> {
	
	List<T> find(T obj);

	void save(T obj);
}
