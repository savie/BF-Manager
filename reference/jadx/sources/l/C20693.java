package l;

/* JADX INFO: renamed from: l.᩵ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643C */
/* JADX INFO: loaded from: classes5.dex */
public class C20693 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m47329(int i, int i2, byte[] bArr) {
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
    public static byte[] m47330(AbstractC19728 abstractC19728) {
        byte[] bArrMo42394 = abstractC19728.mo42394();
        int iMo42398 = abstractC19728.mo42398();
        int iMo42395 = abstractC19728.mo42395();
        byte[] bArr = new byte[iMo42395];
        for (int i = 0; i < iMo42395; i++) {
            byte b = bArrMo42394[iMo42398 + i];
            if (b == 46) {
                bArr[i] = 47;
            } else {
                bArr[i] = b;
            }
        }
        return bArr;
    }
}
