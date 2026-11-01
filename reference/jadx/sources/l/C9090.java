package l;

/* JADX INFO: renamed from: l.ۡ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9090 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f30982;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f30983;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f30984;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f30985;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f30986;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f30987;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C13668 f30988;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f30989;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f30990;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30991;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f30992;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f30993;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f30994;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30995;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f30996;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f30997;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23430() {
        this.f30990 = false;
        this.f30997 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23431(int i) {
        this.f30994 = i;
        this.f30990 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23432(C13668 c13668, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.f30988 = c13668;
        this.f30992 = i;
        this.f30994 = i2;
        this.f30982 = i3;
        this.f30993 = i4;
        this.f30996 = z;
        this.f30991 = z2;
        this.f30985 = z3;
        this.f30984 = z4;
        this.f30987 = i5;
        this.f30995 = i6;
        this.f30986 = i7;
        this.f30989 = i8;
        this.f30983 = i9;
        this.f30997 = true;
        this.f30990 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m23433() {
        if (!this.f30990) {
            return false;
        }
        int i = this.f30994;
        return i == 7 || i == 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23429(C9090 c9090, C9090 c9091) {
        int i;
        int i2;
        int i3;
        boolean z;
        if (!c9090.f30997) {
            return false;
        }
        if (c9091.f30997) {
            C13668 c13668 = c9090.f30988;
            C2023.m6508(c13668);
            C13668 c13669 = c9091.f30988;
            C2023.m6508(c13669);
            int i4 = c13669.f45082;
            if (c9090.f30982 == c9091.f30982 && c9090.f30993 == c9091.f30993 && c9090.f30996 == c9091.f30996 && ((!c9090.f30991 || !c9091.f30991 || c9090.f30985 == c9091.f30985) && (((i = c9090.f30992) == (i2 = c9091.f30992) || (i != 0 && i2 != 0)) && (((i3 = c13668.f45082) != 0 || i4 != 0 || (c9090.f30995 == c9091.f30995 && c9090.f30986 == c9091.f30986)) && ((i3 != 1 || i4 != 1 || (c9090.f30989 == c9091.f30989 && c9090.f30983 == c9091.f30983)) && (z = c9090.f30984) == c9091.f30984 && (!z || c9090.f30987 == c9091.f30987)))))) {
                return false;
            }
        }
        return true;
    }
}
