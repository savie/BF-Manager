package l;

import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import net.engio.mbassy.bus.error.PublicationError;

/* JADX INFO: renamed from: l.᩺᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9DJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24520 implements IPublicationErrorHandler {
    @Override // net.engio.mbassy.bus.error.IPublicationErrorHandler
    public final void handleError(PublicationError publicationError) {
        if (publicationError.getCause() != null) {
            C4382.f15789.mo13724(publicationError.toString(), publicationError.getCause());
        } else {
            C4382.f15789.mo13699(publicationError.toString());
        }
    }
}
