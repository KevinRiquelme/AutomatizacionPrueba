package main.java.pageSteps;

import main.java.config.Context;
import main.java.config.Utils;
import main.java.pageEvents.ResultsEvents;
import main.java.utils.Events;

public class ResultsSteps {

	@Context(step = "Obtener el resultado de la búsqueda")
	public static void resultCamara(String index) {
		
		Utils.stepStarted();

	}

	@Context(step = "Obtener el resultado de la búsqueda")
	public static void resultadoCampo(String index) {

		Utils.stepStarted();
	}



}
