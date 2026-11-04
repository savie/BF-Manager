package l;

/* JADX INFO: renamed from: l.ᩴ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20049 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f64426;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3959 f64427;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64428;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f64429;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f64430;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f64431;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f64432;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f64433;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f64434;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f64435;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f64436;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f64437;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f64438;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f64439;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f64440;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f64441;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46106() {
        this.f64429 = false;
        this.f64441 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46107(int i) {
        this.f64440 = i;
        this.f64429 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46108(C3959 c3959, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.f64427 = c3959;
        this.f64435 = i;
        this.f64440 = i2;
        this.f64432 = i3;
        this.f64434 = i4;
        this.f64433 = z;
        this.f64438 = z2;
        this.f64428 = z3;
        this.f64426 = z4;
        this.f64431 = i5;
        this.f64436 = i6;
        this.f64437 = i7;
        this.f64430 = i8;
        this.f64439 = i9;
        this.f64441 = true;
        this.f64429 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46109() {
        if (!this.f64429) {
            return false;
        }
        int i = this.f64440;
        return i == 7 || i == 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46105(C20049 c20049, C20049 c200410) {
        int i;
        int i2;
        int i3;
        boolean z;
        if (!c20049.f64441) {
            return false;
        }
        if (c200410.f64441) {
            C3959 c3959 = c20049.f64427;
            C20782.m47566(c3959);
            C3959 c39510 = c200410.f64427;
            C20782.m47566(c39510);
            int i4 = c39510.f13516;
            if (c20049.f64432 == c200410.f64432 && c20049.f64434 == c200410.f64434 && c20049.f64433 == c200410.f64433 && ((!c20049.f64438 || !c200410.f64438 || c20049.f64428 == c200410.f64428) && (((i = c20049.f64435) == (i2 = c200410.f64435) || (i != 0 && i2 != 0)) && (((i3 = c3959.f13516) != 0 || i4 != 0 || (c20049.f64436 == c200410.f64436 && c20049.f64437 == c200410.f64437)) && ((i3 != 1 || i4 != 1 || (c20049.f64430 == c200410.f64430 && c20049.f64439 == c200410.f64439)) && (z = c20049.f64426) == c200410.f64426 && (!z || c20049.f64431 == c200410.f64431)))))) {
                return false;
            }
        }
        return true;
    }
}
