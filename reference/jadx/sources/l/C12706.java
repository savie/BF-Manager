package l;

/* JADX INFO: renamed from: l.ۨ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R6JT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12706 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10743 f40696;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9153 f40697;

    public C12706(C10743 c10743, C9153 c9153) {
        this.f40696 = c10743;
        this.f40697 = c9153;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f40696.f34105.recycle();
        this.f40697.close();
    }
}
