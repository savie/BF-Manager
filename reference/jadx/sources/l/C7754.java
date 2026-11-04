package l;

/* JADX INFO: renamed from: l.۟۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C7754 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25519 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f25520 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21095(int i, long j) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            stringBuffer.append(f25520[((int) (j >> (i * 4))) & 15]);
        }
        String string = stringBuffer.toString();
        if (string.isEmpty()) {
            string = "0";
        }
        return "0x".concat(string);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21094(int i) {
        int i2 = 8;
        while (i2 > 0 && (i >> ((i2 - 1) * 4)) == 0) {
            i2--;
        }
        return m21095(i2, i);
    }
}
