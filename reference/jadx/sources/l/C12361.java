package l;

import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۨ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54WU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12361 extends AbstractC22343 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f39704;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15399 f39705;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f39706;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f39707;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f39708;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C1516 f39709;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC21094 f39710;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f39711;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12361(C1175 c1175, C16618 c16618, C9311 c9311) {
        super(c1175);
        int i = c9311.f30251;
        this.f39705 = new C15399();
        this.f39709 = new C1516();
        this.f39704 = new Object();
        this.f39710 = c16618.f53739;
        int iM39312 = c16618.m39312();
        c16618.m39317(2);
        int i2 = 0;
        boolean z = (iM39312 & 1) != 0;
        this.f39706 = z;
        boolean z2 = (iM39312 & 2) != 0;
        this.f39708 = z2;
        int iM39316 = c16618.m39316();
        this.f39707 = c16618.m39316() + i;
        this.f72322 = C20500.m47001(c16618, ((C1175) super.getType()).mo4332().mo27606());
        c16618.m39310(i + c9311.f30252);
        int i3 = -1;
        if (z) {
            while (i2 < iM39316) {
                int iM39311 = c16618.m39311();
                this.f39705.mo20978(iM39311, c16618.m39311() * 4);
                if (iM39311 > i3) {
                    i3 = iM39311;
                }
                i2++;
            }
            this.f39711 = i3;
            return;
        }
        if (z2) {
            while (i2 < iM39316) {
                int iM39313 = c16618.m39311();
                if (iM39313 != 65535) {
                    this.f39705.mo20978(i2, iM39313 * 4);
                }
                i2++;
            }
            this.f39711 = iM39316 - 1;
            return;
        }
        while (i2 < iM39316) {
            int iM39317 = c16618.m39316();
            if (iM39317 != -1) {
                this.f39705.mo20978(i2, iM39317);
            }
            i2++;
        }
        this.f39711 = iM39316 - 1;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۛ */
    public final int mo9069() {
        return this.f39711;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۤ */
    public final String mo9070(int i) {
        int iMo10513;
        int iM36868 = this.f39705.m36868(i, -1);
        if (iM36868 == -1) {
            return null;
        }
        int i2 = this.f39707 + iM36868;
        AbstractC21094 abstractC21094 = this.f39710;
        if ((abstractC21094.mo10518(i2 + 2) & 8) != 0) {
            iMo10513 = abstractC21094.mo10514(i2);
        } else {
            iMo10513 = abstractC21094.mo10513(i2 + 4);
        }
        try {
            return (String) ((C7887) super.mo9071()).m21426().get(iMo10513);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo9075(int i) {
        int i2;
        boolean z;
        int iM36868 = this.f39705.m36868(i, -1);
        if (iM36868 == -1 || (i2 = this.f39707 + iM36868) < 0 || this.f39710.m48154(i2) < 8) {
            return false;
        }
        synchronized (this.f39704) {
            byte bM5393 = this.f39709.m5393(i);
            if (bM5393 == 0) {
                C16618 c16618M48157 = this.f39710.m48157(i2);
                bM5393 = C6396.m18149(c16618M48157, (C7887) super.mo9071()) ? (byte) 1 : (byte) 2;
                this.f39710.m48156(c16618M48157);
                this.f39709.mo5390(bM5393, i);
            }
            z = bM5393 == 1;
        }
        return z;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC8697 mo9076(int i) {
        int i2;
        int iM36868 = this.f39705.m36868(i, -1);
        if (iM36868 == -1 || (i2 = iM36868 + this.f39707) < 0) {
            return null;
        }
        AbstractC21094 abstractC21094 = this.f39710;
        if (abstractC21094.m48154(i2) < 8) {
            return null;
        }
        C16618 c16618M48157 = abstractC21094.m48157(i2);
        C6396 c6396 = new C6396(this, i, c16618M48157);
        abstractC21094.m48156(c16618M48157);
        return c6396;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۨۙ */
    public final boolean mo9072() {
        return this.f39706;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ֫᩷ */
    public final boolean mo9067() {
        return this.f39708;
    }

    @Override // l.AbstractC22343, l.InterfaceC2731
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7206 mo9068() {
        return (C24296) super.mo9068();
    }

    @Override // l.AbstractC22343, l.InterfaceC2731
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC10869 mo9071() {
        return (C7887) super.mo9071();
    }

    @Override // l.AbstractC22343, l.InterfaceC2731
    public final InterfaceC15344 getType() {
        return (C1175) super.getType();
    }
}
