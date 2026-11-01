package l;

/* JADX INFO: renamed from: l.۬ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13282 implements InterfaceC5520 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4108 f44119;

    public C13282(C4108 c4108) {
        this.f44119 = c4108;
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4612(C6330 c6330) {
        m32768((AbstractC22454) c6330);
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ۙ */
    public final void mo4613(C9859 c9859) {
        m32768((AbstractC22454) c9859);
    }

    @Override // l.InterfaceC5520
    /* JADX INFO: renamed from: ܰ */
    public final void mo4614(C6330 c6330) {
        m32768((AbstractC22454) c6330);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32768(AbstractC22454 abstractC22454) {
        C0727 c0727Mo17429 = abstractC22454.mo17429();
        int size = c0727Mo17429.size();
        for (int i = 0; i < size; i++) {
            this.f44119.f15066[c0727Mo17429.m15275get(i).m38400()].add(abstractC22454);
        }
    }
}
