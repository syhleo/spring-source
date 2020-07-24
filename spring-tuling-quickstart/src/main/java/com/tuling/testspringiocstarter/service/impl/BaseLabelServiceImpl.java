package com.tuling.testspringiocstarter.service.impl;

import com.tuling.testspringiocstarter.service.BaseLabelService;
import com.tuling.testspringiocstarter.service.DataDictRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseLabelServiceImpl implements BaseLabelService {

	@Autowired
	private DataDictRedisService dataDictRedisService;
}
