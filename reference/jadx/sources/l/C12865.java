package l;

/* JADX INFO: renamed from: l.۫ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S98Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C12865 implements InterfaceC16594 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41190;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5408 f41191;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f41192 = 0;

    public C12865(C5408 c5408) {
        this.f41191 = c5408;
        this.f41190 = c5408.m16131();
    }

    @Override // l.InterfaceC16594
    public final int read() {
        int i = this.f41192;
        int i2 = this.f41190;
        if (i >= i2) {
            return -1;
        }
        this.f41192 = i + 1;
        int i3 = (i2 - 1) - i;
        return (this.f41191.mo6024(i3 >> 2) >>> ((i3 & 3) << 3)) & 255;
    }
}
