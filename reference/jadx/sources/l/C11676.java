package l;

/* JADX INFO: renamed from: l.ۨۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes3.dex */
public final class C11676 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f39267;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3662 f39268;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9496 f39269;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f39270;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f39271;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f39272;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f39273;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f39274;

    public C11676(C3662 c3662, int i, int i2, int i3, int i4) {
        this.f39268 = c3662;
        this.f39269 = c3662.m10817();
        this.f39271 = i;
        this.f39267 = i2;
        this.f39273 = i2;
        this.f39270 = i3;
        this.f39274 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29175(C14435 c14435, C12836 c12836) {
        int i;
        int i2;
        while (true) {
            int i3 = this.f39271;
            i = this.f39270;
            i2 = this.f39273;
            if (i3 >= i2 || this.f39268.m10816(i3) + i >= c14435.f47317) {
                break;
            }
            this.f39271++;
        }
        int i4 = this.f39271;
        if (i4 == i2) {
            return false;
        }
        C14435 c14435M24325 = this.f39269.m24325(i4);
        int i5 = c14435M24325.f47316 + i;
        c14435M24325.f47316 = i5;
        int i6 = c14435M24325.f47317 + i;
        c14435M24325.f47317 = i6;
        int i7 = c14435M24325.f47319 + this.f39274;
        c14435M24325.f47319 = i7;
        if (i7 != c14435.f47319) {
            return false;
        }
        int i8 = this.f39272 + 1;
        this.f39272 = i8;
        int i9 = c14435.f47317;
        if (i6 != i9) {
            if (i8 < 5000 || i9 < i5) {
                return false;
            }
            c12836.m31832(new C14435(i9, i6, i7));
        }
        this.f39267 = this.f39271 + 1;
        return true;
    }
}
