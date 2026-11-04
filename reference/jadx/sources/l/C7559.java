package l;

/* JADX INFO: renamed from: l.۟֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7559 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        int iM34627 = ((C14270) c19929.m45858()).m34627();
        int[] iArr = (int[]) ((C14270) c19929.m45858()).m34634();
        byte[] bArr = (byte[]) ((C14270) c19929.m45858()).m34634();
        int i = iM34627 * 4;
        while (iM34627 < iArr.length) {
            int i2 = iArr[iM34627];
            int i3 = ~i2;
            bArr[i] = (byte) (i3 & 255);
            bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
            int i4 = i + 3;
            bArr[i + 2] = (byte) ((i3 >>> 16) & 255);
            i += 4;
            bArr[i4] = (byte) ((i2 >>> 24) & 255);
            iM34627++;
        }
    }
}
