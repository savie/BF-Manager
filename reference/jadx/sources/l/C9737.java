package l;

/* JADX INFO: renamed from: l.ۡ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6HM */
/* JADX INFO: loaded from: classes4.dex */
public final class C9737 extends AbstractC15462 {
    @Override // l.AbstractC15462
    /* JADX INFO: renamed from: ۙ */
    public final void mo3186(C11975 c11975, int i, C12479 c12479) {
        int iM31000 = c12479.m31000();
        int iM30990 = c12479.m30990();
        int[] iArr = new int[iM31000];
        int[] iArr2 = new int[iM31000];
        for (int i2 = 0; i2 < iM31000; i2++) {
            iArr2[i2] = c12479.m30990();
            iArr[i2] = iM30990 + i2;
        }
        c11975.m30050(new C19968(iM31000, iArr, iArr2));
        c11975.m30063((iM31000 * 2) + 4);
    }

    @Override // l.AbstractC15462
    /* JADX INFO: renamed from: ۙ */
    public final void mo9837(C11975 c11975, C12479 c12479) {
        int iM31000 = c12479.m31000();
        c12479.m31012((iM31000 * 4) + 4);
        c11975.m30063((iM31000 * 2) + 4);
    }
}
