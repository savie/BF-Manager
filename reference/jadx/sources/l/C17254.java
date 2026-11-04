package l;

/* JADX INFO: renamed from: l.ܽ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes4.dex */
public final class C17254 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f56204;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f56205;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String[] f56206;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f56207;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f56208;

    public C17254(C15762 c15762) {
        byte[] bArr = new byte[0];
        this.f56207 = bArr;
        this.f56204 = c15762.f51306.m51664();
        this.f56208 = new int[0];
        this.f56205 = new int[0];
        this.f56206 = new String[c15762.f51304.size()];
        System.arraycopy(c15762.f51302, 0, bArr, 0, 0);
        for (C16508 c16508 : c15762.f51303.values()) {
            int[] iArr = this.f56208;
            c16508.getClass();
            iArr[0] = 0;
            this.f56205[0] = 0;
        }
        c15762.f51304.toArray(this.f56206);
        for (Integer num : c15762.f51305) {
            int iIntValue = num.intValue();
            byte[] bArr2 = this.f56204;
            short s = (short) ((bArr2[iIntValue] & 255) | ((bArr2[iIntValue + 1] & 255) << 8));
            int iIntValue2 = num.intValue();
            ((C16508) c15762.f51303.get(Short.valueOf(s))).getClass();
            byte[] bArr3 = this.f56204;
            byte b = (byte) 0;
            bArr3[iIntValue2] = b;
            bArr3[iIntValue2 + 1] = b;
            bArr3[iIntValue2 + 2] = b;
            bArr3[iIntValue2 + 3] = b;
        }
    }

    public C17254(byte[] bArr, byte[] bArr2, int[] iArr, int[] iArr2, String[] strArr) {
        this.f56207 = bArr;
        this.f56204 = bArr2;
        this.f56208 = iArr;
        this.f56205 = iArr2;
        this.f56206 = strArr;
    }
}
