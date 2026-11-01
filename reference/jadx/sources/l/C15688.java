package l;

/* JADX INFO: renamed from: l.ܺۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes4.dex */
public final class C15688 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f50929;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f50930;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String[] f50931;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f50932;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f50933;

    public C15688(C19921 c19921) {
        byte[] bArr = new byte[0];
        this.f50933 = bArr;
        this.f50930 = c19921.f63845.m51050();
        this.f50929 = new int[0];
        this.f50932 = new int[0];
        this.f50931 = new String[c19921.f63847.size()];
        System.arraycopy(c19921.f63846, 0, bArr, 0, 0);
        for (C20626 c20626 : c19921.f63848.values()) {
            int[] iArr = this.f50929;
            c20626.getClass();
            iArr[0] = 0;
            this.f50932[0] = 0;
        }
        c19921.f63847.toArray(this.f50931);
        for (Integer num : c19921.f63849) {
            int iIntValue = num.intValue();
            byte[] bArr2 = this.f50930;
            short s = (short) ((bArr2[iIntValue] & 255) | ((bArr2[iIntValue + 1] & 255) << 8));
            int iIntValue2 = num.intValue();
            ((C20626) c19921.f63848.get(Short.valueOf(s))).getClass();
            byte[] bArr3 = this.f50930;
            byte b = (byte) 0;
            bArr3[iIntValue2] = b;
            bArr3[iIntValue2 + 1] = b;
            bArr3[iIntValue2 + 2] = b;
            bArr3[iIntValue2 + 3] = b;
        }
    }

    public C15688(byte[] bArr, byte[] bArr2, int[] iArr, int[] iArr2, String[] strArr) {
        this.f50933 = bArr;
        this.f50930 = bArr2;
        this.f50929 = iArr;
        this.f50932 = iArr2;
        this.f50931 = strArr;
    }
}
