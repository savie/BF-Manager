package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.ܺ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V7IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16254 implements InterfaceC21192, Closeable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5046 f52411;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21192 m38403(InterfaceC5046 interfaceC5046) {
        if (interfaceC5046 != null) {
            return new C16254(interfaceC5046);
        }
        return m38403(C11397.empty());
    }

    public C16254(InterfaceC5046 interfaceC5046) {
        this.f52411 = interfaceC5046;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f52411.close();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6124 m38404() {
        return this.f52411;
    }
}
