package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16291 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f52896;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f52897;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f52898;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17037 f52899;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f52900;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f52895 = new long[C20767.m47496(65536)];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f52901 = C25227.FOREVER_NS;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38650(int i, boolean z) {
        m38646(i);
        while (i > 0) {
            int i2 = this.f52900;
            if (i2 == 0 && i >= 65536) {
                int i3 = (-65536) & i;
                this.f52899 = C20767.m47498(this.f52899, C20767.m47504(i3, z));
                i -= i3;
            } else {
                int iMin = Math.min(i, 65536 - i2);
                if (z) {
                    int i4 = this.f52900;
                    C20767.m47507(i4, i4 + iMin, this.f52895);
                }
                int i5 = this.f52900 + iMin;
                this.f52900 = i5;
                i -= iMin;
                if (i5 == 65536) {
                    m38647();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38649(int i, int i2, long[] jArr) {
        m38646(i2);
        int i3 = i2;
        int i4 = i;
        while (i3 > 0) {
            int iMin = Math.min(i3, 65536 - this.f52900);
            int i5 = this.f52900;
            int i6 = i4;
            int i7 = iMin;
            while (i7 > 0) {
                int i8 = i6 >>> 6;
                int i9 = i6 & 63;
                int i10 = i5 >>> 6;
                int i11 = i5 & 63;
                int iMin2 = Math.min(i7, 64 - i11);
                long j = jArr[i8] >>> i9;
                if (i9 != 0 && i9 + iMin2 > 64) {
                    j |= jArr[i8 + 1] << (64 - i9);
                }
                long j2 = iMin2 == 64 ? -1L : (1 << iMin2) - 1;
                long[] jArr2 = this.f52895;
                jArr2[i10] = ((j2 & j) << i11) | jArr2[i10];
                i6 += iMin2;
                i5 += iMin2;
                i7 -= iMin2;
            }
            i4 += iMin;
            int i12 = this.f52900 + iMin;
            this.f52900 = i12;
            i3 -= iMin;
            if (i12 == 65536) {
                m38647();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17037 m38648() {
        if (this.f52896) {
            throw new IllegalStateException("Dirty sequence builder already built");
        }
        m38647();
        this.f52896 = true;
        return this.f52899;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m38652() {
        return (((long) this.f52895.length) * 8) + this.f52898;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38651(long j) {
        this.f52901 = Math.max(0L, j);
        if (m38652() > this.f52901) {
            throw new IllegalStateException("Dirty bitmap exceeds memory limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38646(int i) {
        if (this.f52896) {
            throw new IllegalStateException("Dirty sequence builder already built");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Dirty length must not be negative");
        }
        int i2 = this.f52897;
        if (((long) i2) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        this.f52897 = i2 + i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m38647() {
        long[] jArr;
        int i = this.f52900;
        if (i == 0) {
            return;
        }
        int iM47496 = C20767.m47496(i);
        int i2 = this.f52900;
        int iM47497 = C20767.m47496(i2);
        int i3 = i2 & 63;
        int i4 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            jArr = this.f52895;
            if (i4 >= iM47497) {
                break;
            }
            long j = (i4 != iM47497 + (-1) || i3 == 0) ? -1L : (1 << i3) - 1;
            long j2 = jArr[i4] & j;
            z |= j2 != 0;
            z2 &= j2 == j;
            i4++;
        }
        if (z && !z2 && C20767.m47503(m38652(), ((long) iM47496) * 8) > this.f52901) {
            throw new IllegalStateException("Dirty bitmap exceeds memory limit");
        }
        C17037 c17037M47497 = C20767.m47497(this.f52900, Arrays.copyOf(jArr, iM47496));
        if (c17037M47497.m40147()) {
            this.f52898 = (((long) c17037M47497.f55677.length) * 8) + this.f52898;
        }
        this.f52899 = C20767.m47498(this.f52899, c17037M47497);
        Arrays.fill(jArr, 0L);
        this.f52900 = 0;
    }
}
