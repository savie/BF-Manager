package l;

/* JADX INFO: renamed from: l.ۗۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2986 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        int iM34486 = ((C14277) c15313.m36673()).m34486();
        byte[] bArr = (byte[]) ((C14277) c15313.m36673()).m34475();
        int[] iArr = (int[]) ((C14277) c15313.m36673()).m34475();
        int i = iM34486 * 4;
        while (iM34486 < iArr.length) {
            int i2 = ((bArr[i + 1] & 255) << 8) | ((~bArr[i]) & 255);
            int i3 = i + 3;
            int i4 = i2 | (((~bArr[i + 2]) & 255) << 16);
            i += 4;
            iArr[iM34486] = i4 | ((bArr[i3] & 255) << 24);
            iM34486++;
        }
    }
}
