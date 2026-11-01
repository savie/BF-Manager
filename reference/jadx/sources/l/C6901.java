package l;

/* JADX INFO: renamed from: l.ۜܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88TM */
/* JADX INFO: loaded from: classes2.dex */
public final class C6901 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C6901 f23229;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f23230;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f23231;

    static {
        C6901 c6901 = new C6901(0L, 0L);
        new C6901(C17492.FOREVER_NS, C17492.FOREVER_NS);
        new C6901(C17492.FOREVER_NS, 0L);
        new C6901(0L, C17492.FOREVER_NS);
        f23229 = c6901;
    }

    public C6901(long j, long j2) {
        C2023.m6507(j >= 0);
        C2023.m6507(j2 >= 0);
        this.f23231 = j;
        this.f23230 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005c A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m18520(long j, long j2, long j3) {
        long j4 = this.f23230;
        long j5 = this.f23231;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        String str = C17983.f57504;
        long j6 = j - j5;
        if (((j5 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j4;
        if (((j4 ^ j7) & (j ^ j7)) < 0) {
            j7 = C17492.FOREVER_NS;
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
        if (obj != null && C6901.class == obj.getClass()) {
            C6901 c6901 = (C6901) obj;
            if (this.f23231 == c6901.f23231 && this.f23230 == c6901.f23230) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f23231) * 31) + ((int) this.f23230);
    }
}
