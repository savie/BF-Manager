package l;

/* JADX INFO: renamed from: l.ۢ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes3.dex */
public final class C10416 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18096 f33107;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f33108;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f33109;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f33110;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f33111;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f33112;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33113;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6909 f33114;

    public C10416(C6909 c6909, int i, int i2, int i3, int i4) {
        this.f33114 = c6909;
        this.f33107 = c6909.m19181();
        this.f33109 = i;
        this.f33110 = i2;
        this.f33113 = i2;
        this.f33112 = i3;
        this.f33111 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26728(C14366 c14366, C8400 c8400) {
        int i;
        int i2;
        while (true) {
            int i3 = this.f33109;
            i = this.f33112;
            i2 = this.f33113;
            if (i3 >= i2 || this.f33114.m19180(i3) + i >= c14366.f45294) {
                break;
            }
            this.f33109++;
        }
        int i4 = this.f33109;
        if (i4 == i2) {
            return false;
        }
        C14366 c14366M42205 = this.f33107.m42205(i4);
        int i5 = c14366M42205.f45295 + i;
        c14366M42205.f45295 = i5;
        int i6 = c14366M42205.f45294 + i;
        c14366M42205.f45294 = i6;
        int i7 = c14366M42205.f45296 + this.f33111;
        c14366M42205.f45296 = i7;
        if (i7 != c14366.f45296) {
            return false;
        }
        int i8 = this.f33108 + 1;
        this.f33108 = i8;
        int i9 = c14366.f45294;
        if (i6 != i9) {
            if (i8 < 5000 || i9 < i5) {
                return false;
            }
            c8400.m22572(new C14366(i9, i6, i7));
        }
        this.f33110 = this.f33109 + 1;
        return true;
    }
}
