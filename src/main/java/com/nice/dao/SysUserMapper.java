package com.nice.dao;

import com.nice.pojo.SysUser;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface SysUserMapper {

    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
	
	SysUser findByName(String loginName);

	SysUser getUserByLoginNameAndPassWord(String loginName,String passWrod);

	List<SysUser> queryListPage(Example example);

}