package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1715 implements InterfaceC22598 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24836 f5863;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20029 f5864;

    public C1715(C24836 c24836, InterfaceC20029 interfaceC20029) {
        this.f5863 = c24836;
        this.f5864 = interfaceC20029;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6083(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC8644 interfaceC8644 = (InterfaceC8644) it.next();
            if (interfaceC8644.isClosed()) {
                String strName = interfaceC8644.name();
                AbstractC11528 abstractC11528 = this.f5863;
                AbstractC17376 abstractC17376Mo29028 = abstractC11528.mo29028(strName);
                if (abstractC17376Mo29028 != null) {
                    abstractC17376Mo29028.mo12252(this.f5864, abstractC11528, (InterfaceC13864) interfaceC8644);
                } else {
                    m6083(interfaceC8644.mo14578());
                }
            }
        }
    }
}
