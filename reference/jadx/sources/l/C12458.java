package l;

/* JADX INFO: renamed from: l.۫ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C12458 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f41533;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41534;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17396 f41535;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f41536;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f41537;

    public C12458(C17396 c17396, int i, int i2, long j, int i3) {
        this.f41535 = c17396;
        this.f41536 = i;
        this.f41534 = i2;
        this.f41537 = j;
        this.f41533 = i3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m30938() {
        return this.f41537 < this.f41535.f55363;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m30937() {
        if (!m30938()) {
            throw new IndexOutOfBoundsException("Recipe cursor exhausted");
        }
        return this.f41533;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30936() {
        if (m30938()) {
            long j = this.f41537 + 1;
            this.f41537 = j;
            C17396 c17396 = this.f41535;
            if (j >= c17396.f55363) {
                return;
            }
            AbstractC13538 abstractC13538 = c17396.f55366[this.f41536];
            int i = this.f41534 + 1;
            this.f41534 = i;
            if (i < abstractC13538.mo19949()) {
                this.f41533 = abstractC13538.mo19951(this.f41533);
                return;
            }
            this.f41536++;
            this.f41534 = 0;
            this.f41533 = c17396.f55366[this.f41536].mo19950(0);
        }
    }
}
