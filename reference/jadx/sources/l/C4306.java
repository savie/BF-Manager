package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.ۘܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6ER */
/* JADX INFO: loaded from: classes2.dex */
public final class C4306 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23341 f15608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f15609;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24444 m13733(C1610 c1610) {
        if (this.f15609 == c1610.hashCode()) {
            return this.f15608;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13734(C1610 c1610, C23341 c23341) {
        this.f15609 = c1610.hashCode();
        this.f15608 = c23341;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15609 = 0;
        this.f15608 = null;
    }
}
