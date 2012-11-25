package ch.hotstuff.beowulf.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Sample entity class, according to the tutorial in Ch. 2 of
 * "Java Persistence with Hibernate" (2006).
 */
@Entity
@Table(name="TBWFC_MESSAGE")
public class Message
{
	@Id
	@Column(name="MESSAGE_ID", nullable=false)
	private Long id;

	@Column(name="TEXT", nullable=false)
	private String text;

	protected Message() {}

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
}
