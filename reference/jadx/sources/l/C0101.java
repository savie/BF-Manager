package l;

/* JADX INFO: renamed from: l.֡֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0101 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1200(C19929 c19929) {
        int iM34627 = ((C14270) c19929.m45858()).m34627();
        byte[] bArr = (byte[]) ((C14270) c19929.m45858()).m34634();
        int[] iArr = (int[]) ((C14270) c19929.m45858()).m34634();
        int i = iM34627 * 4;
        while (iM34627 < iArr.length) {
            int i2 = ((bArr[i + 1] & 255) << 8) | ((~bArr[i]) & 255);
            int i3 = i + 3;
            int i4 = i2 | (((~bArr[i + 2]) & 255) << 16);
            i += 4;
            iArr[iM34627] = i4 | ((bArr[i3] & 255) << 24);
            iM34627++;
        }
    }
}
