package l;

/* JADX INFO: renamed from: l.᩸۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 65AK */
/* JADX INFO: loaded from: classes4.dex */
public final class C21585 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] f70039 = {"build", "runtime", "system"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48298(int i) {
        if (i < 0 || i >= 3) {
            throw new C20749(null, "Invalid annotation visibility %d", Integer.valueOf(i));
        }
        return f70039[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48297(String str) {
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
        throw new C20749(null, "Invalid annotation visibility: %s", lowerCase);
    }
}
