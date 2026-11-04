package l;

/* JADX INFO: renamed from: l.֨ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97UZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1092 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f3895;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f3897;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f3899;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f3896 = 255;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f3898 = 0;

    public final Object clone() {
        C1092 c1092 = (C1092) super.clone();
        byte[] bArr = c1092.f3899;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c1092.f3899 = bArr2;
        }
        byte[] bArr3 = c1092.f3895;
        if (bArr3 != null) {
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            c1092.f3895 = bArr4;
        }
        byte[] bArr5 = c1092.f3897;
        if (bArr5 != null) {
            int length3 = bArr5.length;
            byte[] bArr6 = new byte[length3];
            System.arraycopy(bArr5, 0, bArr6, 0, length3);
            c1092.f3897 = bArr6;
        }
        return c1092;
    }
}
