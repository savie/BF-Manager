package l;

/* JADX INFO: renamed from: l.ۘ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4478 extends AbstractC20886 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC9697 f16017;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C11935 f16018;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C24616 f16019;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C12681 f16020;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12681 f16021;

    public C4478(C11935 c11935, AbstractC9697 abstractC9697, int i, int i2, int i3) {
        super(i3);
        this.f16021 = new C12681(this);
        this.f16020 = new C12681(this);
        this.f16018 = c11935;
        this.f16017 = abstractC9697;
        this.f16019 = new C24616(this, i, i2);
        mo3090();
    }

    @Override // l.AbstractC20886
    /* JADX INFO: renamed from: ۙ */
    public final void mo3090() {
        super.mo3090();
        this.f16019.m54945();
        this.f16021.mo35895();
        this.f16020.mo35895();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m14182() {
        return this.f66852[0] == -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14183() throws C13996 {
        int i;
        int iM31476;
        C11935 c11935 = this.f16018;
        c11935.m29905();
        while (true) {
            boolean zM29901 = c11935.m29901();
            AbstractC9697 abstractC9697 = this.f16017;
            if (zM29901) {
                int iM29894 = c11935.m29894() & this.f66845;
                short[][] sArr = this.f66851;
                C1495 c1495 = this.f66848;
                if (abstractC9697.m25289(sArr[c1495.m5322()], iM29894) == 0) {
                    this.f16019.m54944();
                } else {
                    int iM25289 = abstractC9697.m25289(this.f66849, c1495.m5322());
                    int iM31477 = 1;
                    int[] iArr = this.f66852;
                    if (iM25289 == 0) {
                        c1495.m5326();
                        iArr[3] = iArr[2];
                        iArr[2] = iArr[1];
                        iArr[1] = iArr[0];
                        iM31476 = this.f16021.m31476(iM29894);
                        int iM25291 = abstractC9697.m25291(this.f66850[iM31476 < 6 ? iM31476 - 2 : 3]);
                        if (iM25291 < 4) {
                            iArr[0] = iM25291;
                        } else {
                            int i2 = iM25291 >> 1;
                            int i3 = (2 | (iM25291 & 1)) << (i2 - 1);
                            iArr[0] = i3;
                            if (iM25291 < 14) {
                                short[] sArr2 = this.f66844[iM25291 - 4];
                                int i4 = 1;
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    int iM252810 = abstractC9697.m25289(sArr2, i4);
                                    i4 = (i4 << 1) | iM252810;
                                    int i7 = i6 + 1;
                                    i5 |= iM252810 << i6;
                                    if (i4 >= sArr2.length) {
                                        break;
                                    } else {
                                        i6 = i7;
                                    }
                                }
                                iArr[0] = i3 | i5;
                            } else {
                                int iM25290 = i3 | (abstractC9697.m25290(i2 - 5) << 4);
                                iArr[0] = iM25290;
                                int i8 = 1;
                                int i9 = 0;
                                int i10 = 0;
                                while (true) {
                                    short[] sArr3 = this.f66842;
                                    int iM252811 = abstractC9697.m25289(sArr3, i8);
                                    i8 = (i8 << 1) | iM252811;
                                    int i11 = i10 + 1;
                                    i9 |= iM252811 << i10;
                                    if (i8 >= sArr3.length) {
                                        break;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                iArr[0] = iM25290 | i9;
                            }
                        }
                    } else {
                        if (abstractC9697.m25289(this.f66847, c1495.m5322()) == 0) {
                            if (abstractC9697.m25289(this.f66846[c1495.m5322()], iM29894) == 0) {
                                c1495.m5325();
                            }
                            iM31476 = iM31477;
                        } else {
                            if (abstractC9697.m25289(this.f66843, c1495.m5322()) == 0) {
                                i = iArr[1];
                            } else {
                                if (abstractC9697.m25289(this.f66841, c1495.m5322()) == 0) {
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
                        c1495.m5327();
                        iM31477 = this.f16020.m31476(iM29894);
                        iM31476 = iM31477;
                    }
                    c11935.m29898(iArr[0], iM31476);
                }
            } else {
                abstractC9697.mo9706();
                return;
            }
        }
    }
}
