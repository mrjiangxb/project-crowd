package com.jiangxb.crowd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiangxb.crowd.entity.Admin;
import com.jiangxb.crowd.entity.AdminExample;
import com.jiangxb.crowd.mapper.AdminMapper;
import com.jiangxb.crowd.service.api.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public void saveAdmin(Admin admin) {
		
		adminMapper.insert(admin);
		
		// throw new RuntimeException();
		
	}

	@Override
	public List<Admin> getAll() {
		return adminMapper.selectByExample(new AdminExample());
	}

}
