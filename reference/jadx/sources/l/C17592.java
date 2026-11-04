package l;

/* JADX INFO: renamed from: l.ܽ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 78NK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17592 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13117 f57117;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16911 f57118;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f57124;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15354 f57121 = new C15354();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C10098 f57127 = new C10098();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10098 f57119 = new C10098();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C25017 f57122 = new C25017();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f57120 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18787 f57123 = C18787.f61010;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f57126 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f57125 = -9223372036854775807L;

    public C17592(C16911 c16911, C13117 c13117) {
        this.f57118 = c16911;
        this.f57117 = c13117;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41249() {
        this.f57122.m55845();
        this.f57120 = -9223372036854775807L;
        this.f57126 = -9223372036854775807L;
        this.f57125 = -9223372036854775807L;
        C10098 c10098 = this.f57119;
        if (c10098.m26056() > 0) {
            C20782.m47565(c10098.m26056() > 0);
            while (c10098.m26056() > 1) {
                c10098.m26057();
            }
            Object objM26057 = c10098.m26057();
            objM26057.getClass();
            this.f57124 = ((Long) objM26057).longValue();
        }
        C10098 c10099 = this.f57127;
        if (c10099.m26056() > 0) {
            C20782.m47565(c10099.m26056() > 0);
            while (c10099.m26056() > 1) {
                c10099.m26057();
            }
            Object objM26058 = c10099.m26057();
            objM26058.getClass();
            c10099.m26055(0L, (C18787) objM26058);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41253(long j, long j2) {
        long jM36797;
        while (true) {
            C25017 c25017 = this.f57122;
            if (c25017.m55847()) {
                return;
            }
            long jM55848 = c25017.m55848();
            Long l2 = (Long) this.f57119.m26058(jM55848);
            C13117 c13117 = this.f57117;
            if (l2 != null && l2.longValue() != this.f57124) {
                this.f57124 = l2.longValue();
                c13117.m32581(2);
            }
            long j3 = this.f57124;
            C13117 c13118 = this.f57117;
            C15354 c15354 = this.f57121;
            int iM32578 = c13118.m32578(jM55848, j, j2, j3, false, false, c15354);
            final C16911 c16911 = this.f57118;
            if (iM32578 == 0 || iM32578 == 1) {
                this.f57126 = jM55848;
                boolean z = iM32578 == 0;
                long jM55849 = c25017.m55849();
                C18787 c18787 = (C18787) this.f57127.m26058(jM55849);
                if (c18787 != null && !c18787.equals(C18787.f61010) && !c18787.equals(this.f57123)) {
                    this.f57123 = c18787;
                    c16911.m39896(c18787);
                }
                if (z) {
                    jM36797 = System.nanoTime();
                } else {
                    jM36797 = c15354.m36797();
                }
                c16911.m39895(jM36797, jM55849, c13117.m32590());
            } else if (iM32578 == 2 || iM32578 == 3) {
                this.f57126 = jM55848;
                c25017.m55849();
                C17657 c17657 = c16911.f55305;
                c17657.f58040.execute(new Runnable() { // from class: l.ۧܳ᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        c16911.f55305.f58044.mo26318();
                    }
                });
                ((InterfaceC18338) c17657.f58042.remove()).skip();
            } else {
                if (iM32578 != 4) {
                    if (iM32578 != 5) {
                        throw new IllegalStateException(String.valueOf(iM32578));
                    }
                    return;
                }
                this.f57126 = jM55848;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41250(int i, int i2) {
        long j = this.f57120;
        this.f57127.m26055(j == -9223372036854775807L ? 0L : j + 1, new C18787(i, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41251(int i, long j) {
        if (this.f57122.m55847()) {
            this.f57117.m32581(i);
            this.f57124 = j;
        } else {
            long j2 = this.f57120;
            this.f57119.m26055(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41252(long j) {
        this.f57122.m55846(j);
        this.f57120 = j;
        this.f57125 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41254() {
        if (this.f57120 == -9223372036854775807L) {
            this.f57120 = Long.MIN_VALUE;
            this.f57126 = Long.MIN_VALUE;
        }
        this.f57125 = this.f57120;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m41255() {
        long j = this.f57125;
        return j != -9223372036854775807L && this.f57126 == j;
    }
}
