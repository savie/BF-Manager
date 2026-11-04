package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܽۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 68XX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17376 {
    /* JADX INFO: renamed from: ۙ */
    public abstract Collection mo12251();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo12252(InterfaceC20029 interfaceC20029, AbstractC11528 abstractC11528, InterfaceC13864 interfaceC13864);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40819(InterfaceC20029 interfaceC20029, AbstractC11528 abstractC11528, InterfaceC8644 interfaceC8644) {
        for (InterfaceC8644 interfaceC8645 : interfaceC8644.mo14578()) {
            if (interfaceC8645.isClosed()) {
                AbstractC17376 abstractC17376Mo29028 = abstractC11528.mo29028(interfaceC8645.name());
                if (abstractC17376Mo29028 != null) {
                    abstractC17376Mo29028.mo12252(interfaceC20029, abstractC11528, (InterfaceC13864) interfaceC8645);
                } else {
                    m40819(interfaceC20029, abstractC11528, interfaceC8645);
                }
            }
        }
    }
}
