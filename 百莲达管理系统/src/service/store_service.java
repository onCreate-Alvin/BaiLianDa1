package service;

import java.util.List;

import model.store;

public interface store_service extends BasicService<store>{
	public List<store> getByShopId(int shopid);
}
