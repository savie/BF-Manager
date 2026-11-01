package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y17M */
/* JADX INFO: loaded from: classes3.dex */
public final class C10602 implements InterfaceC9191 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1388 f36255;

    public C10602(AbstractC20745 abstractC20745) {
        C1388 c1388M46710 = abstractC20745.m46710("rw");
        this.f36255 = c1388M46710;
        c1388M46710.setLength(0L);
    }

    @Override // l.InterfaceC9191
    /* JADX INFO: renamed from: ۤ */
    public final OutputStream mo23644(int i) {
        return new C10562(i, this.f36255);
    }

    @Override // l.InterfaceC9191
    /* JADX INFO: renamed from: ۡ */
    public final InputStream mo23643(int i) {
        return new C9151(i, this.f36255);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f36255.close();
    }
}
