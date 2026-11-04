package l;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽܿ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17738 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58271;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20614 f58272;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17738(C23706 c23706, OutputStream outputStream, C20614 c20614) {
        super(outputStream, 32768);
        this.f58272 = c20614;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20614 c20614 = this.f58272;
        if (this.f58271) {
            return;
        }
        try {
            super.close();
        } finally {
            int i = C23706.f76834;
            C10367.m26670(c20614);
            this.f58271 = true;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
