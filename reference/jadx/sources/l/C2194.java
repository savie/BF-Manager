package l;

/* JADX INFO: renamed from: l.ۖ֨۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 643C */
/* JADX INFO: loaded from: classes2.dex */
public class C2194 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m6808(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i + i3];
            if (b == 47) {
                bArr2[i3] = 46;
            } else {
                bArr2[i3] = b;
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m6809(AbstractC11242 abstractC11242) {
        byte[] bArrMo28214 = abstractC11242.mo28214();
        int iMo28207 = abstractC11242.mo28207();
        int iMo28217 = abstractC11242.mo28217();
        byte[] bArr = new byte[iMo28217];
        for (int i = 0; i < iMo28217; i++) {
            byte b = bArrMo28214[iMo28207 + i];
            if (b == 46) {
                bArr[i] = 47;
            } else {
                bArr[i] = b;
            }
        }
        return bArr;
    }
}
