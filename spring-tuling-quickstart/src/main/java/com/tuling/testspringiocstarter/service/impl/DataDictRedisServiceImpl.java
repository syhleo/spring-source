package com.tuling.testspringiocstarter.service.impl;

import com.tuling.testspringiocstarter.service.BaseLabelService;
import com.tuling.testspringiocstarter.service.BasicUnitConvertService;
import com.tuling.testspringiocstarter.service.DataDictRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DataDictRedisServiceImpl implements DataDictRedisService {


	@Autowired
	private BasicUnitConvertService basicUnitConvertService;

	@Autowired
	private BaseLabelService baseLabelService;

	@Async
	@Override
	public void testDej(){
		System.out.println("-----------测试循环依赖-----------");
	}

}
