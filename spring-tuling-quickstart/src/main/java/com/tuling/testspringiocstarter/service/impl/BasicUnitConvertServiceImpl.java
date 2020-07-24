package com.tuling.testspringiocstarter.service.impl;

import com.tuling.testspringiocstarter.service.BasicUnitConvertService;
import com.tuling.testspringiocstarter.service.DataDictRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicUnitConvertServiceImpl implements BasicUnitConvertService {

	@Autowired
	private DataDictRedisService dataDictRedisService;
}
