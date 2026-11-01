package l;

/* JADX INFO: renamed from: l.ۙ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 11N5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4312 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15487 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f15488 = new int[128];

    static {
        for (int i = 0; i < 128; i++) {
            f15488[i] = Character.getType(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12113(int i) {
        if (i < 128) {
            return f15488[i];
        }
        return Character.getType(i);
    }
}
