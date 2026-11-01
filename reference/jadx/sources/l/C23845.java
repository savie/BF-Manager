package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes.dex */
public final class C23845 implements InterfaceC16789 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1971 f77095;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12061 f77096;

    public C23845(C1971 c1971, InterfaceC12061 interfaceC12061) {
        this.f77095 = c1971;
        this.f77096 = interfaceC12061;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52574(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC10440 interfaceC10440 = (InterfaceC10440) it.next();
            if (interfaceC10440.isClosed()) {
                String strName = interfaceC10440.name();
                AbstractC4332 abstractC4332 = this.f77095;
                AbstractC3382 abstractC3382Mo6344 = abstractC4332.mo6344(strName);
                if (abstractC3382Mo6344 != null) {
                    abstractC3382Mo6344.mo3244(this.f77096, abstractC4332, (InterfaceC21022) interfaceC10440);
                } else {
                    m52574(interfaceC10440.mo26355());
                }
            }
        }
    }
}
