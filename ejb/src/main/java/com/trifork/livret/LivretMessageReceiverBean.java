package com.trifork.livret;

import javax.ejb.EJBException;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(mappedName="jms/livretQueue")
public class LivretMessageReceiverBean implements MessageListener {

    public void onMessage(Message msg) {
        // Antager det er en TextMessage, Kan også være Bytes-, Object-, Map- og StreamMessage
        TextMessage txtMsg = (TextMessage) msg;
        try {
            final String livret = txtMsg.getText();
            // gem livret ...
        } catch (JMSException e) {
            // ...
            throw new EJBException(e);
        }
    }
}
