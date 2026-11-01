package l;

/* JADX INFO: renamed from: l.ۖ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8FN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2377 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f8399;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f8400;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f8401;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f8402;

    public C2377(byte[] bArr, int i, int i2) {
        m7229(i, i2, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7229(int i, int i2, byte[] bArr) {
        this.f8399 = bArr;
        this.f8401 = i;
        this.f8402 = i2;
        this.f8400 = 0;
        m7225();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m7236() {
        int i = this.f8400 + 1;
        this.f8400 = i;
        if (i == 8) {
            this.f8400 = 0;
            int i2 = this.f8401;
            this.f8401 = i2 + (m7226(i2 + 1) ? 2 : 1);
        }
        m7225();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m7232(int i) {
        int i2 = this.f8401;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f8401 = i4;
        int i5 = (i - (i3 * 8)) + this.f8400;
        this.f8400 = i5;
        if (i5 > 7) {
            this.f8401 = i4 + 1;
            this.f8400 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.f8401) {
                if (m7226(i2)) {
                    this.f8401++;
                    i2 += 2;
                }
            } else {
                m7225();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7228() {
        int i = this.f8400;
        if (i > 0) {
            m7232(8 - i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7230(int i) {
        int i2 = this.f8401;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f8400 + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f8402) {
                break;
            }
            if (m7226(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f8402;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m7233() {
        boolean z = (this.f8399[this.f8401] & (128 >> this.f8400)) != 0;
        m7236();
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m7234(int i) {
        int i2;
        this.f8400 += i;
        int i3 = 0;
        while (true) {
            i2 = this.f8400;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f8400 = i5;
            byte[] bArr = this.f8399;
            int i6 = this.f8401;
            i3 |= (bArr[i6] & 255) << i5;
            if (!m7226(i6 + 1)) {
                i4 = 1;
            }
            this.f8401 = i6 + i4;
        }
        byte[] bArr2 = this.f8399;
        int i7 = this.f8401;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f8400 = 0;
            this.f8401 = i7 + (m7226(i7 + 1) ? 2 : 1);
        }
        m7225();
        return i8;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m7235() {
        int i = this.f8401;
        int i2 = this.f8400;
        int i3 = 0;
        while (this.f8401 < this.f8402 && !m7233()) {
            i3++;
        }
        boolean z = this.f8401 == this.f8402;
        this.f8401 = i;
        this.f8400 = i2;
        return !z && m7230((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m7227() {
        int i = 0;
        while (!m7233()) {
            i++;
        }
        int iM7234 = ((1 << i) - 1) + (i > 0 ? m7234(i) : 0);
        return ((iM7234 + 1) / 2) * (iM7234 % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m7231() {
        int i = 0;
        while (!m7233()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m7234(i) : 0);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m7226(int i) {
        if (2 > i || i >= this.f8402) {
            return false;
        }
        byte[] bArr = this.f8399;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m7225() {
        int i;
        int i2 = this.f8401;
        C2023.m6510(i2 >= 0 && (i2 < (i = this.f8402) || (i2 == i && this.f8400 == 0)));
    }
}
