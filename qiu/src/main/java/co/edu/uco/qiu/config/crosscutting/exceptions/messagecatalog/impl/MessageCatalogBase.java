package co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.impl;

import java.util.HashMap;
import java.util.Map;

import co.edu.uco.qiu.config.crosscutting.exceptions.custom.CrosscuttingQIUException;
import co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.MessageCatalog;
import co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.data.Message;
import co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.data.MessageCode;
import co.edu.uco.qiu.config.crosscutting.helpers.ObjectHelper;
import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;

public final class MessageCatalogBase implements MessageCatalog {

	private final Map<String, Message> messages = new HashMap<>();
	
	@Override
	public final void initialize() {
	
		messages.clear();
		messages.put(MessageCode.M00001.getIdentifier(), new Message(MessageCode.M00001, "El código del mensaje que se quiere obtener del catalogo de mensajes llegó nulo."));
		messages.put(MessageCode.M00002.getIdentifier(), new Message(MessageCode.M00002, "Se ha presentado un problema tratando de llevar a cabo la operación deseada."));
		messages.put(MessageCode.M00003.getIdentifier(), new Message(MessageCode.M00003, "El identificador del mensaje \"{0}\" que se intentó obtener no está en el catálogo de mensajes base."));
		messages.put(MessageCode.M00004.getIdentifier(), new Message(MessageCode.M00004, "El mensaje con identificador \"{0}\" que se intentó obtener no está configurado para residir en el catálogo de mensajes base."));
		messages.put(MessageCode.M00005.getIdentifier(), new Message(MessageCode.M00005, "El mensaje con identificador \"{0}\" que se intentó obtener no está configurado para residir en el catálogo de mensajes externo."));
		messages.put(MessageCode.M00006.getIdentifier(), new Message(MessageCode.M00006, "El identificador del mensaje \"{0}\" que se intentó obtener no está en el catálogo de mensajes externo."));
		messages.put(MessageCode.M00009.getIdentifier(), new Message(MessageCode.M00009, "El mensaje con identificador \"{0}\" no recibió los suficientes parámetros."));
	}

	@Override
	public final String getMessageContent(MessageCode code, String... params) {
		
		return StringTool.replaceParams(getMessage(code, params).getContent(), params);
	}

	@Override
	public final Message getMessage(final MessageCode code, final String... params) {
		
		if (ObjectHelper.getObjectHelper().isNull(code))
		{
			var userMessage = getMessageContent(MessageCode.M00002);
			var technicalMessage = getMessageContent(MessageCode.M00001);
			
			throw new CrosscuttingQIUException(technicalMessage, userMessage);
		}
		
		if (!code.getIsBase())
		{
			var userMessage = getMessageContent(MessageCode.M00002);
			var technicalMessage = getMessageContent(MessageCode.M00004, code.getIdentifier());
			
			throw new CrosscuttingQIUException(technicalMessage, userMessage);
		}
		
		if (!messages.containsKey(code.getIdentifier()))
		{
			var userMessage = getMessageContent(MessageCode.M00002);
			var technicalMessage = getMessageContent(MessageCode.M00003, code.getIdentifier());
			
			throw new CrosscuttingQIUException(technicalMessage, userMessage);
		}
		
		return messages.get(code.getIdentifier());
	}
	
}
