package l;

/* JADX INFO: renamed from: l.۬ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13095 implements InterfaceC20670 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f43603;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7264 f43604;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13095 f43605;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f43606;

    public C13095(int i, long j) {
        C2023.m6510(this.f43604 == null);
        this.f43603 = j;
        this.f43606 = j + ((long) i);
    }

    @Override // l.InterfaceC20670
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7264 mo32313() {
        C7264 c7264 = this.f43604;
        c7264.getClass();
        return c7264;
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 next() {
        C13095 c13095 = this.f43605;
        if (c13095 == null || c13095.f43604 == null) {
            return null;
        }
        return c13095;
    }
}
