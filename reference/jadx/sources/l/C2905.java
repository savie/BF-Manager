package l;

/* JADX INFO: renamed from: l.ۖ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2905 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f9499;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f9500;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f9501;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f9502;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f9503;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f9504;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f9505;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f9506;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f9507;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9508;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f9509;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f9510;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f9513;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final StringBuilder f9512 = new StringBuilder();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f9511 = -1;

    public C2905(int i, int i2, long j, long j2) {
        this.f9513 = j;
        this.f9503 = j2;
        this.f9509 = i;
        this.f9504 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9538(C2905 c2905, int i) {
        if (c2905.m9541(1, false)) {
            c2905.f9512.appendCodePoint(i);
        }
        c2905.m9540(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9539(C2905 c2905, String str) {
        if (c2905.m9541(str.length(), true)) {
            c2905.f9512.append(str);
        }
        c2905.m9540(true);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9541(int i, boolean z) {
        int i2;
        if (!this.f9510 && !this.f9502) {
            long j = this.f9505;
            long j2 = this.f9513;
            long j3 = this.f9503;
            if (j > j2 || (j == j2 && this.f9500 > j3)) {
                this.f9502 = true;
            }
            boolean z2 = this.f9502;
            if (!z2 && j == j2) {
                long j4 = this.f9500;
                if (j4 == j3) {
                    this.f9510 = true;
                    this.f9499 = j;
                    this.f9501 = j4;
                } else if (!z2) {
                    this.f9502 = true;
                }
            } else if (!z2 && j == j2 && z) {
                this.f9502 = true;
            }
        }
        if (!this.f9510 || this.f9506) {
            return false;
        }
        long j5 = this.f9511;
        long j6 = this.f9505;
        boolean z3 = j5 != j6;
        if ((z3 && this.f9508 >= this.f9509) || (i2 = this.f9507) > this.f9504 - i) {
            this.f9506 = true;
            this.f9499 = j6;
            this.f9501 = this.f9500;
            return false;
        }
        this.f9507 = i2 + i;
        if (z3) {
            this.f9508++;
            this.f9511 = j6;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9540(boolean z) {
        boolean z2 = this.f9506;
        if (!z2) {
            if ((z ? this.f9505 : this.f9500) == 9007199254740991L) {
                this.f9502 = true;
                return;
            }
        }
        if (this.f9510 && !z2) {
            if (z) {
                this.f9499 = this.f9505 + 1;
                this.f9501 = 0L;
            } else {
                this.f9499 = this.f9505;
                this.f9501 = this.f9500 + 1;
            }
        }
        if (z2) {
            return;
        }
        if (z) {
            this.f9505++;
            this.f9500 = 0L;
        } else {
            this.f9500++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m9542(C2905 c2905) {
        return c2905.f9506;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1414 m9537(C2905 c2905) {
        if (!c2905.f9510 && !c2905.f9502) {
            long j = c2905.f9505;
            if (j == c2905.f9513) {
                long j2 = c2905.f9500;
                if (j2 != c2905.f9503) {
                    c2905.f9502 = true;
                } else {
                    c2905.f9510 = true;
                    c2905.f9499 = j;
                    c2905.f9501 = j2;
                }
            } else {
                c2905.f9502 = true;
            }
        }
        return new C1414(c2905.f9512.toString(), c2905.f9499, c2905.f9501, c2905.f9508, c2905.f9507, c2905.f9506, !c2905.f9502, c2905.f9505, c2905.f9500);
    }
}
