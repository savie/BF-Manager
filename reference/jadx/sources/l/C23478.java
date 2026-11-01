package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes.dex */
public final class C23478 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f76017;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C5838 f76020;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f76021;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f76022;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f76023;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f76019 = new long[C9367.m24033(65536)];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f76018 = C17492.FOREVER_NS;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51736(int i, boolean z) {
        m51732(i);
        while (i > 0) {
            int i2 = this.f76022;
            if (i2 == 0 && i >= 65536) {
                int i3 = (-65536) & i;
                this.f76020 = C9367.m24035(this.f76020, C9367.m24039(i3, z));
                i -= i3;
            } else {
                int iMin = Math.min(i, 65536 - i2);
                if (z) {
                    int i4 = this.f76022;
                    C9367.m24042(i4, i4 + iMin, this.f76019);
                }
                int i5 = this.f76022 + iMin;
                this.f76022 = i5;
                i -= iMin;
                if (i5 == 65536) {
                    m51733();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51735(int i, int i2, long[] jArr) {
        m51732(i2);
        int i3 = i2;
        int i4 = i;
        while (i3 > 0) {
            int iMin = Math.min(i3, 65536 - this.f76022);
            int i5 = this.f76022;
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
                long[] jArr2 = this.f76019;
                jArr2[i10] = ((j2 & j) << i11) | jArr2[i10];
                i6 += iMin2;
                i5 += iMin2;
                i7 -= iMin2;
            }
            i4 += iMin;
            int i12 = this.f76022 + iMin;
            this.f76022 = i12;
            i3 -= iMin;
            if (i12 == 65536) {
                m51733();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5838 m51734() {
        if (this.f76021) {
            throw new IllegalStateException("Dirty sequence builder already built");
        }
        m51733();
        this.f76021 = true;
        return this.f76020;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m51738() {
        return (((long) this.f76019.length) * 8) + this.f76023;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51737(long j) {
        this.f76018 = Math.max(0L, j);
        if (m51738() > this.f76018) {
            throw new IllegalStateException("Dirty bitmap exceeds memory limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51732(int i) {
        if (this.f76021) {
            throw new IllegalStateException("Dirty sequence builder already built");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Dirty length must not be negative");
        }
        int i2 = this.f76017;
        if (((long) i2) + ((long) i) > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        this.f76017 = i2 + i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m51733() {
        long[] jArr;
        int i = this.f76022;
        if (i == 0) {
            return;
        }
        int iM24033 = C9367.m24033(i);
        int i2 = this.f76022;
        int iM24034 = C9367.m24033(i2);
        int i3 = i2 & 63;
        int i4 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            jArr = this.f76019;
            if (i4 >= iM24034) {
                break;
            }
            long j = (i4 != iM24034 + (-1) || i3 == 0) ? -1L : (1 << i3) - 1;
            long j2 = jArr[i4] & j;
            z |= j2 != 0;
            z2 &= j2 == j;
            i4++;
        }
        if (z && !z2 && C9367.m24038(m51738(), ((long) iM24033) * 8) > this.f76018) {
            throw new IllegalStateException("Dirty bitmap exceeds memory limit");
        }
        C5838 c5838M24034 = C9367.m24034(this.f76022, Arrays.copyOf(jArr, iM24033));
        if (c5838M24034.m16052()) {
            this.f76023 = (((long) c5838M24034.f19807.length) * 8) + this.f76023;
        }
        this.f76020 = C9367.m24035(this.f76020, c5838M24034);
        Arrays.fill(jArr, 0L);
        this.f76022 = 0;
    }
}
