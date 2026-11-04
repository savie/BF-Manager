package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8686 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f28348;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0287 f28349;

    public C8686(C0287 c0287, int i) {
        this.f28349 = c0287;
        this.f28348 = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f28349.close();
    }
}
