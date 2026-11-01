package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4NP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6783 extends AbstractC3733 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f22887;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12429 f22888;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f22889;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f22890 = new Object();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3960[] f22891;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int[] f22892;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f22893;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f22894;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f22895;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f22896;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f22897;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22898;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f22899;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f22900;

    public C6783(C23718 c23718) throws IOException {
        C12429 c12429 = c23718.f76755;
        this.f22888 = c12429;
        this.f22893 = c23718.m52234();
        C4356 c4356M12196 = C4356.m12196(c23718);
        if (c4356M12196.f15584 == 0) {
            c23718.m52226(c4356M12196.f15585 - 8);
            this.f22893 = c23718.m52234();
            c4356M12196 = C4356.m12196(c23718);
        }
        int i = c4356M12196.f15587;
        int i2 = c4356M12196.f15585;
        c4356M12196.m12198(1);
        int iM52225 = c23718.m52225();
        int iM52226 = c23718.m52225();
        this.f22898 = iM52226;
        int iM52227 = c23718.m52225();
        int iM52228 = c23718.m52225();
        int iM52229 = c23718.m52225();
        this.f22897 = iM52229;
        if (i > 28) {
            c23718.m52226(i - 28);
        }
        iM52228 = iM52228 < i ? i : iM52228;
        if ((iM52226 == 0 || iM52229 == 0) && (iM52225 < 0 || (iM52225 * 4) + i > iM52228)) {
            this.f22898 = 0;
            this.f22897 = 0;
            iM52225 = (iM52228 - i) / 4;
        }
        this.f22889 = iM52225;
        this.f22900 = iM52228;
        int i3 = this.f22898;
        if (i3 == 0) {
            this.f22897 = 0;
        }
        if (iM52225 > 16777216) {
            throw new IOException("Too many strings");
        }
        if (i3 > iM52225) {
            this.f22898 = iM52225;
        }
        int i4 = this.f22893;
        this.f22887 = i + i4;
        this.f22899 = AbstractC3733.m10923(i4, iM52228, this.f22897, i2, c12429.m30893().length);
        this.f22896 = (int) Math.min(((long) this.f22893) + ((long) i2), c12429.m30893().length);
        this.f22895 = c23718.m52234();
        c23718.m52226(iM52225 * 4);
        int i5 = this.f22898;
        if (i5 != 0) {
            this.f22892 = c23718.m52229(i5);
        } else {
            this.f22892 = new int[0];
        }
        this.f22891 = new C3960[iM52225];
        this.f22894 = (iM52227 & 256) != 0;
        c23718.m52232(this.f22893 + i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6783 m18386(C17367 c17367) {
        C23718 c23718M30888 = new C12429(c17367.f55260).m30888(c17367.m40445());
        C6783 c6783 = new C6783(c23718M30888);
        c17367.seek(c23718M30888.m52234());
        return c6783;
    }

    @Override // l.InterfaceC5727
    public final int size() {
        return this.f22889;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m18389() {
        synchronized (this.f22890) {
            this.f22891 = null;
        }
    }

    @Override // l.InterfaceC5727
    public final C3960 getItem(int i) {
        if (i >= 0 && i < this.f22889) {
            synchronized (this.f22890) {
                C3960[] c3960Arr = this.f22891;
                C3960 c3960 = c3960Arr == null ? null : c3960Arr[i];
                if (c3960 != null) {
                    return c3960;
                }
                C3960 c3961 = new C3960(this, m18385(i), m18387(i));
                C3960[] c3960Arr2 = this.f22891;
                if (c3960Arr2 != null) {
                    c3960Arr2[i] = c3961;
                }
                return c3961;
            }
        }
        return new C3960(this, m18385(i), m18387(i));
    }

    @Override // l.InterfaceC5727
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC12078 mo15779(int i) {
        int i2 = this.f22889;
        if (i < 0 || i >= i2) {
            throw C20149.m45565(i, i2);
        }
        return getItem(i);
    }

    @Override // l.InterfaceC5727
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15780() {
        return this.f22894;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private String m18385(int i) {
        int i2;
        int iM30896;
        int i3;
        if (i < 0 || i >= this.f22889) {
            return C20149.m45565(i, this.f22889).toString();
        }
        synchronized (this.f22890) {
            i2 = i * 4;
            iM30896 = this.f22893 + this.f22900 + this.f22888.m30896(this.f22895 + i2);
        }
        if (iM30896 < this.f22887 || iM30896 >= (i3 = this.f22899)) {
            return "";
        }
        String strM10936 = m10936(this.f22888, iM30896, this.f22894, i3);
        if (strM10936 != null) {
            return strM10936;
        }
        synchronized (this.f22890) {
            int iM18388 = m18388(i);
            if (iM18388 != -1 && (strM10936 = m10936(this.f22888, iM18388, this.f22894, this.f22899)) != null) {
                C15157.m36338(i2 + this.f22895, (iM18388 - this.f22893) - this.f22900, this.f22888.m30893());
            }
        }
        return strM10936 == null ? "" : strM10936;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m18388(int i) {
        C20149.m45563("getPreviousStringEndOffset " + i);
        int i2 = this.f22893 + this.f22900;
        if (i == 0) {
            return i2;
        }
        int i3 = i - 1;
        int i4 = (i3 * 4) + this.f22895;
        C12429 c12429 = this.f22888;
        int iM30896 = c12429.m30896(i4) + i2;
        boolean z = this.f22894;
        int i5 = this.f22899;
        int iM10932 = AbstractC3733.m10932(c12429, iM30896, z, i5);
        C20149.m45563("new offset " + iM10932);
        if (iM10932 != -1) {
            return iM10932;
        }
        int iM18388 = m18388(i3);
        if (iM18388 == -1) {
            return -1;
        }
        return AbstractC3733.m10932(c12429, iM18388, z, i5);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int[] m18387(int i) {
        int i2;
        if (i >= 0 && i < this.f22898 && (i2 = this.f22897) > 0 && i2 >= this.f22900) {
            long j = ((long) this.f22893) + ((long) i2);
            long j2 = (((long) this.f22892[i]) & 4294967295L) + j;
            if (j >= this.f22887) {
                int i3 = this.f22896;
                if (j2 <= ((long) i3) - 4) {
                    C15070 c15070 = new C15070();
                    for (int i4 = (int) j2; i4 <= i3 - 4; i4 += 12) {
                        C12429 c12429 = this.f22888;
                        int iM30896 = c12429.m30896(i4);
                        int i5 = i4 + 4;
                        if (iM30896 == -1) {
                            return c15070.mo3181();
                        }
                        if (i5 > i3 - 8) {
                            return null;
                        }
                        c15070.add(iM30896);
                        c15070.add(c12429.m30896(i5));
                        c15070.add(c12429.m30896(i4 + 8));
                    }
                }
            }
        }
        return null;
    }
}
