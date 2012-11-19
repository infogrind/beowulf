package ch.hotstuff.beowulf.dao;

import ch.hotstuff.beowulf.dao.entities.Message;

public interface MessageDao
{
	Message findById(Long messageId);
	void persist(final Message message);
	void modify(final Message message);
}
