package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f79739;

    public C24621(C4483 c4483) {
        c4483.f16035.getClass();
        this.f79739 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54957(C12510 c12510) {
        return this.f79739.containsKey(c12510);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54955(AbstractC8036 abstractC8036) {
        C6721 c6721 = (C6721) this.f79739.get(abstractC8036);
        InterfaceC19399 interfaceC19399 = c6721 == null ? null : c6721.f22356;
        if (interfaceC19399 == null) {
            return null;
        }
        return interfaceC19399.getText();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54956(AbstractC8036 abstractC8036, InterfaceC19399 interfaceC19399) {
        this.f79739.put(abstractC8036, new C6721(interfaceC19399));
    }
}
