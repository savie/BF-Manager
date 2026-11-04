package l;

import java.io.FilterInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V6JD */
/* JADX INFO: loaded from: classes5.dex */
public final class C19517 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13961 f62970;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19517(C25173 c25173, C13961 c13961) {
        super(c25173);
        this.f62970 = c13961;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f62970.close();
    }
}
