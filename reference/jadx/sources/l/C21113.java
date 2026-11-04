package l;

/* JADX INFO: renamed from: l.᩶ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8FN */
/* JADX INFO: loaded from: classes5.dex */
public final class C21113 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67431;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f67432;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f67433;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f67434;

    public C21113(byte[] bArr, int i, int i2) {
        m48200(i, i2, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48200(int i, int i2, byte[] bArr) {
        this.f67434 = bArr;
        this.f67432 = i;
        this.f67433 = i2;
        this.f67431 = 0;
        m48197();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m48204() {
        int i = this.f67431 + 1;
        this.f67431 = i;
        if (i == 8) {
            this.f67431 = 0;
            int i2 = this.f67432;
            this.f67432 = i2 + (m48198(i2 + 1) ? 2 : 1);
        }
        m48197();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m48202(int i) {
        int i2 = this.f67432;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f67432 = i4;
        int i5 = (i - (i3 * 8)) + this.f67431;
        this.f67431 = i5;
        if (i5 > 7) {
            this.f67432 = i4 + 1;
            this.f67431 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.f67432) {
                if (m48198(i2)) {
                    this.f67432++;
                    i2 += 2;
                }
            } else {
                m48197();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48199() {
        int i = this.f67431;
        if (i > 0) {
            m48202(8 - i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48201(int i) {
        int i2 = this.f67432;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f67431 + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f67433) {
                break;
            }
            if (m48198(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f67433;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m48203() {
        boolean z = (this.f67434[this.f67432] & (128 >> this.f67431)) != 0;
        m48204();
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m48206(int i) {
        int i2;
        this.f67431 += i;
        int i3 = 0;
        while (true) {
            i2 = this.f67431;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f67431 = i5;
            byte[] bArr = this.f67434;
            int i6 = this.f67432;
            i3 |= (bArr[i6] & 255) << i5;
            if (!m48198(i6 + 1)) {
                i4 = 1;
            }
            this.f67432 = i6 + i4;
        }
        byte[] bArr2 = this.f67434;
        int i7 = this.f67432;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f67431 = 0;
            this.f67432 = i7 + (m48198(i7 + 1) ? 2 : 1);
        }
        m48197();
        return i8;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m48207() {
        int i = this.f67432;
        int i2 = this.f67431;
        int i3 = 0;
        while (this.f67432 < this.f67433 && !m48203()) {
            i3++;
        }
        boolean z = this.f67432 == this.f67433;
        this.f67432 = i;
        this.f67431 = i2;
        return !z && m48201((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m48205() {
        int i = 0;
        while (!m48203()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m48206(i) : 0);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m48208() {
        int i = 0;
        while (!m48203()) {
            i++;
        }
        int iM48206 = ((1 << i) - 1) + (i > 0 ? m48206(i) : 0);
        return ((iM48206 + 1) / 2) * (iM48206 % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m48198(int i) {
        if (2 > i || i >= this.f67433) {
            return false;
        }
        byte[] bArr = this.f67434;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m48197() {
        int i;
        int i2 = this.f67432;
        C20782.m47568(i2 >= 0 && (i2 < (i = this.f67433) || (i2 == i && this.f67431 == 0)));
    }
}
