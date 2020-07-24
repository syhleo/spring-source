package com.tuling.testspringiocstarter.api;


import com.tuling.testspringiocstarter.service.BaseLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseLabelApi {

	@Autowired
	private BaseLabelService baseLabelService;
}
