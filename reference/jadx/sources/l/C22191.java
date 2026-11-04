package l;

/* JADX INFO: renamed from: l.᩷ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: LARQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22191 implements InterfaceC5037 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C22191 f71497;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String[] f71498;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f71499;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String[] f71500;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String[] f71501;

    static {
        String[] strArr = new String[0];
        f71498 = strArr;
        f71497 = new C22191(strArr, strArr, strArr);
    }

    public C22191(String[] strArr, String[] strArr2, String[] strArr3) {
        String[] strArr4 = f71498;
        strArr = strArr == null ? strArr4 : strArr;
        this.f71501 = strArr;
        strArr2 = strArr2 == null ? strArr4 : strArr2;
        this.f71500 = strArr2;
        strArr3 = strArr3 == null ? strArr4 : strArr3;
        this.f71499 = strArr3;
        Math.max(strArr3.length, Math.max(strArr.length, strArr2.length));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m50200(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f71501;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m50199(int i) {
        if (i >= 0) {
            String[] strArr = this.f71500;
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
    public final String m50198(int i) {
        String str;
        if (i >= 0) {
            String[] strArr = this.f71499;
            if (i < strArr.length && (str = strArr[i]) != null) {
                return str;
            }
        }
        String strM50200 = m50200(i);
        if (strM50200 != null) {
            return strM50200;
        }
        String strM50199 = m50199(i);
        return strM50199 != null ? strM50199 : Integer.toString(i);
    }
}
