package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C5444 implements InterfaceC22598 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24836 f19028;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20029 f19029;

    public C5444(C24836 c24836, InterfaceC20029 interfaceC20029) {
        this.f19028 = c24836;
        this.f19029 = interfaceC20029;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16273(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC7153 interfaceC7153 = (InterfaceC7153) it.next();
            if (interfaceC7153.isClosed()) {
                String strName = interfaceC7153.name();
                AbstractC11528 abstractC11528 = this.f19028;
                AbstractC17376 abstractC17376Mo29028 = abstractC11528.mo29028(strName);
                if (abstractC17376Mo29028 != null) {
                    abstractC17376Mo29028.mo12252(this.f19029, abstractC11528, interfaceC7153);
                }
            }
        }
    }
}
