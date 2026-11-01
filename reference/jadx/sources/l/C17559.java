package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F6LO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17559 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f55790 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f55791 = new HashMap(32);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40829(InterfaceC8825 interfaceC8825) {
        this.f55790.add(interfaceC8825);
        Iterator it = interfaceC8825.mo5501().iterator();
        while (it.hasNext()) {
            C9735.putIfAbsent(this.f55791, (Class) it.next(), interfaceC8825);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40831(AbstractC19367 abstractC19367) {
        InterfaceC8825 interfaceC8825 = (InterfaceC8825) this.f55791.get(abstractC19367.getClass());
        if (interfaceC8825 != null) {
            interfaceC8825.mo5500(abstractC19367);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40832(AbstractC19367 abstractC19367) {
        C0356.forEach(this.f55790, new C5735(2, abstractC19367));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40830(AbstractC19367 abstractC19367) {
        C0356.forEach(this.f55790, new C8263(1, abstractC19367));
    }
}
