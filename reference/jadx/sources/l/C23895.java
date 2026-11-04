package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes.dex */
public final class C23895 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 f77381;

    public C23895(AbstractC7629 abstractC7629) throws IOException {
        AbstractC7629 abstractC7629M42101 = C18070.m42101(abstractC7629.m20838(), false);
        this.f77381 = abstractC7629M42101;
        try {
            abstractC7629M42101.mo20837(false);
        } catch (IOException | Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        Object obj = this.f77381;
        if (obj instanceof Closeable) {
            ((Closeable) obj).close();
        }
    }
}
