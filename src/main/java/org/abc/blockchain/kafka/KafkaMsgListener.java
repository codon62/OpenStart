package org.abc.blockchain.kafka;

import java.util.ArrayList;

public interface KafkaMsgListener
{
	public void acceptMessages(ArrayList<String> messages);
}
