package co.edu.uco.qiu.config.crosscutting.exceptions;

import co.edu.uco.qiu.config.crosscutting.exceptions.enums.Lugar;
import co.edu.uco.qiu.config.crosscutting.helpers.ObjectHelper;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public class QIUException extends RuntimeException {

	private static final long serialVersionUID = -1119971647684852037L;

	protected String userMesaage;
	protected Lugar exceptionPlace;
	
	public QIUException(final String technicalMessage, final String userMessage, final Lugar exceptionPlace, final Throwable rootException)
	{
		super(technicalMessage, rootException);
		
		setUserMesaage(userMessage);
		setExceptionPlace(exceptionPlace);
	}
	
	public QIUException(final String userMessage, final Lugar exceptionPlace)
	{
		super(userMessage, new Exception());
		
		setUserMesaage(userMessage);
		setExceptionPlace(exceptionPlace);
	}

	public void setUserMesaage(final String userMesaage) {
		this.userMesaage = StringTool.applyTrim(userMesaage);
	}

	public void setExceptionPlace(final Lugar lugar) {
		this.exceptionPlace = ObjectHelper.getObjectHelper().getDefaultValue(lugar, Lugar.DEFAULT);
	}

	public final String getUserMesaage() {
		return this.userMesaage;
	}

	public final Lugar getExceptionPlace() {
		return this.exceptionPlace;
	}
	
}
