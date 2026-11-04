package l;

/* JADX INFO: renamed from: l.ۡ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88TM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9221 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C9221 f30042;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f30043;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f30044;

    static {
        C9221 c9221 = new C9221(0L, 0L);
        new C9221(C25227.FOREVER_NS, C25227.FOREVER_NS);
        new C9221(C25227.FOREVER_NS, 0L);
        new C9221(0L, C25227.FOREVER_NS);
        f30042 = c9221;
    }

    public C9221(long j, long j2) {
        C20782.m47565(j >= 0);
        C20782.m47565(j2 >= 0);
        this.f30044 = j;
        this.f30043 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005c A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m24397(long j, long j2, long j3) {
        long j4 = this.f30043;
        long j5 = this.f30044;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        String str = C7116.f23455;
        long j6 = j - j5;
        if (((j5 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j4;
        if (((j4 ^ j7) & (j ^ j7)) < 0) {
            j7 = C25227.FOREVER_NS;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        if (z2 && z) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z2) {
            if (z) {
                return j3;
            }
            return j6;
        }
        return j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9221.class == obj.getClass()) {
            C9221 c9221 = (C9221) obj;
            if (this.f30044 == c9221.f30044 && this.f30043 == c9221.f30043) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f30044) * 31) + ((int) this.f30043);
    }
}
