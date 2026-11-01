package l;

/* JADX INFO: renamed from: l.֨ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1230 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Byte[] f5392;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f5393;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4429(C1230 c1230, byte[] bArr) {
        c1230.getClass();
        int length = bArr.length;
        Byte[] bArr2 = c1230.f5392;
        if (length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                Byte b = bArr2[i];
                if (b == null || b.byteValue() == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public C1230(String str, String str2) {
        this.f5393 = str;
        String[] strArrSplit = str2.split(" ");
        this.f5392 = new Byte[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            if (str3.length() != 2) {
                throw new RuntimeException(str2);
            }
            if (!str3.equals("??")) {
                this.f5392[i] = Byte.valueOf((byte) Integer.parseInt(str3, 16));
            }
        }
    }
}
