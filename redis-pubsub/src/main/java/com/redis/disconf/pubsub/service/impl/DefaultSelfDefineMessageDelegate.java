package com.redis.disconf.pubsub.service.impl;

import com.redis.disconf.pubsub.service.SelfDefineMessageDelegate;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by aayongche on 2016/2/19.
 */
public class DefaultSelfDefineMessageDelegate implements SelfDefineMessageDelegate {
    public void handleMessage(String message) {
        System.out.println("handleMessage(String message):" + message);
    }

    public void handleMessage(Map<?, ?> message) {
        System.out.println("handleMessage(Map<?, ?> message):" + message);
    }

    public void handleMessage(byte[] message) {
        System.out.println("handleMessage(byte[] message):"
                + new String(message));
    }

    public void handleMessage(Serializable message) {
        System.out.println("handleMessage(Serializable message):"
                + message.toString());
    }

    public void handleMessage(Serializable message, String channel) {
        System.out
                .println("handleMessage(Serializable message, String channel):"
                        + message.toString() + ", channel:" + channel);
    }
}
