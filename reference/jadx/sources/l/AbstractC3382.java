package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۗܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68XX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3382 {
    /* JADX INFO: renamed from: ۙ */
    public abstract Collection mo3243();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3244(InterfaceC12061 interfaceC12061, AbstractC4332 abstractC4332, InterfaceC21022 interfaceC21022);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10034(InterfaceC12061 interfaceC12061, AbstractC4332 abstractC4332, InterfaceC10440 interfaceC10440) {
        for (InterfaceC10440 interfaceC10441 : interfaceC10440.mo26355()) {
            if (interfaceC10441.isClosed()) {
                AbstractC3382 abstractC3382Mo6344 = abstractC4332.mo6344(interfaceC10441.name());
                if (abstractC3382Mo6344 != null) {
                    abstractC3382Mo6344.mo3244(interfaceC12061, abstractC4332, (InterfaceC21022) interfaceC10441);
                } else {
                    m10034(interfaceC12061, abstractC4332, interfaceC10441);
                }
            }
        }
    }
}
