package l;

import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۜ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54WU */
/* JADX INFO: loaded from: classes.dex */
public class C7141 extends AbstractC22343 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23612;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15399 f23613;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f23614;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f23615;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f23616;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C1516 f23617;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC21094 f23618;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f23619;

    static {
        ApplicationC23172.m52091(75);
    }

    public native C7141(C22586 c22586, C16618 c16618, C9311 c9311, C23308 c23308);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m19707(C15848 c15848);

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۛ */
    public final int mo9069() {
        return this.f23615;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۤ */
    public final String mo9070(int i) {
        int iMo10513;
        int iM36868 = this.f23613.m36868(i, -1);
        if (iM36868 == -1) {
            return null;
        }
        int i2 = this.f23612 + iM36868;
        AbstractC21094 abstractC21094 = this.f23618;
        if ((abstractC21094.mo10518(i2 + 2) & 8) != 0) {
            iMo10513 = abstractC21094.mo10514(i2);
        } else {
            iMo10513 = abstractC21094.mo10513(i2 + 4);
        }
        try {
            return (String) ((C10651) super.mo9071()).m27153().get(iMo10513);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo9075(int i) {
        int i2;
        int iM39316;
        int iM36868 = this.f23613.m36868(i, -1);
        if (iM36868 != -1 && (i2 = iM36868 + this.f23612) >= 0) {
            AbstractC21094 abstractC21094 = this.f23618;
            if (abstractC21094.m48154(i2) >= 8) {
                C1516 c1516 = this.f23617;
                byte bM5393 = c1516.m5393(i);
                if (bM5393 == 0) {
                    C16618 c16618M48157 = abstractC21094.m48157(i2);
                    C10651 c10651 = (C10651) super.mo9071();
                    if (c16618M48157.m39305() < 8) {
                        bM5393 = 2;
                    } else {
                        int iM39311 = c16618M48157.m39311();
                        short sM39313 = c16618M48157.m39313();
                        int iM39317 = c16618M48157.m39316();
                        boolean z = (sM39313 & 8) != 0;
                        boolean z2 = (sM39313 & 1) != 0;
                        if (z) {
                            if (iM39311 < 0 || iM39311 >= c10651.m27153().size()) {
                                bM5393 = 2;
                            } else {
                                bM5393 = 1;
                            }
                        } else {
                            if (iM39317 >= 0 && iM39317 < c10651.m27153().size()) {
                                if (z2) {
                                    c16618M48157.m39308();
                                    iM39316 = c16618M48157.m39316();
                                    if (iM39316 != -1) {
                                    }
                                } else {
                                    iM39316 = 1;
                                }
                                if (!z2 ? c16618M48157.m39305() >= iM39316 * 8 : c16618M48157.m39305() >= iM39316 * 12) {
                                    int size = c10651.mo21425().mo15675().size();
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < iM39316) {
                                            if (z2) {
                                                c16618M48157.m39308();
                                            }
                                            c16618M48157.m39317(2);
                                            c16618M48157.m39309();
                                            byte bM39309 = c16618M48157.m39309();
                                            int iM39318 = c16618M48157.m39316();
                                            if (C13107.m32571(bM39309) && (bM39309 != 3 || (iM39318 >= 0 && iM39318 < size))) {
                                                i3++;
                                            }
                                        } else {
                                            bM5393 = 1;
                                        }
                                    }
                                }
                            }
                            bM5393 = 2;
                        }
                    }
                    abstractC21094.m48156(c16618M48157);
                    c1516.mo5390(bM5393, i);
                }
                if (bM5393 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC8697 mo9076(int i) {
        int i2;
        int iM36868 = this.f23613.m36868(i, -1);
        if (iM36868 == -1 || (i2 = iM36868 + this.f23612) < 0) {
            return null;
        }
        AbstractC21094 abstractC21094 = this.f23618;
        if (abstractC21094.m48154(i2) < 8) {
            return null;
        }
        C16618 c16618M48157 = abstractC21094.m48157(i2);
        C13852 c13852 = new C13852(this, i, c16618M48157);
        abstractC21094.m48156(c16618M48157);
        return c13852;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۨۙ */
    public final boolean mo9072() {
        return this.f23614;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ֫᩷ */
    public final boolean mo9067() {
        return this.f23616;
    }

    @Override // l.AbstractC22343, l.InterfaceC2731
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7206 mo9068() {
        return (C15126) super.mo9068();
    }

    @Override // l.AbstractC22343, l.InterfaceC2731
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC10869 mo9071() {
        return (C10651) super.mo9071();
    }

    @Override // l.AbstractC22343, l.InterfaceC2731
    public final InterfaceC15344 getType() {
        return (C22586) super.getType();
    }
}
