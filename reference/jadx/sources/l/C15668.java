package l;

/* JADX INFO: renamed from: l.ܺۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H72R */
/* JADX INFO: loaded from: classes4.dex */
public final class C15668 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f50882;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f50883;

    public C15668(long j, String str) {
        if (j <= 0) {
            throw new IllegalArgumentException("Expected library length must be positive");
        }
        if (!str.matches("[0-9a-f]{64}")) {
            throw new IllegalArgumentException("Expected library SHA-256 must be lowercase hex");
        }
        this.f50882 = j;
        this.f50883 = str;
    }
}
