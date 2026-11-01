package l;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B4EZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19180 extends C14511 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient byte[][] f61948;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient int[] f61949;

    @Override // l.C14511
    /* JADX INFO: renamed from: ֨ */
    public final C14511 mo34937() {
        throw null;
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ۚ */
    public final C14511 mo34944() {
        throw null;
    }

    public C19180(C6043 c6043, int i) {
        super(null);
        C15653.m37329(c6043.f20522, 0L, i);
        C18474 c18474 = c6043.f20521;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c18474.f58877;
            int i6 = c18474.f58875;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c18474 = c18474.f58876;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f61948 = new byte[i4][];
        this.f61949 = new int[i4 * 2];
        C18474 c18475 = c6043.f20521;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f61948;
            bArr[i7] = c18475.f58874;
            int i8 = c18475.f58877;
            int i9 = c18475.f58875;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.f61949;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c18475.f58872 = true;
            i7++;
            c18475 = c18475.f58876;
        }
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ᩴ */
    public final String mo34948() {
        return m44034().mo34948();
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ۙ */
    public final String mo34940() {
        return C12394.m30831(m44034().f47543);
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ܰ */
    public final String mo34946() {
        return m44034().mo34946();
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ᩺ */
    public final C14511 mo34949() {
        return m44034().mo34949();
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ۜ */
    public final C14511 mo34945() {
        return m44034().mo34945();
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ۙ */
    public final byte mo34939(int i) {
        byte[][] bArr = this.f61948;
        int length = bArr.length - 1;
        int[] iArr = this.f61949;
        C15653.m37329(iArr[length], i, 1L);
        int iM44033 = m44033(i);
        return bArr[iM44033][(i - (iM44033 == 0 ? 0 : iArr[iM44033 - 1])) + iArr[bArr.length + iM44033]];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m44033(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f61949, 0, this.f61948.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ۘ */
    public final int mo34938() {
        return this.f61949[this.f61948.length - 1];
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ܶ */
    public final byte[] mo34947() {
        byte[][] bArr = this.f61948;
        int length = bArr.length - 1;
        int[] iArr = this.f61949;
        byte[] bArr2 = new byte[iArr[length]];
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            int i3 = iArr[length2 + i];
            int i4 = iArr[i];
            System.arraycopy(bArr[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ۙ */
    public final void mo34941(C6043 c6043) {
        byte[][] bArr = this.f61948;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f61949;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C18474 c18474 = new C18474(bArr[i], i3, (i3 + i4) - i2);
            C18474 c18475 = c6043.f20521;
            if (c18475 == null) {
                c18474.f58878 = c18474;
                c18474.f58876 = c18474;
                c6043.f20521 = c18474;
            } else {
                c18475.f58878.m42845(c18474);
            }
            i++;
            i2 = i4;
        }
        c6043.f20522 += (long) i2;
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo34943(C14511 c14511, int i) {
        if (mo34938() - i >= 0) {
            int iM44033 = m44033(0);
            int i2 = 0;
            int i3 = 0;
            while (i > 0) {
                int[] iArr = this.f61949;
                int i4 = iM44033 == 0 ? 0 : iArr[iM44033 - 1];
                int iMin = Math.min(i, ((iArr[iM44033] - i4) + i4) - i2);
                byte[][] bArr = this.f61948;
                if (c14511.mo34942(i3, bArr[iM44033], (i2 - i4) + iArr[bArr.length + iM44033], iMin)) {
                    i2 += iMin;
                    i3 += iMin;
                    i -= iMin;
                    iM44033++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.C14511
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo34942(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0 && i <= mo34938() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int iM44033 = m44033(i);
            while (i3 > 0) {
                int[] iArr = this.f61949;
                int i4 = iM44033 == 0 ? 0 : iArr[iM44033 - 1];
                int iMin = Math.min(i3, ((iArr[iM44033] - i4) + i4) - i);
                byte[][] bArr2 = this.f61948;
                int i5 = (i - i4) + iArr[bArr2.length + iM44033];
                byte[] bArr3 = bArr2[iM44033];
                Charset charset = C15653.f50852;
                for (int i6 = 0; i6 < iMin; i6++) {
                    if (bArr3[i6 + i5] == bArr[i6 + i2]) {
                    }
                }
                i += iMin;
                i2 += iMin;
                i3 -= iMin;
                iM44033++;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C14511 m44034() {
        return new C14511(mo34947());
    }

    @Override // l.C14511
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14511)) {
            return false;
        }
        C14511 c14511 = (C14511) obj;
        return c14511.mo34938() == mo34938() && mo34943(c14511, mo34938());
    }

    @Override // l.C14511
    public final int hashCode() {
        int i = this.f47544;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f61948;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.f61949;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f47544 = i4;
        return i4;
    }

    @Override // l.C14511
    public final String toString() {
        return m44034().toString();
    }

    private Object writeReplace() {
        return m44034();
    }
}
