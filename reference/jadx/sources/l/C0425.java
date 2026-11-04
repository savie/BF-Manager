package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0425 extends AbstractC1100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f1973;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        c2832.f9333.mo9324(this, (C3168) obj);
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        C3168 c3168 = (C3168) obj;
        m2232(c10510.mo15882(), c3168);
        C22010 c22010 = this.f1973;
        if (!c22010.m49790(c3168, (AbstractC22664) c10510, true)) {
            C1699 c1699 = new C1699(c22010, c3168, null, c10510.f73596);
            AbstractC8036 abstractC8036 = c3168.f10273;
            abstractC8036.getClass();
            c22010.m49777((AbstractC11781) c1699, (InterfaceC5075) abstractC8036, (AbstractC11781) c3168.f10279.f26345, (AbstractC22664) c10510, c10510.f73596.f38072, true);
        }
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        c10729.f34074.mo9324(this, (C3168) obj);
        return null;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo2231(C23191 c23191, Object obj) {
        C3168 c3168 = (C3168) obj;
        m2232(c23191.f75155, c3168);
        c23191.f75156.mo9324(this, c3168);
        m2232(c23191.f75157, c3168);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2232(C14769 c14769, C3168 c3168) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            m34207(c3168, (AbstractC22664) it.next());
        }
    }

    public C0425(C22010 c22010) {
        this.f1973 = c22010;
    }
}
