package l;

import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E998 */
/* JADX INFO: loaded from: classes.dex */
public class C10312 extends AbstractC3733 {

    /* JADX INFO: renamed from: ֫۠ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f35352;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f35353;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12429 f35354;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f35355;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f35356;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3960[] f35357;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f35358;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f35359;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f35360;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f35361;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f35362;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35363;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f35364;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f35365;

    static {
        ApplicationC6132.m17119(IShizukuService.Stub.TRANSACTION_getFlagsForUid);
        f35352 = new short[]{2355, 30427, 30432, 30432, 30383, 30434, 30446, 30433, 30454, 30383, 30460, 30459, 30461, 30438, 30433, 30440, 30460};
    }

    public native C10312(C23718 c23718, C6753 c6753);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m26130(C3930 c3930);

    @Override // l.InterfaceC5727
    public final int size() {
        return this.f35355;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m26129() {
        this.f35357 = null;
    }

    @Override // l.InterfaceC5727
    public final C3960 getItem(int i) {
        C3960[] c3960Arr = this.f35357;
        if (c3960Arr != null && i >= 0 && i < this.f35355) {
            C3960 c3960 = c3960Arr[i];
            if (c3960 != null) {
                return c3960;
            }
            String strM26126 = m26126(i);
            int[] iArrM26127 = m26127(i);
            C3960[] c3960Arr2 = this.f35357;
            C3960 c3961 = new C3960(this, strM26126, iArrM26127);
            c3960Arr2[i] = c3961;
            return c3961;
        }
        return new C3960(this, m26126(i), m26127(i));
    }

    @Override // l.InterfaceC5727
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC12078 mo15779(int i) {
        if (i < 0 || i >= this.f35355) {
            throw C20149.m45565(i, this.f35355);
        }
        return getItem(i);
    }

    @Override // l.InterfaceC5727
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15780() {
        return this.f35359;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private String m26126(int i) {
        int i2;
        if (i < 0 || i >= this.f35355) {
            return C20149.m45565(i, this.f35355).toString();
        }
        int i3 = this.f35365;
        int i4 = this.f35358;
        int i5 = i3 + i4 + this.f35360[i];
        if (i5 < this.f35364 || i5 >= (i2 = this.f35356)) {
            return "";
        }
        C12429 c12429 = this.f35354;
        boolean z = this.f35359;
        String strM10936 = m10936(c12429, i5, z, i2);
        if (strM10936 == null) {
            int iM26128 = m26128(i);
            if (iM26128 != -1 && (strM10936 = m10936(c12429, iM26128, z, i2)) != null) {
                this.f35360[i] = (iM26128 - i4) - this.f35365;
            }
            if (strM10936 == null) {
                return "";
            }
        }
        return strM10936;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m26128(int i) {
        C20149.m45563("getPreviousStringEndOffset " + i);
        int i2 = this.f35358;
        if (i == 0) {
            return i2 + this.f35365;
        }
        int i3 = i - 1;
        int i4 = i2 + this.f35365 + this.f35360[i3];
        C12429 c12429 = this.f35354;
        boolean z = this.f35359;
        int i5 = this.f35356;
        int iM10932 = AbstractC3733.m10932(c12429, i4, z, i5);
        C20149.m45563("new offset " + iM10932);
        if (iM10932 != -1) {
            return iM10932;
        }
        int iM26128 = m26128(i3);
        if (iM26128 == -1) {
            return -1;
        }
        return AbstractC3733.m10932(c12429, iM26128, z, i5);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int[] m26127(int i) {
        if (i >= 0 && i < this.f35363) {
            C23718 c23718M30888 = this.f35354.m30888(this.f35358 + this.f35361 + this.f35362[i]);
            C15070 c15070 = new C15070();
            while (true) {
                try {
                    int iM52225 = c23718M30888.m52225();
                    if (iM52225 != -1) {
                        c15070.add(iM52225);
                    } else {
                        return c15070.mo3181();
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return null;
    }
}
