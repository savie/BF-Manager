package l;

/* JADX INFO: renamed from: l.ۢܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9670 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f32492;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f32494;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f32495;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f32496;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f32497;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f32498;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f32499;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f32500;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f32501;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f32502;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f32504;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f32505;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f32506;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f32503 = new StringBuilder();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f32493 = -1;

    public C9670(int i, int i2, long j, long j2) {
        this.f32506 = j;
        this.f32497 = j2;
        this.f32496 = i;
        this.f32492 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24575(C9670 c9670, int i) {
        if (c9670.m24578(1, false)) {
            c9670.f32503.appendCodePoint(i);
        }
        c9670.m24577(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24576(C9670 c9670, String str) {
        if (c9670.m24578(str.length(), true)) {
            c9670.f32503.append(str);
        }
        c9670.m24577(true);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m24578(int i, boolean z) {
        int i2;
        if (!this.f32500 && !this.f32498) {
            long j = this.f32505;
            long j2 = this.f32506;
            long j3 = this.f32497;
            if (j > j2 || (j == j2 && this.f32495 > j3)) {
                this.f32498 = true;
            }
            boolean z2 = this.f32498;
            if (!z2 && j == j2) {
                long j4 = this.f32495;
                if (j4 == j3) {
                    this.f32500 = true;
                    this.f32494 = j;
                    this.f32499 = j4;
                } else if (!z2) {
                    this.f32498 = true;
                }
            } else if (!z2 && j == j2 && z) {
                this.f32498 = true;
            }
        }
        if (!this.f32500 || this.f32502) {
            return false;
        }
        long j5 = this.f32493;
        long j6 = this.f32505;
        boolean z3 = j5 != j6;
        if ((z3 && this.f32504 >= this.f32496) || (i2 = this.f32501) > this.f32492 - i) {
            this.f32502 = true;
            this.f32494 = j6;
            this.f32499 = this.f32495;
            return false;
        }
        this.f32501 = i2 + i;
        if (z3) {
            this.f32504++;
            this.f32493 = j6;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24577(boolean z) {
        boolean z2 = this.f32502;
        if (!z2) {
            if ((z ? this.f32505 : this.f32495) == 9007199254740991L) {
                this.f32498 = true;
                return;
            }
        }
        if (this.f32500 && !z2) {
            if (z) {
                this.f32494 = this.f32505 + 1;
                this.f32499 = 0L;
            } else {
                this.f32494 = this.f32505;
                this.f32499 = this.f32495 + 1;
            }
        }
        if (z2) {
            return;
        }
        if (z) {
            this.f32505++;
            this.f32495 = 0L;
        } else {
            this.f32495++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m24579(C9670 c9670) {
        return c9670.f32502;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14609 m24574(C9670 c9670) {
        if (!c9670.f32500 && !c9670.f32498) {
            long j = c9670.f32505;
            if (j == c9670.f32506) {
                long j2 = c9670.f32495;
                if (j2 != c9670.f32497) {
                    c9670.f32498 = true;
                } else {
                    c9670.f32500 = true;
                    c9670.f32494 = j;
                    c9670.f32499 = j2;
                }
            } else {
                c9670.f32498 = true;
            }
        }
        return new C14609(c9670.f32503.toString(), c9670.f32494, c9670.f32499, c9670.f32504, c9670.f32501, c9670.f32502, !c9670.f32498, c9670.f32505, c9670.f32495);
    }
}
