package l;

/* JADX INFO: renamed from: l.᩵ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H72R */
/* JADX INFO: loaded from: classes5.dex */
public final class C20691 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f66322;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f66323;

    public C20691(long j, String str) {
        if (j <= 0) {
            throw new IllegalArgumentException("Expected library length must be positive");
        }
        if (!str.matches("[0-9a-f]{64}")) {
            throw new IllegalArgumentException("Expected library SHA-256 must be lowercase hex");
        }
        this.f66322 = j;
        this.f66323 = str;
    }
}
