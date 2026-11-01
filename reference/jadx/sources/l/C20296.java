package l;

/* JADX INFO: renamed from: l.᩶ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R61W */
/* JADX INFO: loaded from: classes4.dex */
public final class C20296 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45807(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(C9023.m23354(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45806(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }
}
