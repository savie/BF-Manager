package l;

import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.᩻֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54WU */
/* JADX INFO: loaded from: classes2.dex */
public final class C23367 extends AbstractC12824 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12429 f75686;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C9177 f75687;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10672 f75688;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f75689;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f75690;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f75691;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f75692;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f75693;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23367(C1138 c1138, C23718 c23718, C4356 c4356) {
        super(c1138);
        int i = c4356.f15586;
        this.f75688 = new C10672();
        this.f75687 = new C9177();
        this.f75691 = new Object();
        this.f75686 = c23718.f76755;
        int iM52236 = c23718.m52236();
        c23718.m52226(2);
        int i2 = 0;
        boolean z = (iM52236 & 1) != 0;
        this.f75690 = z;
        boolean z2 = (iM52236 & 2) != 0;
        this.f75693 = z2;
        int iM52225 = c23718.m52225();
        this.f75689 = c23718.m52225() + i;
        this.f42695 = C15916.m37841(c23718, ((C1138) super.getType()).mo1537().mo19107());
        c23718.m52232(i + c4356.f15587);
        int i3 = -1;
        if (z) {
            while (i2 < iM52225) {
                int iM52224 = c23718.m52224();
                this.f75688.mo26878(iM52224, c23718.m52224() * 4);
                if (iM52224 > i3) {
                    i3 = iM52224;
                }
                i2++;
            }
            this.f75692 = i3;
            return;
        }
        if (z2) {
            while (i2 < iM52225) {
                int iM52226 = c23718.m52224();
                if (iM52226 != 65535) {
                    this.f75688.mo26878(i2, iM52226 * 4);
                }
                i2++;
            }
            this.f75692 = iM52225 - 1;
            return;
        }
        while (i2 < iM52225) {
            int iM52227 = c23718.m52225();
            if (iM52227 != -1) {
                this.f75688.mo26878(i2, iM52227);
            }
            i2++;
        }
        this.f75692 = iM52225 - 1;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۤ */
    public final int mo31751() {
        return this.f75692;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۨ */
    public final String mo31752(int i) {
        int iM30896;
        int iM26883 = this.f75688.m26883(i);
        if (iM26883 == -1) {
            return null;
        }
        int i2 = this.f75689 + iM26883;
        C12429 c12429 = this.f75686;
        if ((c12429.m30889(i2 + 2) & 8) != 0) {
            iM30896 = c12429.m30898(i2);
        } else {
            iM30896 = c12429.m30896(i2 + 4);
        }
        try {
            return ((C11723) ((C2549) super.mo31754()).m7942()).f39410.m10939(iM30896);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC3609 mo31753(int i) {
        int i2;
        int iM26883 = this.f75688.m26883(i);
        if (iM26883 == -1 || (i2 = iM26883 + this.f75689) < 0) {
            return null;
        }
        C12429 c12429 = this.f75686;
        if (c12429.m30890(i2) < 8) {
            return null;
        }
        C23718 c23718M30888 = c12429.m30888(i2);
        C14195 c14195 = new C14195(this, i, c23718M30888);
        c12429.m30892(c23718M30888);
        return c14195;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo31756(int i) {
        int i2;
        boolean z;
        int iM26883 = this.f75688.m26883(i);
        if (iM26883 == -1 || (i2 = this.f75689 + iM26883) < 0 || this.f75686.m30890(i2) < 8) {
            return false;
        }
        synchronized (this.f75691) {
            byte bM23611 = this.f75687.m23611(i);
            if (bM23611 == 0) {
                C23718 c23718M30888 = this.f75686.m30888(i2);
                bM23611 = C14195.m34283(c23718M30888, (C2549) super.mo31754()) ? (byte) 1 : (byte) 2;
                this.f75686.m30892(c23718M30888);
                this.f75687.mo9046(bM23611, i);
            }
            z = bM23611 == 1;
        }
        return z;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۡۙ */
    public final boolean mo31750() {
        return this.f75690;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۘܰ */
    public final boolean mo31748() {
        return this.f75693;
    }

    @Override // l.AbstractC12824, l.InterfaceC12783
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo31749() {
        return (C1493) super.mo31749();
    }

    @Override // l.AbstractC12824, l.InterfaceC12783
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC17721 mo31754() {
        return (C2549) super.mo31754();
    }

    @Override // l.AbstractC12824, l.InterfaceC12783
    public final InterfaceC19133 getType() {
        return (C1138) super.getType();
    }
}
