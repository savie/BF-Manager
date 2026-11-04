package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.᩸ܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: LIWF */
/* JADX INFO: loaded from: classes.dex */
public final class C22842 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f74025 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51545(String str, InterfaceC23283 interfaceC23283) {
        this.f74025.put(str, interfaceC23283);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23283 m51544(String str) {
        InterfaceC23283 interfaceC23283 = (InterfaceC23283) this.f74025.get(str);
        return interfaceC23283 == null ? InterfaceC23283.f75440 : interfaceC23283;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f74025.clear();
    }

    public final String toString() {
        return "InMemoryCodeCache: size=" + this.f74025.size();
    }
}
