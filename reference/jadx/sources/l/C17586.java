package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17586 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f55892;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7584 f55893;

    public C17586(C7584 c7584, int i) {
        this.f55893 = c7584;
        this.f55892 = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f55893.close();
    }
}
