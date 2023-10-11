package main.java.pageEvents;

import main.java.config.Context;
import main.java.config.Utils;
import main.java.pageObjects.SearchElements;
import main.java.utils.Events;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.java.BaseTest;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class PostulatcionEvents implements SearchElements {

	WebDriver driver;

	@Context(description = "Seleccionar el botón para iniciar el proceso de postulación", page = "Postulacion de la CchC")
	public static void clickPostulacion() {
		try {
			Events.clickButton(iniciarProceso);
			
		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}

	@Context(description = "Ingresar datos en el campo de rut", page = "Postulacion de la CchC")
	public static void rutDatos(String rut) {
		try {
			Events.clickButton(campoRut);
			Events.sendKeys(campoRut, rut);

		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}

	@Context(description = "Ingresar datos en el campo de correo", page = "Postulacion de la CchC")
	public static void correoDatos(String correo) {
		try {
			Events.clickButton(campoCorreo);
			Events.sendKeys(campoCorreo , correo);

		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}

	@Context(description = "Ingresar datos en el campo de confirmación de correo", page = "Postulacion de la CchC")
	public static void confirmacionDatos(String confirmcorreo) {
		try {
			Events.clickButton(campoConfirmacion);
			Events.sendKeys(campoConfirmacion , confirmcorreo);

		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}

	@Context(description = "Ingresar datos en el campo de telefono", page = "Postulacion de la CchC")
	public static void telefonoDatos(String telefono) {
		try {
			Events.clickButton(campoTelefono);
			Events.sendKeys(campoTelefono , telefono);

		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}

	@Context(description = "Seleccionar una opción del campo camara regional", page = "Postulacion de la CchC")
	public static void camaraDatos() {
		try {
			List<WebElement> regiones = Events.getElementList(campoCamaraRegional);

			for (int i = 0; i < Objects.requireNonNull(regiones).size(); i++) {
				regiones.get(4).click();
			}
			Utils.outputInfo("Camara seleccionada: " + regiones.get(4).getText());

		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}

	@Context(description = "Seleccionar la opcion de persona juridica en el campo tipo de persona", page = "Postulacion de la CchC")
	public static void personaJuridicaDatos() {
		try {
			List<WebElement> tipoPersona = Events.getElementList(campoTipoPersona);

			for (int i = 0; i < Objects.requireNonNull(tipoPersona).size(); i++) {
				tipoPersona.get(1).click();
			}
			Utils.outputInfo("Persona seleccionada: " + tipoPersona.get(1).getText());

		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}
	@Context(description = "Seleccionar una de las opciones en el campo tipo de sociedad", page = "Postulacion de la CchC")
	public static void tipoSociedadDatos() {
		try {
			List<WebElement> tipoSociedad = Events.getElementList(campoTipoSociedad);

			for (int i = 0; i < Objects.requireNonNull(tipoSociedad).size(); i++) {
				tipoSociedad.get(5).click();
			}
			Utils.outputInfo("Persona seleccionada: " + tipoSociedad.get(5).getText());

		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}

	@Context(description = "Seleccionar la opcion de persona natural en el campo tipo de persona", page = "Postulacion de la CchC")
	public static void personaNaturalDatos() {
		try {
			List<WebElement> tipoSociedad = Events.getElementList(campoTipoPersona);

			for (int i = 0; i < Objects.requireNonNull(tipoSociedad).size(); i++) {
				tipoSociedad.get(2).click();
			}
			Utils.outputInfo("Persona seleccionada: " + tipoSociedad.get(2).getText());

		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}

	@Context(description = "Hacer click en el botón de enviar en el formulario", page = "Postulacion de la CchC")
	public static void clickEnviarPostulacion() {
		try {
			Events.clickButton(btnEnviar);

		} catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}

	@Context(description = "Click para confirmar envío de postulación en el popup", page = "Postulacion de la CchC")
	public static void clickConfirmsend() {
		try {
			Events.clickButton(btnConfirmsend);
		}
		catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}
	@Context(description = "Confirmar que la postulación se haya enviado correctamente", page = "Postulacion de la CchC")
	public static void msjExito() {
		try {
			Events.getAtributte(imgExitoEnvio, "");
			Utils.outputInfo("El envío fue un exito!");
		}
		catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}


	//Codigo en proceso adjuntar archivos adjuntos
	@Context(description = "Click para confirmar envío de postulación en el popup", page = "Postulacion de la CchC")
	public static void clickExpandirPestana() {
		try {

			/*/Events.clickButton(inputRUT);
			Events.sendKeys(inputRUT, "99999999-9");

			Events.clickButton(inputSolicitud);
			Events.sendKeys(inputSolicitud, "65758");

			Events.clickButton(clickBTNproceso);
			Events.clickButton(clickBTNconfirmar);
			Events.clickButton(clickExpandir); /*/


			File file = new File ("C:\\Users\\Test Group\\Desktop\\imagenes\\archivode1.7MB.pdf");
			String path = file.getAbsolutePath();

			Events.getElement(btnAdjuntar).sendKeys(path);
			System.out.println("Se ha subido el archivo");
			Actions actions = new Actions(BaseTest.driver);
			WebElement btn = BaseTest.driver.findElement(By.xpath(btnAdjuntar));
			btn.sendKeys(Keys.ENTER);
			actions.sendKeys(Keys.ENTER);
			//Events.clickButton(btnUpload);
		}
		catch (Exception e) {
			Utils.eventFailed(e.getMessage());
		}
	}
}
