package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C6107 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f20682;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20683;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f20684;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f20685;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f20687;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f20688;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f20689;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f20691;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20686 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f20681 = new int[256];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f20690 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f20680 = -1;

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16607(int i, int i2, int i3) {
        boolean z;
        if (!this.f20683 && i >= 0 && i2 > 0 && i3 > 0 && i > this.f20680) {
            long j = i;
            long j2 = i2;
            int i4 = i3 - 1;
            if ((((long) i4) * j2) + j <= 2147483647L) {
                int i5 = this.f20687;
                int i6 = 0;
                if (i5 != 0) {
                    long j3 = j - ((long) this.f20685);
                    if (i5 != 1) {
                        int i7 = this.f20691;
                        if (j3 == i7 && i2 == i7) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else if (j3 == j2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long j4 = ((long) i5) + ((long) i3);
                    if (z && j4 <= 2147483647L) {
                        this.f20691 = i2;
                        this.f20687 = (int) j4;
                        this.f20685 = (i2 * i4) + i;
                    } else {
                        m16603();
                        this.f20682 = i;
                        this.f20685 = (i4 * i2) + i;
                        if (i3 != 1) {
                            i6 = i2;
                        }
                        this.f20691 = i6;
                        this.f20687 = i3;
                    }
                } else {
                    this.f20682 = i;
                    this.f20685 = (i4 * i2) + i;
                    if (i3 != 1) {
                        i6 = i2;
                    }
                    this.f20691 = i6;
                    this.f20687 = i3;
                }
                this.f20680 = (i2 * i4) + i;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid replacement match run");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17396 m16606(InterfaceC5614 interfaceC5614) throws C1105 {
        if (this.f20683) {
            throw new IllegalStateException("Recipe index already built");
        }
        if (interfaceC5614 != null && interfaceC5614.mo2357()) {
            throw new C1105();
        }
        this.f20683 = true;
        m16603();
        m16604();
        AbstractC13538[] abstractC13538Arr = (AbstractC13538[]) this.f20686.toArray(new AbstractC13538[0]);
        long[] jArr = new long[abstractC13538Arr.length];
        long jMo19949 = 0;
        for (int i = 0; i < abstractC13538Arr.length; i++) {
            if ((i & 255) == 0 && interfaceC5614 != null && interfaceC5614.mo2357()) {
                throw new C1105();
            }
            jMo19949 += (long) abstractC13538Arr[i].mo19949();
            jArr[i] = jMo19949;
        }
        return new C17396(abstractC13538Arr, jArr, jMo19949, C2516.m7721(abstractC13538Arr.length, this.f20688));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m16605() {
        return Math.max(C2124.m6676(this.f20689, C2124.m6676(this.f20687 == 0 ? 0L : 16L, ((long) this.f20681.length) * 4)), C2516.m7721(this.f20686.size(), this.f20688));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m16603() {
        int i = this.f20687;
        if (i == 0) {
            return;
        }
        if (i >= 3) {
            m16604();
            m16602(AbstractC13538.m33081(this.f20682, this.f20691, this.f20687));
        } else {
            int i2 = i == 1 ? 1 : this.f20691;
            for (int i3 = 0; i3 < this.f20687; i3++) {
                int i4 = (i3 * i2) + this.f20682;
                int i5 = i4 >>> 16;
                if (this.f20684 != 0 && i5 != this.f20690) {
                    m16604();
                }
                this.f20690 = i5;
                int i6 = this.f20684;
                int[] iArr = this.f20681;
                if (i6 == iArr.length) {
                    this.f20681 = Arrays.copyOf(iArr, Math.min(65536, iArr.length << 1));
                }
                int[] iArr2 = this.f20681;
                int i7 = this.f20684;
                this.f20684 = i7 + 1;
                iArr2[i7] = i4;
            }
        }
        this.f20687 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m16604() {
        int i = this.f20684;
        if (i == 0) {
            return;
        }
        m16602(AbstractC13538.m33082(i, this.f20681));
        this.f20684 = 0;
        this.f20690 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16602(AbstractC13538 abstractC13538) {
        long jM6676 = C2124.m6676(this.f20689, C2124.m6676(abstractC13538.mo19952(), 24L));
        ArrayList arrayList = this.f20686;
        int size = arrayList.size() + 1;
        long jM6677 = C2124.m6676(this.f20688, abstractC13538.mo19943());
        long jM7721 = C2516.m7721(size, jM6677);
        if (jM6676 > 67108864 || jM7721 > 67108864) {
            throw new IllegalStateException("Replacement match index exceeds memory limit");
        }
        arrayList.add(abstractC13538);
        this.f20689 = jM6676;
        this.f20688 = jM6677;
    }
}
