package l;

import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.۬۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53T */
/* JADX INFO: loaded from: classes4.dex */
public final class C13852 extends AbstractC11154 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final short f43949;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f43950;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19602[] f43951;

    public C13852(C7141 c7141, int i, C16618 c16618) {
        super(c7141, i);
        int iM39311 = c16618.m39311();
        short sM39313 = c16618.m39313();
        this.f43949 = sM39313;
        int iM39316 = c16618.m39316();
        if (mo18151()) {
            this.f43951 = new C19602[]{new C19602(this, (byte) ((sM39313 >> 8) & 255), iM39316)};
        } else {
            if (mo18155()) {
                this.f35130 = c16618.m39316();
                int iMax = Math.max(c16618.m39316(), 0);
                this.f43951 = new C19602[iMax];
                for (int i2 = 0; i2 < iMax; i2++) {
                    this.f43951[i2] = new C19602(this, i2, c16618.m39316(), c16618);
                }
            } else {
                this.f43951 = new C19602[]{new C19602(this, 0, -1, c16618)};
            }
            iM39311 = iM39316;
        }
        this.f43950 = iM39311;
    }

    @Override // l.InterfaceC8697
    public final InterfaceC5650 getValue() {
        return this.f43951[0];
    }

    @Override // l.InterfaceC8697
    public final InterfaceC5650 getValue(int i) {
        return this.f43951[i];
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۤۙ */
    public final int mo18154() {
        return this.f43951.length;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۫ۙ */
    public final boolean mo18155() {
        return (this.f43949 & 1) != 0;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۡۙ */
    public final boolean mo18152() {
        return (this.f43949 & 2) != 0;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo18157() {
        return (this.f43949 & 4) != 0;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo18151() {
        return (this.f43949 & 8) != 0;
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7206 mo18150() {
        return (C15126) super.mo18150();
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC10869 mo18153() {
        return (C10651) super.mo18153();
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۬ۙ */
    public final String mo18156() {
        try {
            return (String) ((C10651) super.mo18153()).m27153().get(this.f43950);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    public final InterfaceC15344 getType() {
        return (C22586) super.getType();
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC2731 mo18158() {
        return (C7141) super.mo18158();
    }
}
