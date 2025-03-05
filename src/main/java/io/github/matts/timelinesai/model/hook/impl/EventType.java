package io.github.matts.timelinesai.model.hook.impl;

public enum EventType {
    MESSAGE_NEW("message:new"),
    MESSAGE_SENT_NEW("message:sent:new"),
    MESSAGE_RECEIVED_NEW("message:received:new"),
    WHATSAPP_ACCOUNT_CONNECTED("whatsapp:account:connected"),
    WHATSAPP_ACCOUNT_DISCONNECTED("whatsapp:account:disconnected"),
    WHATSAPP_ACCOUNT_SUSPENDED("whatsapp:account:suspended"),
    WHATSAPP_ACCOUNT_RESUMED("whatsapp:account:resumed"),
    CHAT_NEW("chat:new"),
    CHAT_INCOMING_NEW("chat:incoming:new"),
    CHAT_OUTGOING_NEW("chat:outgoing:new"),
    CHAT_RESPONSIBLE_ASSIGNED("chat:responsible:assigned"),
    CHAT_RESPONSIBLE_UNASSIGNED("chat:responsible:unassigned");

    private final String value;

    EventType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EventType fromValue(String value) {
        for (EventType eventType : EventType.values()) {
            if (eventType.getValue().equals(value)) {
                return eventType;
            }
        }
        return null;
    }
}
