package main.java.pageObjects;

public interface SearchElements {

	//clickbutton
	String iniciarProceso = "//a[@class='btn-red btn-login']";
	String btnEnviar = "//button[@id='submitStep02']";
	String btnConfirmsend = "//button[@class='swal2-confirm swal2-styled']";

	//Rellenarcampos
	String campoRut = "//input[@name='rutst02']";
	String campoCorreo = "//input[@name='emailst02']";
	String campoConfirmacion = "//input[@name='email2st02']";
	String campoTelefono = "//input[@name='phonest02']";
	String campoCamaraRegional = "//select[@name='camararegional01_st02']//option";
	String campoTipoPersona = "//select[@name='camararegional_st02']//option";
	String campoTipoSociedad = "//select[@name='tiposociedad_st02']//option";

	//Confirmacion de envio de postulacion
	String imgExitoEnvio = "//div[@class='c-form-info__validacion']";



	//Xpath para tarea archivos adjuntos (aun no terminado)
	String inputRUT = "//input[@name='loginrut']";

	String inputSolicitud = "//input[@name='loginsolicitud']";

	String clickBTNproceso = "//button[@id='loginSubmit']";

	String clickBTNconfirmar = "//button[@class='swal2-confirm swal2-styled']";

	String clickExpandir = "//a[@class='section-minimizar pointer']";

	String btnAdjuntar = "//div[@class='border vue-dropzone dropzone dz-clickable']//ancestor::div[@class='input']";

	String btnUpload = "//input[@id='file-submit']";

	String btnAdjuntarpag2 = "//div[@class='full-choose-file']";

}
