package l;

/* JADX INFO: renamed from: l.ۘۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3690 extends AbstractC5102 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC8631 f13465;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1843 f13466;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22036 f13467;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C22036 f13468;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12864 f13469;

    public C3690(C1843 c1843, AbstractC8631 abstractC8631, int i, int i2, int i3) {
        super(i3);
        this.f13467 = new C22036(this);
        this.f13468 = new C22036(this);
        this.f13466 = c1843;
        this.f13465 = abstractC8631;
        this.f13469 = new C12864(this, i, i2);
        mo10858();
    }

    @Override // l.AbstractC5102
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10858() {
        super.mo10858();
        this.f13469.m31906();
        this.f13467.mo17716();
        this.f13468.mo17716();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m10859() {
        return this.f17788[0] == -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m10860() throws C19838 {
        int i;
        int iM48949;
        C1843 c1843 = this.f13466;
        c1843.m5996();
        while (true) {
            boolean zM6005 = c1843.m6005();
            AbstractC8631 abstractC8631 = this.f13465;
            if (zM6005) {
                int iM5997 = c1843.m5997() & this.f17782;
                short[][] sArr = this.f17778;
                C19214 c19214 = this.f17786;
                if (abstractC8631.m22426(sArr[c19214.m44132()], iM5997) == 0) {
                    this.f13469.m31905();
                } else {
                    int iM22426 = abstractC8631.m22426(this.f17781, c19214.m44132());
                    int iM489410 = 1;
                    int[] iArr = this.f17788;
                    if (iM22426 == 0) {
                        c19214.m44137();
                        iArr[3] = iArr[2];
                        iArr[2] = iArr[1];
                        iArr[1] = iArr[0];
                        iM48949 = this.f13467.m48949(iM5997);
                        int iM22427 = abstractC8631.m22427(this.f17785[iM48949 < 6 ? iM48949 - 2 : 3]);
                        if (iM22427 < 4) {
                            iArr[0] = iM22427;
                        } else {
                            int i2 = iM22427 >> 1;
                            int i3 = (2 | (iM22427 & 1)) << (i2 - 1);
                            iArr[0] = i3;
                            if (iM22427 < 14) {
                                short[] sArr2 = this.f17783[iM22427 - 4];
                                int i4 = 1;
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    int iM22428 = abstractC8631.m22426(sArr2, i4);
                                    i4 = (i4 << 1) | iM22428;
                                    int i7 = i6 + 1;
                                    i5 |= iM22428 << i6;
                                    if (i4 >= sArr2.length) {
                                        break;
                                    } else {
                                        i6 = i7;
                                    }
                                }
                                iArr[0] = i3 | i5;
                            } else {
                                int iM22425 = i3 | (abstractC8631.m22425(i2 - 5) << 4);
                                iArr[0] = iM22425;
                                int i8 = 1;
                                int i9 = 0;
                                int i10 = 0;
                                while (true) {
                                    short[] sArr3 = this.f17780;
                                    int iM22429 = abstractC8631.m22426(sArr3, i8);
                                    i8 = (i8 << 1) | iM22429;
                                    int i11 = i10 + 1;
                                    i9 |= iM22429 << i10;
                                    if (i8 >= sArr3.length) {
                                        break;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                iArr[0] = iM22425 | i9;
                            }
                        }
                    } else {
                        if (abstractC8631.m22426(this.f17787, c19214.m44132()) == 0) {
                            if (abstractC8631.m22426(this.f17777[c19214.m44132()], iM5997) == 0) {
                                c19214.m44130();
                            }
                            iM48949 = iM489410;
                        } else {
                            if (abstractC8631.m22426(this.f17784, c19214.m44132()) == 0) {
                                i = iArr[1];
                            } else {
                                if (abstractC8631.m22426(this.f17779, c19214.m44132()) == 0) {
                                    i = iArr[2];
                                } else {
                                    i = iArr[3];
                                    iArr[3] = iArr[2];
                                }
                                iArr[2] = iArr[1];
                            }
                            iArr[1] = iArr[0];
                            iArr[0] = i;
                        }
                        c19214.m44134();
                        iM489410 = this.f13468.m48949(iM5997);
                        iM48949 = iM489410;
                    }
                    c1843.m6001(iArr[0], iM48949);
                }
            } else {
                abstractC8631.mo19186();
                return;
            }
        }
    }
}
