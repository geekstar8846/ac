package com.geekstar.batch.ac.Interface;

import java.util.List;

import com.geekstar.batch.ac.Bean.ResultBean;

public interface IResultTable {
	//保存一条对账结果到内存
	public void addResultBean(ResultBean bean);
	public List<ResultBean> getResultBeanList();
	
	//转存当前“账务日期”的所有对账结果到database
	public void saveToDB(String date);
}
