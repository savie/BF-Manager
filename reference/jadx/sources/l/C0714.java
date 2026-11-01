package l;

/* JADX INFO: renamed from: l.֡᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 88AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0714 implements InterfaceC20267, InterfaceC22548 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16943 f2986;

    public C0714(C16943 c16943) {
        this.f2986 = c16943;
    }

    @Override // l.InterfaceC20267
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3130(long j, long j2, long j3, long j4) {
        C16943 c16943 = this.f2986;
        c16943.f54156.m10994(j);
        c16943.f54150.mo24047(c16943.f54156);
        c16943.f54150.mo24048(j4);
        c16943.f54150.setProgress(c16943.f54156.m10996());
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        C16943 c16943 = this.f2986;
        return c16943.f54150.mo2357() || c16943.f54154.get() != null;
    }

    @Override // l.InterfaceC20267
    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C16842 mo3131() {
        return this.f2986.f54158;
    }

    @Override // l.InterfaceC8978
    /* JADX INFO: renamed from: ۘۙ */
    public final void mo2885() {
        C16943 c16943 = this.f2986;
        String str = (String) c16943.f54147.get();
        if (str != null) {
            c16943.f54150.setName(str);
        }
    }

    @Override // l.InterfaceC22548
    public final void cancel() {
        this.f2986.f54150.mo24046();
    }
}
