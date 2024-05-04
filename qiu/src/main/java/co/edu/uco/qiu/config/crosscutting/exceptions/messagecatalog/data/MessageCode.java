package co.edu.uco.qiu.config.crosscutting.exceptions.messagecatalog.data;

import co.edu.uco.qiu.config.crosscutting.helpers.StringTool;
import static co.edu.uco.qiu.config.crosscutting.helpers.StringTool.UNDERSCORE;

public enum MessageCode {
	
	M00001(MessageCategory.ERROR, MessageType.TECHNICAL, "00001", true),
	M00002(MessageCategory.ERROR, MessageType.BUSSINESS, "00002", true),
	M00003(MessageCategory.ERROR, MessageType.TECHNICAL, "00003", true),
	M00004(MessageCategory.ERROR, MessageType.TECHNICAL, "00004", true);
	
	private MessageCode(MessageCategory category, MessageType type, String id, final boolean base)
	{
		setCategory(category);
		setType(type);
		setId(id);
		setIsBase(base);
	}
	
	private MessageCategory _category;
	private MessageType _type;
	private String _id;
	private boolean _base;

	public MessageCategory getCategory() {
		return this._category;
	}
	private void setCategory(final MessageCategory category) {
		this._category = category;
	}
	public MessageType getType() {
		return this._type;
	}
	private void setType(final MessageType type) {
		this._type = type;
	}
	public String getId() {
		return this._id;
	}
	private void setId(final String id) {
		this._id = id;
	}
	
	public boolean getIsBase()
	{
		return this._base;
	}
	
	private void setIsBase(final boolean base)
	{
		this._base = base;
	}
	
	public String getIdentifier()
	{
		return StringTool.concatenate(this.getCategory().name(), UNDERSCORE, this.getType().name(), UNDERSCORE, this.getId());
	}
}
