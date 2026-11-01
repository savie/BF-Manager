package l;

/* JADX INFO: renamed from: l.᩸֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes4.dex */
public final class C21234 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22646 f69162;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f69163;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f69164;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47707(C21234 c21234, C4651 c4651) {
        c21234.getClass();
        c4651.m12839(c21234.f69164);
        c4651.m12833(c21234.f69163);
        c4651.m12833(C22646.m50179(c21234.f69162));
    }

    public C21234(int i, int i2, C22646 c22646) {
        this.f69164 = i;
        this.f69163 = i2;
        this.f69162 = c22646;
    }

    public C21234(C13825 c13825, C1123 c1123) {
        this.f69164 = c13825.m33642();
        this.f69163 = c13825.m33638();
        C22646 c22646 = (C22646) c1123.m4151(c13825.m33638());
        this.f69162 = c22646;
        if (c22646 == null) {
            throw new RuntimeException("Could not find the EncodedCatchHandler referenced by this TryItem");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47708() {
        return this.f69164;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m47709() {
        return this.f69163;
    }
}
