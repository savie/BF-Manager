package l;

/* JADX INFO: renamed from: l.ۚܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes3.dex */
public final class C5397 implements InterfaceC4383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18803 f18628;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1163 f18629;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f18630;

    public C5397(C1163 c1163, C18803 c18803, long j) {
        this.f18629 = c1163;
        this.f18628 = c18803;
        this.f18630 = j;
    }

    @Override // l.InterfaceC4383
    public final void cancel() {
        C1163 c1163 = this.f18629;
        EnumC20508 enumC20508M11484 = c1163.f5211.m32548().m11484();
        C18803 c18803 = this.f18628;
        C7537 c7537 = new C7537(enumC20508M11484, this.f18630, c18803.m43369(), c18803.m43365());
        try {
            c1163.f5206.m45673(Long.valueOf(this.f18630)).m46889(c7537, c18803.m43363());
        } catch (C21317 unused) {
            C1163.f5202.mo12118(c7537, "Failed to send {}");
        }
    }
}
