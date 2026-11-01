package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ۢܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9681 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32642;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3329 f32643;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char[] f32644;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f32645;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C2042 f32646;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C4159 f32647;

    public C9681(C3329 c3329) {
        this.f32643 = c3329;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        C3329 c3329 = this.f32643;
        c3329.m9887();
        return c3329.f12327;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < this.f32645 || i >= this.f32642) {
            m24634(i);
        }
        return this.f32644[i - this.f32645];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] m24637(int i) {
        if (i < this.f32645 || i >= this.f32642) {
            m24634(i);
        }
        return this.f32644;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m24636() {
        return this.f32645;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24635() {
        return this.f32642;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m24634(int i) {
        C3329 c3329 = this.f32643;
        c3329.m9887();
        if (i < 0 || i >= c3329.f12327) {
            throw new IndexOutOfBoundsException("Invalid character index");
        }
        c3329.m9886();
        int i2 = this.f32642;
        int iMin = i == i2 ? Math.min(512, i2 - this.f32645) : 0;
        if (iMin != 0) {
            i = this.f32642 - iMin;
        } else if (i < this.f32645) {
            i = Math.max(0, i - 512);
        }
        if (iMin != 0) {
            char[] cArr = this.f32644;
            System.arraycopy(cArr, (this.f32642 - this.f32645) - iMin, cArr, 0, iMin);
        }
        this.f32642 = 0;
        this.f32645 = 0;
        if (this.f32646 == null) {
            C2042 c2042 = new C2042(c3329.f12324.m40840().f48220, 2048);
            this.f32646 = c2042;
            this.f32644 = c2042.m6538();
        }
        int i3 = iMin + i;
        int iMin2 = Math.min(2048, c3329.f12327 - i) + i;
        C4159 c4159 = this.f32647;
        if (c4159 == null) {
            this.f32647 = c3329.f12324.mo33951(i3);
        } else if (c4159.position() != i3) {
            this.f32647.m11799(i3);
        }
        while (i3 < iMin2) {
            c3329.m9886();
            int iMin3 = Math.min(1024, iMin2 - i3);
            this.f32647.m11800(this.f32644, i3 - i, iMin3);
            i3 += iMin3;
        }
        this.f32645 = i;
        this.f32642 = iMin2;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C3329 c3329 = this.f32643;
        c3329.m9887();
        C14744.m35328(i, i2, c3329.f12327);
        C17565.m40836(cArr, i3, i2 - i);
        while (i < i2) {
            c3329.m9886();
            if (i < this.f32645 || i >= this.f32642) {
                m24634(i);
            }
            int iMin = Math.min(i2, this.f32642) - i;
            System.arraycopy(this.f32644, i - this.f32645, cArr, i3, iMin);
            i += iMin;
            i3 += iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final String subSequence(int i, int i2) {
        C3329 c3329 = this.f32643;
        c3329.m9887();
        C14744.m35328(i, i2, c3329.f12327);
        c3329.m9886();
        if (i == i2) {
            return "";
        }
        int i3 = this.f32645;
        if (i >= i3 && i2 <= this.f32642) {
            return new String(this.f32644, i - i3, i2 - i);
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return subSequence(0, this.f32643.f12327);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24633(C9681 c9681) {
        c9681.f32642 = 0;
        c9681.f32645 = 0;
        c9681.f32644 = null;
        try {
            C4159 c4159 = c9681.f32647;
            if (c4159 != null) {
                c4159.close();
            }
        } finally {
            c9681.f32647 = null;
            C2042 c2042 = c9681.f32646;
            if (c2042 != null) {
                c2042.close();
                c9681.f32646 = null;
            }
        }
    }
}
