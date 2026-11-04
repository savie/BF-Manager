package l;

/* JADX INFO: renamed from: l.ۜ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6HM */
/* JADX INFO: loaded from: classes4.dex */
public final class C7501 extends AbstractC15462 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [long[]] */
    @Override // l.AbstractC15462
    /* JADX INFO: renamed from: ۙ */
    public final void mo3186(C11975 c11975, int i, C12479 c12479) {
        short[] sArrM30983;
        int iM31000 = c12479.m31000();
        int iM30990 = c12479.m30990();
        int i2 = 0;
        if (iM31000 == 0) {
            sArrM30983 = new byte[0];
        } else if (iM31000 == 1) {
            sArrM30983 = c12479.m30983(iM30990);
            if (iM30990 % 2 != 0) {
                c12479.m31002();
            }
        } else if (iM31000 == 2) {
            sArrM30983 = new short[iM30990];
            while (i2 < iM30990) {
                sArrM30983[i2] = (short) c12479.m30994();
                i2++;
            }
        } else if (iM31000 == 4) {
            sArrM30983 = new int[iM30990];
            while (i2 < iM30990) {
                sArrM30983[i2] = c12479.m30990();
                i2++;
            }
        } else {
            if (iM31000 != 8) {
                throw new C13817(C13645.m33382(iM31000, "Unexpected element size in FILL_ARRAY_DATA_PAYLOAD: "));
            }
            sArrM30983 = new long[iM30990];
            while (i2 < iM30990) {
                sArrM30983[i2] = c12479.m30982();
                i2++;
            }
        }
        c11975.m30063((((iM30990 * iM31000) + 1) / 2) + 4);
        c11975.m30050(new C5768(iM30990, iM31000, sArrM30983));
    }

    @Override // l.AbstractC15462
    /* JADX INFO: renamed from: ۙ */
    public final void mo9837(C11975 c11975, C12479 c12479) {
        int iM31000 = c12479.m31000();
        int iM30990 = c12479.m30990();
        if (iM31000 == 1) {
            c12479.m31012((iM30990 % 2) + iM30990);
        } else {
            c12479.m31012(iM30990 * iM31000);
        }
        c11975.m30063((((iM30990 * iM31000) + 1) / 2) + 4);
    }
}
