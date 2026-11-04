package l;

/* JADX INFO: renamed from: l.֨᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7704 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1534 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f5329;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f5330;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9736 f5331;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f5332;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f5333;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f5334;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5335;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5446(C9736 c9736, int i, int i2) {
        c9736.m25356(i, i2);
        if (i == i2) {
            throw new IllegalArgumentException("Empty syntax context cursor range");
        }
        this.f5331 = c9736;
        this.f5335 = i2;
        this.f5333 = c9736.f31405.m22185(i - c9736.f31407);
        m5444(i);
        this.f5329 = true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m5450() {
        if (!this.f5329 || this.f5334 >= this.f5335) {
            this.f5329 = false;
            return false;
        }
        this.f5333++;
        m5444(this.f5331.f31407 + this.f5331.f31405.m22187(this.f5333));
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m5448() {
        this.f5331 = null;
        this.f5329 = false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m5447() {
        return this.f5332;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5445() {
        return this.f5334;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m5449() {
        return this.f5330;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5444(int i) {
        this.f5332 = i;
        this.f5334 = Math.min(this.f5335, this.f5331.f31407 + this.f5331.f31405.m22188(this.f5333));
        this.f5330 = this.f5331.f31405.m22180(this.f5333);
    }
}
