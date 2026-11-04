package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.ۙ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QISJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4585 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16301;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f16301) {
            this.f16301 = true;
        }
    }
}
