package l;

/* JADX INFO: renamed from: l.ᩴ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20089 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Byte[] f64566;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f64567;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46223(C20089 c20089, byte[] bArr) {
        c20089.getClass();
        int length = bArr.length;
        Byte[] bArr2 = c20089.f64566;
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

    public C20089(String str, String str2) {
        this.f64567 = str;
        String[] strArrSplit = str2.split(" ");
        this.f64566 = new Byte[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            if (str3.length() != 2) {
                throw new RuntimeException(str2);
            }
            if (!str3.equals("??")) {
                this.f64566[i] = Byte.valueOf((byte) Integer.parseInt(str3, 16));
            }
        }
    }
}
