package l;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠ۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4EZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8590 extends C16794 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final transient byte[][] f28080;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final transient int[] f28081;

    @Override // l.C16794
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16794 mo23088() {
        throw null;
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16794 mo23090() {
        throw null;
    }

    public C8590(C1879 c1879, int i) {
        super(null);
        C11222.m28280(c1879.f6314, 0L, i);
        C9335 c9335 = c1879.f6313;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c9335.f30348;
            int i6 = c9335.f30347;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c9335 = c9335.f30344;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f28080 = new byte[i4][];
        this.f28081 = new int[i4 * 2];
        C9335 c9336 = c1879.f6313;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f28080;
            bArr[i7] = c9336.f30343;
            int i8 = c9336.f30348;
            int i9 = c9336.f30347;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.f28081;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c9336.f30345 = true;
            i7++;
            c9336 = c9336.f30344;
        }
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo23092() {
        return m23079().mo23092();
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo23083() {
        return C13065.m32547(m23079().f54181);
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo23091() {
        return m23079().mo23091();
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16794 mo23093() {
        return m23079().mo23093();
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16794 mo23087() {
        return m23079().mo23087();
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte mo23082(int i) {
        byte[][] bArr = this.f28080;
        int length = bArr.length - 1;
        int[] iArr = this.f28081;
        C11222.m28280(iArr[length], i, 1L);
        int iM23080 = m23080(i);
        return bArr[iM23080][(i - (iM23080 == 0 ? 0 : iArr[iM23080 - 1])) + iArr[bArr.length + iM23080]];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m23080(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f28081, 0, this.f28080.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo23081() {
        return this.f28081[this.f28080.length - 1];
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] mo23089() {
        byte[][] bArr = this.f28080;
        int length = bArr.length - 1;
        int[] iArr = this.f28081;
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

    @Override // l.C16794
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23084(C1879 c1879) {
        byte[][] bArr = this.f28080;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f28081;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C9335 c9335 = new C9335(bArr[i], i3, (i3 + i4) - i2);
            C9335 c9336 = c1879.f6313;
            if (c9336 == null) {
                c9335.f30346 = c9335;
                c9335.f30344 = c9335;
                c1879.f6313 = c9335;
            } else {
                c9336.f30346.m24586(c9335);
            }
            i++;
            i2 = i4;
        }
        c1879.f6314 += (long) i2;
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23086(C16794 c16794, int i) {
        if (mo23081() - i >= 0) {
            int iM23080 = m23080(0);
            int i2 = 0;
            int i3 = 0;
            while (i > 0) {
                int[] iArr = this.f28081;
                int i4 = iM23080 == 0 ? 0 : iArr[iM23080 - 1];
                int iMin = Math.min(i, ((iArr[iM23080] - i4) + i4) - i2);
                byte[][] bArr = this.f28080;
                if (c16794.mo23085(i3, bArr[iM23080], (i2 - i4) + iArr[bArr.length + iM23080], iMin)) {
                    i2 += iMin;
                    i3 += iMin;
                    i -= iMin;
                    iM23080++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.C16794
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23085(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0 && i <= mo23081() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int iM23080 = m23080(i);
            while (i3 > 0) {
                int[] iArr = this.f28081;
                int i4 = iM23080 == 0 ? 0 : iArr[iM23080 - 1];
                int iMin = Math.min(i3, ((iArr[iM23080] - i4) + i4) - i);
                byte[][] bArr2 = this.f28080;
                int i5 = (i - i4) + iArr[bArr2.length + iM23080];
                byte[] bArr3 = bArr2[iM23080];
                Charset charset = C11222.f35388;
                for (int i6 = 0; i6 < iMin; i6++) {
                    if (bArr3[i6 + i5] == bArr[i6 + i2]) {
                    }
                }
                i += iMin;
                i2 += iMin;
                i3 -= iMin;
                iM23080++;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C16794 m23079() {
        return new C16794(mo23089());
    }

    @Override // l.C16794
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16794)) {
            return false;
        }
        C16794 c16794 = (C16794) obj;
        return c16794.mo23081() == mo23081() && mo23086(c16794, mo23081());
    }

    @Override // l.C16794
    public final int hashCode() {
        int i = this.f54183;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f28080;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.f28081;
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
        this.f54183 = i4;
        return i4;
    }

    @Override // l.C16794
    public final String toString() {
        return m23079().toString();
    }

    private Object writeReplace() {
        return m23079();
    }
}
