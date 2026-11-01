package l;

/* JADX INFO: renamed from: l.۟۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7461 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0405 f24857;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f24858;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3120 f24859;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f24860;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7461(C0405 c0405, AbstractActivityC12483 abstractActivityC12483, C3120 c3120, AbstractActivityC12483 abstractActivityC12484, DialogInterfaceC19356 dialogInterfaceC19356) {
        super(abstractActivityC12483, -1);
        this.f24857 = c0405;
        this.f24859 = c3120;
        this.f24858 = abstractActivityC12484;
        this.f24860 = dialogInterfaceC19356;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        if (strTrim.equals(this.f24859.m9394())) {
            m40364();
        } else {
            new C10284(this, strTrim).m10243();
        }
    }
}
