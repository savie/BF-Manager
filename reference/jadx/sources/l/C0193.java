package l;

/* JADX INFO: renamed from: l.֡ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FIQP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0193 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f1295;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1296;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f1297 = new int[2048];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f1298;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long[] f1299;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long[] f1300;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f1301;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f1302;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f1303;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m1555(int i, int i2, int i3, int i4) {
        int i5 = this.f1302;
        return i >= i5 && i3 >= this.f1303 && (i - i5) % 32 == 0 && ((long) i) + ((long) i2) <= ((long) this.f1298) && ((long) i3) + ((long) i4) <= ((long) this.f1301);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1554(int i, int i2, int i3, int i4) {
        this.f1302 = i;
        this.f1303 = i3;
        this.f1298 = i + i2;
        this.f1301 = i3 + i4;
    }
}
