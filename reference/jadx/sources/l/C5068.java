package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۚۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5068 implements InterfaceC8597 {
    @Override // l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // l.InterfaceC8597, java.io.Flushable
    public final void flush() {
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ */
    public final void mo5901(C6043 c6043, long j) throws EOFException {
        c6043.skip(j);
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo5902() {
        return C20591.f67091;
    }
}
