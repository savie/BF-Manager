package l;

/* JADX INFO: renamed from: l.ܳ֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78NK */
/* JADX INFO: loaded from: classes3.dex */
public final class C14197 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C16313 f46560;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6350 f46561;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f46562;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C0084 f46563 = new C0084();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C3871 f46568 = new C3871();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3871 f46565 = new C3871();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C12299 f46558 = new C12299();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f46564 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C13314 f46567 = C13314.f44192;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f46559 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f46566 = -9223372036854775807L;

    public C14197(C6350 c6350, C16313 c16313) {
        this.f46561 = c6350;
        this.f46560 = c16313;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34284() {
        this.f46558.m30552();
        this.f46564 = -9223372036854775807L;
        this.f46559 = -9223372036854775807L;
        this.f46566 = -9223372036854775807L;
        C3871 c3871 = this.f46565;
        if (c3871.m11202() > 0) {
            C2023.m6507(c3871.m11202() > 0);
            while (c3871.m11202() > 1) {
                c3871.m11203();
            }
            Object objM11203 = c3871.m11203();
            objM11203.getClass();
            this.f46562 = ((Long) objM11203).longValue();
        }
        C3871 c3872 = this.f46568;
        if (c3872.m11202() > 0) {
            C2023.m6507(c3872.m11202() > 0);
            while (c3872.m11202() > 1) {
                c3872.m11203();
            }
            Object objM11204 = c3872.m11203();
            objM11204.getClass();
            c3872.m11201(0L, (C13314) objM11204);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34288(long j, long j2) {
        long jM1022;
        while (true) {
            C12299 c12299 = this.f46558;
            if (c12299.m30554()) {
                return;
            }
            long jM30555 = c12299.m30555();
            Long l2 = (Long) this.f46565.m11204(jM30555);
            C16313 c16313 = this.f46560;
            if (l2 != null && l2.longValue() != this.f46562) {
                this.f46562 = l2.longValue();
                c16313.m38463(2);
            }
            long j3 = this.f46562;
            C16313 c16314 = this.f46560;
            C0084 c0084 = this.f46563;
            int iM38460 = c16314.m38460(jM30555, j, j2, j3, false, false, c0084);
            final C6350 c6350 = this.f46561;
            if (iM38460 == 0 || iM38460 == 1) {
                this.f46559 = jM30555;
                boolean z = iM38460 == 0;
                long jM30551 = c12299.m30551();
                C13314 c13314 = (C13314) this.f46568.m11204(jM30551);
                if (c13314 != null && !c13314.equals(C13314.f44192) && !c13314.equals(this.f46567)) {
                    this.f46567 = c13314;
                    c6350.m17458(c13314);
                }
                if (z) {
                    jM1022 = System.nanoTime();
                } else {
                    jM1022 = c0084.m1022();
                }
                c6350.m17457(jM1022, jM30551, c16313.m38472());
            } else if (iM38460 == 2 || iM38460 == 3) {
                this.f46559 = jM30555;
                c12299.m30551();
                C11290 c11290 = c6350.f21410;
                c11290.f38124.execute(new Runnable() { // from class: l.۫᩹ܰ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c6350.f21410.f38126.mo7958();
                    }
                });
                ((InterfaceC22308) c11290.f38127.remove()).skip();
            } else {
                if (iM38460 != 4) {
                    if (iM38460 != 5) {
                        throw new IllegalStateException(String.valueOf(iM38460));
                    }
                    return;
                }
                this.f46559 = jM30555;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34285(int i, int i2) {
        long j = this.f46564;
        this.f46568.m11201(j == -9223372036854775807L ? 0L : j + 1, new C13314(i, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34286(int i, long j) {
        if (this.f46558.m30554()) {
            this.f46560.m38463(i);
            this.f46562 = j;
        } else {
            long j2 = this.f46564;
            this.f46565.m11201(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34287(long j) {
        this.f46558.m30553(j);
        this.f46564 = j;
        this.f46566 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34289() {
        if (this.f46564 == -9223372036854775807L) {
            this.f46564 = Long.MIN_VALUE;
            this.f46559 = Long.MIN_VALUE;
        }
        this.f46566 = this.f46564;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m34290() {
        long j = this.f46566;
        return j != -9223372036854775807L && this.f46559 == j;
    }
}
