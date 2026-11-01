package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.ۡᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R6VA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9047 implements Closeable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Closeable f30862;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        Closeable closeable = this.f30862;
        if (closeable == null) {
            return;
        }
        this.f30862 = null;
        closeable.close();
    }

    public C9047(Closeable closeable) {
        this.f30862 = closeable;
    }
}
