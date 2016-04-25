package com.geekstar.batch.ac.Interface;

import java.util.List;

import com.geekstar.batch.ac.Bean.*;

public interface IDetailFile {
	//获取对账文件中的所有记录
	public List<DetailBean> getDetailBeanList(String file);
}
