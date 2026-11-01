package l;

/* JADX INFO: renamed from: l.ᩴᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97UZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18927 implements Cloneable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f61241;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f61242;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f61243;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f61240 = 255;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f61239 = 0;

    public final Object clone() {
        C18927 c18927 = (C18927) super.clone();
        byte[] bArr = c18927.f61243;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            c18927.f61243 = bArr2;
        }
        byte[] bArr3 = c18927.f61242;
        if (bArr3 != null) {
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            c18927.f61242 = bArr4;
        }
        byte[] bArr5 = c18927.f61241;
        if (bArr5 != null) {
            int length3 = bArr5.length;
            byte[] bArr6 = new byte[length3];
            System.arraycopy(bArr5, 0, bArr6, 0, length3);
            c18927.f61241 = bArr6;
        }
        return c18927;
    }
}
