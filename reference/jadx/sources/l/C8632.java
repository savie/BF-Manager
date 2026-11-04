package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4NP */
/* JADX INFO: loaded from: classes4.dex */
public final class C8632 extends AbstractC5101 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f28200;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f28201;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f28202;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f28203;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f28204;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15399 f28205;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f28206 = new Object();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f28207;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C2666[] f28208;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f28209;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC21094 f28210;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f28211;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f28212;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f28213;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f28214;

    public C8632(C16618 c16618) throws IOException {
        AbstractC21094 abstractC21094 = c16618.f53739;
        this.f28210 = abstractC21094;
        this.f28212 = c16618.m39314();
        C9311 c9311M24535 = C9311.m24535(c16618);
        if (c9311M24535.f30253 == 0) {
            c16618.m39317(c9311M24535.f30250 - 8);
            this.f28212 = c16618.m39314();
            c9311M24535 = C9311.m24535(c16618);
        }
        int i = c9311M24535.f30252;
        int i2 = c9311M24535.f30250;
        c9311M24535.m24537(1);
        int iM39316 = c16618.m39316();
        int iM39317 = c16618.m39316();
        this.f28213 = iM39317;
        int iM39318 = c16618.m39316();
        int iM39319 = c16618.m39316();
        int iM393110 = c16618.m39316();
        this.f28211 = iM393110;
        if (i > 28) {
            c16618.m39317(i - 28);
        }
        iM39319 = iM39319 < i ? i : iM39319;
        if ((iM39317 == 0 || iM393110 == 0) && (iM39316 < 0 || (iM39316 * 4) + i > iM39319)) {
            this.f28213 = 0;
            this.f28211 = 0;
            iM39316 = (iM39319 - i) / 4;
        }
        this.f28214 = iM39316;
        this.f28209 = iM39319;
        int i3 = this.f28213;
        if (i3 == 0) {
            this.f28211 = 0;
        }
        if (iM39316 > 16777216) {
            throw new IOException("Too many strings");
        }
        if (i3 > iM39316) {
            this.f28213 = iM39316;
        }
        int i4 = this.f28212;
        this.f28200 = i + i4;
        this.f28202 = AbstractC5101.m15421(i4, iM39319, this.f28211, i2, abstractC21094.mo10510());
        this.f28201 = (int) Math.min(((long) this.f28212) + ((long) i2), abstractC21094.mo10510());
        this.f28207 = c16618.m39314();
        c16618.m39317(iM39316 * 4);
        int i5 = this.f28213;
        if (i5 != 0) {
            this.f28204 = c16618.m39307(i5);
        } else {
            this.f28204 = new int[0];
        }
        this.f28208 = new C2666[iM39316];
        this.f28203 = (iM39318 & 256) != 0;
        c16618.m39310(this.f28212 + i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8632 m23264(C20348 c20348) {
        C16618 c16618M48157 = new C3194(c20348.f65270).m48157(c20348.m46744());
        C8632 c8632 = new C8632(c16618M48157);
        c20348.seek(c16618M48157.m39314());
        return c8632;
    }

    @Override // l.InterfaceC3412
    public final int size() {
        return this.f28214;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m23268() {
        synchronized (this.f28206) {
            this.f28208 = null;
        }
    }

    @Override // l.InterfaceC3412
    public final C2666 getItem(int i) {
        if (i >= 0 && i < this.f28214) {
            synchronized (this.f28206) {
                C2666[] c2666Arr = this.f28208;
                C2666 c2666 = c2666Arr == null ? null : c2666Arr[i];
                if (c2666 != null) {
                    return c2666;
                }
                C2666 c2667 = new C2666(this, m23266(i), m23265(i));
                C2666[] c2666Arr2 = this.f28208;
                if (c2666Arr2 != null) {
                    c2666Arr2[i] = c2667;
                }
                return c2667;
            }
        }
        return new C2666(this, m23266(i), m23265(i));
    }

    @Override // l.InterfaceC3412
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16090 mo11156(int i) {
        int i2 = this.f28214;
        if (i < 0 || i >= i2) {
            throw C12295.m30686(i, i2);
        }
        return getItem(i);
    }

    @Override // l.InterfaceC3412
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11157() {
        return this.f28203;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private String m23266(int i) {
        int iMo10513;
        int i2;
        int i3;
        if (i < 0 || i >= this.f28214) {
            return C12295.m30686(i, this.f28214).toString();
        }
        synchronized (this.f28206) {
            int i4 = this.f28212 + this.f28209;
            C15399 c15399 = this.f28205;
            if (c15399 == null || (iMo10513 = c15399.m36868(i, Integer.MIN_VALUE)) == Integer.MIN_VALUE) {
                iMo10513 = this.f28210.mo10513((i * 4) + this.f28207);
            }
            i2 = i4 + iMo10513;
        }
        if (i2 < this.f28200 || i2 >= (i3 = this.f28202)) {
            return "";
        }
        String strM15438 = m15438(this.f28210, i2, this.f28203, i3);
        if (strM15438 != null) {
            return strM15438;
        }
        synchronized (this.f28206) {
            int iM23267 = m23267(i);
            if (iM23267 != -1 && (strM15438 = m15438(this.f28210, iM23267, this.f28203, this.f28202)) != null) {
                int i5 = (iM23267 - this.f28212) - this.f28209;
                if (this.f28205 == null) {
                    this.f28205 = new C15399();
                }
                this.f28205.mo20978(i, i5);
            }
        }
        return strM15438 == null ? "" : strM15438;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m23267(int i) {
        int iMo10513;
        C12295.m30688("getPreviousStringEndOffset " + i);
        int i2 = this.f28212 + this.f28209;
        if (i == 0) {
            return i2;
        }
        int i3 = i - 1;
        C15399 c15399 = this.f28205;
        AbstractC21094 abstractC21094 = this.f28210;
        if (c15399 == null || (iMo10513 = c15399.m36868(i3, Integer.MIN_VALUE)) == Integer.MIN_VALUE) {
            iMo10513 = abstractC21094.mo10513((i3 * 4) + this.f28207);
        }
        int i4 = i2 + iMo10513;
        boolean z = this.f28203;
        int i5 = this.f28202;
        int iM15432 = AbstractC5101.m15432(abstractC21094, i4, z, i5);
        C12295.m30688("new offset " + iM15432);
        if (iM15432 != -1) {
            return iM15432;
        }
        int iM23267 = m23267(i3);
        if (iM23267 == -1) {
            return -1;
        }
        return AbstractC5101.m15432(abstractC21094, iM23267, z, i5);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int[] m23265(int i) {
        int i2;
        if (i >= 0 && i < this.f28213 && (i2 = this.f28211) > 0 && i2 >= this.f28209) {
            long j = ((long) this.f28212) + ((long) i2);
            long j2 = (((long) this.f28204[i]) & 4294967295L) + j;
            if (j >= this.f28200) {
                int i3 = this.f28201;
                if (j2 <= ((long) i3) - 4) {
                    C14763 c14763 = new C14763();
                    for (int i4 = (int) j2; i4 <= i3 - 4; i4 += 12) {
                        AbstractC21094 abstractC21094 = this.f28210;
                        int iMo10513 = abstractC21094.mo10513(i4);
                        int i5 = i4 + 4;
                        if (iMo10513 == -1) {
                            return c14763.mo2687();
                        }
                        if (i5 > i3 - 8) {
                            return null;
                        }
                        c14763.add(iMo10513);
                        c14763.add(abstractC21094.mo10513(i5));
                        c14763.add(abstractC21094.mo10513(i4 + 8));
                    }
                }
            }
        }
        return null;
    }
}
