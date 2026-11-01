package l;

/* JADX INFO: renamed from: l.ܺۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D4GD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15863 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20096 f51329;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20801 f51330 = null;

    public C15863(C20096 c20096) {
        this.f51329 = c20096;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m37746(int i, byte[] bArr) {
        bArr.getClass();
        if (this.f51330 == null) {
            this.f51330 = new C20801();
        }
        this.f51330.m46785(bArr);
        int i2 = i == 0 ? this.f51330.f67627 : i;
        C20801 c20801 = this.f51330;
        byte[] bArr2 = this.f51329.f65278;
        int i3 = c20801.f67627;
        int i4 = 0;
        int i5 = (i2 / i3) + (i2 % i3 > 0 ? 1 : 0);
        int i6 = i2 - ((i5 - 1) * i3);
        byte[] bArr3 = new byte[i5 * i3];
        int i7 = 0;
        for (int i8 = 1; i8 <= i5; i8++) {
            int i9 = c20801.f67627;
            byte[] bArr4 = new byte[i9];
            byte[] bArrDoFinal = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, i4, bArrDoFinal, i4, bArr2.length);
            int length = bArr2.length;
            bArrDoFinal[length] = (byte) (i8 / 16777216);
            bArrDoFinal[length + 1] = (byte) (i8 / 65536);
            bArrDoFinal[length + 2] = (byte) (i8 / 256);
            bArrDoFinal[length + 3] = (byte) i8;
            for (int i10 = 0; i10 < 1000; i10++) {
                bArrDoFinal = c20801.f67628.doFinal(bArrDoFinal);
                for (int i11 = 0; i11 < i9; i11++) {
                    bArr4[i11] = (byte) (bArr4[i11] ^ bArrDoFinal[i11]);
                }
            }
            i4 = 0;
            System.arraycopy(bArr4, 0, bArr3, i7, i9);
            i7 += i3;
        }
        if (i6 >= i3) {
            return bArr3;
        }
        byte[] bArr5 = new byte[i2];
        System.arraycopy(bArr3, i4, bArr5, i4, i2);
        return bArr5;
    }
}
