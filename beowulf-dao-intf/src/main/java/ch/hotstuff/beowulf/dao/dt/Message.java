package ch.hotstuff.beowulf.dao.dt;

/**
 * Sample entity class, according to the tutorial in Ch. 2 of
 * "Java Persistence with Hibernate" (2006).
 */
public class Message
{
	private Long id;
	private String text;
	private Message nextMessage;
	
	Message() {}
	
	public Message(String text) {
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Message getNextMessage() {
		return nextMessage;
	}

	public void setNextMessage(Message nextMessage) {
		this.nextMessage = nextMessage;
	}
}
