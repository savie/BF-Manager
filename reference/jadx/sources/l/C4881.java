package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۙۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y17M */
/* JADX INFO: loaded from: classes3.dex */
public final class C4881 implements InterfaceC14070 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13961 f17054;

    public C4881(AbstractC22044 abstractC22044) {
        C13961 c13961M49855 = abstractC22044.m49855("rw");
        this.f17054 = c13961M49855;
        c13961M49855.setLength(0L);
    }

    @Override // l.InterfaceC14070
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo14972(int i) {
        return new C16967(i, this.f17054);
    }

    @Override // l.InterfaceC14070
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InputStream mo14973(int i) {
        return new C25173(i, this.f17054);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17054.close();
    }
}
