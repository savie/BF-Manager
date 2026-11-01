package l;

/* JADX INFO: renamed from: l.ᩳ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18346 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f58514;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f58515 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C21874 f58516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7971 f58517;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C22580 f58518;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17661 f58519;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f58520;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19779 f58521;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f58522;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0209 m42599(C17661 c17661, C19779 c19779, int i, C6559 c6559) {
        C12018 c12018M15553;
        int i2;
        C18346 c18346 = new C18346(c17661, c19779, i, c6559);
        C5667 c5667M41141 = c17661.m41141();
        int size = c5667M41141.size();
        int iM36890 = c5667M41141.m36890();
        int[] iArrM24742 = C9754.m24742(iM36890);
        int[] iArrM24743 = C9754.m24742(iM36890);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C9754.m24734(c5667M41141.m15271get(i4).mo29913(), iArrM24742);
        }
        int[] iArr = new int[size];
        int iM41142 = c17661.m41142();
        int i5 = 0;
        while (iM41142 != -1) {
            while (true) {
                C4129 c4129M41140 = c17661.m41140(iM41142);
                int size2 = c4129M41140.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        break;
                    }
                    i2 = c4129M41140.get(i6);
                    if (C9754.m24744(i2, iArrM24743)) {
                        break;
                    }
                    if (C9754.m24744(i2, iArrM24742) && c5667M41141.m15553(i2).m29918() == iM41142) {
                        break;
                    }
                    i6++;
                }
                C9754.m24734(i2, iArrM24743);
                iM41142 = i2;
            }
            while (iM41142 != -1) {
                C9754.m24740(iM41142, iArrM24742);
                C9754.m24740(iM41142, iArrM24743);
                iArr[i5] = iM41142;
                i5++;
                C12018 c12018M15554 = c5667M41141.m15553(iM41142);
                int iM29918 = c12018M15554.m29918();
                C4129 c4129M29916 = c12018M15554.m29916();
                int size3 = c4129M29916.size();
                if (size3 == 0) {
                    c12018M15553 = null;
                } else if (size3 != 1 && iM29918 != -1) {
                    c12018M15553 = c5667M41141.m15553(iM29918);
                } else {
                    c12018M15553 = c5667M41141.m15553(c4129M29916.get(0));
                }
                if (c12018M15553 == null) {
                    break;
                }
                int iMo29913 = c12018M15553.mo29913();
                int iM29919 = c12018M15554.m29918();
                if (C9754.m24744(iMo29913, iArrM24742)) {
                    iM41142 = iMo29913;
                } else if (iM29919 == iMo29913 || iM29919 < 0 || !C9754.m24744(iM29919, iArrM24742)) {
                    C4129 c4129M29917 = c12018M15554.m29916();
                    int size4 = c4129M29917.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size4) {
                            iM41142 = -1;
                            break;
                        }
                        int i8 = c4129M29917.get(i7);
                        if (C9754.m24744(i8, iArrM24742)) {
                            iM41142 = i8;
                            break;
                        }
                        i7++;
                    }
                } else {
                    iM41142 = iM29919;
                }
            }
            iM41142 = C9754.m24745(0, iArrM24742);
        }
        if (i5 != size) {
            throw new RuntimeException("shouldn't happen");
        }
        c18346.f58515 = iArr;
        C5667 c5667M41142 = c17661.m41141();
        int[] iArr2 = c18346.f58515;
        int length = iArr2.length;
        while (true) {
            C22580 c22580 = c18346.f58518;
            C7971 c7971 = c18346.f58517;
            if (i3 >= length) {
                return new C0209(c22580.m50087(), new C8469(c17661, c18346.f58515, c7971));
            }
            int i9 = i3 + 1;
            int i10 = i9 == iArr2.length ? -1 : iArr2[i9];
            C12018 c12018M15555 = c5667M41142.m15553(iArr2[i3]);
            C20671 c20671M21029 = c7971.m21029(c12018M15555);
            c22580.m50089((AbstractC16438) c20671M21029);
            C19779 c197710 = c18346.f58521;
            if (c197710 != null) {
                c22580.m50089(new C14114(c20671M21029.m38701(), c197710.m44992(c12018M15555)));
            }
            C20671 c20671M21030 = c7971.m21030(c12018M15555);
            C21874 c21874 = c18346.f58516;
            c21874.m48657(c12018M15555, c20671M21030);
            c12018M15555.m29911().m48687(c21874);
            c22580.m50089((AbstractC16438) c7971.m21028(c12018M15555));
            int iM299110 = c12018M15555.m29918();
            AbstractC15546 abstractC15546M29914 = c12018M15555.m29914();
            if (iM299110 >= 0 && iM299110 != i10) {
                if (abstractC15546M29914.m37181().m31577() == 4 && c12018M15555.m29910() == i10) {
                    c22580.m50090(c7971.m21027(iM299110));
                } else {
                    c22580.m50089(new C9175(C5854.f19885, abstractC15546M29914.m37183(), C0727.f3015, c7971.m21027(iM299110)));
                }
            }
            i3 = i9;
        }
    }

    public C18346(C17661 c17661, C19779 c19779, int i, C6559 c6559) {
        this.f58519 = c17661;
        this.f58521 = c19779;
        this.f58517 = new C7971(c17661);
        this.f58522 = i;
        boolean[] zArr = {true};
        c17661.m41141().m15552(new C23286(zArr, c17661.m41141().m15555(), i));
        boolean z = zArr[0];
        this.f58514 = z;
        C5667 c5667M41141 = c17661.m41141();
        int size = c5667M41141.size();
        int i2 = size * 3;
        int iM15554 = c5667M41141.m15554() + i2;
        int iM44995 = c19779 != null ? iM15554 + c19779.m44995() + size : iM15554;
        int iM15555 = c5667M41141.m15555() + (z ? 0 : i);
        this.f58520 = iM15555;
        C22580 c22580 = new C22580(c6559, iM44995, i2, iM15555, i);
        this.f58518 = c22580;
        if (c19779 != null) {
            this.f58516 = new C15525(this, c22580, c19779);
        } else {
            this.f58516 = new C21874(this, c22580);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0727 m42600(AbstractC15546 abstractC15546) {
        return m42605(abstractC15546, abstractC15546.m37185());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C0727 m42605(AbstractC15546 abstractC15546, C16251 c16251) {
        C0727 c0727M37186 = abstractC15546.m37186();
        if (abstractC15546.m37181().m31576() && c0727M37186.size() == 2 && c16251.m38400() == c0727M37186.m15275get(1).m38400()) {
            c0727M37186 = C0727.m3149(c0727M37186.m15275get(1), c0727M37186.m15275get(0));
        }
        return c16251 == null ? c0727M37186 : c0727M37186.m3154(c16251);
    }
}
