package it.dontesta.labs.liferay.lrbo16.service.horse.impl;

import it.dontesta.labs.liferay.lrbo16.service.horse.HorseService;

public class HorseServiceImpl implements HorseService {

	@Override
	public String start() {
		return "I started...";
	}

	@Override
	public String stop() {
		return "I stopped...";
	}

	@Override
	public String trot() {
		return "I go at a trot.";
	}

	@Override
	public String gallop() {
		return "I go at a gallop.";
	}
}