package org.abc.blockchain.kafka;

//import static kr.ac.jbnu.ssel.blockchain.BCConstants.NET_DELIM;

//import java.util.ArrayList;
//import java.util.Arrays;

//import kr.ac.jbnu.ssel.blockchain.BCConstants;
//import kr.ac.jbnu.ssel.blockchain.BlockChainEnv;
//import kr.ac.jbnu.ssel.blockchain.block.Block;
//import kr.ac.jbnu.ssel.blockchain.net.IBCNetProtocol;
//import kr.ac.jbnu.ssel.blockchain.net.NetworkGateway;
//import kr.ac.jbnu.ssel.blockchain.util.JSonHelper;

//import static kr.ac.jbnu.ssel.blockchain.BCConstants.PRESCRIPT_BLOCK;
//import static kr.ac.jbnu.ssel.blockchain.BCConstants.PRESCRIPT_TX;

public class KafkaProtocolHandler //implements IBCNetProtocol, KafkaMsgListener
{
/*	private BCConstants.NET_TOPIC blockTopic = BlockChainEnv.getBlockChainEnv().getBlockTopic(); 
	private BCConstants.NET_TOPIC txTopic = BlockChainEnv.getBlockChainEnv().getTxTopic(); 
	private BCConstants.NET_TOPIC blockNetSpv 	= BlockChainEnv.getBlockChainEnv().getBlockTopic(); 
	
	private KafkaMsgCosumer consumer = null;
	private KafkaMsgProducer produer = null;
	private NetworkGateway netGateway;
	
	public KafkaProtocolHandler(NetworkGateway netGateway)
	{
		this.netGateway = netGateway;
		if( consumer == null)
		{
			consumer = new KafkaMsgCosumer();
		}
		consumer.addKafkaMsgListener(this);
		consumer.subscribeTopics(Arrays.asList(blockTopic.toString(), txTopic.toString()));
		
		if( produer == null)
		{
			produer = new KafkaMsgProducer();
		}
	}
	
	@Override
	public void sendTx(String signedNEcodedTxMsg)
	{
		String msg = PRESCRIPT_TX + NET_DELIM + signedNEcodedTxMsg;
		produer.sendMessage(txTopic.toString(), msg);	
	}
	
	@Override
	public void sendBlock(String signedNEcodedBlockMsg)
	{
		String message = PRESCRIPT_BLOCK + NET_DELIM + signedNEcodedBlockMsg;
		produer.sendMessage(txTopic.toString(), message);	
	}
	
	private long msgCount = 0;
	@Override
	public void acceptMessages(ArrayList<String> messages)
	{
		if( messages != null && messages.size() > 0)
		{
			for(int i = 0; i < messages.size() ; i++ )
			{
				String msg = messages.get(i);
				System.out.println(msgCount++ +"]" + msg);
				
				String msgType = msg.substring(0, msg.indexOf(NET_DELIM));
				if( msgType.equals(PRESCRIPT_BLOCK))
				{
					netGateway.receiveBlock(msg.substring(msg.indexOf(NET_DELIM)+1));
				}
				else if(msgType.equals(PRESCRIPT_TX))
				{
					netGateway.receiveTx(msg.substring(msg.indexOf(NET_DELIM)+1));
				}
				else
				{
					// This is never gonna happen!
				}
					
			}
		}
	}

	@Override
	public void sendToSpv(Block block) {
		
	}
	
	
*/

}
