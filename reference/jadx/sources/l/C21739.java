package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.᩷֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3IWR */
/* JADX INFO: loaded from: classes.dex */
public final class C21739 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f69344;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f69344) {
            this.f69344 = true;
        }
    }
}
