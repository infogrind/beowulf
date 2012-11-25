package ch.hotstuff.beowulf.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.hotstuff.beowulf.dao.MessageDao;
import ch.hotstuff.beowulf.dao.entities.Message;

public class MessageDaoImpl implements MessageDao
{
	@PersistenceContext
	private EntityManager em;

	@Override
	public Message findById(Long messageId)
	{
		// TODO Auto-generated method stub
		return em.find(Message.class, messageId);
	}

	@Override
	public void persist(Message message)
	{
		em.persist(message);
	}

	@Override
	public void modify(Message message)
	{
		em.merge(message);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
