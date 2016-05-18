package it.dontesta.labs.liferay.lfbo16.service.client;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import it.dontesta.labs.liferay.lrbo16.service.horse.HorseService;

@Component(immediate = true, 
		service = Object.class, 
		property = 
			{"osgi.command.function=gallop",
			 "osgi.command.scope=custom" 
			}
)
public class HorseClientCommand {
	private HorseService horseService;

	public void gallop() {
		System.out.println(horseService.gallop());
	}

	@Reference(policy = ReferencePolicy.DYNAMIC, cardinality = ReferenceCardinality.OPTIONAL)
	protected void setHelloService(HorseService horseService) {
		System.out.println("[Horse Service Client]: setting hello service");
		this.horseService = horseService;
	}

	protected void unsetHelloService(HorseService horseService) {
		System.out.println("[Horse Service Client]: unsetting hello service");
		this.horseService = null;
	}

	@Activate
	protected void start() {
		if (horseService != null) {
			System.out.println("Horse Service command started");
		} else {
			System.out.println("No Horse Service available.");
		}
	}
}