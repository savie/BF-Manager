package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.ܳܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15508 implements InterfaceC1181, GetChars, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Runnable f50477;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f50478;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19984 f50479;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10508 f50480;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f50481;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7305 f50482;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f50483;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f50484 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f50485;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f50486;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f50487;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50488;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f50481) {
            return;
        }
        this.f50481 = true;
        this.f50477 = null;
        C7305 c7305 = this.f50482;
        try {
            this.f50482 = null;
            this.f50485 = null;
            try {
                C19984 c19984 = this.f50479;
                if (c19984 != null) {
                    C19984.m45926(c19984);
                }
                this.f50479 = null;
                C10508 c10508 = this.f50480;
                if (c10508 != null) {
                    c10508.close();
                    this.f50480 = null;
                }
                if (c7305 != null) {
                    c7305.close();
                }
            } catch (Throwable th) {
                this.f50479 = null;
                C10508 c10509 = this.f50480;
                if (c10509 != null) {
                    c10509.close();
                    this.f50480 = null;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (c7305 != null) {
                try {
                    c7305.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C15508 m37172() {
        m37171();
        return m37164(new C7305(this.f50482.m23622(), this.f50482.m19989()), this.f50483);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C19984 m37176() {
        m37171();
        if (this.f50479 == null) {
            this.f50479 = new C19984(this);
        }
        return this.f50479;
    }

    public C15508(C7305 c7305, int i) {
        this.f50482 = c7305;
        this.f50478 = c7305.length();
        this.f50483 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15508 m37163(C7305 c7305) {
        return m37164(c7305, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15508 m37164(C7305 c7305, int i) {
        try {
            return new C15508(c7305, i);
        } catch (Error | RuntimeException e) {
            c7305.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m37177() {
        m37171();
        return this.f50483;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7305 m37178() {
        return this.f50482;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        m37171();
        return this.f50478;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m37175() {
        m37171();
        return this.f50482.m23621();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37179(int i) {
        m37171();
        C21697.m49248(i, i, this.f50478);
        return this.f50482.m23620(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m37174(int i) {
        m37171();
        return this.f50482.m23623(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22968 m37173(int i, int i2) {
        m37171();
        C21697.m49248(i, i2, this.f50478);
        return new C22968(this, i, i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37180(Runnable runnable) {
        m37171();
        this.f50477 = runnable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2;
        m37171();
        if (i < this.f50486 || i >= this.f50488) {
            if (i < 0 || i >= (i2 = this.f50478)) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            m37165(this.f50484 > i ? Math.max(0, i - 1024) : i, Math.min(1024, i2 - i) + i, i);
        }
        return this.f50485[i - this.f50486];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37165(int i, int i2, int i3) {
        m37167();
        this.f50484 = i3;
        this.f50488 = 0;
        this.f50486 = 0;
        if (this.f50480 == null) {
            C10508 c10508 = new C10508(this.f50482.m23622().f69247, 2048);
            this.f50480 = c10508;
            this.f50485 = c10508.m26971();
        }
        this.f50482.getChars(i, i2, this.f50485, 0);
        this.f50486 = i;
        this.f50488 = i2;
    }

    @Override // l.InterfaceC1181
    public final int indexOf(char c, int i, int i2) {
        m37171();
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f50478, i2);
        while (iMax < iMin) {
            m37167();
            if (iMax < this.f50486 || iMax >= this.f50488) {
                m37165(iMax, Math.min(1024, iMin - iMax) + iMax, iMax);
            }
            int iMin2 = Math.min(iMin, this.f50488);
            while (iMax < iMin2) {
                if (this.f50485[iMax - this.f50486] == c) {
                    return iMax;
                }
                iMax++;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC1181
    public final int lastIndexOf(char c, int i, int i2) {
        m37171();
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f50478, i2);
        while (iMin > iMax) {
            m37167();
            int i3 = iMin - 1;
            if (i3 < this.f50486 || i3 >= this.f50488) {
                m37165(Math.max(iMax, iMin - 1024), iMin, i3);
            }
            int iMax2 = Math.max(iMax, this.f50486);
            while (iMin > iMax2) {
                iMin--;
                if (this.f50485[iMin - this.f50486] == c) {
                    return iMin;
                }
            }
        }
        return -1;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        m37171();
        C21697.m49248(i, i2, this.f50478);
        int i4 = i2 - i;
        C8796.m23619(cArr, i3, i4);
        if (i == i2) {
            return;
        }
        m37167();
        int i5 = this.f50486;
        if (i >= i5 && i2 <= this.f50488) {
            System.arraycopy(this.f50485, i - i5, cArr, i3, i4);
            return;
        }
        if (this.f50477 == null) {
            this.f50482.getChars(i, i2, cArr, i3);
            return;
        }
        while (i < i2) {
            m37167();
            int iMin = Math.min(4096, i2 - i) + i;
            this.f50482.getChars(i, iMin, cArr, i3);
            i3 += iMin - i;
            i = iMin;
        }
    }

    @Override // java.lang.CharSequence
    public final String subSequence(int i, int i2) {
        m37171();
        m37167();
        C21697.m49248(i, i2, this.f50478);
        if (i == i2) {
            return "";
        }
        int i3 = this.f50486;
        if (i >= i3 && i2 <= this.f50488) {
            return new String(this.f50485, i - i3, i2 - i);
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        m37171();
        if (this.f50487) {
            return super.toString();
        }
        return this.f50477 != null ? subSequence(0, this.f50478) : this.f50482.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m37167() {
        Runnable runnable = this.f50477;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m37171() {
        if (this.f50481) {
            throw new IllegalStateException("Text reader is closed");
        }
    }
}
