package l;

/* JADX INFO: renamed from: l.֫ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P708 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1652 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C1652 f6604;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20889 f6605;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1900 f6606;

    static {
        EnumC14354 enumC14354 = EnumC14354.TEXT;
        f6604 = new C1652(null, null);
    }

    public C1652(C20889 c20889, C1900 c1900) {
        this.f6605 = c20889;
        this.f6606 = c1900;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1652 m5551(C20889 c20889) {
        C1900 c1900M6195;
        if (c20889 == null) {
            c1900M6195 = null;
        } else {
            try {
                c1900M6195 = C1900.m6195(c20889);
            } catch (RuntimeException unused) {
                return f6604;
            }
        }
        if (c20889 != null) {
            c20889.m46955(C16387.f52730);
        }
        EnumC14354 enumC14354 = EnumC14354.TEXT;
        return new C1652(c20889, c1900M6195);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20889 m5552() {
        return this.f6605;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1900 m5553() {
        return this.f6606;
    }
}
