package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.᩺ۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes.dex */
public final class C24254 implements InterfaceC7099 {
    @Override // l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // l.InterfaceC7099, java.io.Flushable
    public final void flush() {
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ */
    public final void mo6066(C1879 c1879, long j) throws EOFException {
        c1879.skip(j);
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo6067() {
        return C22411.f72586;
    }
}
