package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C20635 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f66175;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f66176;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f66177;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f66179;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f66182;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f66183;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f66184;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f66186;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66178 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f66185 = new int[256];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f66181 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f66180 = -1;

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47250(int i, int i2, int i3) {
        boolean z;
        if (!this.f66176 && i >= 0 && i2 > 0 && i3 > 0 && i > this.f66180) {
            long j = i;
            long j2 = i2;
            int i4 = i3 - 1;
            if ((((long) i4) * j2) + j <= 2147483647L) {
                int i5 = this.f66177;
                int i6 = 0;
                if (i5 != 0) {
                    long j3 = j - ((long) this.f66179);
                    if (i5 != 1) {
                        int i7 = this.f66186;
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
                        this.f66186 = i2;
                        this.f66177 = (int) j4;
                        this.f66179 = (i2 * i4) + i;
                    } else {
                        m47246();
                        this.f66175 = i;
                        this.f66179 = (i4 * i2) + i;
                        if (i3 != 1) {
                            i6 = i2;
                        }
                        this.f66186 = i6;
                        this.f66177 = i3;
                    }
                } else {
                    this.f66175 = i;
                    this.f66179 = (i4 * i2) + i;
                    if (i3 != 1) {
                        i6 = i2;
                    }
                    this.f66186 = i6;
                    this.f66177 = i3;
                }
                this.f66180 = (i2 * i4) + i;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid replacement match run");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3481 m47249(InterfaceC7509 interfaceC7509) throws C9446 {
        if (this.f66176) {
            throw new IllegalStateException("Recipe index already built");
        }
        if (interfaceC7509 != null && interfaceC7509.mo924()) {
            throw new C9446();
        }
        this.f66176 = true;
        m47246();
        m47247();
        AbstractC0433[] abstractC0433Arr = (AbstractC0433[]) this.f66178.toArray(new AbstractC0433[0]);
        long[] jArr = new long[abstractC0433Arr.length];
        long jMo2248 = 0;
        for (int i = 0; i < abstractC0433Arr.length; i++) {
            if ((i & 255) == 0 && interfaceC7509 != null && interfaceC7509.mo924()) {
                throw new C9446();
            }
            jMo2248 += (long) abstractC0433Arr[i].mo2248();
            jArr[i] = jMo2248;
        }
        return new C3481(abstractC0433Arr, jArr, jMo2248, C19143.m44282(abstractC0433Arr.length, this.f66184));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m47248() {
        return Math.max(C3077.m10044(this.f66182, C3077.m10044(this.f66177 == 0 ? 0L : 16L, ((long) this.f66185.length) * 4)), C19143.m44282(this.f66178.size(), this.f66184));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m47246() {
        int i = this.f66177;
        if (i == 0) {
            return;
        }
        if (i >= 3) {
            m47247();
            m47245(AbstractC0433.m2239(this.f66175, this.f66186, this.f66177));
        } else {
            int i2 = i == 1 ? 1 : this.f66186;
            for (int i3 = 0; i3 < this.f66177; i3++) {
                int i4 = (i3 * i2) + this.f66175;
                int i5 = i4 >>> 16;
                if (this.f66183 != 0 && i5 != this.f66181) {
                    m47247();
                }
                this.f66181 = i5;
                int i6 = this.f66183;
                int[] iArr = this.f66185;
                if (i6 == iArr.length) {
                    this.f66185 = Arrays.copyOf(iArr, Math.min(65536, iArr.length << 1));
                }
                int[] iArr2 = this.f66185;
                int i7 = this.f66183;
                this.f66183 = i7 + 1;
                iArr2[i7] = i4;
            }
        }
        this.f66177 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m47247() {
        int i = this.f66183;
        if (i == 0) {
            return;
        }
        m47245(AbstractC0433.m2237(i, this.f66185));
        this.f66183 = 0;
        this.f66181 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47245(AbstractC0433 abstractC0433) {
        long jM10044 = C3077.m10044(this.f66182, C3077.m10044(abstractC0433.mo2251(), 24L));
        ArrayList arrayList = this.f66178;
        int size = arrayList.size() + 1;
        long jM10045 = C3077.m10044(this.f66184, abstractC0433.mo2241());
        long jM44282 = C19143.m44282(size, jM10045);
        if (jM10044 > 67108864 || jM44282 > 67108864) {
            throw new IllegalStateException("Replacement match index exceeds memory limit");
        }
        arrayList.add(abstractC0433);
        this.f66182 = jM10044;
        this.f66184 = jM10045;
    }
}
