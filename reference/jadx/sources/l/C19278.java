package l;

/* JADX INFO: renamed from: l.ᩳᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R61W */
/* JADX INFO: loaded from: classes5.dex */
public final class C19278 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44624(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(C14483.m34971("null key in entry: null=", obj2));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44623(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }
}
