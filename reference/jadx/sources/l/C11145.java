package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8ZW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11145 implements InterfaceC16789 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1971 f37806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12061 f37807;

    public C11145(C1971 c1971, InterfaceC12061 interfaceC12061) {
        this.f37806 = c1971;
        this.f37807 = interfaceC12061;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28069(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC7617 interfaceC7617 = (InterfaceC7617) it.next();
            if (interfaceC7617.isClosed()) {
                String strName = interfaceC7617.name();
                AbstractC4332 abstractC4332 = this.f37806;
                AbstractC3382 abstractC3382Mo6344 = abstractC4332.mo6344(strName);
                if (abstractC3382Mo6344 != null) {
                    abstractC3382Mo6344.mo3244(this.f37807, abstractC4332, interfaceC7617);
                }
            }
        }
    }
}
