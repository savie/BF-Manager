package l;

/* JADX INFO: renamed from: l.᩹ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAU5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22330 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22330 f72908;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f72909;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f72910;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f72911;

    public C22330(C22330 c22330, Object obj, Object obj2, int i) {
        this.f72908 = c22330;
        this.f72910 = obj;
        this.f72911 = obj2;
        this.f72909 = i;
    }

    public final String toString() {
        C22330 c22330 = this.f72908;
        if (c22330 == null) {
            return "$";
        }
        Object obj = this.f72911;
        if (obj instanceof Integer) {
            return c22330.toString() + "[" + obj + "]";
        }
        return c22330.toString() + "." + obj;
    }
}
