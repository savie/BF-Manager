package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.ۗ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6VA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3038 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Closeable f9844;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        Closeable closeable = this.f9844;
        if (closeable == null) {
            return;
        }
        this.f9844 = null;
        closeable.close();
    }

    public C3038(Closeable closeable) {
        this.f9844 = closeable;
    }
}
