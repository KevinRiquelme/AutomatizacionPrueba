package test.java.main;

import com.opencsv.exceptions.CsvValidationException;
import main.java.config.OpenCSV;
import main.java.pageSteps.CamposSteps;

import main.java.pageSteps.ResultsSteps;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.java.BaseTest;

import java.io.File;
import java.io.IOException;

public class PostulacionSocioTests extends BaseTest {

	@Test(priority = 1, enabled = true, dataProvider = "dataPostulationSearch")
	public void PostulacionJuridico(String[] args) {

		test.assignCategory("Postulación persona júridica");
		step = test.createNode("Ingresar datos correctos en todo los campos disponibles para persona júridica");

		CamposSteps.ingresarPostulacion();
		CamposSteps.ingresarRut(args[0]);
		CamposSteps.ingresarCorreo(args[1]);
		CamposSteps.ingresarConfirmacion(args[2]);
		CamposSteps.ingresarTelefono(args[3]);
		CamposSteps.ingresarCamaraReg();
		CamposSteps.ingresarPersonaJuridica();
		CamposSteps.ingresarTipoSociedad();
		CamposSteps.enviarPostulacion();





	}

	@Test(priority = 2, enabled = false, dataProvider = "dataPostulationSearch")
	public void PostulacionNatural(String[] args) {

		test.assignCategory("Postulacion persona natural");
		step = test.createNode("Ingresar datos correctos en todo los campos disponibles para persona natural");

		CamposSteps.ingresarPostulacion();
		CamposSteps.ingresarRut(args[8]);
		CamposSteps.ingresarCorreo(args[9]);
		CamposSteps.ingresarConfirmacion(args[10]);
		CamposSteps.ingresarTelefono(args[11]);
		CamposSteps.ingresarCamaraReg();
		CamposSteps.ingresarPersonaNatural();
		CamposSteps.enviarPostulacion();





	}

	@Test(priority = 3, enabled = true, dataProvider = "dataPostulationSearch")
	public void postulacionJuridicoTriste(String[] args) {

		test.assignCategory("Postulación persona júridica erronea");
		step = test.createNode("Ingresar datos incorrectos en todo los campos disponibles para persona júridica");

		CamposSteps.ingresarPostulacion();
		CamposSteps.ingresarRut(args[4]);
		CamposSteps.ingresarCorreo(args[5]);
		CamposSteps.ingresarConfirmacion(args[6]);
		CamposSteps.ingresarTelefono(args[7]);
		CamposSteps.ingresarCamaraReg();
		CamposSteps.ingresarPersonaJuridica();
		CamposSteps.errorPostulacion();

	}

	@Test(priority = 4, enabled = false, dataProvider = "dataPostulationSearch")
	public void postulacionNaturalTriste(String[] args) {

		test.assignCategory("Postulacion persona natural erronea");
		step = test.createNode("Ingresar datos incorrectos en todo los campos disponibles para persona natural");

		CamposSteps.ingresarPostulacion();
		CamposSteps.ingresarRut(args[4]);
		CamposSteps.ingresarCorreo(args[5]);
		CamposSteps.ingresarConfirmacion(args[6]);
		CamposSteps.ingresarTelefono(args[7]);
		CamposSteps.ingresarCamaraReg();
		CamposSteps.ingresarPersonaNatural();
		CamposSteps.errorPostulacion();

	}

	//Codigo en desarrolloooo

	@Test(priority = 5, enabled = false, dataProvider = "dataPostulationSearch")
	public void adjuntarArchivos(String[] args) {

		test.assignCategory("Adjuntar archivos adjuntos en el formulario desde el computador");
		step = test.createNode("Adjuntar archivos adjuntos, extrayendo la ruta desde donde se encuentra y adjuntarlo en el formulario");

		CamposSteps.rutExistente();
	}

	@DataProvider(name = "dataPostulationSearch")
	public Object[][] dataGoogleSearch() throws CsvValidationException, InterruptedException, IOException {
		return OpenCSV.getCSVParametersDescription("search" + File.separator + "CSVDataSearch.csv", 1, 12);
	}
}
