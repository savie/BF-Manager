package l;

/* JADX INFO: renamed from: l.ۙۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4480 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        int iM34486 = ((C14277) c15313.m36673()).m34486();
        int[] iArr = (int[]) ((C14277) c15313.m36673()).m34475();
        byte[] bArr = (byte[]) ((C14277) c15313.m36673()).m34475();
        int i = iM34486 * 4;
        while (iM34486 < iArr.length) {
            int i2 = iArr[iM34486];
            int i3 = ~i2;
            bArr[i] = (byte) (i3 & 255);
            bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
            int i4 = i + 3;
            bArr[i + 2] = (byte) ((i3 >>> 16) & 255);
            i += 4;
            bArr[i4] = (byte) ((i2 >>> 24) & 255);
            iM34486++;
        }
    }
}
