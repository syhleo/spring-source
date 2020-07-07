package com.tuling.testspringiocstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Btest {

	@Autowired
	private Atest atest;
}
