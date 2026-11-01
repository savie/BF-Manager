package l;

/* JADX INFO: renamed from: l.ۨ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S98Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C11693 implements InterfaceC13104 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f39310;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2519 f39311;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39312 = 0;

    public C11693(C2519 c2519) {
        this.f39311 = c2519;
        this.f39310 = c2519.m7847();
    }

    @Override // l.InterfaceC13104
    public final int read() {
        int i = this.f39312;
        int i2 = this.f39310;
        if (i >= i2) {
            return -1;
        }
        this.f39312 = i + 1;
        int i3 = (i2 - 1) - i;
        return (this.f39311.mo4125(i3 >> 2) >>> ((i3 & 3) << 3)) & 255;
    }
}
