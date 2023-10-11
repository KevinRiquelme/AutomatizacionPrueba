package main.java.pageSteps;

import main.java.config.Context;
import main.java.config.Utils;
import main.java.pageEvents.PostulatcionEvents;
import test.java.BaseTest;

public class CamposSteps extends BaseTest{

	@Context(step = "Hacer click en el botón de postulación")
	public static void ingresarPostulacion() {
		Utils.stepStarted();

		PostulatcionEvents.clickPostulacion();
	}

	@Context(step = "Hacer click en el campo de rut e ingresar datos")
	public static void ingresarRut(String rut) {
		Utils.stepStarted();

		PostulatcionEvents.rutDatos(rut);
	}

	@Context(step = "Hacer click en el campo de correo e ingresar datos")
	public static void ingresarCorreo(String correo) {
		Utils.stepStarted();

		PostulatcionEvents.correoDatos(correo);
	}

	@Context(step = "Hacer click en el campo de confirmacion de correo e ingresar datos")
	public static void ingresarConfirmacion(String confirmcorreo) {
		Utils.stepStarted();

		PostulatcionEvents.confirmacionDatos(confirmcorreo);
	}

	@Context(step = "Hacer click en el campo de telefono e ingresar datos")
	public static void ingresarTelefono(String telefono) {
		Utils.stepStarted();

		PostulatcionEvents.telefonoDatos(telefono);
	}

	@Context(step = "Hacer click en el campo de camara regional y seleccionar una región")
	public static void ingresarCamaraReg() {
		Utils.stepStarted();


		PostulatcionEvents.camaraDatos();

	}

	@Context(step = "Hacer click en el campo de tipo de persona y seleccionar persona júridica")
	public static void ingresarPersonaJuridica() {
		Utils.stepStarted();


		PostulatcionEvents.personaJuridicaDatos();

	}

	@Context(step = "Hacer click en el campo de tipo de persona y seleccionar persona júridica")
	public static void ingresarTipoSociedad() {
		Utils.stepStarted();

		PostulatcionEvents.tipoSociedadDatos();

	}


	@Context(step = "Hacer click en el campo de de tipo de persona y seleccionar persona natural")
	public static void ingresarPersonaNatural() {
		Utils.stepStarted();


		PostulatcionEvents.personaNaturalDatos();
	}


	@Context(step = "Hacer click en el botón enviar, y confirmar envio, extrayendo mensaje de exito de envío")
	public static void enviarPostulacion() {
		Utils.stepStarted();


		PostulatcionEvents.clickEnviarPostulacion();
		PostulatcionEvents.clickConfirmsend();
		PostulatcionEvents.msjExito();

	}

	@Context(step = "Hacer click en el botón enviar, y confirmar envio, extrayendo mensaje de exito de envío")
	public static void errorPostulacion() {
		Utils.stepStarted();


		PostulatcionEvents.clickEnviarPostulacion();
		PostulatcionEvents.msjExito();

	}







	//Codigo en proceso
	@Context(step = "Hacer click en el campo de rut e ingresar datos")
	public static void rutExistente() {
		Utils.stepStarted();

		PostulatcionEvents.clickExpandirPestana();

	}



}
