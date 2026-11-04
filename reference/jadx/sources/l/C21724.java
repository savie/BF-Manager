package l;

/* JADX INFO: renamed from: l.᩷֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes.dex */
public final class C21724 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f69322;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f69323;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9153 f69324;

    public C21724(byte[] bArr, int i, C9153 c9153) {
        this.f69322 = bArr;
        this.f69323 = i;
        this.f69324 = c9153;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f69324.close();
    }
}
