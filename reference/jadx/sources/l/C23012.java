package l;

import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.᩺۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54WU */
/* JADX INFO: loaded from: classes.dex */
public class C23012 extends AbstractC12824 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12429 f74787;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C9177 f74788;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10672 f74789;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f74790;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f74791;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f74792;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74793;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f74794;

    static {
        ApplicationC6132.m17119(164);
    }

    public native C23012(C8195 c8195, C23718 c23718, C4356 c4356, C6753 c6753);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m50903(C3930 c3930);

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۤ */
    public final int mo31751() {
        return this.f74790;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۨ */
    public final String mo31752(int i) {
        int iM30896;
        int iM26883 = this.f74789.m26883(i);
        if (iM26883 == -1) {
            return null;
        }
        int i2 = this.f74792 + iM26883;
        C12429 c12429 = this.f74787;
        if ((c12429.m30889(i2 + 2) & 8) != 0) {
            iM30896 = c12429.m30898(i2);
        } else {
            iM30896 = c12429.m30896(i2 + 4);
        }
        try {
            return ((C18072) ((C18778) super.mo31754()).m43336()).f57793.m10939(iM30896);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC3609 mo31753(int i) {
        int i2;
        int iM26883 = this.f74789.m26883(i);
        if (iM26883 == -1 || (i2 = iM26883 + this.f74792) < 0) {
            return null;
        }
        C12429 c12429 = this.f74787;
        if (c12429.m30890(i2) < 8) {
            return null;
        }
        C23718 c23718M30888 = c12429.m30888(i2);
        C15251 c15251 = new C15251(this, i, c23718M30888);
        c12429.m30892(c23718M30888);
        return c15251;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo31756(int i) {
        int i2;
        int iM52225;
        int iM26883 = this.f74789.m26883(i);
        if (iM26883 != -1 && (i2 = iM26883 + this.f74792) >= 0) {
            C12429 c12429 = this.f74787;
            if (c12429.m30890(i2) >= 8) {
                C9177 c9177 = this.f74788;
                byte bM23611 = c9177.m23611(i);
                if (bM23611 == 0) {
                    C23718 c23718M30888 = c12429.m30888(i2);
                    C18778 c18778 = (C18778) super.mo31754();
                    if (c23718M30888.m52227() < 8) {
                        bM23611 = 2;
                    } else {
                        int iM52224 = c23718M30888.m52224();
                        short sM52230 = c23718M30888.m52230();
                        int iM52226 = c23718M30888.m52225();
                        boolean z = (sM52230 & 8) != 0;
                        boolean z2 = (sM52230 & 1) != 0;
                        if (z) {
                            if (iM52224 < 0 || iM52224 >= ((C18072) c18778.m43336()).f57793.size()) {
                                bM23611 = 2;
                            } else {
                                bM23611 = 1;
                            }
                        } else {
                            if (iM52226 >= 0 && iM52226 < ((C18072) c18778.m43336()).f57793.size()) {
                                if (z2) {
                                    c23718M30888.m52233();
                                    iM52225 = c23718M30888.m52225();
                                    if (iM52225 != -1) {
                                    }
                                } else {
                                    iM52225 = 1;
                                }
                                if (!z2 ? c23718M30888.m52227() >= iM52225 * 8 : c23718M30888.m52227() >= iM52225 * 12) {
                                    int size = c18778.mo7938().mo5139().size();
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < iM52225) {
                                            if (z2) {
                                                c23718M30888.m52233();
                                            }
                                            c23718M30888.m52226(2);
                                            c23718M30888.m52231();
                                            byte bM52231 = c23718M30888.m52231();
                                            int iM52227 = c23718M30888.m52225();
                                            if (C8550.m22299(bM52231) && (bM52231 != 3 || (iM52227 >= 0 && iM52227 < size))) {
                                                i3++;
                                            }
                                        } else {
                                            bM23611 = 1;
                                        }
                                    }
                                }
                            }
                            bM23611 = 2;
                        }
                    }
                    c12429.m30892(c23718M30888);
                    c9177.mo9046(bM23611, i);
                }
                if (bM23611 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۡۙ */
    public final boolean mo31750() {
        return this.f74791;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۘܰ */
    public final boolean mo31748() {
        return this.f74794;
    }

    @Override // l.AbstractC12824, l.InterfaceC12783
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6432 mo31749() {
        return (C8901) super.mo31749();
    }

    @Override // l.AbstractC12824, l.InterfaceC12783
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC17721 mo31754() {
        return (C18778) super.mo31754();
    }

    @Override // l.AbstractC12824, l.InterfaceC12783
    public final InterfaceC19133 getType() {
        return (C8195) super.getType();
    }
}
