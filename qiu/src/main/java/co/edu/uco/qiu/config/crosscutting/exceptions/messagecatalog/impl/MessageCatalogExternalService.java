package co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.impl;

import co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.MessageCatalog;
import co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.data.Message;
import co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.data.MessageCode;

public final class MessageCatalogExternalService implements MessageCatalog {

	@Override
	public final void initialize() {
		
	}

	@Override
	public final String getMessageContent(MessageCode code, String... params) {
		return null;
	}

	@Override
	public final Message getMessage(MessageCode code, String... params) {
		return null;
	}

}
