package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11621 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 f39035;

    public C11621(AbstractC9677 abstractC9677) throws IOException {
        AbstractC9677 abstractC9677M35094 = C14616.m35094(abstractC9677.m24619(), false);
        this.f39035 = abstractC9677M35094;
        try {
            abstractC9677M35094.mo10267(false);
        } catch (IOException | Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        Object obj = this.f39035;
        if (obj instanceof Closeable) {
            ((Closeable) obj).close();
        }
    }
}
