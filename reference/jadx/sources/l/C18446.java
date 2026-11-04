package l;

/* JADX INFO: renamed from: l.ܿܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 11N5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18446 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f60051 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f60052 = new int[128];

    static {
        for (int i = 0; i < 128; i++) {
            f60052[i] = Character.getType(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m42976(int i) {
        if (i < 128) {
            return f60052[i];
        }
        return Character.getType(i);
    }
}
