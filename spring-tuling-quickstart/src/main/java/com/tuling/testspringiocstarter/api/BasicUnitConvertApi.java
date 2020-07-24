package com.tuling.testspringiocstarter.api;

import com.tuling.testspringiocstarter.service.BasicUnitConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BasicUnitConvertApi {

	@Autowired
	private BasicUnitConvertService basicUnitConvertService;
}
