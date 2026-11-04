package net.engio.mbassy.bus.common;

import net.engio.mbassy.bus.publication.IPublicationCommand;

/* JADX INFO: loaded from: classes2.dex */
public interface GenericMessagePublicationSupport extends PubSubSupport, ErrorHandlingSupport {
    IPublicationCommand post(Object obj);
}
