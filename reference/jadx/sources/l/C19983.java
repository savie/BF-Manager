package l;

/* JADX INFO: renamed from: l.ᩴܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 152K */
/* JADX INFO: loaded from: classes5.dex */
public final class C19983 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f64208 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19983 f64209;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m45923(int i) {
        if (i >= 64) {
            m45918();
            this.f64209.m45923(i - 64);
        } else {
            this.f64208 |= 1 << i;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m45918() {
        if (this.f64209 == null) {
            this.f64209 = new C19983();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45920(int i) {
        if (i >= 64) {
            C19983 c19983 = this.f64209;
            if (c19983 != null) {
                c19983.m45920(i - 64);
                return;
            }
            return;
        }
        this.f64208 &= ~(1 << i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m45922(int i) {
        if (i < 64) {
            return (this.f64208 & (1 << i)) != 0;
        }
        m45918();
        return this.f64209.m45922(i - 64);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45919() {
        this.f64208 = 0L;
        C19983 c19983 = this.f64209;
        if (c19983 != null) {
            c19983.m45919();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45921(int i, boolean z) {
        if (i >= 64) {
            m45918();
            this.f64209.m45921(i - 64, z);
            return;
        }
        long j = this.f64208;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f64208 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m45923(i);
        } else {
            m45920(i);
        }
        if (z2 || this.f64209 != null) {
            m45918();
            this.f64209.m45921(0, z2);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m45925(int i) {
        if (i >= 64) {
            m45918();
            return this.f64209.m45925(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f64208;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f64208 = j3;
        long j4 = j - 1;
        this.f64208 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C19983 c19983 = this.f64209;
        if (c19983 != null) {
            if (c19983.m45922(0)) {
                m45923(63);
            }
            this.f64209.m45925(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m45924(int i) {
        C19983 c19983 = this.f64209;
        if (c19983 == null) {
            if (i >= 64) {
                return Long.bitCount(this.f64208);
            }
            return Long.bitCount(this.f64208 & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f64208 & ((1 << i) - 1));
        }
        return Long.bitCount(this.f64208) + c19983.m45924(i - 64);
    }

    public final String toString() {
        if (this.f64209 == null) {
            return Long.toBinaryString(this.f64208);
        }
        return this.f64209.toString() + "xx" + Long.toBinaryString(this.f64208);
    }
}
