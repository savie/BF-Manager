package l;

/* JADX INFO: renamed from: l.ۨܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11778 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23067 f39529;

    public C11778(C23067 c23067) {
        this.f39529 = c23067;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 != EnumC1651.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC1651).toString());
        }
        interfaceC1423.getLifecycle().mo9172(this);
        this.f39529.m51040();
    }
}
