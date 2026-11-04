package l;

/* JADX INFO: renamed from: l.۟ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66CT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7978 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f26515;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f26516;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f26517;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f26518;

    public C7978(int i, int i2, int i3, int i4) {
        this.f26517 = i;
        this.f26518 = i2;
        this.f26516 = i3;
        this.f26515 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7978 m21763(String str) {
        if (str == null || str.length() < 10 || str.charAt(0) != '[') {
            return null;
        }
        int iIndexOf = str.indexOf(44);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf("][", i);
        int i2 = iIndexOf2 + 2;
        int iIndexOf3 = str.indexOf(44, i2);
        if (iIndexOf < 2 || iIndexOf2 < iIndexOf + 2 || iIndexOf3 < iIndexOf2 + 3 || C22313.m50373(1, str) != ']') {
            return null;
        }
        try {
            return new C7978(Integer.parseInt(str.substring(1, iIndexOf)), Integer.parseInt(str.substring(i, iIndexOf2)), Integer.parseInt(str.substring(i2, iIndexOf3)), Integer.parseInt(str.substring(iIndexOf3 + 1, str.length() - 1)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
