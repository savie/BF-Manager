package l;

/* JADX INFO: renamed from: l.ۢۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9407 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1644 m24150(C10922 c10922) {
        return new C1644(c10922.m27394() | (c10922.m27394() << 32));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24151(C1644 c1644, C10922 c10922) {
        long jM5534 = c1644.m5534();
        c10922.m27398(jM5534 & 4294967295L);
        c10922.m27398((jM5534 >> 32) & 4294967295L);
    }
}
