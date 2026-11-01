package l;

/* JADX INFO: renamed from: l.ܺ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 152K */
/* JADX INFO: loaded from: classes4.dex */
public final class C15587 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f50701 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15587 f50702;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m37250(int i) {
        if (i >= 64) {
            m37245();
            this.f50702.m37250(i - 64);
        } else {
            this.f50701 |= 1 << i;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m37245() {
        if (this.f50702 == null) {
            this.f50702 = new C15587();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37248(int i) {
        if (i >= 64) {
            C15587 c15587 = this.f50702;
            if (c15587 != null) {
                c15587.m37248(i - 64);
                return;
            }
            return;
        }
        this.f50701 &= ~(1 << i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m37251(int i) {
        if (i < 64) {
            return (this.f50701 & (1 << i)) != 0;
        }
        m37245();
        return this.f50702.m37251(i - 64);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37247() {
        this.f50701 = 0L;
        C15587 c15587 = this.f50702;
        if (c15587 != null) {
            c15587.m37247();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37249(int i, boolean z) {
        if (i >= 64) {
            m37245();
            this.f50702.m37249(i - 64, z);
            return;
        }
        long j = this.f50701;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f50701 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m37250(i);
        } else {
            m37248(i);
        }
        if (z2 || this.f50702 != null) {
            m37245();
            this.f50702.m37249(0, z2);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m37246(int i) {
        if (i >= 64) {
            m37245();
            return this.f50702.m37246(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f50701;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f50701 = j3;
        long j4 = j - 1;
        this.f50701 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C15587 c15587 = this.f50702;
        if (c15587 != null) {
            if (c15587.m37251(0)) {
                m37250(63);
            }
            this.f50702.m37246(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m37252(int i) {
        C15587 c15587 = this.f50702;
        if (c15587 == null) {
            if (i >= 64) {
                return Long.bitCount(this.f50701);
            }
            return Long.bitCount(this.f50701 & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f50701 & ((1 << i) - 1));
        }
        return Long.bitCount(this.f50701) + c15587.m37252(i - 64);
    }

    public final String toString() {
        if (this.f50702 == null) {
            return Long.toBinaryString(this.f50701);
        }
        return this.f50702.toString() + "xx" + Long.toBinaryString(this.f50701);
    }
}
