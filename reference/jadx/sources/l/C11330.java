package l;

/* JADX INFO: renamed from: l.ۧ᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11330 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f38229;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f38230;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20502 f38231;

    public C11330(byte[] bArr, int i, C20502 c20502) {
        this.f38230 = bArr;
        this.f38229 = i;
        this.f38231 = c20502;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f38231.close();
    }
}
