package l;

/* JADX INFO: renamed from: l.᩷᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LARQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21171 implements InterfaceC7766 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f68946;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C21171 f68947;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f68948;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String[] f68949;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String[] f68950;

    static {
        String[] strArr = new String[0];
        f68946 = strArr;
        f68947 = new C21171(strArr, strArr, strArr);
    }

    public C21171(String[] strArr, String[] strArr2, String[] strArr3) {
        String[] strArr4 = f68946;
        strArr = strArr == null ? strArr4 : strArr;
        this.f68950 = strArr;
        strArr2 = strArr2 == null ? strArr4 : strArr2;
        this.f68949 = strArr2;
        strArr3 = strArr3 == null ? strArr4 : strArr3;
        this.f68948 = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m47631(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f68950;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m47630(int i) {
        if (i >= 0) {
            String[] strArr = this.f68949;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        if (i == -1) {
            return "EOF";
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m47629(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.f68948;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String strM47631 = m47631(i);
        if (strM47631 != null) {
            return strM47631;
        }
        String strM47630 = m47630(i);
        return strM47630 != null ? strM47630 : Integer.toString(i);
    }
}
