package co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog;

import co.edu.uco.qiu.config.crosscutting.exceptions.custom.CrosscuttingQIUException;
import co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.data.Message;
import co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.data.MessageCode;
import co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.impl.MessageCatalogBase;
import co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.impl.MessageCatalogExternalService;
import co.edu.uco.qiu.config.crosscutting.helpers.ObjectHelper;

public final class MessageCatalogStrategy {
	
	private static final MessageCatalog base = new MessageCatalogBase();
	private static final MessageCatalog externalService = new MessageCatalogExternalService();
	
	private MessageCatalogStrategy()
	{
		super();
	}
	
	public static void initialize()
	{
		base.initialize();
		externalService.initialize();
	}
	
	private static final MessageCatalog getStrat( final boolean isBase )
	{
		return isBase ? base : externalService;
	}
	
	public static final Message getMessage( final MessageCode code, final String... params)
	{
		if (ObjectHelper.getObjectHelper().isNull(code))
		{
			throw new CrosscuttingQIUException(null, null, null);
		}
		
		return getStrat(code.getIsBase()).getMessage(code, params);
	}
}
