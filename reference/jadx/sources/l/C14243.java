package l;

/* JADX INFO: renamed from: l.ܳۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: JGV */
/* JADX INFO: loaded from: classes3.dex */
public final class C14243 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f46654;

    static {
        int i;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]", 3);
            i = Integer.parseInt(strArrSplit[0]);
            if (i == 1 && strArrSplit.length > 1) {
                i = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < property.length(); i2++) {
                    char cCharAt = property.charAt(i2);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        if (i == -1) {
            i = 6;
        }
        f46654 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34377() {
        return f46654 >= 9;
    }
}
