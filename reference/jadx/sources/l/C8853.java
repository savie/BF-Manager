package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.۠᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C8853 implements InterfaceC2887, Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20670 f28932;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2887 m23720(InterfaceC20670 interfaceC20670) {
        if (interfaceC20670 != null) {
            return new C8853(interfaceC20670);
        }
        return m23720(C23654.empty());
    }

    public C8853(InterfaceC20670 interfaceC20670) {
        this.f28932 = interfaceC20670;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28932.close();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC19924 m23721() {
        return this.f28932;
    }
}
