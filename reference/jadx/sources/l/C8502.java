package l;

/* JADX INFO: renamed from: l.۠۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65AK */
/* JADX INFO: loaded from: classes3.dex */
public final class C8502 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] f27803 = {"build", "runtime", "system"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22819(int i) {
        if (i < 0 || i >= 3) {
            throw new C23044(null, "Invalid annotation visibility %d", Integer.valueOf(i));
        }
        return f27803[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22818(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("build")) {
            return 0;
        }
        if (lowerCase.equals("runtime")) {
            return 1;
        }
        if (lowerCase.equals("system")) {
            return 2;
        }
        throw new C23044(null, "Invalid annotation visibility: %s", lowerCase);
    }
}
