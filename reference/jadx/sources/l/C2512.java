package l;

import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import net.engio.mbassy.bus.error.PublicationError;

/* JADX INFO: renamed from: l.ۖۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9DJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2512 implements IPublicationErrorHandler {
    @Override // net.engio.mbassy.bus.error.IPublicationErrorHandler
    public final void handleError(PublicationError publicationError) {
        if (publicationError.getCause() != null) {
            C5335.f18403.mo12138(publicationError.toString(), publicationError.getCause());
        } else {
            C5335.f18403.mo12119(publicationError.toString());
        }
    }
}
