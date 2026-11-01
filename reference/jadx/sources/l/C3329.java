package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ۗܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3329 implements InterfaceC1976, GetChars, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f12323;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6276 f12324;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f12325 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C2042 f12326;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12327;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f12328;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9681 f12329;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char[] f12330;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Runnable f12331;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f12332;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f12333;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f12334;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f12328) {
            return;
        }
        this.f12328 = true;
        this.f12331 = null;
        C6276 c6276 = this.f12324;
        try {
            this.f12324 = null;
            this.f12330 = null;
            try {
                C9681 c9681 = this.f12329;
                if (c9681 != null) {
                    C9681.m24633(c9681);
                }
                this.f12329 = null;
                C2042 c2042 = this.f12326;
                if (c2042 != null) {
                    c2042.close();
                    this.f12326 = null;
                }
                if (c6276 != null) {
                    c6276.close();
                }
            } catch (Throwable th) {
                this.f12329 = null;
                C2042 c2043 = this.f12326;
                if (c2043 != null) {
                    c2043.close();
                    this.f12326 = null;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (c6276 != null) {
                try {
                    c6276.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C3329 m9891() {
        m9887();
        return m9881(new C6276(this.f12324.m40840(), this.f12324.m17352()), this.f12334);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C9681 m9888() {
        m9887();
        if (this.f12329 == null) {
            this.f12329 = new C9681(this);
        }
        return this.f12329;
    }

    public C3329(C6276 c6276, int i) {
        this.f12324 = c6276;
        this.f12327 = c6276.length();
        this.f12334 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3329 m9880(C6276 c6276) {
        return m9881(c6276, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3329 m9881(C6276 c6276, int i) {
        try {
            return new C3329(c6276, i);
        } catch (Error | RuntimeException e) {
            c6276.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m9896() {
        m9887();
        return this.f12334;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6276 m9895() {
        return this.f12324;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        m9887();
        return this.f12327;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m9889() {
        m9887();
        return this.f12324.m40838();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m9893(int i) {
        m9887();
        C14744.m35328(i, i, this.f12327);
        return this.f12324.m40839(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m9892(int i) {
        m9887();
        return this.f12324.m40837(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1918 m9890(int i, int i2) {
        m9887();
        C14744.m35328(i, i2, this.f12327);
        return new C1918(this, i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9894(Runnable runnable) {
        m9887();
        this.f12331 = runnable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2;
        m9887();
        if (i < this.f12323 || i >= this.f12333) {
            if (i < 0 || i >= (i2 = this.f12327)) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            m9882(this.f12325 > i ? Math.max(0, i - 1024) : i, Math.min(1024, i2 - i) + i, i);
        }
        return this.f12330[i - this.f12323];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9882(int i, int i2, int i3) {
        m9886();
        this.f12325 = i3;
        this.f12333 = 0;
        this.f12323 = 0;
        if (this.f12326 == null) {
            C2042 c2042 = new C2042(this.f12324.m40840().f48220, 2048);
            this.f12326 = c2042;
            this.f12330 = c2042.m6538();
        }
        this.f12324.getChars(i, i2, this.f12330, 0);
        this.f12323 = i;
        this.f12333 = i2;
    }

    @Override // l.InterfaceC1976
    public final int indexOf(char c, int i, int i2) {
        m9887();
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f12327, i2);
        while (iMax < iMin) {
            m9886();
            if (iMax < this.f12323 || iMax >= this.f12333) {
                m9882(iMax, Math.min(1024, iMin - iMax) + iMax, iMax);
            }
            int iMin2 = Math.min(iMin, this.f12333);
            while (iMax < iMin2) {
                if (this.f12330[iMax - this.f12323] == c) {
                    return iMax;
                }
                iMax++;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC1976
    public final int lastIndexOf(char c, int i, int i2) {
        m9887();
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f12327, i2);
        while (iMin > iMax) {
            m9886();
            int i3 = iMin - 1;
            if (i3 < this.f12323 || i3 >= this.f12333) {
                m9882(Math.max(iMax, iMin - 1024), iMin, i3);
            }
            int iMax2 = Math.max(iMax, this.f12323);
            while (iMin > iMax2) {
                iMin--;
                if (this.f12330[iMin - this.f12323] == c) {
                    return iMin;
                }
            }
        }
        return -1;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        m9887();
        C14744.m35328(i, i2, this.f12327);
        int i4 = i2 - i;
        C17565.m40836(cArr, i3, i4);
        if (i == i2) {
            return;
        }
        m9886();
        int i5 = this.f12323;
        if (i >= i5 && i2 <= this.f12333) {
            System.arraycopy(this.f12330, i - i5, cArr, i3, i4);
            return;
        }
        if (this.f12331 == null) {
            this.f12324.getChars(i, i2, cArr, i3);
            return;
        }
        while (i < i2) {
            m9886();
            int iMin = Math.min(4096, i2 - i) + i;
            this.f12324.getChars(i, iMin, cArr, i3);
            i3 += iMin - i;
            i = iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final String subSequence(int i, int i2) {
        m9887();
        m9886();
        C14744.m35328(i, i2, this.f12327);
        if (i == i2) {
            return "";
        }
        int i3 = this.f12323;
        if (i >= i3 && i2 <= this.f12333) {
            return new String(this.f12330, i - i3, i2 - i);
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        m9887();
        if (this.f12332) {
            return super.toString();
        }
        return this.f12331 != null ? subSequence(0, this.f12327) : this.f12324.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m9886() {
        Runnable runnable = this.f12331;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m9887() {
        if (this.f12328) {
            throw new IllegalStateException("Text reader is closed");
        }
    }
}
