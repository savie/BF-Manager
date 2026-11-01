package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܺ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16155 extends AbstractC0631 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f52215;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C7605 f52216;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13625 f52217;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f52218;

    public C16155(Object obj, final int i, final char[] cArr, final int i2, final int i3, C16072 c16072) {
        super(0, obj);
        int i4 = 0;
        boolean z = true;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            char c = cArr[i5];
            i4 = c == '\n' ? i4 + 1 : i4;
            if (c > 255) {
                z = false;
            }
        }
        this.f52218 = i;
        this.f52215 = z;
        this.f2727 = i3;
        this.f2726 = i4;
        if (c16072 == null) {
            this.f52216 = null;
            this.f52217 = new C13625(i, cArr, i2, i3, i4, z);
        } else {
            this.f52216 = c16072.m38091(i3, i4, z, new Supplier() { // from class: l.ۤ᩶ۖ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C16155.m38240(this.f36007, i, cArr, i2, i3);
                }
            });
            this.f52217 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C13625 m38240(C16155 c16155, int i, char[] cArr, int i2, int i3) {
        return new C13625(i, cArr, i2, i3, c16155.f2726, c16155.f52215);
    }

    public C16155(Object obj, C7605 c7605) {
        super(0, obj);
        this.f52216 = c7605;
        this.f52217 = null;
        this.f52218 = c7605.f25160;
        this.f52215 = c7605.f25155;
        this.f2727 = c7605.f25157;
        this.f2726 = c7605.f25161;
    }

    public C16155(Object obj, C13625 c13625) {
        super(0, obj);
        this.f52216 = null;
        this.f52217 = c13625;
        this.f52218 = c13625.m33314();
        this.f52215 = c13625.m33313();
        this.f2727 = c13625.m33305();
        this.f2726 = c13625.m33311();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38243() {
        return this.f52218;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m38249() {
        return this.f52215;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object m38241() {
        C7605 c7605 = this.f52216;
        return c7605 == null ? this.f52217 : c7605;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21093 m38247() {
        C13625 c13625 = this.f52217;
        if (c13625 != null) {
            return new C21093(c13625, null);
        }
        C7605 c7605 = this.f52216;
        return new C21093(null, c7605.f25159.f51982.m26332(c7605));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m38242(int i) {
        C13625 c13625 = this.f52217;
        if (c13625 != null) {
            return c13625.m33306(i);
        }
        C21093 c21093M38247 = m38247();
        try {
            char cM33306 = c21093M38247.f68721.m33306(i);
            c21093M38247.close();
            return cM33306;
        } catch (Throwable th) {
            try {
                c21093M38247.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38245(char[] cArr, int i, int i2) {
        C13625 c13625 = this.f52217;
        if (c13625 != null) {
            c13625.m33309(0, i, cArr, i2);
            return;
        }
        C21093 c21093M38247 = m38247();
        try {
            c21093M38247.f68721.m33309(0, i, cArr, i2);
            c21093M38247.close();
        } catch (Throwable th) {
            try {
                c21093M38247.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16155 m38244(Object obj, final int i, final int i2, final char[] cArr, final int i3) {
        C21093 c21093M38247 = m38247();
        try {
            final C13625 c13625 = c21093M38247.f68721;
            C7605 c7605 = this.f52216;
            if (c7605 != null) {
                int iM33315 = this.f2726 - (c13625.m33315(i2) - c13625.m33315(i));
                boolean z = this.f52215;
                for (int i4 = 0; i4 < i3; i4++) {
                    char c = cArr[i4];
                    if (c == '\n') {
                        iM33315++;
                    }
                    if (c > 255) {
                        z = false;
                    }
                }
                C16155 c16155 = new C16155(obj, c7605.f25159.m38091((this.f2727 - (i2 - i)) + i3, iM33315, z, new Supplier() { // from class: l.۟᩶ۖ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return c13625.m33316(i, i2, cArr, i3);
                    }
                }));
                c21093M38247.close();
                return c16155;
            }
            C16155 c16156 = new C16155(obj, c13625.m33316(i, i2, cArr, i3));
            c21093M38247.close();
            return c16156;
        } catch (Throwable th) {
            try {
                c21093M38247.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m38248(int i) {
        C13625 c13625 = this.f52217;
        if (c13625 != null) {
            return c13625.m33315(i);
        }
        C21093 c21093M38247 = m38247();
        try {
            int iM33315 = c21093M38247.f68721.m33315(i);
            c21093M38247.close();
            return iM33315;
        } catch (Throwable th) {
            try {
                c21093M38247.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m38246(int i) {
        C13625 c13625 = this.f52217;
        if (c13625 != null) {
            return c13625.m33312(i);
        }
        C21093 c21093M38247 = m38247();
        try {
            int iM33312 = c21093M38247.f68721.m33312(i);
            c21093M38247.close();
            return iM33312;
        } catch (Throwable th) {
            try {
                c21093M38247.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
