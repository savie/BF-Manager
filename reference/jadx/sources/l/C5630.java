package l;

import java.io.FilterOutputStream;

/* JADX INFO: renamed from: l.ۚۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2G3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5630 extends C25022 {
    @Override // l.C25022, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterOutputStream) this).out = C1901.f6400;
    }
}
