package it.dontesta.labs.liferay.lfbo16.service.client;

import it.dontesta.labs.liferay.lrbo16.servicebuilder.model.Horse;
import it.dontesta.labs.liferay.lrbo16.servicebuilder.service.HorseServiceUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import java.util.List;


@Component(immediate = true,
        service = Object.class,
        property =
                {
                        "osgi.command.function=createHorse",
                        "osgi.command.function=getCurrentHorseByAge",
                        "osgi.command.scope=custom"
                }
)
public class HorseClientCommand {

    /**
     * Create a Horse
     *
     * @param name
     * @param kind
     * @param mantle
     * @param gender
     * @param age
     */
    public void createHorse(String name, String kind, String mantle, String gender, int age) {

        Horse horse = _horseServiceUtil.addHorse(name, kind, mantle, gender, age);

        System.out.println("Horse created whit id "
                + horse.getPrimaryKey());
    }

    /**
     * Get all current Horses by age
     *
     * @param age
     */
    public void getCurrentHorseByAge(int age) {

        List<Horse> horses = _horseServiceUtil.getCurrentHorseByeAge(age);

        for (Horse horse : horses) {
            System.out.println("Horse: " + horse.getName());
        }
    }

    @Reference(
            policy = ReferencePolicy.DYNAMIC,
            cardinality = ReferenceCardinality.OPTIONAL
    )
    protected void setHorseServiceUtil(HorseServiceUtil horseService) {
        System.out.println("[Horse Service Client]: setting hello service");
        _horseServiceUtil = horseService;
    }

    protected void unsetHorseServiceUtil(HorseServiceUtil horseService) {

        _horseServiceUtil = null;
    }

    private static HorseServiceUtil _horseServiceUtil;
}