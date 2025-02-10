package io.github.matts.emailengine.model.hook;

public enum Events {
    messageNew,
    messageDeleted,
    messageUpdated,
    messageMissing,
    messageSent,
    messageDeliveryError,
    messageFailed,
    messageBounce,
    messageComplaint,
    mailboxReset,
    mailboxDeleted,
    mailboxNew,
    authenticationError,
    authenticationSuccess,
    connectError,
    accountAdded,
    accountInitialized,
    accountDeleted,
    trackOpen,
    trackClick,
    listUnsubscribe,
    listSubscribe
}
