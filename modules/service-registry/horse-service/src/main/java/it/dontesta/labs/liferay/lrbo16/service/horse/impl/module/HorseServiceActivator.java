package it.dontesta.labs.liferay.lrbo16.service.horse.impl.module;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import it.dontesta.labs.liferay.lrbo16.service.horse.HorseService;
import it.dontesta.labs.liferay.lrbo16.service.horse.impl.HorseServiceImpl;

public class HorseServiceActivator implements BundleActivator {

	private HorseService _horseService;
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("[Horse OSGi Service] Starting module...");
		
		HorseService helloService = new HorseServiceImpl();
		_horseService = helloService;
	     
		// Register the service with the service registry
	     bundleContext.registerService(
	    		 HorseService.class.getName(), _horseService, null);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("[Horse OSGi Service] Stopping module...");
	}

}