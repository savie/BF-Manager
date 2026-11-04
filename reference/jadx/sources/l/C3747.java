package l;

/* JADX INFO: renamed from: l.ۗ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3747 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23885 f12845;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12171 f12846;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f12847;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9757 f12848;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f12849;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f12850;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5985 f12851;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11995 f12852;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f12853 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7697 m12175(C9757 c9757, C11995 c11995, int i, C16646 c16646) {
        C22438 c22438M36044;
        int i2;
        C3747 c3747 = new C3747(c9757, c11995, i, c16646);
        C14978 c14978M25432 = c9757.m25432();
        int size = c14978M25432.size();
        int iM37668 = c14978M25432.m37668();
        int[] iArrM14321 = C4560.m14321(iM37668);
        int[] iArrM14322 = C4560.m14321(iM37668);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C4560.m14326(c14978M25432.m31620get(i4).mo31292(), iArrM14321);
        }
        int[] iArr = new int[size];
        int iM25434 = c9757.m25434();
        int i5 = 0;
        while (iM25434 != -1) {
            while (true) {
                C24698 c24698M25433 = c9757.m25433(iM25434);
                int size2 = c24698M25433.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        break;
                    }
                    i2 = c24698M25433.get(i6);
                    if (C4560.m14322(i2, iArrM14322)) {
                        break;
                    }
                    if (C4560.m14322(i2, iArrM14321) && c14978M25432.m36044(i2).m50593() == iM25434) {
                        break;
                    }
                    i6++;
                }
                C4560.m14326(i2, iArrM14322);
                iM25434 = i2;
            }
            while (iM25434 != -1) {
                C4560.m14320(iM25434, iArrM14321);
                C4560.m14320(iM25434, iArrM14322);
                iArr[i5] = iM25434;
                i5++;
                C22438 c22438M36045 = c14978M25432.m36044(iM25434);
                int iM50593 = c22438M36045.m50593();
                C24698 c24698M50590 = c22438M36045.m50590();
                int size3 = c24698M50590.size();
                if (size3 == 0) {
                    c22438M36044 = null;
                } else if (size3 != 1 && iM50593 != -1) {
                    c22438M36044 = c14978M25432.m36044(iM50593);
                } else {
                    c22438M36044 = c14978M25432.m36044(c24698M50590.get(0));
                }
                if (c22438M36044 == null) {
                    break;
                }
                int iMo31292 = c22438M36044.mo31292();
                int iM50594 = c22438M36045.m50593();
                if (C4560.m14322(iMo31292, iArrM14321)) {
                    iM25434 = iMo31292;
                } else if (iM50594 == iMo31292 || iM50594 < 0 || !C4560.m14322(iM50594, iArrM14321)) {
                    C24698 c24698M50591 = c22438M36045.m50590();
                    int size4 = c24698M50591.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            iM25434 = -1;
                            break;
                        }
                        int i8 = c24698M50591.get(i7);
                        if (C4560.m14322(i8, iArrM14321)) {
                            iM25434 = i8;
                            break;
                        }
                        i7++;
                    }
                } else {
                    iM25434 = iM50594;
                }
            }
            iM25434 = C4560.m14323(0, iArrM14321);
        }
        if (i5 != size) {
            throw new RuntimeException("shouldn't happen");
        }
        c3747.f12853 = iArr;
        C14978 c14978M25433 = c9757.m25432();
        int[] iArr2 = c3747.f12853;
        int length = iArr2.length;
        while (true) {
            C5985 c5985 = c3747.f12851;
            C12171 c12171 = c3747.f12846;
            if (i3 >= length) {
                return new C7697(c5985.m17412(), new C12696(c9757, c3747.f12853, c12171));
            }
            int i9 = i3 + 1;
            int i10 = i9 == iArr2.length ? -1 : iArr2[i9];
            C22438 c22438M36046 = c14978M25433.m36044(iArr2[i3]);
            C21122 c21122M30438 = c12171.m30438(c22438M36046);
            c5985.m17414((AbstractC18884) c21122M30438);
            C11995 c11996 = c3747.f12852;
            if (c11996 != null) {
                c5985.m17414(new C23139(c21122M30438.m43799(), c11996.m30149(c22438M36046)));
            }
            C21122 c21122M30439 = c12171.m30439(c22438M36046);
            C23885 c23885 = c3747.f12845;
            c23885.m53386(c22438M36046, c21122M30439);
            c22438M36046.m50596().m37630(c23885);
            c5985.m17414((AbstractC18884) c12171.m30437(c22438M36046));
            int iM50595 = c22438M36046.m50593();
            AbstractC17216 abstractC17216M50594 = c22438M36046.m50594();
            if (iM50595 >= 0 && iM50595 != i10) {
                if (abstractC17216M50594.m40434().m43508() == 4 && c22438M36046.m50592() == i10) {
                    c5985.m17415(c12171.m30436(iM50595));
                } else {
                    c5985.m17414(new C24631(C9187.f29815, abstractC17216M50594.m40433(), C0063.f947, c12171.m30436(iM50595)));
                }
            }
            i3 = i9;
        }
    }

    public C3747(C9757 c9757, C11995 c11995, int i, C16646 c16646) {
        this.f12848 = c9757;
        this.f12852 = c11995;
        this.f12846 = new C12171(c9757);
        this.f12850 = i;
        boolean[] zArr = {true};
        c9757.m25432().m36042(new C17917(zArr, c9757.m25432().m36043(), i));
        boolean z = zArr[0];
        this.f12849 = z;
        C14978 c14978M25432 = c9757.m25432();
        int size = c14978M25432.size();
        int i2 = size * 3;
        int iM36045 = c14978M25432.m36045() + i2;
        int iM30153 = c11995 != null ? iM36045 + c11995.m30153() + size : iM36045;
        int iM36043 = c14978M25432.m36043() + (z ? 0 : i);
        this.f12847 = iM36043;
        C5985 c5985 = new C5985(c16646, iM30153, i2, iM36043, i);
        this.f12851 = c5985;
        if (c11995 != null) {
            this.f12845 = new C16425(this, c5985, c11995);
        } else {
            this.f12845 = new C23885(this, c5985);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0063 m12173(AbstractC17216 abstractC17216) {
        return m12179(abstractC17216, abstractC17216.m40437());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C0063 m12179(AbstractC17216 abstractC17216, C20946 c20946) {
        C0063 c0063M40438 = abstractC17216.m40438();
        if (abstractC17216.m40434().m43503() && c0063M40438.size() == 2 && c20946.m47903() == c0063M40438.m31619get(1).m47903()) {
            c0063M40438 = C0063.m1031(c0063M40438.m31619get(1), c0063M40438.m31619get(0));
        }
        return c20946 == null ? c0063M40438 : c0063M40438.m1036(c20946);
    }
}
