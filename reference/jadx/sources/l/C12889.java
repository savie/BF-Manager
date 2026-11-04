package l;

import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: E998 */
/* JADX INFO: loaded from: classes.dex */
public class C12889 extends AbstractC5101 {

    /* JADX INFO: renamed from: ֡ۗܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f41218;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f41219;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int[] f41220;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f41221;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f41222;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f41223;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f41224;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f41225;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f41226;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f41227;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC21094 f41228;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f41229;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f41230;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C2666[] f41231;

    static {
        ApplicationC23172.m52091(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult);
        f41218 = new short[]{4572, 5813, 5774, 5774, 5825, 5772, 5760, 5775, 5784, 5825, 5778, 5781, 5779, 5768, 5775, 5766, 5778};
    }

    public native C12889(C16618 c16618, C23308 c23308);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m31934(C15848 c15848);

    @Override // l.InterfaceC3412
    public final int size() {
        return this.f41222;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31935() {
        this.f41231 = null;
    }

    @Override // l.InterfaceC3412
    public final C2666 getItem(int i) {
        C2666[] c2666Arr = this.f41231;
        if (c2666Arr != null && i >= 0 && i < this.f41222) {
            C2666 c2666 = c2666Arr[i];
            if (c2666 != null) {
                return c2666;
            }
            String strM31932 = m31932(i);
            int[] iArrM31931 = m31931(i);
            C2666[] c2666Arr2 = this.f41231;
            C2666 c2667 = new C2666(this, strM31932, iArrM31931);
            c2666Arr2[i] = c2667;
            return c2667;
        }
        return new C2666(this, m31932(i), m31931(i));
    }

    @Override // l.InterfaceC3412
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16090 mo11156(int i) {
        if (i < 0 || i >= this.f41222) {
            throw C12295.m30686(i, this.f41222);
        }
        return getItem(i);
    }

    @Override // l.InterfaceC3412
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11157() {
        return this.f41219;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private String m31932(int i) {
        int i2;
        if (i < 0 || i >= this.f41222) {
            return C12295.m30686(i, this.f41222).toString();
        }
        int i3 = this.f41226;
        int i4 = this.f41229;
        int i5 = i3 + i4 + this.f41227[i];
        if (i5 < this.f41223 || i5 >= (i2 = this.f41224)) {
            return "";
        }
        AbstractC21094 abstractC21094 = this.f41228;
        boolean z = this.f41219;
        String strM15438 = m15438(abstractC21094, i5, z, i2);
        if (strM15438 == null) {
            int iM31933 = m31933(i);
            if (iM31933 != -1 && (strM15438 = m15438(abstractC21094, iM31933, z, i2)) != null) {
                this.f41227[i] = (iM31933 - i4) - this.f41226;
            }
            if (strM15438 == null) {
                return "";
            }
        }
        return strM15438;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m31933(int i) {
        C12295.m30688("getPreviousStringEndOffset " + i);
        int i2 = this.f41229;
        if (i == 0) {
            return i2 + this.f41226;
        }
        int i3 = i - 1;
        int i4 = i2 + this.f41226 + this.f41227[i3];
        AbstractC21094 abstractC21094 = this.f41228;
        boolean z = this.f41219;
        int i5 = this.f41224;
        int iM15432 = AbstractC5101.m15432(abstractC21094, i4, z, i5);
        C12295.m30688("new offset " + iM15432);
        if (iM15432 != -1) {
            return iM15432;
        }
        int iM31933 = m31933(i3);
        if (iM31933 == -1) {
            return -1;
        }
        return AbstractC5101.m15432(abstractC21094, iM31933, z, i5);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int[] m31931(int i) {
        if (i >= 0 && i < this.f41225) {
            int i2 = this.f41229 + this.f41230 + this.f41220[i];
            AbstractC21094 abstractC21094 = this.f41228;
            C16618 c16618M48157 = abstractC21094.m48157(i2);
            C14763 c14763 = new C14763();
            while (true) {
                try {
                    int iM39316 = c16618M48157.m39316();
                    if (iM39316 != -1) {
                        c14763.add(iM39316);
                    } else {
                        abstractC21094.m48156(c16618M48157);
                        return c14763.mo2687();
                    }
                } catch (IndexOutOfBoundsException unused) {
                    abstractC21094.m48156(c16618M48157);
                } catch (Throwable th) {
                    abstractC21094.m48156(c16618M48157);
                    throw th;
                }
            }
        }
        return null;
    }
}
