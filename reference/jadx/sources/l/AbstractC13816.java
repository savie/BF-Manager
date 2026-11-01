package l;

/* JADX INFO: renamed from: l.ܰ۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13816 extends C2339 implements InterfaceC14771, InterfaceC14522 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22386 f45601;

    @Override // l.InterfaceC14771
    /* JADX INFO: renamed from: ۙ */
    public final void mo2097(Object obj) {
        Throwable thM41594 = C17904.m41594(obj);
        if (thM41594 != null) {
            obj = new C18754(thM41594, false);
        }
        Object objM7123 = m7123(obj);
        if (objM7123 == C5162.f17918) {
            return;
        }
        mo4567(objM7123);
    }

    @Override // l.C2339
    /* JADX INFO: renamed from: ۙ */
    public final String mo7111() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public AbstractC13816(InterfaceC22386 interfaceC22386, boolean z) {
        super(z);
        m7117((InterfaceC11138) interfaceC22386.mo4416(C6198.f21082));
        this.f45601 = interfaceC22386.mo4417(this);
    }

    @Override // l.InterfaceC14771
    public final InterfaceC22386 getContext() {
        return this.f45601;
    }

    @Override // l.C2339
    /* JADX INFO: renamed from: ۙ */
    public final void mo7116(C8877 c8877) {
        C23694.m52151(c8877, this.f45601);
    }
}
