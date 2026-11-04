package l;

import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۛ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53T */
/* JADX INFO: loaded from: classes3.dex */
public final class C6396 extends AbstractC11154 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final short f21590;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f21591;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9377[] f21592;

    public C6396(C12361 c12361, int i, C16618 c16618) {
        super(c12361, i);
        int iM39311 = c16618.m39311();
        short sM39313 = c16618.m39313();
        this.f21590 = sM39313;
        int iM39316 = c16618.m39316();
        if (mo18151()) {
            this.f21592 = new C9377[]{new C9377(this, (byte) ((sM39313 >> 8) & 255), iM39316)};
        } else {
            if (mo18155()) {
                this.f35130 = c16618.m39316();
                int iMax = Math.max(c16618.m39316(), 0);
                this.f21592 = new C9377[iMax];
                for (int i2 = 0; i2 < iMax; i2++) {
                    this.f21592[i2] = new C9377(this, i2, c16618.m39316(), c16618);
                }
            } else {
                this.f21592 = new C9377[]{new C9377(this, 0, -1, c16618)};
            }
            iM39311 = iM39316;
        }
        this.f21591 = iM39311;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18149(C16618 c16618, C7887 c7887) {
        int iM39316;
        if (c16618.m39305() >= 8) {
            int iM39311 = c16618.m39311();
            short sM39313 = c16618.m39313();
            int iM39317 = c16618.m39316();
            boolean z = (sM39313 & 8) != 0;
            boolean z2 = (sM39313 & 1) != 0;
            if (z) {
                if (iM39311 >= 0 && iM39311 < c7887.m21426().size()) {
                    return true;
                }
            } else if (iM39317 >= 0 && iM39317 < c7887.m21426().size()) {
                if (z2) {
                    c16618.m39308();
                    iM39316 = c16618.m39316();
                    if (iM39316 != -1) {
                    }
                } else {
                    iM39316 = 1;
                }
                if (!z2 ? c16618.m39305() >= iM39316 * 8 : c16618.m39305() >= iM39316 * 12) {
                    int size = c7887.mo21425().mo15675().size();
                    for (int i = 0; i < iM39316; i++) {
                        if (z2) {
                            c16618.m39308();
                        }
                        c16618.m39317(2);
                        c16618.m39309();
                        byte bM39309 = c16618.m39309();
                        int iM39318 = c16618.m39316();
                        if (C13107.m32571(bM39309) && (bM39309 != 3 || (iM39318 >= 0 && iM39318 < size))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC8697
    public final InterfaceC5650 getValue() {
        return this.f21592[0];
    }

    @Override // l.InterfaceC8697
    public final InterfaceC5650 getValue(int i) {
        return this.f21592[i];
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int mo18154() {
        return this.f21592.length;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo18155() {
        return (this.f21590 & 1) != 0;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo18152() {
        return (this.f21590 & 2) != 0;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo18157() {
        return (this.f21590 & 4) != 0;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean mo18151() {
        return (this.f21590 & 8) != 0;
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 mo18150() {
        return (C24296) super.mo18150();
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10869 mo18153() {
        return (C7887) super.mo18153();
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final String mo18156() {
        try {
            return (String) ((C7887) super.mo18153()).m21426().get(this.f21591);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    public final InterfaceC15344 getType() {
        return (C1175) super.getType();
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2731 mo18158() {
        return (C12361) super.mo18158();
    }
}
