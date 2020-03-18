package com.jiangxb.crowd.service.api;

import java.util.List;

import com.jiangxb.crowd.entity.Admin;

public interface AdminService {
	
	void saveAdmin(Admin admin);

	List<Admin> getAll();

}
